package csz.mdm.mapper;

import com.hand.hap.mybatis.common.Mapper;
import csz.mdm.dto.MdmClass;

import java.util.List;

public interface MdmClassMapper extends Mapper<MdmClass> {
    List<MdmClass> queryClass(MdmClass mdmClass);

    List<MdmClass> queryStudentCourseClass(MdmClass mdmClass);
}