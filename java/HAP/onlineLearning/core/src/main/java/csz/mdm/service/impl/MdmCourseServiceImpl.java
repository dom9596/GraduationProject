package csz.mdm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import csz.mdm.mapper.MdmCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmCourse;
import csz.mdm.service.IMdmCourseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmCourseServiceImpl extends BaseServiceImpl<MdmCourse> implements IMdmCourseService {

    @Autowired
    private MdmCourseMapper mdmCourseMapper;

    /**
     * 查找学生所参与的该老师的课程
     *
     * @param mdmCourse
     * @return
     */
    @Override
    public List<MdmCourse> queryStudentCourse(IRequest iRequest, MdmCourse mdmCourse, int pageMun, int pageSize) {
        PageHelper.startPage(pageMun, pageSize);
        return mdmCourseMapper.queryStudentCourse(mdmCourse);
    }
}