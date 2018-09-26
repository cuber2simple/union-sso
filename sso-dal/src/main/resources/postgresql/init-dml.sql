insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000001', 'dashboard', '主面板', 'menu','00000000', '/sso/dashboard', 'home', 'dashboard', '主面板',
'sso.home', 0, 'N', 0, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000002', 'devops', '运维管理', 'menu','M00000001', null, 'setting', 'devops', '运维管理',
'sso.devops', 1, 'N', 1, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000003', 'project.setting', '配置中心', 'menu','M00000002', '/sso/conf', 'settings', 'config center', '配置中心',
'sso.settings', 1, 'Y', 2, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000004', 'center', '个人中心', 'menu','M00000001', null, 'edit', 'personal center', '个人中心',
'sso.personal_center', 2, 'N', 1, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000005', 'profile', '个人信息', 'menu','M00000004', '/sso/me', 'edit', 'personal profile', '个人信息',
'sso.profile', 1, 'Y', 2, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000006', 'message', '我的消息', 'menu','M00000004', '/message/me', 'mail', 'personal message', '我的消息',
'sso.message', 2, 'Y', 2, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000007', 'task', '我的流程', 'menu','M00000004', '/workflow/me', 'tasks', 'my task', '我的流程',
'sso.task', 3, 'Y', 2, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000008', 'start_task', '发起的流程', 'tab','M00000007', '/workflow/start_me', 'tag', 'start task', '发起的流程',
'sso.start_task', 1, 'Y', 3, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);


insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000009', 'designate_task', '我的流程', 'tab','M00000007', '/workflow/designated_me', 'tags', 'designated task', '指定的流程',
'sso.designate_task', 2, 'Y', 3, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000010', 'message_inbox', '我的收件箱', 'tab','M00000006', '/message/inbox', 'inbox', 'inbox', '收件箱',
'sso.message_inbox', 1, 'Y', 3, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_MENU (ID, MENU_NAME, MENU_DESC, MENU_TYPE, PARENT_ID, MENU_URL, MENU_ICON,
MENU_DISPLAY_EN, MENU_DISPLAY_ZH, I18N_KEY, TREE_SORT, TREE_LEAF, TREE_LEVEL, DOMAIN,
IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME,CREATE_DATETIME) values (
'M00000011', 'message_send', '我的发件箱', 'tab','M00000006', '/message/send', 'send', 'send', '发件箱',
'sso.message_send', 2, 'Y', 3, 'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000001', 'p_dashboard', '主面板', 'menu', 'M00000001', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000002', 'p_devops', '运维管理', 'menu', 'M00000002', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000003', 'p_conf', '配置中心', 'menu', 'M00000003', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000004', 'p_personal', '个人中心', 'menu', 'M00000004', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000005', 'p_profile', '个人信息', 'menu', 'M00000005', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000006', 'p_message', '个人消息', 'menu', 'M00000006', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);


insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000007', 'p_task', '个人流程', 'menu', 'M00000007', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000008', 'p_start_task', '发起的流程', 'menu', 'M00000008', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000009', 'p_designated_task', '指派我的任务', 'menu', 'M00000009', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);


insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000010', 'p_inbox', '收件箱', 'menu', 'M00000010', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_PERMISSION ( ID, PERMISSION_NAME, PERMISSION_DESC, PERMISSION_TYPE, AUTHORIZE_OBJ_ID,
DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values(
'P00000011', 'p_send', '发件箱', 'menu', 'M00000011', 'x', 'Y', '1', 'system', 'system',
current_timestamp, current_timestamp);

insert into T_ROLE (ID, ROLE_NAME, ROLE_DESC, ROLE_TYPE, DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID,
CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values  ('R00000000', 'ROLE_ROOT', '超级角色', 'permission',
'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_ROLE (ID, ROLE_NAME, ROLE_DESC, ROLE_TYPE, DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID,
CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values  ('R00000001', 'ROLE_USER', '用户角色', 'permission',
'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_ROLE (ID, ROLE_NAME, ROLE_DESC, ROLE_TYPE, DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID,
CREATE_USER_ID, UPDATE_DATETIME, CREATE_DATETIME) values  ('R00000002', 'ROLE_OP', '运维角色', 'permission',
'x', 'Y', '1', 'system', 'system', current_timestamp, current_timestamp);

insert into T_USER (ID, USER_NAME, NICK_NAME, PASSWORD, EMAIL, MOBILE, SEX, AVATAR, WX_OPEN_ID, DING_OPEN_ID, DOMAIN,
IS_SYS, LAST_LOGIN_ID, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, EXPIRE_DATETIME, CREATE_DATETIME )
values ( 'U00000001', 'admin', 'single dog', '{bcrypt}$2a$10$tEUpuQT0EoUiiUhT1XmJz.1JXgynFgbElXIhCDxOs1sY/BhWs1uhu',
'admin@ipaylinks.com', null, 'M', null,null, null, 'x','Y', null, '1','system', 'system', current_timestamp,
current_timestamp + '3month', current_timestamp);

insert into T_USER (ID, USER_NAME, NICK_NAME, PASSWORD, EMAIL, MOBILE, SEX, AVATAR, WX_OPEN_ID, DING_OPEN_ID, DOMAIN,
IS_SYS, LAST_LOGIN_ID, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, EXPIRE_DATETIME, CREATE_DATETIME )
values ( 'U00000002', 'cuber', 'cuber2simple', '{scrypt}$e0801$5nwVJ6iv9hlqx0j7GB3RKqBm5srOtctnu/JO2jFIM/ojzDJ/YNpNxG08gl6rTABzDya0AoB2GiBdCHaq77tgkw==$g49FMCpOMuXN5b4mjCJmwcTneGyHmFURQo+NlQyoLKg=',
'cuber.huang@ipaylinks.com', '08613248199190', 'M', null,null, null, 'x','Y', null, '1','system', 'system', current_timestamp,
current_timestamp + '3month', current_timestamp);

insert into T_USER (ID, USER_NAME, NICK_NAME, PASSWORD, EMAIL, MOBILE, SEX, AVATAR, WX_OPEN_ID, DING_OPEN_ID, DOMAIN,
IS_SYS, LAST_LOGIN_ID, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, EXPIRE_DATETIME, CREATE_DATETIME )
values ( 'U00000003', 'jimbo', 'jimbo', '{bcrypt}$2a$10$ExAXX9/htS/veWGknfxhM.Ee3bFL1jIO1mt3qSG2c56zb.GUoL/vS',
'jiangbo.peng@ipaylinks.com', '08618918435383', 'M', null,null, null, 'x','Y', null, '1','system', 'system', current_timestamp,
current_timestamp + '3month', current_timestamp);

insert into T_USER (ID, USER_NAME, NICK_NAME, PASSWORD, EMAIL, MOBILE, SEX, AVATAR, WX_OPEN_ID, DING_OPEN_ID, DOMAIN,
IS_SYS, LAST_LOGIN_ID, STATUS, UPDATE_USER_ID, CREATE_USER_ID, UPDATE_DATETIME, EXPIRE_DATETIME, CREATE_DATETIME )
values ( 'U00000004', 'tom', 'daqiang', '{pbkdf2}22cab2de5a93007439d086660c1265fd6f40e0d6dcf410f2d647f9b151cb54c50a770e2288016a9a',
'yiqiang.chen@ipaylinks.com', '08618918435383', 'M', null,null, null, 'x','Y', null, '1','system', 'system', current_timestamp,
current_timestamp + '3month', current_timestamp);

insert into T_USER_GROUP (ID, GROUP_NAME, GROUP_DESC, GROUP_TYPE, DOMAIN, IS_SYS, STATUS, UPDATE_USER_ID, CREATE_USER_ID,
UPDATE_DATETIME, CREATE_DATETIME) values ('G00000001', 'OP', '运维组', 'role', 'x', 'Y', '1', 'system','system', current_timestamp, current_timestamp);

insert into TR_USER_GROUP (ID, GROUP_ID, USER_ID, CONNECT_DATETIME) values ( 'RUG00000001', 'G00000001', 'U00000003', current_timestamp);

insert into TR_USER_ROLE (ID, ROLE_ID, CONNECT_TYPE, SBJ_USER_ID, CONNECT_DATETIME) values(
'RUR00000001', 'R00000002', 'group', 'G00000001',current_timestamp);

insert into TR_USER_ROLE (ID, ROLE_ID, CONNECT_TYPE, SBJ_USER_ID, CONNECT_DATETIME) values(
'RUR00000002', 'R00000001', 'user', 'U00000004',current_timestamp);

insert into TR_USER_ROLE (ID, ROLE_ID, CONNECT_TYPE, SBJ_USER_ID, CONNECT_DATETIME) values(
'RUR00000003', 'R00000000', 'user', 'U00000001',current_timestamp);

insert into TR_USER_ROLE (ID, ROLE_ID, CONNECT_TYPE, SBJ_USER_ID, CONNECT_DATETIME) values(
'RUR00000004', 'R00000000', 'user', 'U00000002',current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000001', 'R00000001', 'P00000001', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000002', 'R00000002', 'P00000002', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000003', 'R00000002', 'P00000003', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000004', 'R00000001', 'P00000004', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000005', 'R00000001', 'P00000005', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000006', 'R00000001', 'P00000006', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000007', 'R00000001', 'P00000007', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000008', 'R00000001', 'P00000008', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000009', 'R00000001', 'P00000009', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000010', 'R00000001', 'P00000010', current_timestamp);

insert into TR_ROLE_PERMISSION (ID, ROLE_ID, PERMISSION_ID, CONNECT_DATETIME) values(
'RRP00000011', 'R00000001', 'P00000011', current_timestamp);

