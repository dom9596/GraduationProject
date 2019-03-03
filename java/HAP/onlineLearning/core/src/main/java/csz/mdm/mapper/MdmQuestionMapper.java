package csz.mdm.mapper;

import com.hand.hap.mybatis.common.Mapper;
import csz.mdm.dto.MdmQuestion;

import java.util.List;

public interface MdmQuestionMapper extends Mapper<MdmQuestion> {
    List<MdmQuestion> questQuestion(MdmQuestion mdmQuestion);

    List<MdmQuestion> questStudentQuestion(MdmQuestion mdmQuestion);


}