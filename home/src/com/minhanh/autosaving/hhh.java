/*package com.minhanh.autosaving;

public class hhh {
 
	   static int j=20;
	   public static void main(String argv[]){
		   System.out.println(8 | 3);
	   }
	-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
	--
	-- Host: localhost    Database: adhtour_db
	-- ------------------------------------------------------
	-- Server version	5.7.22-log
	
	!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT ;
	!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS ;
	!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION ;
	!40101 SET NAMES utf8 ;
	!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE ;
	!40103 SET TIME_ZONE='+00:00' ;
	!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 ;
	!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 ;
	!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' ;
	!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 ;
	
	--
	-- Table structure for table `career`
	--
	
	DROP TABLE IF EXISTS `career`;
	!40101 SET @saved_cs_client     = @@character_set_client ;
	!40101 SET character_set_client = utf8 ;
	CREATE TABLE `career` (
	  `career_id` int(11) NOT NULL AUTO_INCREMENT,
	  `career_indentity_card` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_fullname` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_address` varchar(85) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_phone` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_birthday` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_notes` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_email` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_office` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_sex` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_isative` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `career_level` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  PRIMARY KEY (`career_id`)
	) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
	!40101 SET character_set_client = @saved_cs_client ;
	
	--
	-- Dumping data for table `career`
	--
	
	LOCK TABLES `career` WRITE;
	!40000 ALTER TABLE `career` DISABLE KEYS ;
	INSERT INTO `career` VALUES (9,'10999333','Nguyen Van Hoang','Ha Noi','0985937033','1995-11-21T12:00','<p>Nhan Vien Uu Tu</p>\r\n','for@gmail.com','b1','nam',' ','Nhan Vien'),(10,'0838332222','Hoang Van Chin','Ha Noi','09203824444','1993-11-15T12:00','<p>Nhan Vien binh thuong</p>\r\n','git@gmail.com','b3','nam',' ','Nhan Vien'),(15,'0238374893932','Nguyen Thi Thu Ha','Ha Nam','0178659783','1996-11-09T12:00','<p>Nhan vien nhiet tinh</p>\r\n','thuha110919@gmail.com','Quan li tour','Nu',' ','Nhan Vien'),(16,'0123456729933','Ngo Minh Anh','Ha Long','9203824444','1996-10-30T12:00','<p>Nhan vien nhiet tinh</p>\r\n','ngominhanh@gmail.com','Quan Li Tour','Nam',' ','Nhan Vien');
	!40000 ALTER TABLE `career` ENABLE KEYS ;
	UNLOCK TABLES;
	
	--
	-- Table structure for table `customer`
	--
	
	DROP TABLE IF EXISTS `customer`;
	!40101 SET @saved_cs_client     = @@character_set_client ;
	!40101 SET character_set_client = utf8 ;
	CREATE TABLE `customer` (
	  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
	  `customer_indentity_card` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_fullname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_address` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_phone` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_birthday` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_notes` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_email` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_office` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_sex` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_isative` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_level` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_company` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `customer_tour_id` int(11) DEFAULT NULL,
	  `customer_tour_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  PRIMARY KEY (`customer_id`)
	) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
	!40101 SET character_set_client = @saved_cs_client ;
	
	--
	-- Dumping data for table `customer`
	--
	
	LOCK TABLES `customer` WRITE;
	!40000 ALTER TABLE `customer` DISABLE KEYS ;
	INSERT INTO `customer` VALUES (3,'84204242','Nguyen Van Manh','Ha Nam','0943442242',' ',' ','anh@gmail.com',' ',' ',' ',' ',' ',' ',9,'Ninh Binh'),(4,'8688655','Nguyen Van Tien','Ha Noi','0832322',' ',' ','fdfdanh@gmail.com',' ',' ',' ',' ',' ',' ',9,'Ninh Binh'),(5,'878688655','Chu Tien Hoang','Thai Nguyen','0985937304',' ',' ','ddnh@gmail.com',' ',' ',' ',' ',' ',' ',9,'Ninh Binh'),(6,'8688655','hoang van a','Ha Noi','57575',' ',' ','a@gmail.com',' ',' ',' ',' ',' ',' ',13,'Tay Bac'),(7,'84204242','Chu Tien Hoang','Ha Noi','9203824444',' ',' ','bien@gmail.com',' ',' ',' ',' ',' ',' ',113,'Da Nang');
	!40000 ALTER TABLE `customer` ENABLE KEYS ;
	UNLOCK TABLES;
	
	--
	-- Table structure for table `tour`
	--
	
	DROP TABLE IF EXISTS `tour`;
	!40101 SET @saved_cs_client     = @@character_set_client ;
	!40101 SET character_set_client = utf8 ;
	CREATE TABLE `tour` (
	  `tour_id` int(11) NOT NULL AUTO_INCREMENT,
	  `tour_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_destination_id` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_sub_destination_id` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_start_id` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_start_date` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_finish_date` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_number_date` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_number_customer` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_customer_notes` varchar(300) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_transport` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_guider_id` int(11) DEFAULT NULL,
	  `tour_price` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
	  `tour_img` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
	  PRIMARY KEY (`tour_id`)
	) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
	!40101 SET character_set_client = @saved_cs_client ;
	
	--
	-- Dumping data for table `tour`
	--
	
	LOCK TABLES `tour` WRITE;
	!40000 ALTER TABLE `tour` DISABLE KEYS ;
	INSERT INTO `tour` VALUES (1,'01','Con Dao','Con Dao','Khong Co','Ha Noi','2018-11-02T12:00','2018-11-04T01:59',NULL,'10','<p>Chuyen di dac biet chac chan se lam cac ban hai long</p>\r\n','O To',1,'2.000.000','condao1.png'),(19,'02','Ha Long','Ha Long','Khong co','Ha Noi','2018-11-10T13:59','2018-11-10T12:00',NULL,'4','<p>La diem den cua rat nhieu du khach trong va ngoai nuoc.</p>\r\n','O To',1,'900.000','halong.jpg'),(113,'06','Da Nang','Da Nang','Khong Co','Ha Noi','2018-11-01T15:05','2018-11-04T16:02',NULL,'7','<p>Da Nang la mot diem den tuyet voi cho moi nguoi .</p>\r\n','O to',1,'1.500.000','baibiendanang.jpg'),(114,'06','Ninh Binh','Ninh Binh','Khong co','Ha Noi','2018-11-02T00:59','2018-11-04T12:00',NULL,'10','<p>Ninh Binh la noi tuyet voi de trai nghiem nhung dieu ky dieu</p>\r\n','O To',1,'900000','hoalu-ninhbinh.jpg'),(115,'08','Phu Quoc','Phu Quoc','Khong co','Ha Noi','2018-11-08T00:00','2018-01-31T12:00',NULL,'5','<p>La noi tuyet voi de tam bien va hoa minh vao thien nhien.</p>\r\n','O To',1,'2.000.000','phuquoc.jpg'),(116,'09','Tay Bac ','Tay Bac','Khong co','Ha Noi','2018-11-08T00:00','2018-01-31T12:00',NULL,'5','<p>La noi tuyet voi de tam bien va hoa minh vao thien nhien.</p>\r\n','O To',1,'2.000.000','taybac.jpg'),(117,'09','Tay Nguyen','Tay Nguyen','Khong co','Ha Noi','2018-11-08T00:00','2018-01-31T12:00',NULL,'5','<p>La noi tuyet voi de tam bien va hoa minh vao thien nhien.</p>\r\n','O To',1,'2.000.000','taynguyen.jpg'),(118,'09','Sapa','Sapa','Khong co','Ha Noi','2018-11-08T00:00','2018-01-31T12:00',NULL,'5','<p>La noi tuyet voi de tam bien va hoa minh vao thien nhien.</p>\r\n','O To',0,'2.000.000','sapa.jpg'),(119,'09','Ha Long','Con Dao','Khong co','Ha Noi','','',NULL,'4','<p>chuyen di dac biet danh cho nhom va gia dinh.</p>\r\n','O To',1,'2.000.000','cucphuong.jpg');
	!40000 ALTER TABLE `tour` ENABLE KEYS ;
	UNLOCK TABLES;
	
	--
	-- Table structure for table `user`
	--
	
	DROP TABLE IF EXISTS `user`;
	!40101 SET @saved_cs_client     = @@character_set_client ;
	!40101 SET character_set_client = utf8 ;
	CREATE TABLE `user` (
	  `user_id` int(11) NOT NULL AUTO_INCREMENT,
	  `user_name` varchar(45) DEFAULT NULL,
	  `user_pass` varchar(45) DEFAULT NULL,
	  `user_role` varchar(45) DEFAULT NULL,
	  PRIMARY KEY (`user_id`)
	) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
	!40101 SET character_set_client = @saved_cs_client ;
	
	--
	-- Dumping data for table `user`
	--
	
	LOCK TABLES `user` WRITE;
	!40000 ALTER TABLE `user` DISABLE KEYS ;
	INSERT INTO `user` VALUES (1,'a','a','0'),(2,'s','s','1');
	!40000 ALTER TABLE `user` ENABLE KEYS ;
	UNLOCK TABLES;
	!40103 SET TIME_ZONE=@OLD_TIME_ZONE ;
	
	!40101 SET SQL_MODE=@OLD_SQL_MODE ;
	!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS ;
	!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS ;
	!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT ;
	!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS ;
	!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION ;
	!40111 SET SQL_NOTES=@OLD_SQL_NOTES ;
	
	-- Dump completed on 2019-01-17 19:34:50
	


	   }

		  

	   





*/