package csz.mdm.mapper;

import com.hand.hap.mybatis.common.Mapper;
import csz.mdm.dto.MdmUser;

import java.util.List;

public interface MdmUserMapper extends Mapper<MdmUser>{

    List<MdmUser> queryTeacherAllStudent(MdmUser mdmUser);
}