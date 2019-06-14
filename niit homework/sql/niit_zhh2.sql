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
-- Table structure for table `zhh2`
--

DROP TABLE IF EXISTS `zhh2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhh2` (
  `number` int(11) DEFAULT NULL,
  `xtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `history` text,
  `medicine` varchar(100) DEFAULT NULL,
  `money` double DEFAULT NULL,
  `doctor` varchar(30) DEFAULT NULL,
  `picture` longblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhh2`
--

LOCK TABLES `zhh2` WRITE;
/*!40000 ALTER TABLE `zhh2` DISABLE KEYS */;
INSERT INTO `zhh2` VALUES (1,'2019-05-14 09:05:35',NULL,NULL,NULL,NULL,'ˇÿˇ·\0ÇExif\0\0MM\0*\0\0\0\0\0\0\0\0\0\0\0\0,\0\0\0\0\0\0\04ái\0\0\0\0\0\0\0J\0\0\0\0\0\0\0\02\0\0\0\0\0\0\0\0\0\0\0\0\0í\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\02\0\0\0\0\0\0\0\0\0\0\0\0ˇ‡\0JFIF\0\0\0\0\0\0ˇ€\0C\0\n\n\n		\n\Z%\Z# , #&\')*)-0-(0%()(ˇ€\0C\n\n\n\n(\Z\Z((((((((((((((((((((((((((((((((((((((((((((((((((ˇ¿\0\04\0,\"\0ˇƒ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0	ˇƒ\05\0\0\0\0\0\0\0\0!1AQa\"qÅ#2R°±$3SbÇëí¡ˇƒ\0\Z\0\0\0\0\0\0\0\0\0\0\0\0\0\0ˇƒ\0*\0\0\0\0\0\0\0\0\0\0!1\"AQq±¡—BaÅˇ⁄\0\0\0?\0 êÍõ#1RûjRI≤ÎÓõ%\"\Z∆òÏü≥œmúV ©3víê7¶˛ØÃE¸í9√®”n⁄œ˜ÁHJ/lÁ≥o∂I19à].÷%ZéR-ßRGîOg˚6awÿ(aaµeﬁ[ ﬂÜ°C˛≈Î0‚òdä\0≠‰Ôˆòk€©‡e*j\\.bGU<YR7êt∏EÆ=LTë”‹[Kb≥@õìôJHZnÇG¬æ9≈èhÈ°b Ñãi “Wô	˘A÷ﬁöèHäÅ]8™-–èB$q–àq™I2»˜èëÚ¶√÷¸#zlziÅ@4ŸY¬%-ô‘ü…˚\0-»Õ;!¢∑N√-M˛\"sﬁ≠Dp◊(Ú∂ø»≈ÁT]CRìOì®KL3QAqJB<Mõ\0JM˜kátn©Ïı˙Uß˜æc^üº∞)r‘ÀÖ\nJ“Ö$ãÇ\r¡±A·ÃSR†¨&UﬁÚZ˜SjÉÂ»˘E•A∆Ù ≥9s{4ÊÓ·”Ò⁄x˝˙Ef ≠ÜÊÀ‹{à∑¢…üIÎV¶–ÀJ\nVT6í∑ „ûõa®\"•èjµπ6IÛ‘ëÈ{F•Ì	éSÜ”¨4∞g&4∂˚ìè•œA÷1CŒ-ÁVÎ™+qj*RînI;…äå8twN≠üË|˚@—|Õ+≥ÈÜÊ0u)mR%–ÉniO‘ë≈≤Ãf›fôRs$£™Ã”™>îwÖrIÁ¿˘í.∂Á¥%h	RT.ìpG1ñŒ≈•zcò2Ì\'±‘3ôs2Ïì†˚¬8˙ñ-∏täÛiX¡ätÉ‘ {¡sÔ\'\"‘É˘);ıÊGıæâƒ•\ne‹Â	‹(πê}®‚w1&!VWñÏ¨®ÓõZïõ9\Z_––Ü¡pU™µW.⁄ôÆ&ÊÊÎR1^éú¥È˜ôoÙÓèÚn Çê›Må¿H“=ü∆∏Çy¢€’\'B,Ca-ﬂ’ DtíI$‹û& ™UzÜÓIÛ0íuâB‰OˇŸ');
/*!40000 ALTER TABLE `zhh2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-16  9:31:24
