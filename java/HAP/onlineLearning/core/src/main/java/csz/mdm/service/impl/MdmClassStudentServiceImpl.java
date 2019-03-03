package csz.mdm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import csz.mdm.mapper.MdmClassStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmClassStudent;
import csz.mdm.service.IMdmClassStudentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmClassStudentServiceImpl extends BaseServiceImpl<MdmClassStudent> implements IMdmClassStudentService {

    @Autowired
    MdmClassStudentMapper mdmClassStudentMapper;

    @Override
    public List<MdmClassStudent> queryClassStudent(IRequest iRequest, MdmClassStudent mdmClassStudent, int pageMun, int pageSize) {
        PageHelper.startPage(pageMun, pageSize);
        return mdmClassStudentMapper.queryClassStudent(mdmClassStudent);
    }
}