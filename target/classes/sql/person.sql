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

 Date: 15/01/2021 10:09:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `id` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('5', 15, '5', 3);
INSERT INTO `person` VALUES ('6', 16, '6', 4);
INSERT INTO `person` VALUES ('7', 17, '7', 5);
INSERT INTO `person` VALUES ('1', 1, '1', 1);
INSERT INTO `person` VALUES ('4', 4, '4', 2);
INSERT INTO `person` VALUES ('8', 8, '8', 8);
INSERT INTO `person` VALUES ('9', 9, '9', 9);

SET FOREIGN_KEY_CHECKS = 1;
