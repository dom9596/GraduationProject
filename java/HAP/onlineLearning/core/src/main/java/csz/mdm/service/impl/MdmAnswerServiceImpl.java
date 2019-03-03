package csz.mdm.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmAnswer;
import csz.mdm.service.IMdmAnswerService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmAnswerServiceImpl extends BaseServiceImpl<MdmAnswer> implements IMdmAnswerService{

}