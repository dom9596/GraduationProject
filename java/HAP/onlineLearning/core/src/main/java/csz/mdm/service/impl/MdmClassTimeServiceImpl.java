package csz.mdm.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import csz.mdm.dto.MdmClassTime;
import csz.mdm.service.IMdmClassTimeService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class MdmClassTimeServiceImpl extends BaseServiceImpl<MdmClassTime> implements IMdmClassTimeService{

}