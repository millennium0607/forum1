DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `password` varchar(30) NOT NULL DEFAULT '' COMMENT '密码',
  `user_email` varchar(30) NOT NULL COMMENT '用户邮箱',
  `user_sex` varchar(30) NOT NULL COMMENT '用户性别',
  `user_phone` int(11) DEFAULT NULL COMMENT '电话号码',
  `create_time` datetime NOT NULL COMMENT '用户创建时间',
  `user_type` int(2) NOT NULL DEFAULT '1' COMMENT '用户类型 0:管理员 1:普通用户',
  `user_state` int(2) NOT NULL DEFAULT '0' COMMENT '用户状态 0:正常 1:冻结',
  `credit` int(10) NOT NULL DEFAULT '100' COMMENT '用户积分',
  `last_login_time` datetime DEFAULT NULL COMMENT '用户最后登入时间',
  `last_ip` varchar(20) DEFAULT NULL COMMENT '用户最后登入ip',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`),
  UNIQUE KEY `user_email` (`user_email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'test', '111111', 'adasdasdsads@qq.com', '男', '1111111111', '2017-03-12 09:37:39', '0', '0', '115', '2017-10-27 16:04:23', '127.0.0.1');
INSERT INTO `user` VALUES ('2', 'sfd', 'ADSDA', 'rewe@rew.com', '男', '123123', '2017-10-27 16:47:28', '1', '0', '105', '2017-10-27 16:47:47', '127.0.0.1');



DROP TABLE IF EXISTS `board`;
CREATE TABLE `board` (
  `board_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '论坛板块id',
  `board_name` varchar(150) NOT NULL DEFAULT '' COMMENT '论坛板块名称',
  `board_desc` varchar(300) NOT NULL DEFAULT '' COMMENT '论坛板块描述',
  `board_post_num` int(10) NOT NULL DEFAULT '0' COMMENT '帖子数目',
  PRIMARY KEY (`board_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of board
-- ----------------------------
INSERT INTO `board` VALUES ('1', '111111111111111', '11111111111', '1');
INSERT INTO `board` VALUES ('2', '22222222222222', '22222222222222', '1');

DROP TABLE IF EXISTS `login_log`;
CREATE TABLE `login_log` (
  `login_log_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `login_ip` varchar(30) NOT NULL DEFAULT '' COMMENT '登录IP',
  `login_datetime` datetime NOT NULL COMMENT '登录时间',
  PRIMARY KEY (`login_log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login_log
-- ----------------------------
INSERT INTO `login_log` VALUES ('1', '1111', '127.0.0.1', '2017-03-12 09:37:39');
INSERT INTO `login_log` VALUES ('2', '222', '127.0.0.1', '2017-03-12 09:38:11');
INSERT INTO `login_log` VALUES ('3', '3333', '127.0.0.1', '2017-03-12 10:00:29');
INSERT INTO `login_log` VALUES ('4', '321321', '127.0.0.1', '2017-03-12 10:04:21');
INSERT INTO `login_log` VALUES ('5', 'test', '127.0.0.1', '2017-10-27 16:04:23');
INSERT INTO `login_log` VALUES ('6', 'sfd', '127.0.0.1', '2017-10-27 16:47:28');
INSERT INTO `login_log` VALUES ('7', 'sfd', '127.0.0.1', '2017-10-27 16:47:47');


DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `post_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
  `post_board_id` int(10) NOT NULL DEFAULT '0' COMMENT '论坛板块ID',
  `post_user_name` varchar(30) NOT NULL DEFAULT '0' COMMENT '发表者名称',
  `post_title` varchar(50) NOT NULL COMMENT '帖子名称',
  `post_content` text NOT NULL COMMENT '帖子内容',
  `post_good_count` int(10) NOT NULL DEFAULT '0' COMMENT '点赞',
  `post_bad_count` int(10) NOT NULL DEFAULT '0' COMMENT '踩数',
  `post_view_count` int(10) NOT NULL DEFAULT '0' COMMENT '游览次数',
  `post_reply_count` int(10) NOT NULL DEFAULT '0' COMMENT '回帖数目',
  `post_status` int(2) NOT NULL DEFAULT '0' COMMENT '帖子状态:0:正常 1:锁定',
  `post_create_time` datetime NOT NULL COMMENT '创建时间',
  `post_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '1', 'eqweqw', 'adsdasdasdasd', 'eqweqwe', '0', '0', '0', '1', '0', '2017-08-27 15:33:01', '2017-08-27 15:25:01');
INSERT INTO `post` VALUES ('2', '2', 'eqweqw', 'dasdasdasdasdasdas', 'qeweqw', '0', '0', '0', '0', '0', '2017-08-29 15:25:01', '2017-08-27 15:25:01');


DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `reply_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '回复ID',
  `reply_post_id` int(10) NOT NULL COMMENT '所回复帖子的ID',
  `reply_user_name` varchar(30) NOT NULL COMMENT '回帖者姓名',
  `reply_content` text NOT NULL COMMENT '回复内容',
  `reply_good_count` int(10) NOT NULL DEFAULT '0' COMMENT '点赞',
  `reply_bad_count` int(10) NOT NULL DEFAULT '0' COMMENT '踩数',
  `reply_create_time` datetime NOT NULL COMMENT '回复时间',
  PRIMARY KEY (`reply_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('1', '1', 'adsdasd', 'dfsfsdfdsfdsfds', '0', '0', '2017-03-12 09:42:43');