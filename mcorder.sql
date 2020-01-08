/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : 127.0.0.1:3306
 Source Schema         : mcorder

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 08/01/2020 15:51:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for m_admin
-- ----------------------------
DROP TABLE IF EXISTS `m_admin`;
CREATE TABLE `m_admin`  (
  `adminid` int(11) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `loginid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`adminid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for m_menu
-- ----------------------------
DROP TABLE IF EXISTS `m_menu`;
CREATE TABLE `m_menu`  (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `desc` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `typeid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_menu
-- ----------------------------
INSERT INTO `m_menu` VALUES (1, '双层吉士汉堡', 17.00, '', 1);
INSERT INTO `m_menu` VALUES (2, '板烧鸡腿堡', 19.00, NULL, 1);
INSERT INTO `m_menu` VALUES (3, '巨无霸', 21.50, NULL, 1);
INSERT INTO `m_menu` VALUES (4, '麦乐鸡', 10.00, NULL, 2);
INSERT INTO `m_menu` VALUES (5, '薯条（中）', 11.00, NULL, 2);

-- ----------------------------
-- Table structure for m_order
-- ----------------------------
DROP TABLE IF EXISTS `m_order`;
CREATE TABLE `m_order`  (
  `orderid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `mid` int(11) NOT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`orderid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for m_type
-- ----------------------------
DROP TABLE IF EXISTS `m_type`;
CREATE TABLE `m_type`  (
  `typeid` int(11) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `standard` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1：菜单类型；2：菜品规格',
  `desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sort` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`typeid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_type
-- ----------------------------
INSERT INTO `m_type` VALUES (1, '主食', '1', '主食能吃饱的', 1);
INSERT INTO `m_type` VALUES (2, '小吃', '1', '小吃解馋的', 2);
INSERT INTO `m_type` VALUES (3, '小', '2', NULL, 1);
INSERT INTO `m_type` VALUES (4, '中', '2', NULL, 2);
INSERT INTO `m_type` VALUES (5, '大', '2', NULL, 3);

-- ----------------------------
-- Table structure for m_user
-- ----------------------------
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user`  (
  `userid` int(11) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loginid` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_user
-- ----------------------------
INSERT INTO `m_user` VALUES (1, 'KK', 'kelo', 'olek');
INSERT INTO `m_user` VALUES (2, 'Jassica', 'jassicaaa', '1234');

SET FOREIGN_KEY_CHECKS = 1;
