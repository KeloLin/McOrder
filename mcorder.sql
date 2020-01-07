/*
Navicat MySQL Data Transfer
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for m_admin
-- ----------------------------
DROP TABLE IF EXISTS `m_admin`;
CREATE TABLE `m_admin` (
  `adminid` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `role` varchar(10) NOT NULL,
  `loginid` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_admin
-- ----------------------------

-- ----------------------------
-- Table structure for m_menu
-- ----------------------------
DROP TABLE IF EXISTS `m_menu`;
CREATE TABLE `m_menu` (
  `mid` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `desc` varchar(100) DEFAULT NULL,
  `typeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_menu
-- ----------------------------
INSERT INTO `m_menu` VALUES ('1', '双层吉士汉堡', '17.00', '', '1');
INSERT INTO `m_menu` VALUES ('2', '板烧鸡腿堡', '19.00', null, '1');
INSERT INTO `m_menu` VALUES ('3', '巨无霸', '21.50', null, '1');
INSERT INTO `m_menu` VALUES ('4', '麦乐鸡', '10.00', null, '2');
INSERT INTO `m_menu` VALUES ('5', '薯条（中）', '11.00', null, '2');

-- ----------------------------
-- Table structure for m_order
-- ----------------------------
DROP TABLE IF EXISTS `m_order`;
CREATE TABLE `m_order` (
  `orderid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `mid` int(11) NOT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_order
-- ----------------------------

-- ----------------------------
-- Table structure for m_type
-- ----------------------------
DROP TABLE IF EXISTS `m_type`;
CREATE TABLE `m_type` (
  `typeid` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `standard` varchar(2) DEFAULT NULL COMMENT '1：菜单类型；2：菜品规格',
  `desc` varchar(200) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_type
-- ----------------------------
INSERT INTO `m_type` VALUES ('1', '主食', '1', '主食能吃饱的', '1');
INSERT INTO `m_type` VALUES ('2', '小吃', '1', '小吃解馋的', '2');
INSERT INTO `m_type` VALUES ('3', '小', '2', null, '1');
INSERT INTO `m_type` VALUES ('4', '中', '2', null, '2');
INSERT INTO `m_type` VALUES ('5', '大', '2', null, '3');

-- ----------------------------
-- Table structure for m_user
-- ----------------------------
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user` (
  `userid` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `loginid` varchar(30) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_user
-- ----------------------------
