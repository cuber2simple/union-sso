-- 用户表
CREATE TABLE t_user
(
	id  					    VARCHAR(64) NOT NULL PRIMARY KEY,
	user_name 				VARCHAR(256) NOT NULL,
	nick_name				  VARCHAR(256),
	password 				  VARCHAR(1024) NOT NULL,
	email 					  VARCHAR(256),
	mobile 					  VARCHAR(256),
	sex 					    VARCHAR(64),
	avatar 					  VARCHAR(1024),
	wx_open_id 				VARCHAR(256),
	ding_open_id			VARCHAR(256),
	domain 					  VARCHAR(256) NOT NULL,
	is_sys					  VARCHAR(2),
	last_login_id			VARCHAR(64),
	status          	VARCHAR(2),
	update_user_id    VARCHAR(64),
	create_user_id    VARCHAR(64),
	expire_datetime   TIMESTAMP WITHOUT TIME ZONE,
	update_datetime   TIMESTAMP WITHOUT TIME ZONE,
	create_datetime   TIMESTAMP WITHOUT TIME ZONE
);

CREATE sequence SEQ_USER_ID increment by 1 minvalue 1 no maxvalue start with 1;

CREATE UNIQUE INDEX I_USER_NAME_DOMAIN ON t_user (user_name,domain);

CREATE UNIQUE INDEX I_EMAIL_DOMAIN ON t_user (email,domain);

CREATE UNIQUE INDEX I_MOBILE_DOMAIN ON t_user (mobile,domain);

comment on table  t_user 					        is '用户表';
comment on column t_user.id 				      is '主键';
comment on column t_user.user_name 			  is '用户名';
comment on column t_user.nick_name 			  is '用户昵称';
comment on column t_user.password 			  is '用户密码';
comment on column t_user.email 				    is '用户邮箱';
comment on column t_user.mobile 			    is '用户手机';
comment on column t_user.sex 				      is '用户性别';
comment on column t_user.avatar 			    is '用户头像';
comment on column t_user.wx_open_id 		  is '微信公开ID';
comment on column t_user.ding_open_id 		is 'ding的用户号';
comment on column t_user.domain 			    is '所属domain';
comment on column t_user.is_sys 			    is '系统内置';
comment on column t_user.last_login_id 		is '最后一次登录ID';
comment on column t_user.status           is '用户状态 0/1/2/9/L 初始化/有效/无效/审核/状态被锁';
comment on column t_user.update_user_id   is '更新操作员';
comment on column t_user.create_user_id   is '创建操作员';
comment on column t_user.update_datetime  is '更新时间';
comment on column t_user.expire_datetime  is '过期时间';
comment on column t_user.create_datetime  is '创建时间';

--登录日志
CREATE TABLE t_login_log
(
	id  					    VARCHAR(64) NOT NULL PRIMARY KEY,
	trace_id				  VARCHAR(64),
	login_type				VARCHAR(256),
	user_name         VARCHAR(256),
	user_id					  VARCHAR(64),
	device					  VARCHAR(256),
	login_ip				  VARCHAR(256),
	user_agent        text,
	login_result			VARCHAR(64),
	fail_reason				text,
	logout_datetime		TIMESTAMP WITHOUT TIME ZONE,
	login_datetime    TIMESTAMP WITHOUT TIME ZONE,
	create_datetime   TIMESTAMP WITHOUT TIME ZONE
);
CREATE INDEX I_LOGIN_USER_ID ON t_login_log (user_id);

comment on table  t_login_log 					          is '登陆日志表';
comment on column t_login_log.id 				          is '主键';
comment on column t_login_log.trace_id 			      is '轨迹ID';
comment on column t_login_log.login_type 			    is '登陆类型 password/phone/email/wechat/ding';
comment on column t_login_log.user_id 			      is '用户ID';
comment on column t_login_log.device 				      is '设备类型';
comment on column t_login_log.login_ip 		        is '登陆IP';
comment on column t_login_log.user_agent 			    is '用户的agent';
comment on column t_login_log.login_result 		    is '登陆结果 1/2/9/r  成功/失败/异常/风控拦截';
comment on column t_login_log.fail_reason 		    is '错误原因';
comment on column t_login_log.logout_datetime 		is '登出时间';
comment on column t_login_log.login_datetime 	    is '登陆时间';
comment on column t_login_log.create_datetime 		is '创建时间';

CREATE TABLE t_operate_log
(
	id  					      VARCHAR(64) NOT NULL PRIMARY KEY,
	login_id				    VARCHAR(64),
	trace_id				    VARCHAR(256),
	user_id					    VARCHAR(256),
	app						      VARCHAR(256),
	host_name				    VARCHAR(256),
	action					    VARCHAR(256),
	url						      VARCHAR(256),
	content					    text,
	operate_result	    VARCHAR(64),
	complete_datetime		TIMESTAMP WITHOUT TIME ZONE,
	update_datetime     TIMESTAMP WITHOUT TIME ZONE,
	create_datetime     TIMESTAMP WITHOUT TIME ZONE
);
CREATE INDEX I_OPER_LOGIN_ID ON t_operate_log (login_id);

comment on table  t_operate_log 					        is '操作日志表';
comment on column t_operate_log.id 				        is '主键';
comment on column t_operate_log.login_id 			    is '登录ID';
comment on column t_operate_log.trace_id 			    is '轨迹ID';
comment on column t_operate_log.user_id 			    is '用户ID';
comment on column t_operate_log.app 				      is '项目名';
comment on column t_operate_log.host_name 		    is '主机名';
comment on column t_operate_log.action 			      is '动作名';
comment on column t_operate_log.url 				      is '操作的url';
comment on column t_operate_log.content 			    is '操作内容';
comment on column t_operate_log.operate_result 		is '操作日志,1/2/9  成功/失败/异常';
comment on column t_operate_log.complete_datetime 		is '完成时间';
comment on column t_operate_log.update_datetime 		  is '更新时间';
comment on column t_operate_log.create_datetime 		  is '创建时间';

CREATE TABLE t_user_group
(
	id  					    VARCHAR(64) NOT NULL PRIMARY KEY,
	group_name 				VARCHAR(256) NOT NULL,
	group_desc				VARCHAR(1024),
	group_type        VARCHAR(256),
	domain				    VARCHAR(256),
	is_sys					  VARCHAR(2),
	status          	VARCHAR(2),
	update_user_id    VARCHAR(64),
	create_user_id    VARCHAR(64),
	update_datetime     	TIMESTAMP WITHOUT TIME ZONE,
	create_datetime     	TIMESTAMP WITHOUT TIME ZONE
);

CREATE sequence SEQ_USER_GROUP_ID increment by 1 minvalue 1 no maxvalue start with 1;

CREATE UNIQUE INDEX I_GROUP_NAME_DOMAIN ON t_user_group (group_name,domain);

comment on table  t_user_group                  is '用户组';
comment on column t_user_group.id               is '主键';
comment on column t_user_group.group_name       is '组名';
comment on column t_user_group.group_desc       is '组描述';
comment on column t_user_group.group_type       is '组类型 role/report  角色组/报警组';
comment on column t_user_group.domain           is '所属domain';
comment on column t_user_group.is_sys           is '是否系统内置';
comment on column t_user_group.status           is '用户状态 0/1/2/9 初始化/有效/无效/审核';
comment on column t_user_group.update_user_id   is '更新操作员';
comment on column t_user_group.create_user_id   is '创建操作员';
comment on column t_user_group.update_datetime      is '更新时间';
comment on column t_user_group.create_datetime      is '创建时间';

CREATE TABLE t_role
(
	id  					    VARCHAR(64) NOT NULL PRIMARY KEY,
	role_name 				VARCHAR(256) NOT NULL,
	role_desc				  VARCHAR(1024),
	role_type				  VARCHAR(256),
	domain 			      VARCHAR(256) NOT NULL,
	is_sys					  VARCHAR(2),
	status          	VARCHAR(2),
	update_user_id    VARCHAR(64),
	create_user_id    VARCHAR(64),
	update_datetime   TIMESTAMP WITHOUT TIME ZONE,
	create_datetime   TIMESTAMP WITHOUT TIME ZONE
);

CREATE sequence SEQ_ROLE_ID increment by 1 minvalue 1 no maxvalue start with 1;
CREATE UNIQUE INDEX I_ROLE_NAME_DOMAIN ON t_role (role_name,domain);

comment on table  t_role                      is '权限表';
comment on column t_role.id                   is '主键';
comment on column t_role.role_name            is '权限名';
comment on column t_role.role_desc            is '权限描述';
comment on column t_role.role_type            is '权限类型 permission/workflow 权限角色/流程角色';
comment on column t_role.domain               is '所属domain';
comment on column t_role.is_sys               is '是否系统内置';
comment on column t_role.status               is '用户状态 0/1/2/9 初始化/有效/无效/审核';
comment on column t_role.update_user_id       is '更新操作员';
comment on column t_role.create_user_id       is '创建操作员';
comment on column t_role.update_datetime      is '更新时间';
comment on column t_role.create_datetime      is '创建时间';

CREATE TABLE t_resource
(
	id  					            VARCHAR(64) NOT NULL PRIMARY KEY,
	resource_name 				    VARCHAR(256) NOT NULL,
	resource_desc             VARCHAR(1024),
	resource_type             VARCHAR(256),
	parent_id       		      VARCHAR(64),
	resource_url				      VARCHAR(256),
	resource_icon				      VARCHAR(256) NOT NULL,
	resource_zh_name			    VARCHAR(256),
	i18n_key				          VARCHAR(256),
	tree_sort				          SMALLINT NOT NULL,
	tree_leaf				          VARCHAR(2),
	tree_level 				        SMALLINT NOT NULL,
	domain 			              VARCHAR(256) NOT NULL,
	is_sys					          VARCHAR(2),
	status          		      VARCHAR(2),
	update_user_id            VARCHAR(64),
	create_user_id            VARCHAR(64),
	update_datetime     		  TIMESTAMP WITHOUT TIME ZONE,
	create_datetime     		  TIMESTAMP WITHOUT TIME ZONE
);
CREATE sequence SEQ_RESOURCE_ID increment by 1 minvalue 1 no maxvalue start with 1;

CREATE UNIQUE INDEX I_RESOURCE_NAME_DOMAIN ON t_resource (resource_name,domain);

CREATE INDEX I_PARENT_ID ON t_resource (parent_id);

comment on table  t_resource                        is '资源表';
comment on column t_resource.id                     is '主键';
comment on column t_resource.resource_name          is '资源名';
comment on column t_resource.resource_desc          is '资源描述';
comment on column t_resource.resource_type          is '资源类型  menu/element 菜单/元素';
comment on column t_resource.parent_id              is '父资源ID';
comment on column t_resource.resource_url           is '资源URL';
comment on column t_resource.resource_icon          is '资源ICON';
comment on column t_resource.resource_zh_name       is '资源中文名';
comment on column t_resource.i18n_key               is '资源i18n_key';
comment on column t_resource.tree_sort              is '资源次序';
comment on column t_resource.tree_leaf              is '是否子资源 Y/N 是否子资源';
comment on column t_resource.tree_level             is '资源层级';
comment on column t_resource.domain                 is '所属domain';
comment on column t_resource.is_sys                 is '是否系统内置';
comment on column t_resource.status                 is '状态 0/1/2/9 初始化/有效/无效/审核';
comment on column t_resource.update_user_id         is '更新操作员';
comment on column t_resource.create_user_id         is '创建操作员';
comment on column t_resource.update_datetime        is '更新时间';
comment on column t_resource.create_datetime        is '创建时间';

CREATE TABLE tr_user_group
(
  id  					        VARCHAR(64) NOT NULL PRIMARY KEY,
	group_id 	            VARCHAR(64) NOT NULL,
	user_id 	            VARCHAR(64) NOT NULL,
	connect_datetime     	TIMESTAMP WITHOUT TIME ZONE
);

CREATE sequence SEQ_TR_USER_GROUP_ID increment by 1 minvalue 1 no maxvalue start with 1;
CREATE UNIQUE INDEX I_TR_USER_GROUP ON tr_user_group (group_id,user_id);
CREATE INDEX I_TR_USER_ID ON tr_user_group (user_id);

comment on table  tr_user_group                    is '用户和用户组关联表';
comment on column tr_user_group.id                 is '主键';
comment on column tr_user_group.group_id           is '组ID';
comment on column tr_user_group.user_id            is '用户ID';
comment on column tr_user_group.connect_datetime   is '关联时间';

CREATE TABLE tr_user_role
(
  id  					        VARCHAR(64) NOT NULL PRIMARY KEY,
	role_id 	            VARCHAR(64) NOT NULL,
	connect_type          VARCHAR(256) NOT NULL,
	sbj_user_id 	        VARCHAR(64) NOT NULL,
	connect_datetime     	TIMESTAMP WITHOUT TIME ZONE
);

CREATE sequence SEQ_TR_USER_ROLE_ID increment by 1 minvalue 1 no maxvalue start with 1;
CREATE INDEX I_TR_SBJ_USER_ID ON tr_user_role (sbj_user_id);
CREATE INDEX I_TR_ROLE_ID ON tr_user_role (role_id);


comment on table  tr_user_role                    is '用户和用户组关联表';
comment on column tr_user_role.id                 is '主键';
comment on column tr_user_role.role_id            is '角色ID';
comment on column tr_user_role.connect_type       is '关联类型 user/group  用户关联/用户组关联';
comment on column tr_user_role.sbj_user_id        is '关联的subject id';
comment on column tr_user_role.connect_datetime   is '关联时间';

CREATE TABLE tr_role_resource
(
  id  					        VARCHAR(64) NOT NULL PRIMARY KEY,
	role_id 	            VARCHAR(64) NOT NULL,
	resource_id 	      VARCHAR(64) NOT NULL,
	connect_datetime     	    TIMESTAMP WITHOUT TIME ZONE
);
CREATE sequence SEQ_TR_RESOURCE_ROLE_ID increment by 1 minvalue 1 no maxvalue start with 1;
CREATE UNIQUE INDEX I_TR_ROLE_PERMISSION ON tr_role_resource (role_id,resource_id);
CREATE INDEX I_TR_ROLE_ID_P ON tr_role_resource (role_id);
CREATE INDEX I_TR_RESOURCE_ID_P ON tr_role_resource (resource_id);

comment on table  tr_role_resource                    is '用户和用户组关联表';
comment on column tr_role_resource.id                 is '主键';
comment on column tr_role_resource.role_id            is '角色ID';
comment on column tr_role_resource.resource_id        is '资源ID';
comment on column tr_role_resource.connect_datetime   is '关联时间';