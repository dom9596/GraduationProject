package csz.mdm.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmQuestionImage;
import csz.mdm.service.IMdmQuestionImageService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmQuestionImageServiceImpl extends BaseServiceImpl<MdmQuestionImage> implements IMdmQuestionImageService{

}