-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `parentid` int(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `url` varchar(255) NOT NULL,
  `num` int(11) DEFAULT NULL,
  `levels` int(11) DEFAULT NULL,
  `tips` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', null, null, '用户管理', 'fa-columns', '/userpage', null, '1', null);
INSERT INTO `menu` VALUES ('2', null, null, '部门管理', 'fa-clone', '/deptpage', null, '1', null);
INSERT INTO `menu` VALUES ('3', '', null, '角色管理', 'fa-tags', '/rolepage', null, '1', '');
INSERT INTO `menu` VALUES ('4', '', null, '我的便签', 'fa-sticky-note', '/memopage', null, '1', '');
INSERT INTO `menu` VALUES ('5', null, null, '发送通知', 'fa-share', '/noticepage', null, '1', null);
INSERT INTO `menu` VALUES ('6', null, null, '登陆日志', 'fa-tags', '/loginlogpage', null, '2', null);
INSERT INTO `menu` VALUES ('8', null, null, '操作日志', 'fa-tags', '/operationlogpage', null, '2', null);
INSERT INTO `menu` VALUES ('9', null, null, '请假', 'fa-calendar-plus-o', '/leavepage', null, '1', '');
INSERT INTO `menu` VALUES ('10', null, null, '请假审核', 'fa-calendar-plus-o', '/operationleavepage', null, '1', null);


-- ----------------------------
-- Table structure for memo
-- ----------------------------
DROP TABLE IF EXISTS `memo`;
CREATE TABLE `memo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of memo
-- ----------------------------
INSERT INTO `memo` VALUES ('15', '明天要做的事', '1.早上骑行\n2.中午需要去公司拿材料', '2017/11/14 下午5:10:25', '2');
INSERT INTO `memo` VALUES ('16', '切勿', '王企鹅群无', '2018/1/4 下午8:43:52', '2');


-- ----------------------------
-- Table structure for login_log
-- ----------------------------
DROP TABLE IF EXISTS `login_log`;
CREATE TABLE `login_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `logname` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of login_log
-- ----------------------------
INSERT INTO `login_log` VALUES ('63', '登陆', '2', '2017-11-28 18:33:08', '成功', 'ttt', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('64', '登陆失败', null, '2018-01-04 20:34:02', '成功', '用户名：admin,原因：账号与密码不匹配', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('65', '登陆', '4', '2018-01-04 20:34:54', '成功', 'admin', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('66', '登陆失败', null, '2018-01-04 20:36:35', '成功', '用户名：admin,原因：账号与密码不匹配', '127.0.0.1');
INSERT INTO `login_log` VALUES ('67', '登陆', '4', '2018-01-04 20:36:42', '成功', 'admin', '127.0.0.1');
INSERT INTO `login_log` VALUES ('68', '退出', '4', '2018-01-04 20:37:33', '成功', 'admin', '127.0.0.1');
INSERT INTO `login_log` VALUES ('69', '登陆', '4', '2018-01-04 20:37:39', '成功', 'admin', '127.0.0.1');
INSERT INTO `login_log` VALUES ('70', '退出', '4', '2018-01-04 20:42:06', '成功', 'admin', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('71', '登陆失败', null, '2018-01-04 20:42:15', '成功', '用户名：ttt,原因：账号与密码不匹配', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('72', '登陆失败', null, '2018-01-04 20:42:24', '成功', '用户名：ttt,原因：账号与密码不匹配', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('73', '登陆失败', null, '2018-01-04 20:43:21', '成功', '用户名：ttt,原因：账号与密码不匹配', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('74', '登陆失败', null, '2018-01-04 20:43:27', '成功', '用户名：ttt,原因：账号与密码不匹配', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('75', '登陆', '2', '2018-01-04 20:43:31', '成功', 'ttt', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('76', '退出', '2', '2018-01-04 20:47:06', '成功', 'ttt', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('77', '登陆', '2', '2018-01-04 20:47:13', '成功', 'ttt', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('78', '登陆', '2', '2018-01-06 15:43:24', '成功', 'ttt', '0:0:0:0:0:0:0:1');
INSERT INTO `login_log` VALUES ('79', '登陆', '2', '2018-01-06 17:35:23', '成功', 'ttt', '0:0:0:0:0:0:0:1');

-- ----------------------------
-- Table structure for leaves
-- ----------------------------
DROP TABLE IF EXISTS `leaves`;
CREATE TABLE `leaves` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `isfinish` int(11) NOT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leaves
-- ----------------------------
INSERT INTO `leaves` VALUES ('4', '事假', '2018-01-09 00:00:00', '2018-01-28 00:00:00', '是非得失防守打法', '2', 'ttt', '0', '2018-01-04 20:49:12');
INSERT INTO `leaves` VALUES ('5', '事假', '2018-01-30 00:00:00', '2018-02-08 00:00:00', '胜多负少东方闪电', '2', 'ttt', '1', '2018-01-04 20:49:42');


-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` int(11) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '1', '未分配');
INSERT INTO `dept` VALUES ('2', '2', '总公司');
INSERT INTO `dept` VALUES ('4', '4', '运营部');
INSERT INTO `dept` VALUES ('5', '5', '人事部');
INSERT INTO `dept` VALUES ('6', null, '飞碟说');
INSERT INTO `dept` VALUES ('7', null, '3333');
INSERT INTO `dept` VALUES ('8', null, '32');
INSERT INTO `dept` VALUES ('9', null, 'rwer');
INSERT INTO `dept` VALUES ('10', null, 'werr');
INSERT INTO `dept` VALUES ('11', null, 'rwerwr');
INSERT INTO `dept` VALUES ('12', null, 'wersdf');
INSERT INTO `dept` VALUES ('13', null, 'vxcv');
INSERT INTO `dept` VALUES ('14', null, 'sfdfsdffsdfsdf');

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL,
  `avator` varchar(255) NOT NULL,
  `deptid` int(11) NOT NULL,
  `roleid` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'ttt', '9990775155c3518a0d7917f7780b24aa', '2', '1', '2', '1');
INSERT INTO `user` VALUES ('4', 'admin', '827ccb0eea8a706c4c34a16891f84e7b', '4', '0', '1', '1');
INSERT INTO `user` VALUES ('5', '刚发的', '96e79218965eb72c92a549dd5a330112', '1af85', '0', '6', '1');
INSERT INTO `user` VALUES ('6', 'test', '1', '176e5', '0', '1', '1');


DROP TABLE IF EXISTS `thing`;
CREATE TABLE `thing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `name1` varchar(255) DEFAULT NULL,
  `name2` varchar(255) DEFAULT NULL,
  `name3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of thing
-- ----------------------------
INSERT INTO `thing` VALUES ('1', '1', '1', '1', '1', '1', '1');
INSERT INTO `thing` VALUES ('2', '2', '2', '2', '2', '2', '2');
INSERT INTO `thing` VALUES ('3', '4', '3', '3', '3', '3', '3');
INSERT INTO `thing` VALUES ('4', '4', '4', '4', '4', '4', '4');
INSERT INTO `thing` VALUES ('5', '5', '5', '5', '5', '5', '5');
INSERT INTO `thing` VALUES ('6', '6', '6', '6', '6', '6', '6');
INSERT INTO `thing` VALUES ('7', '7', '7', '7', '7', '7', '7');
INSERT INTO `thing` VALUES ('8', '8', '8', '8', '8', '8', '8');
INSERT INTO `thing` VALUES ('9', '9', '9', '9', '9', '9', '9');
INSERT INTO `thing` VALUES ('10', '10', '10', '10', '10', '10', '10');
INSERT INTO `thing` VALUES ('11', 'aaa', 'fds', 'fds', 'fd', 'fds', 'fdas');

DROP TABLE IF EXISTS `role_menu_relation`;
CREATE TABLE `role_menu_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleid` int(11) NOT NULL,
  `menuid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu_relation
-- ----------------------------
INSERT INTO `role_menu_relation` VALUES ('85', '2', '4');
INSERT INTO `role_menu_relation` VALUES ('86', '2', '9');
INSERT INTO `role_menu_relation` VALUES ('87', '18', '1');
INSERT INTO `role_menu_relation` VALUES ('88', '18', '2');
INSERT INTO `role_menu_relation` VALUES ('89', '18', '3');
INSERT INTO `role_menu_relation` VALUES ('126', '1', '1');
INSERT INTO `role_menu_relation` VALUES ('127', '1', '2');
INSERT INTO `role_menu_relation` VALUES ('128', '1', '3');
INSERT INTO `role_menu_relation` VALUES ('129', '1', '4');
INSERT INTO `role_menu_relation` VALUES ('130', '1', '5');
INSERT INTO `role_menu_relation` VALUES ('131', '1', '6');
INSERT INTO `role_menu_relation` VALUES ('132', '1', '8');
INSERT INTO `role_menu_relation` VALUES ('133', '1', '9');
INSERT INTO `role_menu_relation` VALUES ('134', '1', '10');

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `roles` varchar(255) NOT NULL,
  `tips` varchar(255) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_ADMIN', '超级管理员');
INSERT INTO `role` VALUES ('2', 'ROLE_USER', '用户');
INSERT INTO `role` VALUES ('18', 'ROLE_BUZHANG', '部长');


DROP TABLE IF EXISTS `operation_log`;
CREATE TABLE `operation_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `logtype` varchar(255) DEFAULT NULL,
  `logname` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `classname` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of operation_log
-- ----------------------------
INSERT INTO `operation_log` VALUES ('35', '业务日志', '用户修改密码', '4', 'com.du.lin.controller.UserController', 'setPassword', '2018-01-04 20:37:32', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('36', '业务日志', '添加用户', '4', 'com.du.lin.controller.UserController', 'addUser', '2018-01-04 20:38:36', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('37', '业务日志', '添加用户', '4', 'com.du.lin.controller.UserController', 'addUser', '2018-01-04 20:38:48', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('38', '业务日志', '用户信息修改', '4', 'com.du.lin.controller.UserController', 'setuser', '2018-01-04 20:39:04', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('39', '业务日志', '用户信息修改', '4', 'com.du.lin.controller.UserController', 'setuser', '2018-01-04 20:39:13', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('40', '业务日志', '添加用户', '4', 'com.du.lin.controller.UserController', 'addUser', '2018-01-04 20:39:42', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('41', '业务日志', '添加部门', '4', 'com.du.lin.controller.DeptController', 'addDept', '2018-01-04 20:40:52', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('42', '业务日志', '删除部门', '4', 'com.du.lin.controller.DeptController', 'deleteDept', '2018-01-04 20:41:02', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('43', '业务日志', '配置菜单', '4', 'com.du.lin.controller.RoleController', 'addRelation', '2018-01-04 20:41:20', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('44', '业务日志', '配置菜单', '4', 'com.du.lin.controller.RoleController', 'addRelation', '2018-01-04 20:41:30', '成功', 'admin');
INSERT INTO `operation_log` VALUES ('45', '业务日志', '添加便签', '2', 'com.du.lin.controller.MemoController', 'addMemo', '2018-01-04 20:43:53', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('46', '业务日志', '添加用户', '2', 'com.du.lin.controller.UserController', 'addUser', '2018-01-04 20:47:45', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('47', '业务日志', '用户信息修改', '2', 'com.du.lin.controller.UserController', 'setuser', '2018-01-04 20:47:56', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('48', '业务日志', '下载日志', '2', 'com.du.lin.controller.LogController', 'downLoginLogExcel', '2018-01-04 20:48:11', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('49', '业务日志', '添加通知', '2', 'com.du.lin.controller.NoticeController', 'addNotice', '2018-01-04 20:48:27', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('50', '业务日志', '请假', '2', 'com.du.lin.controller.LeaveController', 'addLeave', '2018-01-04 20:49:12', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('51', '业务日志', '审核请假', '2', 'com.du.lin.controller.LeaveController', 'operationLeave', '2018-01-04 20:49:21', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('52', '业务日志', '请假', '2', 'com.du.lin.controller.LeaveController', 'addLeave', '2018-01-04 20:49:42', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('53', '业务日志', '审核请假', '2', 'com.du.lin.controller.LeaveController', 'operationLeave', '2018-01-04 20:50:01', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('54', '业务日志', '添加用户', '2', 'com.du.lin.controller.UserController', 'addUser', '2018-01-04 21:01:49', '成功', 'ttt');
INSERT INTO `operation_log` VALUES ('55', '业务日志', '下载日志', '2', 'com.du.lin.controller.LogController', 'downLoginLogExcel', '2018-01-06 15:43:55', '成功', 'ttt');


DROP TABLE IF EXISTS `operation_leave_user`;
CREATE TABLE `operation_leave_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `leaveid` int(255) NOT NULL,
  `userid` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operation_leave_user
-- ----------------------------
INSERT INTO `operation_leave_user` VALUES ('3', '4', '2', 'ttt');
INSERT INTO `operation_leave_user` VALUES ('4', '5', '2', 'ttt');


DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `body` varchar(255) NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  `senduserid` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `createtime` datetime NOT NULL,
  `recivedeptid` int(11) DEFAULT NULL,
  `reciveuserid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('10', null, '欢迎使用forum！                    (●\'◡\'●)', null, '2', 'SystemNotice', '2017-09-28 11:52:23', null, null);
INSERT INTO `notice` VALUES ('12', null, '防守打法少的', null, '2', 'SystemNotice', '2018-01-04 20:48:27', null, null);

