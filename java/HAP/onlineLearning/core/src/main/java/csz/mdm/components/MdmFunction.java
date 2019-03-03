package csz.mdm.components;

import com.hand.hap.system.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;

public class MdmFunction {

    @Autowired
    static IProfileService iProfileService;
    public static boolean isAdmin() {
        return "ADMIN".equals(iProfileService.getProfileValue(null, "ADMIN"));
    }

}
