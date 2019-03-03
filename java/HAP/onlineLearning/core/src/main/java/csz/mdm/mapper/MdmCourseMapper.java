package csz.mdm.mapper;

import com.hand.hap.mybatis.common.Mapper;
import csz.mdm.dto.MdmCourse;
import csz.mdm.dto.MdmUser;

import java.util.List;

public interface MdmCourseMapper extends Mapper<MdmCourse> {

    /**
     * 查找学生所参与的该老师的课程
     *
     * @param mdmCourse
     * @return
     */
    List<MdmCourse> queryStudentCourse(MdmCourse mdmCourse);
}