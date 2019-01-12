create table sf_dev.xx_answer
(
 answer_id int not null auto_increment comment '表id',
 questioin_id int comment '题目id',
 questioin_type varchar(240) comment '题目类型',
 answer varchar(4000) comment '答案',
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
 attribute15 varchar(240), primary key (answer_id)
)   comment '答案表';


create index xx_answer_n1 on sf_dev.xx_answer(questioin_id);
create index xx_answer_n2 on sf_dev.xx_answer();


