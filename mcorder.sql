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

 Date: 09/01/2020 17:12:12
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
  `mid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品标识',
  `parentid` int(11) NULL DEFAULT NULL COMMENT '当存在不同规格的时候，parentid有效。parentid为null，无规格可选；parentid为-1，该商品有规格；parentid为具体mid时，该商品为mid的具体规格。',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品价格',
  `picurl` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参考图片',
  `desc` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品描述',
  `typeid` int(11) NULL DEFAULT NULL COMMENT '所属类型',
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_menu
-- ----------------------------
INSERT INTO `m_menu` VALUES (1, NULL, '麦辣鸡腿汉堡', 17.50, NULL, NULL, 1);
INSERT INTO `m_menu` VALUES (2, NULL, '原味板烧鸡腿堡', 19.00, NULL, '原块去骨鸡排嫩滑多汁，加洋葱及胡椒调味，与翠绿新鲜的生菜和香浓烧鸡酱搭配，口感丰富，煎制过程0油添加，绝对让人食指大动！', 1);
INSERT INTO `m_menu` VALUES (3, NULL, '巨无霸', 21.50, NULL, '两块百分百纯牛肉，搭配洒有鲜芝麻的松软面包、清新爽口的生菜、洋葱和酸黄瓜，以及香滑顺口的芝士与美味酱汁，多层次口感的极致美味体验，只在麦当劳！', 1);
INSERT INTO `m_menu` VALUES (4, NULL, '安格斯厚牛培根堡', 30.00, NULL, NULL, 1);
INSERT INTO `m_menu` VALUES (5, NULL, '安格斯厚牛芝士堡', 27.00, NULL, NULL, 1);
INSERT INTO `m_menu` VALUES (6, NULL, '双层吉士汉堡', 17.00, NULL, '百分百纯牛肉与双层香软芝士融为一体，加上松软面包及美味酱料，两倍滋味诱惑，无人能挡！', 1);
INSERT INTO `m_menu` VALUES (7, NULL, '不素之霸双层牛肉堡', 21.00, NULL, NULL, 1);
INSERT INTO `m_menu` VALUES (8, NULL, '双层深海鳕鱼堡', 21.00, NULL, NULL, 1);
INSERT INTO `m_menu` VALUES (9, NULL, '川辣双鸡堡', 21.00, NULL, NULL, 1);
INSERT INTO `m_menu` VALUES (10, NULL, '培根蔬萃双层牛堡', 21.50, NULL, NULL, 1);
INSERT INTO `m_menu` VALUES (11, NULL, '麦香鸡', 12.00, NULL, '清脆爽口的生菜，给你植物纤维；金黄酥脆的鸡肉则来自精心培育的优质嫩鸡。营养配搭，让你多一个好滋味的健康选择。', 1);
INSERT INTO `m_menu` VALUES (12, NULL, '麦香鱼', 17.00, NULL, '鱼柳由阿拉斯加狭鳕鱼制成，外皮炸得金黄酥脆，内里又保留了鱼肉的鲜嫩多汁。美味鱼肉与滋味沙拉酱配搭，风味独特。', 1);
INSERT INTO `m_menu` VALUES (20, NULL, '麦乐鸡', 10.00, NULL, NULL, 2);
INSERT INTO `m_menu` VALUES (21, -1, '薯条', NULL, NULL, NULL, 2);
INSERT INTO `m_menu` VALUES (22, 21, '薯条（小份）', 8.00, NULL, NULL, 2);
INSERT INTO `m_menu` VALUES (23, 21, '薯条（中份）', 11.00, NULL, NULL, 2);
INSERT INTO `m_menu` VALUES (24, 21, '薯条（大份）', 14.00, NULL, NULL, 2);

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
  `desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sort` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`typeid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_type
-- ----------------------------
INSERT INTO `m_type` VALUES (1, '主食', NULL, 1);
INSERT INTO `m_type` VALUES (2, '小吃', NULL, 2);
INSERT INTO `m_type` VALUES (3, '套餐', NULL, 3);

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
