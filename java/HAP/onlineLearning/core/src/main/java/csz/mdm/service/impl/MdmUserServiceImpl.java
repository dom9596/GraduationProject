package csz.mdm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.account.dto.User;
import com.hand.hap.account.dto.UserRole;
import com.hand.hap.account.exception.UserException;
import com.hand.hap.account.mapper.UserMapper;
import com.hand.hap.account.mapper.UserRoleMapper;
import com.hand.hap.account.service.IUserService;
import com.hand.hap.core.IRequest;
import com.hand.hap.hr.dto.Employee;
import com.hand.hap.hr.mapper.EmployeeMapper;
import com.hand.hap.hr.service.IEmployeeService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import csz.mdm.dto.MdmUser;
import csz.mdm.mapper.MdmUserMapper;
import csz.mdm.service.IMdmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmUserServiceImpl extends BaseServiceImpl<MdmUser> implements IMdmUserService {
    @Autowired
    MdmUserMapper mdmUserMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRoleMapper userRoleMapper;
    @Autowired
    private IUserService userService;
    @Autowired
    private IEmployeeService employeeService;

    /**
     * 教师查询自己的学生
     *
     * @param iRequest
     * @param dto
     * @param pageMun
     * @param pageSize
     * @return
     */
    @Override
    public List<MdmUser> queryTeacherAllStudent(IRequest iRequest, MdmUser dto, int pageMun, int pageSize) {
        PageHelper.startPage(pageMun, pageSize);
        return mdmUserMapper.queryTeacherAllStudent(dto);
    }

    /**
     * 新用户注册
     *
     * @param mdmUser 0、MdmUser新建：inserMdmUser
     *                1、员工新建：EmployeeMapper.insertSelective
     *                2、用户新建：UserMapper.insertSelective
     *                3、角色分配：UserRoleMapper.insertSelective
     *                4、修改密码 UserMapper.updatePassword
     * @return
     */

    @Override
    public MdmUser insertMdmUser(MdmUser mdmUser, IRequest request) throws UserException {
        System.out.print(mdmUser.toString());

//        0、MdmUser新建：inserMdmUser
        inserMdmUser(mdmUser);
//        1、员工新建：EmployeeMapper.insertSelective
        insertEmployee(mdmUser);
//        2、用户新建：UserMapper.insertSelective
        insertUser(mdmUser);
//        3、角色分配：UserRoleMapper.insertSelective
        insertUserRole(mdmUser);
//        4、修改密码 UserMapper.updatePassword
        updateUserPassword(request, mdmUser);
        return mdmUser;
    }

    /**
     * 更新用户信息
     *
     * @param mdmUser
     * @param request
     * @return
     * @throws UserException
     */
    @Override
    public MdmUser updataMdmUser(MdmUser mdmUser, IRequest request) throws UserException {
        insertEmployee(mdmUser);
        insertUser(mdmUser);
        insertUserRole(mdmUser);
        return mdmUser;
    }


    void inserMdmUser(MdmUser mdmUser) {
        MdmUser condition = new MdmUser();
        condition.setUserCode(mdmUser.getUserCode());
        List<MdmUser> list = mdmUserMapper.select(condition);
        if (null == list || list.size() < 1) {
            mdmUserMapper.insertSelective(mdmUser);
        } else {
            mdmUser.setUserId(list.get(0).getUserId());
            mdmUserMapper.updateByPrimaryKeySelective(mdmUser);
        }
    }

    //1、员工新建：EmployeeMapper.insertSelective
    void insertEmployee(MdmUser mdmUser) {
        Employee employee = new Employee();
        employee.setEmployeeCode(mdmUser.getUserCode());
        employee.setName(mdmUser.getUserName());
        employee.setGender("M");
        employee.setCertificateId(mdmUser.getUserCode());
        employee.setCertificateType("ID");
        employee.setStatus("NORMAL");
        employee.setEmail(mdmUser.getUserEmail());
        //查看数据是否存在
        Employee condition = new Employee();
        condition.setEmployeeCode(mdmUser.getUserCode());
        List<Employee> list = employeeMapper.select(condition);
        if (null == list || list.size() < 1) {
            employeeMapper.insertSelective(employee);
        } else {
            employee.setEmployeeId(list.get(0).getEmployeeId());
            employeeMapper.updateByPrimaryKeySelective(employee);
        }
    }

    //     2、用户新建：UserMapper.insertSelective
    void insertUser(MdmUser mdmUser) {
        User user = new User();
        user.setUserName(mdmUser.getUserCode());
        user.setEmployeeName(mdmUser.getUserName());
        Employee employee = new Employee();
        employee.setEmployeeCode(mdmUser.getUserCode());
        user.setEmployeeId(employeeMapper.select(employee).get(0).getEmployeeId());
        user.setPhone(mdmUser.getUserPhone());
        user.setEmail(mdmUser.getUserEmail());
        user.setStatus("ACTV");
        //查看数据是否存在
        User condition = new User();
        condition.setUserName(mdmUser.getUserCode());
        List<User> list = userMapper.select(condition);
        if (null == list || list.size() < 1) {
            userMapper.insertSelective(user);
        } else {
            user.setUserId(list.get(0).getUserId());
            userMapper.updateByPrimaryKeySelective(user);
        }

    }

    //    角色分配：UserRoleMapper.insertSelective
    void insertUserRole(MdmUser mdmUser) {
        UserRole userRole = new UserRole();
        User user = new User();
        user.setUserName(mdmUser.getUserCode());
        Long userId = userMapper.select(user).get(0).getUserId();
        userRole.setUserId(userId);
        userRole.setRoleId(mdmUser.getUserRole());
        //查看数据是否存在
        UserRole condition = new UserRole();
        condition.setUserId(userId);
        condition.setRoleId(mdmUser.getUserRole());
        List<UserRole> list = userRoleMapper.select(condition);
        if (null == list || list.size() < 1) {
            userRoleMapper.insertSelective(userRole);
        } else {
            userRole.setSurId(list.get(0).getSurId());
            userRoleMapper.updateByPrimaryKeySelective(userRole);
        }
    }

    //    4、修改密码 UserMapper.updatePassword
    void updateUserPassword(IRequest iRequest, MdmUser mdmUser) throws UserException {
        User dto = new User();
        dto.setUserName(mdmUser.getUserCode());
        Long userId = userMapper.select(dto).get(0).getUserId();
        User user = new User();
        user.setUserId(userId);
        user.setPassword(mdmUser.getUserPassword());
        userService.resetPassword(iRequest, user, mdmUser.getUserPassword());
    }
}