/*
Navicat MySQL Data Transfer

Source Server         : 123.207.123.193_3306
Source Server Version : 50724
Source Host           : 123.207.123.193:3306
Source Database       : onlinelearning

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-01-12 11:22:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `role_code` varchar(100) NOT NULL COMMENT '编码(学号/工号)',
  `role_name` varchar(100) NOT NULL COMMENT '名称',
  `role_description` varchar(240) DEFAULT NULL COMMENT '描述',
  `rstart_active_date` date NOT NULL COMMENT '开始生效日期',
  `end_activie_date` date NOT NULL COMMENT '截至生效日期',
  `enable_flag` varchar(1) NOT NULL DEFAULT 'y' COMMENT '启用标志',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`role_id`),
  KEY `sys_role_n1` (`role_id`,`role_code`),
  KEY `sys_role_n2` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `user_code` varchar(20) NOT NULL COMMENT '用户编码',
  `user_name` varchar(100) NOT NULL COMMENT '名称',
  `user_type` varchar(100) DEFAULT NULL COMMENT '用户类型',
  `password_encryption` varchar(100) NOT NULL COMMENT '加密密码',
  `description` varchar(240) DEFAULT NULL COMMENT '描述',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `qq` varchar(100) DEFAULT NULL COMMENT 'qq',
  `wechat` varchar(100) DEFAULT NULL COMMENT '微信',
  `phone` varchar(100) DEFAULT NULL COMMENT '手机',
  `status` varchar(100) DEFAULT NULL COMMENT '状态',
  `first_login` varchar(1) NOT NULL DEFAULT 'y' COMMENT '是否是第一次登陆',
  `start_active_date` date DEFAULT NULL COMMENT '有效期从',
  `end_active_data` date DEFAULT NULL COMMENT '有兴趣至',
  `create_date` date DEFAULT NULL COMMENT '创建日期',
  `update_date` date DEFAULT NULL COMMENT '更新日期',
  `last_password_update_date` date DEFAULT NULL COMMENT '最后更新密码日期',
  `last_login_date` date DEFAULT NULL COMMENT '最后登陆日期',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `sys_user_n1` (`user_code`,`user_type`),
  KEY `sys_user_n2` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `sur_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `user_id` int(11) NOT NULL COMMENT '编码(学号/工号)',
  `role_id` int(11) DEFAULT NULL,
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`sur_id`),
  KEY `sys_user_role_n1` (`user_id`,`role_id`),
  KEY `sys_user_role_n2` (`sur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='用户角色表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for xx_answer
-- ----------------------------
DROP TABLE IF EXISTS `xx_answer`;
CREATE TABLE `xx_answer` (
  `answer_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `questioin_id` int(11) DEFAULT NULL COMMENT '题目id',
  `questioin_type` varchar(240) DEFAULT NULL COMMENT '题目类型',
  `answer` varchar(4000) DEFAULT NULL COMMENT '答案',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`answer_id`),
  KEY `xx_answer_n1` (`questioin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='答案表';

-- ----------------------------
-- Records of xx_answer
-- ----------------------------

-- ----------------------------
-- Table structure for xx_class
-- ----------------------------
DROP TABLE IF EXISTS `xx_class`;
CREATE TABLE `xx_class` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `class_code` varchar(100) NOT NULL COMMENT '课程编码',
  `class_name` varchar(100) NOT NULL COMMENT '课程名称',
  `course_id` int(11) NOT NULL COMMENT '课程id',
  `user_id` int(11) NOT NULL COMMENT '教师id',
  `class_description` varchar(240) DEFAULT NULL COMMENT '课程描述',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`class_id`),
  KEY `xx_class_n1` (`course_id`),
  KEY `xx_class_n2` (`class_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='班级表';

-- ----------------------------
-- Records of xx_class
-- ----------------------------

-- ----------------------------
-- Table structure for xx_class_student
-- ----------------------------
DROP TABLE IF EXISTS `xx_class_student`;
CREATE TABLE `xx_class_student` (
  `class_student_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `class_id` int(11) NOT NULL COMMENT '班级id',
  `user_id` int(11) NOT NULL COMMENT '学生id',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`class_student_id`),
  KEY `xx_class_student_n1` (`class_id`),
  KEY `xx_class_student_n2` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='班级学生表';

-- ----------------------------
-- Records of xx_class_student
-- ----------------------------

-- ----------------------------
-- Table structure for xx_class_time
-- ----------------------------
DROP TABLE IF EXISTS `xx_class_time`;
CREATE TABLE `xx_class_time` (
  `class_time_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `class_id` int(11) NOT NULL COMMENT '班级',
  `class_time_start` datetime NOT NULL COMMENT '上课时间',
  `class_time_end` datetime NOT NULL COMMENT '下课时间',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`class_time_id`),
  KEY `xx_class_time_n1` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='班级上课时间表';

-- ----------------------------
-- Records of xx_class_time
-- ----------------------------

-- ----------------------------
-- Table structure for xx_course
-- ----------------------------
DROP TABLE IF EXISTS `xx_course`;
CREATE TABLE `xx_course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `course_code` varchar(100) NOT NULL COMMENT '课程编码',
  `course_name` varchar(100) NOT NULL COMMENT '课程名称',
  `user_id` int(11) NOT NULL COMMENT '教师id',
  `course_description` varchar(240) DEFAULT NULL COMMENT '课程描述',
  `course_start_date` date NOT NULL COMMENT '开课时间',
  `course_end_date` date NOT NULL COMMENT '结课时间',
  `course_credit` int(11) DEFAULT NULL COMMENT '学分',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`course_id`),
  KEY `xx_course_n1` (`user_id`,`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='课程表';

-- ----------------------------
-- Records of xx_course
-- ----------------------------

-- ----------------------------
-- Table structure for xx_questioin
-- ----------------------------
DROP TABLE IF EXISTS `xx_questioin`;
CREATE TABLE `xx_questioin` (
  `questioin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `course_id` int(11) NOT NULL COMMENT '课程id',
  `user_id` int(11) NOT NULL COMMENT '教师id',
  `questioin_code` varchar(240) NOT NULL COMMENT '问题编码',
  `question_stem` varchar(4000) NOT NULL COMMENT '题干',
  `questioin_isshare` varchar(1) DEFAULT 'n' COMMENT '是否共享y/n',
  `questioin_description` varchar(240) DEFAULT NULL COMMENT '问题描述',
  `question_type` varchar(240) NOT NULL COMMENT '问题类型(单选/多选/填空/简答)',
  `option1` varchar(240) DEFAULT NULL COMMENT '选项1',
  `option2` varchar(240) DEFAULT NULL COMMENT '选项2',
  `option3` varchar(240) DEFAULT NULL COMMENT '选项3',
  `option4` varchar(240) DEFAULT NULL COMMENT '选项4',
  `option5` varchar(240) DEFAULT NULL COMMENT '选项5',
  `option6` varchar(240) DEFAULT NULL COMMENT '选项6',
  `option7` varchar(240) DEFAULT NULL COMMENT '选项7',
  `option8` varchar(240) DEFAULT NULL COMMENT '选项8',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`questioin_id`),
  KEY `xx_questioin_n1` (`user_id`),
  KEY `xx_questioin_n2` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='问题表';

-- ----------------------------
-- Records of xx_questioin
-- ----------------------------

-- ----------------------------
-- Table structure for xx_questioin_image
-- ----------------------------
DROP TABLE IF EXISTS `xx_questioin_image`;
CREATE TABLE `xx_questioin_image` (
  `questioin_image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `question_id` int(11) NOT NULL COMMENT '题目id',
  `image_url` varchar(240) NOT NULL COMMENT '图片',
  `sequence` varchar(100) DEFAULT NULL COMMENT '序列',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`questioin_image_id`),
  KEY `xx_questioin_image_n1` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='答案表';

-- ----------------------------
-- Records of xx_questioin_image
-- ----------------------------

-- ----------------------------
-- Table structure for xx_student_question
-- ----------------------------
DROP TABLE IF EXISTS `xx_student_question`;
CREATE TABLE `xx_student_question` (
  `student_question_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `user_stu_id` int(11) DEFAULT NULL COMMENT '学生id',
  `user_tch_id` int(11) DEFAULT NULL COMMENT '教师id',
  `question_id` int(11) DEFAULT NULL COMMENT '问题id',
  `score` int(11) DEFAULT NULL COMMENT '得分',
  `description` varchar(240) DEFAULT NULL COMMENT '备注',
  `update_date` varchar(1) NOT NULL COMMENT '更新时间',
  `create_date` varchar(1) NOT NULL COMMENT '创建时间',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) NOT NULL DEFAULT '-1',
  `last_updated_by` int(11) NOT NULL DEFAULT '-1',
  `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_login` int(11) DEFAULT NULL,
  `program_application_id` int(11) DEFAULT NULL,
  `program_id` int(11) DEFAULT NULL,
  `program_update_date` date DEFAULT NULL,
  `request_id` int(11) DEFAULT NULL,
  `attribute_category` varchar(30) DEFAULT NULL,
  `attribute1` varchar(240) DEFAULT NULL,
  `attribute2` varchar(240) DEFAULT NULL,
  `attribute3` varchar(240) DEFAULT NULL,
  `attribute4` varchar(240) DEFAULT NULL,
  `attribute5` varchar(240) DEFAULT NULL,
  `attribute6` varchar(240) DEFAULT NULL,
  `attribute7` varchar(240) DEFAULT NULL,
  `attribute8` varchar(240) DEFAULT NULL,
  `attribute9` varchar(240) DEFAULT NULL,
  `attribute10` varchar(240) DEFAULT NULL,
  `attribute11` varchar(240) DEFAULT NULL,
  `attribute12` varchar(240) DEFAULT NULL,
  `attribute13` varchar(240) DEFAULT NULL,
  `attribute14` varchar(240) DEFAULT NULL,
  `attribute15` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`student_question_id`),
  KEY `xx_student_question_n1` (`user_stu_id`),
  KEY `xx_student_question_n2` (`user_tch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='答题表';

-- ----------------------------
-- Records of xx_student_question
-- ----------------------------
