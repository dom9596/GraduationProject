package csz.mdm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import csz.mdm.mapper.MdmStudentQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmStudentQuestion;
import csz.mdm.service.IMdmStudentQuestionService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmStudentQuestionServiceImpl extends BaseServiceImpl<MdmStudentQuestion> implements IMdmStudentQuestionService {
    @Autowired
    MdmStudentQuestionMapper mdmStudentQuestionMapper;


    @Override
    public List<MdmStudentQuestion> queryStudentQuestion(IRequest iRequest, MdmStudentQuestion mdmStudentQuestion, int pageMun, int pageSize) {
        PageHelper.startPage(pageMun, pageSize);
        return mdmStudentQuestionMapper.queryStudentQuestion(mdmStudentQuestion);
    }
}