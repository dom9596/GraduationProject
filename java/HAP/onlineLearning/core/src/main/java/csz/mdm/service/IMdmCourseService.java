package csz.mdm.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import csz.mdm.dto.MdmCourse;

import java.util.List;

public interface IMdmCourseService extends IBaseService<MdmCourse>, ProxySelf<IMdmCourseService> {
    /**
     * 查找学生所参与的该老师的课程
     *
     * @param mdmCourse
     * @return
     */
    List<MdmCourse> queryStudentCourse(IRequest iRequest, MdmCourse mdmCourse, int pageMun, int pageSize);
}