/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.21-log : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `rolename` varchar(255) NOT NULL,
  `mark` varchar(255) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_lqjrcobrh9jc8wpcar64q1bfh` (`mark`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

LOCK TABLES `role` WRITE;

insert  into `role`(`id`,`role_id`,`rolename`,`mark`,`role_name`) values 
(1,1,'超级管理员','超级管理员',NULL);

UNLOCK TABLES;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `pass_word` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `tell` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_lqjrcobrh9jc8wpcar64q1bfh` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=92138 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

LOCK TABLES `user` WRITE;

insert  into `user`(`id`,`age`,`password`,`user_name`,`user_id`,`pass_word`,`name`,`status`,`tell`) values 
(1,8,'8','888',NULL,NULL,NULL,NULL,NULL),
(2,18,'123456','jerry',NULL,NULL,NULL,NULL,NULL),
(3,12,'00','tmall',NULL,NULL,NULL,NULL,NULL),
(28,NULL,NULL,NULL,9999,NULL,NULL,0,NULL),
(29,NULL,NULL,NULL,9999,NULL,NULL,0,NULL),
(23781,NULL,NULL,'23781',23781,'23781','23781',1,NULL),
(24445,NULL,NULL,'24445',24445,'24445','24445',1,NULL),
(34816,NULL,NULL,'34816',34816,'34816','34816',1,NULL),
(35333,NULL,NULL,'35333',35333,'35333','35333',1,NULL),
(58069,NULL,NULL,'58069',58069,'58069','58069',1,NULL),
(66669,NULL,NULL,'66669',66669,'66669','66669',1,NULL),
(66947,NULL,NULL,'66947',66947,'66947','66947',1,NULL),
(75743,NULL,NULL,'75743',75743,'75743','75743',1,NULL),
(84207,NULL,NULL,'84207',84207,'84207','84207',1,NULL),
(92137,NULL,NULL,'92137',92137,'92137','92137',1,NULL);

UNLOCK TABLES;

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `role_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

LOCK TABLES `user_role` WRITE;

insert  into `user_role`(`id`,`user_id`,`role_id`) values 
(1,1,1);

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
