prompt PL/SQL Developer import file
prompt Created on 2018年5月13日 by a
set feedback off
set define off
prompt Creating SYS_COMMAND...
create table SYS_COMMAND
(
  SC_ID      VARCHAR2(62) not null,
  SC_CNAME   VARCHAR2(62),
  SC_CCODE   VARCHAR2(62),
  SC_CTYPE   NUMBER(6),
  SC_CINTRO  VARCHAR2(200),
  SC_CSQL    VARCHAR2(2000),
  SC_STATE   NUMBER(6),
  SC_IDT     DATE default SYSDATE,
  SC_UDT     DATE default SYSDATE,
  SC_OPTUSER VARCHAR2(62),
  SC_RC1     VARCHAR2(100),
  SC_RC2     VARCHAR2(100),
  SC_RC3     VARCHAR2(100)
)
;
comment on table SYS_COMMAND
  is '命令';
comment on column SYS_COMMAND.SC_ID
  is '唯一标识';
comment on column SYS_COMMAND.SC_CNAME
  is '命令名称';
comment on column SYS_COMMAND.SC_CCODE
  is '命令标识';
comment on column SYS_COMMAND.SC_CTYPE
  is '命令类型';
comment on column SYS_COMMAND.SC_CINTRO
  is '命令介绍';
comment on column SYS_COMMAND.SC_CSQL
  is '命令详情';
comment on column SYS_COMMAND.SC_STATE
  is '1正常 -1 删除';
comment on column SYS_COMMAND.SC_IDT
  is '创建时间';
comment on column SYS_COMMAND.SC_UDT
  is '更新时间';
comment on column SYS_COMMAND.SC_OPTUSER
  is '操作人';
alter table SYS_COMMAND
  add constraint SC_ID primary key (SC_ID);

prompt Creating SYS_CONFIG...
create table SYS_CONFIG
(
  CC_ID     VARCHAR2(64),
  CC_TITLE  VARCHAR2(64),
  CC_KEY    VARCHAR2(64),
  CC_VALUE  VARCHAR2(64),
  CC_SORT   NUMBER,
  CC_STATE  NUMBER,
  CC_UDT    DATE,
  CC_UPUSER VARCHAR2(64),
  CC_RC1    VARCHAR2(64),
  CC_RC2    VARCHAR2(64),
  CC_RC3    VARCHAR2(64),
  CC_RC4    NUMBER
)
;
comment on table SYS_CONFIG
  is '系统配置主体表';
comment on column SYS_CONFIG.CC_ID
  is '系统配置ID';
comment on column SYS_CONFIG.CC_TITLE
  is '系统配置名称';
comment on column SYS_CONFIG.CC_KEY
  is '系统配置 key';
comment on column SYS_CONFIG.CC_VALUE
  is 'value值';
comment on column SYS_CONFIG.CC_SORT
  is '排序';
comment on column SYS_CONFIG.CC_STATE
  is '状态';
comment on column SYS_CONFIG.CC_UDT
  is '更新时间';
comment on column SYS_CONFIG.CC_UPUSER
  is '更新人';

prompt Creating SYS_CONFIG_FIELD...
create table SYS_CONFIG_FIELD
(
  CCF_ID    VARCHAR2(64),
  CCF_KEY   VARCHAR2(64),
  CCF_VALUE VARCHAR2(125),
  CCF_TITLE VARCHAR2(32),
  CCF_TIP   VARCHAR2(64),
  CCF_RULE  VARCHAR2(64),
  CCF_TYPE  VARCHAR2(64),
  CCF_SORT  NUMBER,
  CCF_HTML  VARCHAR2(525),
  CCF_PID   VARCHAR2(64),
  CCF_STATE NUMBER,
  CCF_STYLE VARCHAR2(225),
  CCF_UDT   DATE,
  CCF_EDIT  NUMBER,
  CCF_RC1   VARCHAR2(64),
  CCF_RC2   VARCHAR2(64),
  CCF_RC3   VARCHAR2(64)
)
;
comment on table SYS_CONFIG_FIELD
  is '系统配置（存放所有字段，纵向表，动态扩展）';
comment on column SYS_CONFIG_FIELD.CCF_ID
  is '唯一标示id';
comment on column SYS_CONFIG_FIELD.CCF_KEY
  is '变量名【3-30】';
comment on column SYS_CONFIG_FIELD.CCF_VALUE
  is '变量值';
comment on column SYS_CONFIG_FIELD.CCF_TITLE
  is '变量标题【页面显示标题】';
comment on column SYS_CONFIG_FIELD.CCF_TIP
  is '提示信息';
comment on column SYS_CONFIG_FIELD.CCF_RULE
  is '验证规则';
comment on column SYS_CONFIG_FIELD.CCF_TYPE
  is '数据类型';
comment on column SYS_CONFIG_FIELD.CCF_SORT
  is '排序';
comment on column SYS_CONFIG_FIELD.CCF_HTML
  is '显示的html代码';
comment on column SYS_CONFIG_FIELD.CCF_PID
  is '父类ID';
comment on column SYS_CONFIG_FIELD.CCF_STATE
  is '数据状态';
comment on column SYS_CONFIG_FIELD.CCF_STYLE
  is '样式';
comment on column SYS_CONFIG_FIELD.CCF_UDT
  is '更新时间';
comment on column SYS_CONFIG_FIELD.CCF_EDIT
  is '是否可编辑';

prompt Loading SYS_COMMAND...
insert into SYS_COMMAND (SC_ID, SC_CNAME, SC_CCODE, SC_CTYPE, SC_CINTRO, SC_CSQL, SC_STATE, SC_IDT, SC_UDT, SC_OPTUSER, SC_RC1, SC_RC2, SC_RC3)
values ('68c4bd8392564ab280d814e0e3092f13', '查询系统用户列表', 'C_SYS_USERS', 1, '查询系统用户列表', 'select username 用户,account_status 用户状态  from dba_users', 1, to_date('15-02-2018 13:54:39', 'dd-mm-yyyy hh24:mi:ss'), to_date('15-02-2018 13:54:39', 'dd-mm-yyyy hh24:mi:ss'), 'admin', null, null, null);
insert into SYS_COMMAND (SC_ID, SC_CNAME, SC_CCODE, SC_CTYPE, SC_CINTRO, SC_CSQL, SC_STATE, SC_IDT, SC_UDT, SC_OPTUSER, SC_RC1, SC_RC2, SC_RC3)
values ('2c5b38ac8964454b8e10cc543e9ba752', '查询ORACLE当前连接数', 'C_SYS_CON_NUM', 1, '查询ORACLE当前连接数', 'select count(1) 当前的数据库连接数 from v$process', 1, to_date('15-02-2018 13:54:36', 'dd-mm-yyyy hh24:mi:ss'), to_date('15-02-2018 13:54:36', 'dd-mm-yyyy hh24:mi:ss'), 'admin', null, null, null);
insert into SYS_COMMAND (SC_ID, SC_CNAME, SC_CCODE, SC_CTYPE, SC_CINTRO, SC_CSQL, SC_STATE, SC_IDT, SC_UDT, SC_OPTUSER, SC_RC1, SC_RC2, SC_RC3)
values ('a0e76fd2154548b4875550370fe2a605', '查询系统表列表', 'C_SYS_TABLES', 1, '查询业务表概要', 'SELECT t.table_name 表名称,t.num_rows 记录条数 FROM USER_TABLES t', 1, to_date('16-02-2018 00:10:38', 'dd-mm-yyyy hh24:mi:ss'), to_date('16-02-2018 00:10:38', 'dd-mm-yyyy hh24:mi:ss'), 'admin', null, null, null);
insert into SYS_COMMAND (SC_ID, SC_CNAME, SC_CCODE, SC_CTYPE, SC_CINTRO, SC_CSQL, SC_STATE, SC_IDT, SC_UDT, SC_OPTUSER, SC_RC1, SC_RC2, SC_RC3)
values ('02082522b92a44b697552c48d4f3be3a', '测试命令', 'test_COM', 1, '测试查询', 'select  *  from sys_menus', null, to_date('15-02-2018 00:34:29', 'dd-mm-yyyy hh24:mi:ss'), to_date('15-02-2018 00:34:29', 'dd-mm-yyyy hh24:mi:ss'), 'admin', null, null, null);
insert into SYS_COMMAND (SC_ID, SC_CNAME, SC_CCODE, SC_CTYPE, SC_CINTRO, SC_CSQL, SC_STATE, SC_IDT, SC_UDT, SC_OPTUSER, SC_RC1, SC_RC2, SC_RC3)
values ('91600f16979c4b00a289eafbfb0cd36e', '查询ORACLE最大连接数', 'C_SYS_CON_MAX', 1, '查询系统用户列表123', 'select value  最大连接数 from v$parameter where name =''processes''', 1, to_date('15-02-2018 13:55:05', 'dd-mm-yyyy hh24:mi:ss'), to_date('15-02-2018 13:55:05', 'dd-mm-yyyy hh24:mi:ss'), 'admin', null, null, null);
commit;
prompt 5 records loaded
prompt Loading SYS_CONFIG...
insert into SYS_CONFIG (CC_ID, CC_TITLE, CC_KEY, CC_VALUE, CC_SORT, CC_STATE, CC_UDT, CC_UPUSER, CC_RC1, CC_RC2, CC_RC3, CC_RC4)
values ('1', '登录方式', 'SYS_LOGINTYPE_SET', null, 1, 1, null, 'admin', null, null, null, null);
insert into SYS_CONFIG (CC_ID, CC_TITLE, CC_KEY, CC_VALUE, CC_SORT, CC_STATE, CC_UDT, CC_UPUSER, CC_RC1, CC_RC2, CC_RC3, CC_RC4)
values ('2', '邮箱配置', 'SYS_EMAIL_SET', null, 2, 1, null, 'admin', null, null, null, null);
commit;
prompt 2 records loaded
prompt Loading SYS_CONFIG_FIELD...
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('1', 'F_LOGIN_ACCOUNT', '1', '账号登录', '支持账号登录', null, 'radio', 1, '<div class=''row''><div class=''input-group''><label><input  name=''1'' value=''1'' type=''radio''/>支持</label></div></div>', '1', 1, null, to_date('17-04-2018 18:02:24', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('2', 'F_LOGIN_PHONE', '0', '手机登录', '支持手机登录', null, 'radio', 2, '<div class=''row''><div class=''input-group''><label><input  name=''2'' value=''1'' type=''radio''/>支持</label>&nbsp;&nbsp;<label><input name=''2'' value=''0'' type=''radio''/>禁用</label></div></div>', '1', 1, null, to_date('17-04-2018 18:02:24', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('3', 'F_LOGIN_EMAIL', '1', '邮箱登录', '支持邮箱登录', null, 'radio', 3, '<div class=''row''><div class=''input-group''><label><input  name=''3'' value=''1'' type=''radio''/>支持</label>&nbsp;&nbsp;<label><input name=''3'' value=''0'' type=''radio''/>禁用</label></div></div>', '1', 1, null, to_date('17-04-2018 18:02:24', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('4', 'F_EMAIL_TYPE', 'test', '邮件发送方式' || chr(9) || '', null, null, 'varchar', 1, null, '2', 1, null, to_date('16-04-2018 23:16:59', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('5', 'F_EMAIL_HOST', '121.12.23123.213', '服务器', null, null, 'varchar', 2, null, '2', 1, null, to_date('16-04-2018 23:16:59', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('6', 'F_EMAIL_PORT', '8090', '端口', null, null, 'varchar', 3, null, '2', 1, null, to_date('16-04-2018 23:16:59', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('7', 'F_EMAIL_USER', 'zzh', '用户名', null, null, 'varchar', 4, null, '2', 1, null, to_date('16-04-2018 23:16:59', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('8', 'F_EMAIL_PWD', '233', '密码', null, null, 'varchar', 5, null, '2', 1, null, to_date('16-04-2018 23:17:00', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('9', 'F_EMAIL_VERTYPE', 'md5', '验证方式', null, null, 'varchar', 6, null, '2', 1, null, to_date('16-04-2018 23:17:00', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('10', 'F_EMAIL_FROM', 'zst', '发件人邮箱', null, null, 'varchar', 7, null, '2', 1, null, to_date('16-04-2018 23:17:00', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
insert into SYS_CONFIG_FIELD (CCF_ID, CCF_KEY, CCF_VALUE, CCF_TITLE, CCF_TIP, CCF_RULE, CCF_TYPE, CCF_SORT, CCF_HTML, CCF_PID, CCF_STATE, CCF_STYLE, CCF_UDT, CCF_EDIT, CCF_RC1, CCF_RC2, CCF_RC3)
values ('11', 'F_EMAIL_FRO', 'pid', '其他', null, null, 'varchar', 8, null, '2', 1, null, to_date('16-04-2018 23:17:00', 'dd-mm-yyyy hh24:mi:ss'), 1, null, null, null);
commit;
prompt 11 records loaded
set feedback on
set define on
prompt Done.
