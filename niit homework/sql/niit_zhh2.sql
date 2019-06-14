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
INSERT INTO `zhh2` VALUES (1,'2019-05-14 09:05:35',NULL,NULL,NULL,NULL,'����\0�Exif\0\0MM\0*\0\0\0\0\0\0\0\0\0\0\0\0,\0\0\0\0\0\0\04�i\0\0\0\0\0\0\0J\0\0\0\0\0\0\0\02\0\0\0\0\0\0\0\0\0\0\0\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\02\0\0\0\0\0\0\0\0\0\0\0\0��\0JFIF\0\0\0\0\0\0��\0C\0\n\n\n		\n\Z%\Z# , #&\')*)-0-(0%()(��\0C\n\n\n\n(\Z\Z((((((((((((((((((((((((((((((((((((((((((((((((((��\0\04\0,\"\0��\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0	��\05\0\0\0\0\0\0\0\0!1AQa\"q�#2R��$3Sb������\0\Z\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\0*\0\0\0\0\0\0\0\0\0\0!1\"AQq���Ba����\0\0\0?\0ʐ�#1R�jRI���%\"\ZƘ쟳�m�V �3v��7����E��9è�n����HJ/l�o�I19�].�%Z�R-�RG�Og�6aw�(aa�e�[ ߆�C���0�d�\0������k���e*j\\.bGU<YR7�t�E�=LT���[Kb�@���JHZn�G¾9ŏh�bʄ�i��W�	�A�ޚ�H��]8�-ЏB$q��q�I2���������#zlzi�@4�Y�%-�ԟ��\0-��;!��N�-M�\"sޭDp�(����T]CR�O��KL3QAqJB<M�\0JM�k�tn����U���c^���)r�˅\nJ��$��\r��A��SR��&U��Z�Sj����E�A��ʳ9s{4������x��Efʭ����{���ɟI�V���J\nVT6�� 㞛a�\"��j��6I�ԑ�{F��	�S��Ӭ4�g&4�������A�1C�-�V�+qj*R�nI;Ɋ�8twN���|�@�|�+���0u)mR%ЃniO�����f�f�Rs$���Ӫ>�w�rI����.���%h	RT.�pG1��ťzc�2�\'��3�s2쓠��8��-�t��iX��t���{�s�\'\"ԃ�);��G���ĥ\ne��	�(��}��w1&!VW�쬨�Z��9\Z_����pU��W.ڙ�&���R1^������o����n ���M��H�=�Ƹ�y���\'B,Ca-�� Dt�I$ܞ& �Uz��I�0�u�B�O��');
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
