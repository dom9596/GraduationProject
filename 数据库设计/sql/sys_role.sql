Create Table sf_dev.sys_role
(
 role_id int Not Null AUTO_INCREMENT COMMENT '表ID',
 role_code Varchar(100) Not Null COMMENT '编码(学号/工号)',
 role_name Varchar(100) Not Null COMMENT '名称',
 role_description Varchar(240) COMMENT '描述',
 rstart_active_date Date Not Null COMMENT '开始生效日期',
 end_activie_date Date Not Null COMMENT '截至生效日期',
 enable_flag Varchar(1) Default 'Y' Not Null COMMENT '启用标志',
 UPDATE_DATE Varchar(1) Not Null COMMENT '更新时间',
 CREATE_DATE Varchar(1) Not Null COMMENT '创建时间',
 CREATION_DATE datetime default CURRENT_TIMESTAMP not null,
 CREATED_BY int default -1 not null,
 LAST_UPDATED_BY int default -1 not null,
 LAST_UPDATE_DATE datetime default CURRENT_TIMESTAMP not null,
 LAST_UPDATE_LOGIN int,
 PROGRAM_APPLICATION_ID int,
 PROGRAM_ID int,
 PROGRAM_UPDATE_DATE DATE,
 REQUEST_ID int,
 ATTRIBUTE_CATEGORY VARCHAR(30),
 ATTRIBUTE1 VARCHAR(240),
 ATTRIBUTE2 VARCHAR(240),
 ATTRIBUTE3 VARCHAR(240),
 ATTRIBUTE4 VARCHAR(240),
 ATTRIBUTE5 VARCHAR(240),
 ATTRIBUTE6 VARCHAR(240),
 ATTRIBUTE7 VARCHAR(240),
 ATTRIBUTE8 VARCHAR(240),
 ATTRIBUTE9 VARCHAR(240),
 ATTRIBUTE10 VARCHAR(240),
 ATTRIBUTE11 VARCHAR(240),
 ATTRIBUTE12 VARCHAR(240),
 ATTRIBUTE13 VARCHAR(240),
 ATTRIBUTE14 VARCHAR(240),
 ATTRIBUTE15 VARCHAR(240), primary key (role_id)
)   comment '角色表';


Create Index sys_role_N1 On sf_dev.sys_role(role_id,role_code);
Create Index sys_role_N2 On sf_dev.sys_role();