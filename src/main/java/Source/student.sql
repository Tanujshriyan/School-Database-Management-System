-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: student
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `class_10`
--

DROP TABLE IF EXISTS `class_10`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_10` (
  `Name` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `Caste` varchar(45) NOT NULL,
  `Dob` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Aadhar` varchar(45) NOT NULL,
  `BloodGroup` varchar(45) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `FatherOccupation` varchar(45) NOT NULL,
  `FatherNumber` varchar(45) NOT NULL,
  `MotherName` varchar(45) NOT NULL,
  `MotherOccupation` varchar(45) NOT NULL,
  `MotherNumber` varchar(45) NOT NULL,
  `PermanentAddress` varchar(45) NOT NULL,
  `TemporaryAddress` varchar(45) NOT NULL,
  `PreviousSchoolName` varchar(45) NOT NULL,
  `Percentage` varchar(45) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_10`
--

LOCK TABLES `class_10` WRITE;
/*!40000 ALTER TABLE `class_10` DISABLE KEYS */;
/*!40000 ALTER TABLE `class_10` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_8`
--

DROP TABLE IF EXISTS `class_8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_8` (
  `Name` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `Caste` varchar(45) NOT NULL,
  `Dob` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Aadhar` varchar(45) NOT NULL,
  `BloodGroup` varchar(45) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `FatherOccupation` varchar(45) NOT NULL,
  `FatherNumber` varchar(45) NOT NULL,
  `MotherName` varchar(45) NOT NULL,
  `MotherOccupation` varchar(45) NOT NULL,
  `MotherNumber` varchar(45) NOT NULL,
  `PermanentAddress` varchar(45) NOT NULL,
  `TemporaryAddress` varchar(45) NOT NULL,
  `PreviousSchoolName` varchar(45) NOT NULL,
  `Percentage` varchar(45) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_8`
--

LOCK TABLES `class_8` WRITE;
/*!40000 ALTER TABLE `class_8` DISABLE KEYS */;
INSERT INTO `class_8` VALUES ('Devansh A Sankar','Hindu','Mudiraju','2001-03-13','Male','6512 9642 1920','B (B+)','Advaith ','Freelancer','123456789','Drishti ','Designer','987654321','Padil','Padil','Ramakrishna','81'),('Gauri C Lalla','Hindu','Gahoi','2001-07-15','Female','2782 6974 1374','A (A+)','Chetan','Technician','123456789','Adah ','Housewife','987654321','KPT','KPT','St Aloysius','74'),('Indrajit P Handa','Hindu','Ghirth','2001-12-13','Female','2782 6974 1374','O (O+)','Pratap ','Graphic Designer','123456789','Ishani','Housewife','987654321','Urwa','Urwa','Govinda','69'),('Manas I Nagarajan','Hindu','Joisar','2000-06-19','Female','6499 2818 7302','B (B+)','Ishaan ','Graphic Designer','123456789','Talika ','Housewife','987654321','Carstreet','Carstreet','Besant','56'),('Mayur K Karnad','Hindu','Godha','2000-02-19','Male','3977 8800 0234','O (O+)','Ravindra','Accountant','123456789','Kamala','Housewife','987654321','Carstreet','Carstreet','St Aloysius','86'),('Ravindra S Patla','Hindu','Maiya','2001-08-30','Male','6512 9642 1920','A (A+)','Sandip','Civil engineer','123456789','Khushi ','Social worker','987654321','Padil','Padil','St Aloysius','78'),('Ritu K Prasad','Hindu','Kansara','2001-02-04','Female','2782 6974 1374','O (O+)','Kanta ','Mechanical Engineer','123456789','Vasudha ','Business analyst','987654321','Kotara','Kotara','Ramakrishna','89'),('Sandhya N Iyengar','Hindu','Koshta','2001-04-20','Female','6499 2818 7302','O (O+)','Neel ','Accountant','123456789','Sonam ','Paramedic','987654321','Statebank','Statebank','St Aloysius','71'),('Shravan J Shetty','Hindu','Shetty','2001-11-21','Male','6499 2818 7302','O (O+)','Vaneet','Electrical Engineer','123456789','Shakti','Housewife','987654321','Urwa','Urwa','Govinda','82'),('Tanuj B Shriyan','Hindu','Devadiga','2001-10-02','Male','2782 6974 1374','B (B+)','Aryan','Site Manager','123456789','Kalini ','Housewife','987654321','KPT','KPT','Canara','77'),('Vasuda A Salvi','Hindu','Bandhmati','2001-05-05','Female','6512 9642 1920','B (B+)','Aadesh ','Mechanical Engineer','123456789','Trishna ','Software Developer','987654321','Carstreet','Carstreet','Govinda','59'),('Vipul A Kade','Hindu','Ahirwar','2001-07-02','Male','3977 8800 0234','A (A+)','Akash ','Business analyst','123456789','Saraswati ','Housewife','987654321','Statebank','Statebank','St Aloysius','90');
/*!40000 ALTER TABLE `class_8` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_9`
--

DROP TABLE IF EXISTS `class_9`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_9` (
  `Name` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `Caste` varchar(45) NOT NULL,
  `Dob` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Aadhar` varchar(45) NOT NULL,
  `BloodGroup` varchar(45) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `FatherOccupation` varchar(45) NOT NULL,
  `FatherNumber` varchar(45) NOT NULL,
  `MotherName` varchar(45) NOT NULL,
  `MotherOccupation` varchar(45) NOT NULL,
  `MotherNumber` varchar(45) NOT NULL,
  `PermanentAddress` varchar(45) NOT NULL,
  `TemporaryAddress` varchar(45) NOT NULL,
  `PreviousSchoolName` varchar(45) NOT NULL,
  `Percentage` varchar(45) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_9`
--

LOCK TABLES `class_9` WRITE;
/*!40000 ALTER TABLE `class_9` DISABLE KEYS */;
/*!40000 ALTER TABLE `class_9` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `Uname` varchar(45) NOT NULL,
  `Upassword` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  PRIMARY KEY (`Uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('admin','admin','admin@gmail.com'),('Tanujshriyan','21232f297a57a5a743894ae4a801fc3','Tanujshriyan@gmail.com');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-19 11:43:29
