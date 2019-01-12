create table sf_dev.xx_questioin
(
 questioin_id int not null auto_increment comment '表id',
 course_id int not null comment '课程id',
 user_id int not null comment '教师id',
 questioin_code varchar(240) not null comment '问题编码',
 question_stem varchar(4000) not null comment '题干',
 questioin_isshare varchar(240) default 'n' comment '是否共享y/n',
 questioin_description varchar(240) comment '问题描述',
 question_type varchar(240) not null comment '问题类型(单选/多选/填空/简答)',
 option1 varchar(240) comment '选项1',
 option2 varchar(240) comment '选项2',
 option3 varchar(240) comment '选项3',
 option4 varchar(240) comment '选项4',
 option5 varchar(240) comment '选项5',
 option6 varchar(240) comment '选项6',
 option7 varchar(240) comment '选项7',
 option8 varchar(240) comment '选项8',
 update_date varchar(1) not null comment '更新时间',
 create_date varchar(1) not null comment '创建时间',
 creation_date datetime default current_timestamp not null,
 created_by int default -1 not null,
 last_updated_by int default -1 not null,
 last_update_date datetime default current_timestamp not null,
 last_update_login int,
 program_application_id int,
 program_id int,
 program_update_date date,
 request_id int,
 attribute_category varchar(30),
 attribute1 varchar(240),
 attribute2 varchar(240),
 attribute3 varchar(240),
 attribute4 varchar(240),
 attribute5 varchar(240),
 attribute6 varchar(240),
 attribute7 varchar(240),
 attribute8 varchar(240),
 attribute9 varchar(240),
 attribute10 varchar(240),
 attribute11 varchar(240),
 attribute12 varchar(240),
 attribute13 varchar(240),
 attribute14 varchar(240),
 attribute15 varchar(240), primary key (course_id)
)   comment '问题表';


create index xx_questioin_n1 on sf_dev.xx_questioin(user_id);
create index xx_questioin_n2 on sf_dev.xx_questioin(course_id);


