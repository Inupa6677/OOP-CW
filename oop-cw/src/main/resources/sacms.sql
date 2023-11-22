-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2023 at 08:42 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

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
  `advisor_id` varchar(10) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `dob` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `contact_number` varchar(10) NOT NULL,
  `gender` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `advisor`
--

INSERT INTO `advisor` (`advisor_id`, `first_name`, `last_name`, `dob`, `email`, `password`, `contact_number`, `gender`) VALUES
('1212', 'surathal', 'maluwa', '2023-10-30', 'maluwa@gmail.com', '123', '0789089766', 'male'),
('123e', 'kamal', 'rajev', '2023-10-30', 'kmac@gmail.com', '1234', '0786778900', 'male'),
('A1', 'eminem', 'sama', '2023-10-30', 'eminemsama@gmail.com', '333', '0789766890', 'male'),
('A33', 'sudu', 'nanda', '2023-11-13', 'sudu@gmail.com', '123', '0789877433', 'Female');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `student_id` varchar(10) NOT NULL,
  `event_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `club`
--

CREATE TABLE `club` (
  `club_id` varchar(10) NOT NULL,
  `club_name` varchar(100) NOT NULL,
  `advisor_id` varchar(10) DEFAULT NULL,
  `members` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `club`
--

INSERT INTO `club` (`club_id`, `club_name`, `advisor_id`, `members`, `description`) VALUES
('2222', 'IEE', 'A1', 123, 'huthto'),
('C33', 'LEOO', 'A1', 13, 'hello naveen gobbbya'),
('C5', 'IEE', 'A1', 123, 'huthto'),
('C7', 'htutha', 'A1', 100, 'ado pko'),
('erer', 'tok', 'A1', 12, 'americano wespusi'),
('err', 'wdwdwdw', '1212', 12, 'wwdwdwd');

-- --------------------------------------------------------

--
-- Table structure for table `club_event`
--

CREATE TABLE `club_event` (
  `event_id` varchar(10) NOT NULL,
  `event_name` varchar(50) NOT NULL,
  `location` varchar(20) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `event_Date` date DEFAULT NULL,
  `event_time` time DEFAULT NULL,
  `club_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `join_club`
--

CREATE TABLE `join_club` (
  `student_id` varchar(10) NOT NULL,
  `club_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `meeting`
--

CREATE TABLE `meeting` (
  `event_id` varchar(10) NOT NULL,
  `meeting_type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` varchar(10) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `dob` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `contact_number` varchar(10) NOT NULL,
  `gender` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `first_name`, `last_name`, `dob`, `email`, `password`, `contact_number`, `gender`) VALUES
('e123', 'kurama', 'perera', '2023-10-29', 'kurama@gmail.com', '123', '0763748885', 'male'),
('erer', 'Kumara', 'Saman', '2023-11-01', 'cv@gmail.com', '4', '0777906897', 'male'),
('ffff', 'fffff', 'ffff', '2023-10-29', 'ffff@gmail.com', 'ffff', '0789877678', 'male'),
('S002', 'jayantha', 'punde', '2023-11-05', 'huk@gmail.com', '3333', '0898989778', 'Male'),
('wesd', 'good', 'bad', '2023-10-29', 'giiid@gmail.com', '1234', '0789788677', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `workshop`
--

CREATE TABLE `workshop` (
  `event_id` varchar(10) NOT NULL,
  `workshop_type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `advisor`
--
ALTER TABLE `advisor`
  ADD PRIMARY KEY (`advisor_id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`student_id`,`event_id`),
  ADD KEY `event_id` (`event_id`);

--
-- Indexes for table `club`
--
ALTER TABLE `club`
  ADD PRIMARY KEY (`club_id`),
  ADD KEY `advisor_id` (`advisor_id`);

--
-- Indexes for table `club_event`
--
ALTER TABLE `club_event`
  ADD PRIMARY KEY (`event_id`),
  ADD KEY `club_id` (`club_id`);

--
-- Indexes for table `join_club`
--
ALTER TABLE `join_club`
  ADD PRIMARY KEY (`student_id`,`club_id`),
  ADD KEY `club_id` (`club_id`);

--
-- Indexes for table `meeting`
--
ALTER TABLE `meeting`
  ADD PRIMARY KEY (`event_id`,`meeting_type`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `workshop`
--
ALTER TABLE `workshop`
  ADD PRIMARY KEY (`event_id`,`workshop_type`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  ADD CONSTRAINT `attendance_ibfk_2` FOREIGN KEY (`event_id`) REFERENCES `club_event` (`event_id`);

--
-- Constraints for table `club`
--
ALTER TABLE `club`
  ADD CONSTRAINT `club_ibfk_1` FOREIGN KEY (`advisor_id`) REFERENCES `advisor` (`advisor_id`);

--
-- Constraints for table `club_event`
--
ALTER TABLE `club_event`
  ADD CONSTRAINT `club_event_ibfk_1` FOREIGN KEY (`club_id`) REFERENCES `club` (`club_id`);

--
-- Constraints for table `join_club`
--
ALTER TABLE `join_club`
  ADD CONSTRAINT `join_club_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  ADD CONSTRAINT `join_club_ibfk_2` FOREIGN KEY (`club_id`) REFERENCES `club` (`club_id`);

--
-- Constraints for table `meeting`
--
ALTER TABLE `meeting`
  ADD CONSTRAINT `meeting_ibfk_1` FOREIGN KEY (`event_id`) REFERENCES `club_event` (`event_id`);

--
-- Constraints for table `workshop`
--
ALTER TABLE `workshop`
  ADD CONSTRAINT `workshop_ibfk_1` FOREIGN KEY (`event_id`) REFERENCES `club_event` (`event_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
