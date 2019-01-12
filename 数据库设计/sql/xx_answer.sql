create table sf_dev.xx_answer
(
 answer_id int not null auto_increment comment '��id',
 questioin_id int comment '��Ŀid',
 questioin_type varchar(240) comment '��Ŀ����',
 answer varchar(4000) comment '��',
 update_date varchar(1) not null comment '����ʱ��',
 create_date varchar(1) not null comment '����ʱ��',
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
)   comment '�𰸱�';


create index xx_answer_n1 on sf_dev.xx_answer(questioin_id);
create index xx_answer_n2 on sf_dev.xx_answer();


