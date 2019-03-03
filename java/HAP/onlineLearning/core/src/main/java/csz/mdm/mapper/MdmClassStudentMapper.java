package csz.mdm.mapper;

import com.hand.hap.mybatis.common.Mapper;
import csz.mdm.dto.MdmClassStudent;

import java.util.List;

public interface MdmClassStudentMapper extends Mapper<MdmClassStudent> {

    List<MdmClassStudent> queryClassStudent(MdmClassStudent mdmClassStudent);
}