-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: dnddb
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `pg`
--

DROP TABLE IF EXISTS `pg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pg` (
  `IDuser` int DEFAULT NULL,
  `CharacterName` varchar(45) NOT NULL,
  `PlayerName` varchar(45) NOT NULL,
  `Race` varchar(45) NOT NULL,
  `Alignment` varchar(45) NOT NULL,
  `ClassLevel` int NOT NULL,
  `Background` varchar(40) NOT NULL,
  `PersonalityTraits` varchar(40) NOT NULL,
  `Ideals` varchar(40) NOT NULL,
  `Bonds` varchar(40) NOT NULL,
  `Flaws` varchar(40) NOT NULL,
  `XP` int NOT NULL,
  `STR` int NOT NULL,
  `STRmod` int NOT NULL,
  `DEX` int NOT NULL,
  `DEXmod` int NOT NULL,
  `CON` int NOT NULL,
  `CONmod` int NOT NULL,
  `OINT` int NOT NULL,
  `INTmod` int NOT NULL,
  `WIS` int NOT NULL,
  `WISmod` int NOT NULL,
  `CHA` int NOT NULL,
  `CHAmod` int NOT NULL,
  `Passive` int NOT NULL,
  `ProfBonus` int NOT NULL,
  `Initiative` int NOT NULL,
  `Speed` int NOT NULL,
  `HPMax` int NOT NULL,
  `HDTotal` int NOT NULL,
  `HD` int NOT NULL,
  `RaceBonuses` varchar(40) NOT NULL,
  `RaceAndFeatures` varchar(40) NOT NULL,
  `FeaturesAndTraits` varchar(40) NOT NULL,
  KEY `IDuser` (`IDuser`),
  CONSTRAINT `pg_ibfk_1` FOREIGN KEY (`IDuser`) REFERENCES `users` (`ID`),
  CONSTRAINT `pg_chk_1` CHECK ((`ClassLevel` > 0)),
  CONSTRAINT `pg_chk_10` CHECK ((`ProfBonus` > 0)),
  CONSTRAINT `pg_chk_11` CHECK ((`Initiative` > 0)),
  CONSTRAINT `pg_chk_12` CHECK ((`Speed` > 0)),
  CONSTRAINT `pg_chk_13` CHECK ((`HPMax` > 0)),
  CONSTRAINT `pg_chk_14` CHECK ((`HDTotal` > 0)),
  CONSTRAINT `pg_chk_15` CHECK ((`HD` > 0)),
  CONSTRAINT `pg_chk_2` CHECK ((`XP` > 0)),
  CONSTRAINT `pg_chk_3` CHECK ((`STR` > 0)),
  CONSTRAINT `pg_chk_4` CHECK ((`DEX` > 0)),
  CONSTRAINT `pg_chk_5` CHECK ((`CON` > 0)),
  CONSTRAINT `pg_chk_6` CHECK ((`OINT` > 0)),
  CONSTRAINT `pg_chk_7` CHECK ((`WIS` > 0)),
  CONSTRAINT `pg_chk_8` CHECK ((`CHA` > 0)),
  CONSTRAINT `pg_chk_9` CHECK ((`Passive` > 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pg`
--

LOCK TABLES `pg` WRITE;
/*!40000 ALTER TABLE `pg` DISABLE KEYS */;
/*!40000 ALTER TABLE `pg` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-20 12:50:52
