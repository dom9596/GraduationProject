package csz.mdm.mapper;

import com.hand.hap.mybatis.common.Mapper;
import csz.mdm.dto.MdmStudentQuestion;

import java.util.List;

public interface MdmStudentQuestionMapper extends Mapper<MdmStudentQuestion> {

    List<MdmStudentQuestion> queryStudentQuestion(MdmStudentQuestion mdmStudentQuestion);
}