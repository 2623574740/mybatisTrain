/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : train

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 15/01/2021 10:09:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `name` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `total` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('饼干', 10.01, 10);
INSERT INTO `goods` VALUES ('果汁', 3.50, 510);
INSERT INTO `goods` VALUES ('火腿肠', 1.90, 3210);
INSERT INTO `goods` VALUES ('方便面', 4.80, 298);
INSERT INTO `goods` VALUES ('矿泉水', 1.80, 2399);
INSERT INTO `goods` VALUES ('面包', 3.80, 8710);
INSERT INTO `goods` VALUES ('牛奶', 2.10, 6179);

SET FOREIGN_KEY_CHECKS = 1;
