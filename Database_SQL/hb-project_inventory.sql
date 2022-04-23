-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: hb-project
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `pack` int DEFAULT NULL,
  `packing_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_inventory_packing_idx` (`packing_id`),
  CONSTRAINT `fk_inventory_packing` FOREIGN KEY (`packing_id`) REFERENCES `packing` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (1,'Est Sugar Free',24,1),(2,'Est Cola',0,1),(3,'Est Play Grapefruit',24,1),(4,'Est Play Strawberry',24,1),(5,'Est Play Cream Soda',24,1),(6,'Est Play Orange',24,1),(7,'Esplay Lemon Lime',24,1),(8,'Est play Honey Lemon',48,2),(9,'Est play Honey Lemon',36,3),(10,'Est play Honey Lemon',24,4),(11,'Est play Honey Lemon',20,1),(12,'Est Cola',60,2),(13,'Est Play (Strawberry)',60,2),(14,'Est Play (Cream Soda)',60,2),(15,'Est Play (Orange)',60,2),(16,'Est Clear (Lemon Lime',60,2),(17,'Est Play (Grape Berry)',60,2),(18,'Est Play (Melon Bingsu)',60,2),(19,'Est Play (Ping Bomb)',60,5),(20,'Est Play (Kamikaze)',60,2),(21,'Est Cola',48,3),(22,'Est Play (Strawberry)',48,3),(23,'Est Play (Cream Soda)',48,3),(24,'Est Play (Orange)',48,3),(25,'Est Play (Lemon Lime)',48,3),(26,'Est Play (Grape Berry)',48,3),(27,'Est Play (Melon Bingsu)',48,3),(28,'Est Play (Pink Bomb)',48,3),(29,'Est Play (Kamikaze)',48,3),(30,'Est Cola',36,4),(31,'Est Sugar Free',36,4),(32,'Est Play (Strawberry)',36,4),(33,'Est Cola (Cream Soda)',36,4),(34,'Est Play (Orange)',36,4),(35,'Est Play (Lemon Lime)',36,4),(36,'Est Play (Grape Berry)',36,4),(37,'Est Play (Melon Bingsu)',36,4),(38,'Est Play (Pink Bomb)',36,4),(39,'Est Play (Kamikaze)',36,4),(40,'Est Cola',24,5),(41,'Est Play (Strawberry)',24,5),(42,'Est Play (Cream Soda)',24,5),(43,'Est Play (Orange)',24,5),(44,'Est Play (Lemon Lime)',24,5),(45,'Est Clear (Grape Berry)',24,5),(46,'Est Play (Melon Bingsu)',24,5),(47,'Est Play (Pink Bomb)',24,5),(48,'Est Play (Kamikaze)',24,5);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-23 15:30:07
