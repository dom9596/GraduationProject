package csz.mdm.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import csz.mdm.dto.MdmClass;

import java.util.List;

public interface IMdmClassService extends IBaseService<MdmClass>, ProxySelf<IMdmClassService> {
    /**
     * 界面查询
     *
     * @param request
     * @param dto
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<MdmClass> queryClass(IRequest request, MdmClass dto, int pageNum, int pageSize);

    List<MdmClass> queryStudentCourseClass(IRequest request, MdmClass dto, int pageNum, int pageSize);
}