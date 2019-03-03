package csz.mdm.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import csz.mdm.dto.MdmQuestion;

import java.util.List;

public interface IMdmQuestionService extends IBaseService<MdmQuestion>, ProxySelf<IMdmQuestionService> {
    List<MdmQuestion> questQuestion(IRequest iRequest, MdmQuestion dto, int pageMun, int pageSize);

    List<MdmQuestion> questStudentQuestion(IRequest iRequest, MdmQuestion dto, int pageMun, int pageSize);
}