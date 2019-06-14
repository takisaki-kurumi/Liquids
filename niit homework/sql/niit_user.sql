CREATE DATABASE  IF NOT EXISTS `niit` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `niit`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: niit
-- ------------------------------------------------------
-- Server version	5.5.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `ID` varchar(20) NOT NULL,
  `vpassword` varchar(20) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `Country` char(11) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `Identity` varchar(10) DEFAULT NULL,
  `history` text,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `vpassword` (`vpassword`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('billy herrington','niit@1234',25,'1998-02-12','John@niit.com.cn','China','C-7, West yan an xi Lu, Shanghai','Doctor','','2019-05-07 14:13:11'),('genji','123456',15,'2000-06-27','1822454131@qq.com','China','sadsadsadsadsa','Patient','take some medicine \'2018-12-31abcabc2018-20-16abcabsadsadsadsadsadsadsadsadsc	dopr                               2019-05-07 12:42:46\' ,          duohereshui                               2019-05-07 12:42:46\' ,          duohereshui                               2019-05-07 12:42:46\' ,          duohereshuiya                               2019-05-07 12:42:46\' ,          duohereshuiya                                                 2019-05-07 12:52:06\' ,        lubenweiniubi                                                                                2019-05-07 13:14:26\' ,        ignb','2019-05-07 14:13:08'),('muji','muji',18,'2000-12-31','12245131@qq.com','mujike','asdsads','Doctor',' ','2019-05-14 12:10:50'),('richard milos','hnu@1234',25,'1992-02-10','Linda@niit.com.cn','China','B-606, Weng Hang Lu, Haikou','Doctor','','2019-05-07 14:12:19'),('takisakikurumi','333',18,'3333-11-22','takisaki.com','Unknown','Unknown','Manager',' ','2019-05-10 07:02:53'),('zhh1','zhh1',18,'2000-06-27','sdadsad','sadsadsa','asdsads','Patient','                                                                                 2019-05-13 00:17:16\' ,        duohereshui                                                                                2019-05-14 03:25:15\' ,        duohereshui                                                                                2019-05-14 14:44:41\' ,        adskahk                                                                                2019-05-14 16:56:47\' ,        Take the medicine on time;                                                                                2019-05-15 21:17:01\' ,        adgjsgdjhaj','2019-05-15 13:18:14'),('zhh2','zhh2',18,'2000-06-27','122454131@qq.com','Surgery','HainanUniversity','Doctor','asd','2019-05-15 16:17:58');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-16  9:31:21
