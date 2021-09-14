-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 14, 2021 at 10:16 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `gallons`
--

CREATE TABLE `gallons` (
  `Id` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Size` varchar(100) NOT NULL,
  `Color` varchar(100) NOT NULL,
  `Gallon_Type` varchar(100) NOT NULL,
  `Supplier_id` int(11) NOT NULL,
  `Date_delivered` date NOT NULL,
  `Price` int(11) NOT NULL,
  `Stocks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gallons`
--

INSERT INTO `gallons` (`Id`, `Name`, `Size`, `Color`, `Gallon_Type`, `Supplier_id`, `Date_delivered`, `Price`, `Stocks`) VALUES
(1, 'SLIM', '19 Liters', 'Blue', 'Slim with handle', 1, '2021-09-12', 50, 100),
(2, 'ROUND', '19 Liters', 'Blue', 'Round', 1, '2021-09-13', 50, 100);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `Role_id` int(11) NOT NULL,
  `Display_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`Role_id`, `Display_name`) VALUES
(1, 'Developer'),
(2, 'Owner');

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `Id` int(11) NOT NULL,
  `Fname` varchar(100) NOT NULL,
  `Mname` varchar(100) NOT NULL,
  `Lname` varchar(100) NOT NULL,
  `Company_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`Id`, `Fname`, `Mname`, `Lname`, `Company_name`) VALUES
(1, 'Jomari', 'B', 'Mallare', 'COCOMELON');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Id` int(11) NOT NULL,
  `Role_id` int(11) NOT NULL,
  `Profile` varchar(100) NOT NULL,
  `Fname` varchar(100) NOT NULL,
  `Mname` varchar(100) NOT NULL,
  `Lname` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact` varchar(11) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Id`, `Role_id`, `Profile`, `Fname`, `Mname`, `Lname`, `DOB`, `Address`, `Contact`, `Username`, `password`) VALUES
(1, 1, 'Kevin.jpg', 'Kevin', 'Felix', 'Caluag', '2001-01-13', 'Nazareth general tinio ne', '09261364720', 'superadmin', 'ufxx|twi'),
(2, 2, 'Owner.jpg', 'Owner', 'Owner', 'Owner', '2001-01-13', 'San pedro general tinio ne', '09261364720', 'Owner', 'ufxx|twi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gallons`
--
ALTER TABLE `gallons`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `gallons_supplier_id` (`Supplier_id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`Role_id`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `users_role_id` (`Role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gallons`
--
ALTER TABLE `gallons`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `Role_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `suppliers`
--
ALTER TABLE `suppliers`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `gallons`
--
ALTER TABLE `gallons`
  ADD CONSTRAINT `gallons_supplier_id` FOREIGN KEY (`Supplier_id`) REFERENCES `suppliers` (`Id`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_role_id` FOREIGN KEY (`Role_id`) REFERENCES `roles` (`Role_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
