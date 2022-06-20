/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : escvd

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 20/06/2022 19:52:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for smartcontract
-- ----------------------------
DROP TABLE IF EXISTS `smartcontract`;
CREATE TABLE `smartcontract`  (
  `SmartContractID` int(11) NOT NULL,
  `ABI` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ByteCode` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `VulnID` int(11) NULL DEFAULT NULL,
  `TimeStamp` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`SmartContractID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of smartcontract
-- ----------------------------
INSERT INTO `smartcontract` VALUES (1, 'sdfsd', 'sdfsd', 'fdsfasd', 2, '2022-06-17 15:42:45');
INSERT INTO `smartcontract` VALUES (2, 'aab', 'aab', 'aaed', 40, '2022-01-06 16:01:57');
INSERT INTO `smartcontract` VALUES (3, 'bbc', 'bbc', 'bbcde', 0, '2022-02-16 16:02:25');
INSERT INTO `smartcontract` VALUES (4, 'ccd', 'ccd', 'cdcda', 63, '2022-02-11 12:03:00');
INSERT INTO `smartcontract` VALUES (5, 'ddb', 'dadf', 'fada', 15, '2022-05-05 03:03:39');
INSERT INTO `smartcontract` VALUES (6, 'fdfa', 'dasf', 'ads', 11, '2022-03-15 04:04:08');
INSERT INTO `smartcontract` VALUES (7, 'seve', 'sef', 'vasc', 27, '2022-05-13 05:04:35');
INSERT INTO `smartcontract` VALUES (8, 'egas', 'eaf', 'ead', 19, '2022-06-08 12:05:03');
INSERT INTO `smartcontract` VALUES (9, 'nie', 'nie', 'dfa', 51, '2022-05-19 23:05:38');
INSERT INTO `smartcontract` VALUES (10, 'ten', 'te', 'tsa', 31, '2022-04-05 21:06:09');
INSERT INTO `smartcontract` VALUES (11, 'elcva', 'eac', 'dfae', 29, '2022-05-08 21:06:30');
INSERT INTO `smartcontract` VALUES (12, 'tw', 'tws', 'twfs', 12, '2022-02-16 16:23:58');
INSERT INTO `smartcontract` VALUES (13, 'fa', 'fa', 'faaw', 13, '2022-06-07 21:07:43');
INSERT INTO `smartcontract` VALUES (14, 'fae', 'fae', 'fae', 45, '2022-03-11 11:32:21');
INSERT INTO `smartcontract` VALUES (15, 'facae', 'fecse', 'cea', 41, '2022-06-07 01:08:31');
INSERT INTO `smartcontract` VALUES (16, 'caha', 'vadga', 'ad', 9, '2022-04-06 02:09:04');
INSERT INTO `smartcontract` VALUES (17, 'cafa', 'cad', 'fac', 13, '2022-02-15 01:09:28');
INSERT INTO `smartcontract` VALUES (18, 'dsf', 'sdfs', 'sdff', 9, '2022-06-20 19:49:48');
INSERT INTO `smartcontract` VALUES (19, 'dsf', 'hjgh', 'rty', 11, '2022-06-14 19:50:10');
INSERT INTO `smartcontract` VALUES (20, 'ca', 'ca', 'cada', 45, '2022-06-01 16:10:02');
INSERT INTO `smartcontract` VALUES (21, 'dder', 'dees', 'defs', 40, '2022-04-23 16:10:27');
INSERT INTO `smartcontract` VALUES (22, 'fac', 'cad', 'cad', 60, '2022-03-22 03:10:46');
INSERT INTO `smartcontract` VALUES (23, 'nhgk', 'nnf', 'jyjf', 44, '2022-06-09 16:11:13');
INSERT INTO `smartcontract` VALUES (24, 'nnft', 'uyn', 'yug', 8, '2022-06-17 16:11:35');
INSERT INTO `smartcontract` VALUES (25, 'bg', 'bg', 'dt', 12, '2022-05-28 23:11:50');
INSERT INTO `smartcontract` VALUES (26, 'cas', 'cas', 'rew', 14, '2022-05-06 05:12:12');
INSERT INTO `smartcontract` VALUES (27, 'ase', 'cew', 'ces', 3, '2022-06-08 23:12:38');
INSERT INTO `smartcontract` VALUES (28, 'fwe', 'fwe', 'fet', 11, '2022-01-20 03:12:56');
INSERT INTO `smartcontract` VALUES (29, 'fes', 'yrt', 'uty', 1, '2022-03-09 16:13:19');
INSERT INTO `smartcontract` VALUES (30, 'fe', 'we', 'we', 5, '2022-05-11 06:14:06');
INSERT INTO `smartcontract` VALUES (31, 'yu', 'yu', 'trtr', 4, '2022-04-30 03:14:26');
INSERT INTO `smartcontract` VALUES (32, 'fa', 'err', 'erea', 26, '2022-03-08 16:14:51');
INSERT INTO `smartcontract` VALUES (33, 'tyut', 'uyt', 'uyt', 57, '2022-02-03 16:15:18');
INSERT INTO `smartcontract` VALUES (34, 'yuwa', 'arty', 'are', 49, '2022-02-08 06:15:35');
INSERT INTO `smartcontract` VALUES (35, 'fa', 'trt', 'etsd', 48, '2022-01-11 07:16:05');
INSERT INTO `smartcontract` VALUES (36, 'fwe', 'feas', 'few', 2, '2022-06-09 06:16:30');
INSERT INTO `smartcontract` VALUES (37, 'uou', 'uoy', 'gtj', 38, '2022-05-17 16:16:52');
INSERT INTO `smartcontract` VALUES (38, 'gsr', 'htr', 'jrty', 0, '2022-02-22 09:17:10');
INSERT INTO `smartcontract` VALUES (39, 'gsr', 'bgt', 'fae', 8, '2022-02-21 09:17:43');
INSERT INTO `smartcontract` VALUES (40, 'gsr', 'grty', 'hrt', 24, '2022-02-27 04:18:08');
INSERT INTO `smartcontract` VALUES (41, 'faee', 'fets', 'vssg', 4, '2022-01-28 16:18:53');
INSERT INTO `smartcontract` VALUES (42, 'ytr', 'utyr', 'gsr', 63, '2022-06-08 05:06:16');
INSERT INTO `smartcontract` VALUES (43, 'ty', 'uy', 'uy', 55, '2022-06-10 16:19:43');
INSERT INTO `smartcontract` VALUES (44, 'hsdtr', 'htr', 'dfhge', 7, '2022-06-01 03:20:07');
INSERT INTO `smartcontract` VALUES (45, 'ge', 'hr', 'hr', 39, '2022-03-25 20:20:27');
INSERT INTO `smartcontract` VALUES (46, 'er', 'ery', 'dgr', 32, '2022-05-04 03:32:52');
INSERT INTO `smartcontract` VALUES (47, 'ge', 'grt', 'ert', 42, '2022-03-17 22:21:17');
INSERT INTO `smartcontract` VALUES (48, 'gry', 'yer', 'tew', 3, '2022-04-06 23:54:40');
INSERT INTO `smartcontract` VALUES (49, 'te', 'te', 'yr', 27, '2022-06-06 23:33:01');
INSERT INTO `smartcontract` VALUES (50, 'fwe', 'twe', 'yregs', 59, '2022-03-31 04:02:31');
INSERT INTO `smartcontract` VALUES (51, 'we', 'gdf', 'gsf', 35, '2022-03-10 23:46:58');
INSERT INTO `smartcontract` VALUES (52, 'gsa', 'ger', 'ger', 32, '2022-04-26 23:47:18');
INSERT INTO `smartcontract` VALUES (53, 'afd', 'adfg', 'ew', 44, '2022-05-05 06:47:38');
INSERT INTO `smartcontract` VALUES (54, 'gae', 'gsre', 'gre', 47, '2022-02-06 16:48:21');
INSERT INTO `smartcontract` VALUES (55, 'ge', 'her', 'jr', 16, '2022-06-06 23:48:25');
INSERT INTO `smartcontract` VALUES (56, 'ger', 'gsr', 'hrt', 29, '2022-01-08 23:48:48');
INSERT INTO `smartcontract` VALUES (57, 'ger', 'ye', 'urt', 31, '2022-06-07 16:49:12');
INSERT INTO `smartcontract` VALUES (58, 'ger', 'yet', 'urt', 9, '2022-06-07 16:49:26');
INSERT INTO `smartcontract` VALUES (59, 'ger', 'ye', 'ru', 11, '2022-03-21 16:49:40');
INSERT INTO `smartcontract` VALUES (60, 'rgdfv', 'grt', 'hsf', 63, '2021-06-15 16:49:56');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `UserName` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `Detail` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 178 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('kj', 1, 'kjhdsfhskajd', '123456');
INSERT INTO `user` VALUES ('Adam', 2, 'adamboy', '123456');
INSERT INTO `user` VALUES ('Bose', 3, 'Bosebb', '123456');
INSERT INTO `user` VALUES ('Candy', 4, 'Candycc', '123456');
INSERT INTO `user` VALUES ('David', 5, 'daviddd', '123456');
INSERT INTO `user` VALUES ('Ellen', 6, 'ellenee', '123456');

-- ----------------------------
-- Table structure for user_sc
-- ----------------------------
DROP TABLE IF EXISTS `user_sc`;
CREATE TABLE `user_sc`  (
  `UserID` int(11) NOT NULL,
  `SmartContractID` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`SmartContractID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_sc
-- ----------------------------
INSERT INTO `user_sc` VALUES (1, '1');
INSERT INTO `user_sc` VALUES (1, '10');
INSERT INTO `user_sc` VALUES (2, '11');
INSERT INTO `user_sc` VALUES (2, '12');
INSERT INTO `user_sc` VALUES (2, '13');
INSERT INTO `user_sc` VALUES (2, '14');
INSERT INTO `user_sc` VALUES (2, '15');
INSERT INTO `user_sc` VALUES (2, '16');
INSERT INTO `user_sc` VALUES (2, '17');
INSERT INTO `user_sc` VALUES (2, '18');
INSERT INTO `user_sc` VALUES (2, '19');
INSERT INTO `user_sc` VALUES (1, '2');
INSERT INTO `user_sc` VALUES (2, '20');
INSERT INTO `user_sc` VALUES (3, '21');
INSERT INTO `user_sc` VALUES (3, '22');
INSERT INTO `user_sc` VALUES (3, '23');
INSERT INTO `user_sc` VALUES (3, '24');
INSERT INTO `user_sc` VALUES (3, '25');
INSERT INTO `user_sc` VALUES (3, '26');
INSERT INTO `user_sc` VALUES (3, '27');
INSERT INTO `user_sc` VALUES (3, '28');
INSERT INTO `user_sc` VALUES (3, '29');
INSERT INTO `user_sc` VALUES (1, '3');
INSERT INTO `user_sc` VALUES (3, '30');
INSERT INTO `user_sc` VALUES (4, '31');
INSERT INTO `user_sc` VALUES (4, '32');
INSERT INTO `user_sc` VALUES (4, '33');
INSERT INTO `user_sc` VALUES (4, '34');
INSERT INTO `user_sc` VALUES (4, '35');
INSERT INTO `user_sc` VALUES (4, '36');
INSERT INTO `user_sc` VALUES (4, '37');
INSERT INTO `user_sc` VALUES (4, '38');
INSERT INTO `user_sc` VALUES (4, '39');
INSERT INTO `user_sc` VALUES (1, '4');
INSERT INTO `user_sc` VALUES (4, '40');
INSERT INTO `user_sc` VALUES (5, '41');
INSERT INTO `user_sc` VALUES (5, '42');
INSERT INTO `user_sc` VALUES (5, '43');
INSERT INTO `user_sc` VALUES (5, '44');
INSERT INTO `user_sc` VALUES (5, '45');
INSERT INTO `user_sc` VALUES (5, '46');
INSERT INTO `user_sc` VALUES (5, '47');
INSERT INTO `user_sc` VALUES (5, '48');
INSERT INTO `user_sc` VALUES (5, '49');
INSERT INTO `user_sc` VALUES (1, '5');
INSERT INTO `user_sc` VALUES (5, '50');
INSERT INTO `user_sc` VALUES (6, '51');
INSERT INTO `user_sc` VALUES (6, '52');
INSERT INTO `user_sc` VALUES (6, '53');
INSERT INTO `user_sc` VALUES (6, '54');
INSERT INTO `user_sc` VALUES (6, '55');
INSERT INTO `user_sc` VALUES (6, '56');
INSERT INTO `user_sc` VALUES (6, '57');
INSERT INTO `user_sc` VALUES (6, '58');
INSERT INTO `user_sc` VALUES (6, '59');
INSERT INTO `user_sc` VALUES (1, '6');
INSERT INTO `user_sc` VALUES (6, '60');
INSERT INTO `user_sc` VALUES (1, '7');
INSERT INTO `user_sc` VALUES (1, '8');
INSERT INTO `user_sc` VALUES (1, '9');

-- ----------------------------
-- Table structure for vuln
-- ----------------------------
DROP TABLE IF EXISTS `vuln`;
CREATE TABLE `vuln`  (
  `VulnID` int(11) NOT NULL,
  `VulnName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Vulndetail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`VulnID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of vuln
-- ----------------------------
INSERT INTO `vuln` VALUES (1, NULL, NULL);
INSERT INTO `vuln` VALUES (2, NULL, NULL);
INSERT INTO `vuln` VALUES (3, NULL, NULL);
INSERT INTO `vuln` VALUES (4, NULL, NULL);
INSERT INTO `vuln` VALUES (5, NULL, NULL);
INSERT INTO `vuln` VALUES (6, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
