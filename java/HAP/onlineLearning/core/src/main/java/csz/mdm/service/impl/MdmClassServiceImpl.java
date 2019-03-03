package csz.mdm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import csz.mdm.mapper.MdmClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmClass;
import csz.mdm.service.IMdmClassService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmClassServiceImpl extends BaseServiceImpl<MdmClass> implements IMdmClassService {

    @Autowired
    MdmClassMapper mdmClassMapper;

    @Override
    public List<MdmClass> queryClass(IRequest request, MdmClass dto, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mdmClassMapper.queryClass(dto);
    }

    @Override
    public List<MdmClass> queryStudentCourseClass(IRequest request, MdmClass dto, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mdmClassMapper.queryStudentCourseClass(dto);
    }
}