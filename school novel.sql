/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : school novel

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-12-16 17:33:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('110', '林海龙', '000000');
INSERT INTO `admin` VALUES ('111', '冯浩文', '000000');
INSERT INTO `admin` VALUES ('112', '郑良裕', '000000');
INSERT INTO `admin` VALUES ('113', '吉闻林', '000000');
INSERT INTO `admin` VALUES ('114', 'lhx', '000000');
INSERT INTO `admin` VALUES ('115', '温wen', '000000');
INSERT INTO `admin` VALUES ('116', '泉quan', '000000');
INSERT INTO `admin` VALUES ('117', '思si', '000000');
INSERT INTO `admin` VALUES ('118', '曲qu', '000000');
INSERT INTO `admin` VALUES ('119', '楠nan', '000000');
INSERT INTO `admin` VALUES ('120', '晒、', '000000');

-- ----------------------------
-- Table structure for npc
-- ----------------------------
DROP TABLE IF EXISTS `npc`;
CREATE TABLE `npc` (
  `name` varchar(255) NOT NULL,
  `ages` int(11) NOT NULL,
  `height` double default NULL,
  `weight` double default NULL,
  `sex` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of npc
-- ----------------------------
INSERT INTO `npc` VALUES ('林海龙', '18', '180', '120', '男');
INSERT INTO `npc` VALUES ('冯浩文', '20', '170', '100', '女');
INSERT INTO `npc` VALUES ('lhx', '19', '178', '120', '男');
INSERT INTO `npc` VALUES ('吉闻林', '22', '175', '122', '男');
INSERT INTO `npc` VALUES ('郑良裕', '20', '178', '120', '男');
INSERT INTO `npc` VALUES ('温', '19', '165', '90', '女');
INSERT INTO `npc` VALUES ('曲华', '18', '166', '90', '女');
INSERT INTO `npc` VALUES ('荷花', '16', '175', '110', '男');
INSERT INTO `npc` VALUES ('梅利', '17', '181', '130', '男');
INSERT INTO `npc` VALUES ('李家话', '19', '176', '113', '男');

-- ----------------------------
-- Table structure for photo
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `song` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of photo
-- ----------------------------
INSERT INTO `photo` VALUES ('0', null, '/images/1 .gif', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('1', null, '/images/KS.gif', '/sucai/2.mp3');
INSERT INTO `photo` VALUES ('2', '', '/images/KJ2.gif', '/sucai/3.mp3');
INSERT INTO `photo` VALUES ('3', null, '/images/1.jpg', '/sucai/4.mp3');
INSERT INTO `photo` VALUES ('4', null, '/images/2.jpg', '/sucai/5.mp3');
INSERT INTO `photo` VALUES ('5', '', '/images/3.jpg', '/sucai/6.mp3');
INSERT INTO `photo` VALUES ('6', null, '/images/4.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('7', null, '/images/5.jpg', '/sucai/2.mp3');
INSERT INTO `photo` VALUES ('8', null, '/images/6.jpg', '/sucai/3.mp3');
INSERT INTO `photo` VALUES ('9', null, '/images/7.jpg', '/sucai/4.mp3');
INSERT INTO `photo` VALUES ('10', null, '/images/8.jpg', '/sucai/5.mp3');
INSERT INTO `photo` VALUES ('11', null, '/images/9.jpg', '/sucai/6.mp3');
INSERT INTO `photo` VALUES ('12', null, '/images/10.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('13', null, '/images/11.jpg', '/sucai/2.mp3');
INSERT INTO `photo` VALUES ('14', null, '/images/12.jpg', '/sucai/3.mp3');
INSERT INTO `photo` VALUES ('15', null, '/images/13.jpg', '/sucai/4.mp3');
INSERT INTO `photo` VALUES ('16', null, '/images/14.jpg', '/sucai/5.mp3');
INSERT INTO `photo` VALUES ('17', null, '/images/15.jpg', '/sucai/6.mp3');
INSERT INTO `photo` VALUES ('18', null, '/images/16.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('19', null, '/images/17.jpg', '/sucai/2.mp3');
INSERT INTO `photo` VALUES ('20', null, '/images/YX0.jpg', '/sucai/3.mp3');
INSERT INTO `photo` VALUES ('21', null, '/images/YX1.jpg', '/sucai/4.mp3');
INSERT INTO `photo` VALUES ('22', null, '/images/YX3.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('23', null, '/images/YX4.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('24', null, '/images/YX5.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('25', null, '/images/TL.gif', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('26', null, '/images/YX8.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('27', null, '/images/YX9.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('28', null, '/images/YX10.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('29', null, '/images/YX11.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('30', null, '/images/YX12.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('31', null, '/images/YX13.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('32', null, '/images/YX14.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('33', null, '/images/YX15.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('34', null, '/images/XU1.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('35', '1', '/images/18.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('36', '2', '/images/19.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('37', '3', '/images/20.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('38', null, '/images/XU2.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('39', '1', '/images/21.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('40', '2', '/images/22.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('41', null, '/images/XU3.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('42', '1', '/images/23.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('43', '2', '/images/XU5.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('44', null, '/images/XU7.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('45', '1', '/images/3.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('46', null, '/images/4.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('47', null, '/images/XU8.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('48', '1', '/images/5.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('49', '2', '/images/6.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('50', null, '/images/XU9.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('51', '1', '/images/7.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('52', '3', '/images/8.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('53', '1，3', '/images/9.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('54', null, '/images/XU10.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('55', '2', '/images/10.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('56', '3', '/images/11.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('57', null, '/images/XU11.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('58', '2', '/images/13.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('59', null, '/images/XU12.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('60', '1，2', '/images/15.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('61', null, '/images/XU13.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('62', '1', '/images/16.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('63', null, '/images/XU14.jpg', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('64', '2', '/images/17.png', '/sucai/1.mp3');
INSERT INTO `photo` VALUES ('65', '1', '/images/18.png', '/sucai/1.mp3');

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `singer` varchar(255) default NULL,
  `timelong` time default NULL,
  `singname` varchar(255) default NULL,
  `fabutime` datetime default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song
-- ----------------------------
INSERT INTO `song` VALUES ('杨丞琳', '00:03:41', '《年轮说》', '2016-09-30 17:17:01');
INSERT INTO `song` VALUES ('周杰伦', '00:03:42', '《说好不哭》', '2019-09-16 17:18:34');
INSERT INTO `song` VALUES ('杨丞琳', '00:03:45', '《带我走》', '2019-11-12 12:44:14');
INSERT INTO `song` VALUES ('林俊杰', '00:04:27', '《小酒窝》', '2019-11-05 12:45:00');
INSERT INTO `song` VALUES ('蔡徐坤', '00:06:15', '《鸡你太美》', '2018-11-09 12:45:38');
INSERT INTO `song` VALUES ('田馥甄', '00:04:03', '《魔鬼中的天使》', '2005-11-05 12:46:26');
INSERT INTO `song` VALUES ('邓紫棋', '00:04:59', '《再见》', '2018-01-28 12:47:11');
INSERT INTO `song` VALUES ('徐佳莹', '00:03:58', '《失落沙洲》', '2018-06-28 12:48:14');
INSERT INTO `song` VALUES ('薛之谦', '00:04:11', '《丑八怪》', '2007-11-28 12:48:56');
INSERT INTO `song` VALUES ('罗志祥', '00:02:21', '《爱转角》', '2015-01-01 12:49:42');
