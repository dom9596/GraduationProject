package csz.mdm.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import csz.mdm.dto.MdmClass;
import csz.mdm.dto.MdmClassStudent;

import java.util.List;

public interface IMdmClassStudentService extends IBaseService<MdmClassStudent>, ProxySelf<IMdmClassStudentService> {
    /**
     * 
     * @param iRequest
     * @param mdmClassStudent
     * @param pageMun
     * @param pageSize
     * @return
     */
    List<MdmClassStudent> queryClassStudent(IRequest iRequest, MdmClassStudent mdmClassStudent, int pageMun, int pageSize);
}