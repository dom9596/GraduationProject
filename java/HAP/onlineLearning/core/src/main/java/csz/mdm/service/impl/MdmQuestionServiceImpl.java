package csz.mdm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import csz.mdm.mapper.MdmQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmQuestion;
import csz.mdm.service.IMdmQuestionService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmQuestionServiceImpl extends BaseServiceImpl<MdmQuestion> implements IMdmQuestionService {

    @Autowired
    MdmQuestionMapper mdmQuestionMapper;

    @Override
    public List<MdmQuestion> questQuestion(IRequest iRequest, MdmQuestion dto, int pageMun, int pageSize) {
        PageHelper.startPage(pageMun, pageSize);
        return mdmQuestionMapper.questQuestion(dto);
    }

    @Override
    public List<MdmQuestion> questStudentQuestion(IRequest iRequest, MdmQuestion dto, int pageMun, int pageSize) {
        PageHelper.startPage(pageMun, pageSize);
        return mdmQuestionMapper.questStudentQuestion(dto);
    }
}