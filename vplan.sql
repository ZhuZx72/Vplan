/*
 Navicat MySQL Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : vplan

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 05/07/2019 21:49:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for buy_paper
-- ----------------------------
DROP TABLE IF EXISTS `buy_paper`;
CREATE TABLE `buy_paper`  (
  `user_id` int(11) NOT NULL,
  `paper_id` int(11) NOT NULL,
  `time` datetime(0) NULL DEFAULT NULL COMMENT '购买时间',
  PRIMARY KEY (`user_id`, `paper_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for collection_exercise
-- ----------------------------
DROP TABLE IF EXISTS `collection_exercise`;
CREATE TABLE `collection_exercise`  (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `exercise_id` int(11) NOT NULL COMMENT '问题id',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '收藏时间',
  PRIMARY KEY (`user_id`, `exercise_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for collection_paper
-- ----------------------------
DROP TABLE IF EXISTS `collection_paper`;
CREATE TABLE `collection_paper`  (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `paper_id` int(11) NOT NULL COMMENT '试卷id',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '收藏时间',
  PRIMARY KEY (`user_id`, `paper_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for do_exercise
-- ----------------------------
DROP TABLE IF EXISTS `do_exercise`;
CREATE TABLE `do_exercise`  (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `exercise_id` int(11) NOT NULL COMMENT '习题id',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '最后更新时间',
  `result` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手写笔轨迹类',
  PRIMARY KEY (`user_id`, `exercise_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for do_paper
-- ----------------------------
DROP TABLE IF EXISTS `do_paper`;
CREATE TABLE `do_paper`  (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `paper_id` int(11) NOT NULL COMMENT '试卷id',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '时间',
  `finish` tinyint(4) NULL DEFAULT NULL COMMENT '1：完成2：未完成',
  PRIMARY KEY (`user_id`, `paper_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for exercise
-- ----------------------------
DROP TABLE IF EXISTS `exercise`;
CREATE TABLE `exercise`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '题目暂时是以试卷形式展现',
  `material` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '材料（可有可无）',
  `question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '问题',
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '答案',
  `type` tinyint(4) NULL DEFAULT NULL COMMENT '类型（暂定） 1：单选题2：多选题3：填空题4：综合题5：作文题',
  `subject` tinyint(4) NULL DEFAULT NULL COMMENT '科目',
  `level` tinyint(3) NULL DEFAULT NULL COMMENT '年级（010一年级上，011一年级下）',
  `difficulty` tinyint(4) NULL DEFAULT NULL COMMENT '难度1：简单2：中等3：困难',
  `paper_id` int(11) NULL DEFAULT NULL COMMENT '试卷id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for exercise_image
-- ----------------------------
DROP TABLE IF EXISTS `exercise_image`;
CREATE TABLE `exercise_image`  (
  `id` int(11) NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名字',
  `location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '存放位置',
  `exercise_id` int(11) NULL DEFAULT NULL COMMENT '对应题目id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for get_coin
-- ----------------------------
DROP TABLE IF EXISTS `get_coin`;
CREATE TABLE `get_coin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '天',
  `count` tinyint(4) NULL DEFAULT NULL COMMENT '当天获得了几个，每次加一个，超过四个则不能获得',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for paper
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper`  (
  `id` int(11) NOT NULL COMMENT '试卷id',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试卷name',
  `subject` tinyint(4) NULL DEFAULT NULL COMMENT '科目',
  `level` tinyint(3) NULL DEFAULT NULL COMMENT '年级（010一年级上，011一年级下）',
  `area` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地区',
  `source` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源（）',
  `difficulty` tinyint(4) NULL DEFAULT NULL COMMENT '难度1：简单2：中等3：困难',
  `pay_rmb` double(10, 0) NULL DEFAULT NULL COMMENT '试卷土豪币价格',
  `pay_coin` double(10, 0) NULL DEFAULT NULL COMMENT '试卷学霸券价格，-1为不支持学霸券购买',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id，长度8-16，字母数字与_',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `rmb` double(255, 0) NULL DEFAULT NULL COMMENT '充值余额，土豪币',
  `coin` double(255, 0) NULL DEFAULT NULL COMMENT '做题奖励，学霸券',
  `area` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地区',
  `level` tinyint(2) NULL DEFAULT NULL COMMENT '年级（010一年级上，011一年级下）',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
