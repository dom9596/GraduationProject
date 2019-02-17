package wht.ora2062.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import wht.ora2062.dto.Demo;
import wht.ora2062.service.IOra2062DemoService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class Ora2062DemoServiceImpl extends BaseServiceImpl<Demo> implements IOra2062DemoService {

}