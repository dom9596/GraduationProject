Create Table sf_dev.sys_role
(
 role_id int Not Null AUTO_INCREMENT COMMENT '��ID',
 role_code Varchar(100) Not Null COMMENT '����(ѧ��/����)',
 role_name Varchar(100) Not Null COMMENT '����',
 role_description Varchar(240) COMMENT '����',
 rstart_active_date Date Not Null COMMENT '��ʼ��Ч����',
 end_activie_date Date Not Null COMMENT '������Ч����',
 enable_flag Varchar(1) Default 'Y' Not Null COMMENT '���ñ�־',
 UPDATE_DATE Varchar(1) Not Null COMMENT '����ʱ��',
 CREATE_DATE Varchar(1) Not Null COMMENT '����ʱ��',
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
)   comment '��ɫ��';


Create Index sys_role_N1 On sf_dev.sys_role(role_id,role_code);
Create Index sys_role_N2 On sf_dev.sys_role();