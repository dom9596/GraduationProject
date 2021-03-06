package csz.mdm.dto;

/**
 * Auto Generated By Hap Code Generator
 **/

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

@ExtensionAttribute(disable = true)
@Table(name = "xx_mdm_student_question")
public class MdmStudentQuestion extends BaseDTO {

    public static final String FIELD_STUDENT_QUESTION_ID = "studentQuestionId";
    public static final String FIELD_STUDENT_ID = "studentId";
    public static final String FIELD_QUESTION_ID = "questionId";
    public static final String FIELD_CLASS_ID = "classId";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_SCORE = "score";
    public static final String FIELD_ANSWER = "answer";
    public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
    public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


    @Id
    @GeneratedValue
    private Long studentQuestionId; //表id

    private Long studentId; //学生id

    private Long questionId; //问题id

    private Long classId; //班级id

    @Length(max = 240)
    private String description; //题目类型

    private Long score; //得分


    @Length(max = 240)
    private String answer; //答案

    private Long programApplicationId;

    private Date programUpdateDate;

    @Transient
    private String userCode;
    @Transient
    private String userName;
    @Transient
    private String questionStem;
    @Transient
    private String className;
    @Transient
    private String courseName;
    @Transient
    private String teacherCode;
    @Transient
    private String teacherName;

    public static String getFieldStudentQuestionId() {
        return FIELD_STUDENT_QUESTION_ID;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionStem() {
        return questionStem;
    }

    public void setQuestionStem(String questionStem) {
        this.questionStem = questionStem;
    }

    public void setStudentQuestionId(Long studentQuestionId) {
        this.studentQuestionId = studentQuestionId;
    }

    public Long getStudentQuestionId() {
        return studentQuestionId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getScore() {
        return score;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setProgramApplicationId(Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }

    public Long getProgramApplicationId() {
        return programApplicationId;
    }

    public void setProgramUpdateDate(Date programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }

    public Date getProgramUpdateDate() {
        return programUpdateDate;
    }

}
