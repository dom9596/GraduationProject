package csz.mdm.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import csz.mdm.dto.MdmStudentQuestion;

import java.util.List;

public interface IMdmStudentQuestionService extends IBaseService<MdmStudentQuestion>, ProxySelf<IMdmStudentQuestionService> {
    List<MdmStudentQuestion> queryStudentQuestion(IRequest iRequest, MdmStudentQuestion mdmStudentQuestion, int pageMun, int pageSize);
}