-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 06, 2023 at 03:19 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sacms`
--

-- --------------------------------------------------------

--
-- Table structure for table `advisor`
--

CREATE TABLE `advisor` (
  `Advisor_id` int(5) NOT NULL,
  `Advisor_name` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `club`
--

CREATE TABLE `club` (
  `Club_id` int(5) NOT NULL,
  `Club_name` varchar(50) NOT NULL,
  `Members` int(200) DEFAULT NULL,
  `Advisor_id` int(5) DEFAULT NULL,
  `club_description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `Event_id` int(5) NOT NULL,
  `Event_name` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Event_date` date NOT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `Event_time` time DEFAULT NULL,
  `Club_id` int(5) DEFAULT NULL,
  `Advisor_id` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `join_clubs`
--

CREATE TABLE `join_clubs` (
  `Student_Id` int(10) NOT NULL,
  `Club_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `join_event`
--

CREATE TABLE `join_event` (
  `Event_id` int(5) NOT NULL,
  `Student_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Student_Id` int(10) NOT NULL,
  `First_name` varchar(15) NOT NULL,
  `Last_name` varchar(15) DEFAULT NULL,
  `DoB` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Contact_number` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `advisor`
--
ALTER TABLE `advisor`
  ADD PRIMARY KEY (`Advisor_id`);

--
-- Indexes for table `club`
--
ALTER TABLE `club`
  ADD PRIMARY KEY (`Club_id`),
  ADD KEY `Advisor_id` (`Advisor_id`);

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`Event_id`),
  ADD KEY `Club_id` (`Club_id`),
  ADD KEY `Advisor_id` (`Advisor_id`);

--
-- Indexes for table `join_clubs`
--
ALTER TABLE `join_clubs`
  ADD PRIMARY KEY (`Student_Id`,`Club_id`),
  ADD KEY `Club_id` (`Club_id`);

--
-- Indexes for table `join_event`
--
ALTER TABLE `join_event`
  ADD PRIMARY KEY (`Event_id`,`Student_id`),
  ADD KEY `Student_id` (`Student_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Student_Id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `club`
--
ALTER TABLE `club`
  ADD CONSTRAINT `club_ibfk_1` FOREIGN KEY (`Advisor_id`) REFERENCES `advisor` (`Advisor_id`);

--
-- Constraints for table `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `event_ibfk_1` FOREIGN KEY (`Club_id`) REFERENCES `club` (`Club_id`),
  ADD CONSTRAINT `event_ibfk_2` FOREIGN KEY (`Advisor_id`) REFERENCES `advisor` (`Advisor_id`);

--
-- Constraints for table `join_clubs`
--
ALTER TABLE `join_clubs`
  ADD CONSTRAINT `join_clubs_ibfk_1` FOREIGN KEY (`Student_Id`) REFERENCES `student` (`Student_Id`),
  ADD CONSTRAINT `join_clubs_ibfk_2` FOREIGN KEY (`Club_id`) REFERENCES `club` (`Club_id`);

--
-- Constraints for table `join_event`
--
ALTER TABLE `join_event`
  ADD CONSTRAINT `join_event_ibfk_1` FOREIGN KEY (`Student_id`) REFERENCES `student` (`Student_Id`),
  ADD CONSTRAINT `join_event_ibfk_2` FOREIGN KEY (`Event_id`) REFERENCES `event` (`Event_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
