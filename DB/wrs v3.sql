-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 11, 2021 at 05:15 AM
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
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `Id` int(11) NOT NULL,
  `Fname` varchar(50) NOT NULL,
  `Mname` varchar(50) DEFAULT NULL,
  `Lname` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Contact` varchar(50) NOT NULL,
  `isBorrowed_Gallons` int(11) NOT NULL,
  `Gallon_Id` int(11) NOT NULL,
  `Gallon_Quantity` int(11) NOT NULL,
  `isSuki` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`Id`, `Fname`, `Mname`, `Lname`, `Address`, `Contact`, `isBorrowed_Gallons`, `Gallon_Id`, `Gallon_Quantity`, `isSuki`) VALUES
(1, 'Kevin', NULL, 'Lixfe', 'bago general tinio ne', '09261364720', 1, 2, 5, 1),
(2, 'kevz', 'asdasd', 'Lixfe', 'bago general tinio ne', '09261364720', 1, 2, 5, 1),
(5, 'kevz', 'kevz', 'vin', 'bago general tinio ne', '09261364720', 1, 1, 10, 1);

-- --------------------------------------------------------

--
-- Table structure for table `deliveries`
--

CREATE TABLE `deliveries` (
  `Id` int(11) NOT NULL,
  `Customer_Id` int(11) NOT NULL,
  `Date_Delivered` date NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Promo_Id` int(11) DEFAULT NULL,
  `Status` int(11) NOT NULL,
  `User_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deliveries`
--

INSERT INTO `deliveries` (`Id`, `Customer_Id`, `Date_Delivered`, `Quantity`, `Promo_Id`, `Status`, `User_Id`) VALUES
(15, 5, '2021-09-28', 3, 1, 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `gallons`
--

CREATE TABLE `gallons` (
  `Gallon_Code` int(11) NOT NULL,
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

INSERT INTO `gallons` (`Gallon_Code`, `Name`, `Size`, `Color`, `Gallon_Type`, `Supplier_id`, `Date_delivered`, `Price`, `Stocks`) VALUES
(1, 'SLIM', '19 Liters', 'Blue', 'Slim with handle', 1, '2021-09-12', 50, 100),
(2, 'ROUND', '19 Liters', 'Blue', 'Round', 1, '2021-09-13', 50, 100);

-- --------------------------------------------------------

--
-- Table structure for table `promos`
--

CREATE TABLE `promos` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `Date_Started` date NOT NULL,
  `Date_End` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `promos`
--

INSERT INTO `promos` (`Id`, `Name`, `Description`, `Date_Started`, `Date_End`) VALUES
(0, 'No Available Promo', 'No Available Promo', '2021-09-23', '2021-09-23'),
(1, 'HOLA', '5 + 1', '2021-09-22', '2021-09-23'),
(4, 'esprikitik', 'pungsola tsiriri pungsola abutsikik ekekekek', '2021-09-26', '2021-09-30'),
(5, 'kjoijiopj', 'oijiojoijojoij', '2021-09-26', '2021-10-05');

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
(2, 'Owner'),
(3, 'Refiller');

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
  `Username` varchar(100) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `password` varchar(100) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Id`, `Role_id`, `Profile`, `Fname`, `Mname`, `Lname`, `DOB`, `Address`, `Contact`, `Username`, `password`) VALUES
(1, 1, 'Kevin.jpg', 'Kevin', 'Felix', 'Caluag', '2001-01-13', 'Nazareth general tinio ne', '09261364720', 'superadmin', 'ufxx|twi'),
(2, 2, 'Kevin.jpg', 'Owner', 'Owner', 'Owner', '2001-01-13', 'San pedro general tinio ne', '09261364720', 'Owner', 'ufxx|twi'),
(3, 3, 'sampleuser.jpg', 'Joms', 'banayo', 'mallare', '2021-12-30', 'kmk', '4234', 'refiller', 'ufxx|twi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `customers_barrowed_gallon_id` (`Gallon_Id`);

--
-- Indexes for table `deliveries`
--
ALTER TABLE `deliveries`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `deliviries_customer_id` (`Customer_Id`),
  ADD KEY `deliviries_promo_id` (`Promo_Id`),
  ADD KEY `deliviries_user_id` (`User_Id`);

--
-- Indexes for table `gallons`
--
ALTER TABLE `gallons`
  ADD PRIMARY KEY (`Gallon_Code`),
  ADD KEY `gallons_supplier_id` (`Supplier_id`);

--
-- Indexes for table `promos`
--
ALTER TABLE `promos`
  ADD PRIMARY KEY (`Id`);

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
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `deliveries`
--
ALTER TABLE `deliveries`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `gallons`
--
ALTER TABLE `gallons`
  MODIFY `Gallon_Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `promos`
--
ALTER TABLE `promos`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `Role_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `suppliers`
--
ALTER TABLE `suppliers`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customers`
--
ALTER TABLE `customers`
  ADD CONSTRAINT `customers_barrowed_gallon_id` FOREIGN KEY (`Gallon_Id`) REFERENCES `gallons` (`Gallon_Code`);

--
-- Constraints for table `deliveries`
--
ALTER TABLE `deliveries`
  ADD CONSTRAINT `deliviries_customer_id` FOREIGN KEY (`Customer_Id`) REFERENCES `customers` (`Id`),
  ADD CONSTRAINT `deliviries_promo_id` FOREIGN KEY (`Promo_Id`) REFERENCES `promos` (`Id`),
  ADD CONSTRAINT `deliviries_user_id` FOREIGN KEY (`User_Id`) REFERENCES `users` (`Id`);

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
