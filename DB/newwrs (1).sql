-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 07, 2021 at 10:33 AM
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
-- Database: `newwrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `barrow_gallons`
--

CREATE TABLE `barrow_gallons` (
  `ID` int(11) NOT NULL,
  `Customer_Id` int(11) NOT NULL,
  `Gallon_Id` varchar(10) NOT NULL,
  `Gallon_Quantity` int(11) NOT NULL,
  `Date_Borrowed` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barrow_gallons`
--

INSERT INTO `barrow_gallons` (`ID`, `Customer_Id`, `Gallon_Id`, `Gallon_Quantity`, `Date_Borrowed`) VALUES
(3, 1, '0000000000', 10, '2021-10-25');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `ID` int(11) NOT NULL,
  `Fname` varchar(100) NOT NULL,
  `Mname` varchar(100) NOT NULL,
  `Lname` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact` varchar(100) NOT NULL,
  `isSuki` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`ID`, `Fname`, `Mname`, `Lname`, `Address`, `Contact`, `isSuki`) VALUES
(1, 'kevin', 'felix', 'caluag', 'bago general tinio ne', '0192310912', 1);

-- --------------------------------------------------------

--
-- Table structure for table `deliveries`
--

CREATE TABLE `deliveries` (
  `ID` int(11) NOT NULL,
  `Customer_Id` int(11) NOT NULL,
  `Date_Order` date NOT NULL,
  `Date_Delivered` date NOT NULL,
  `Gallon_Id` varchar(10) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Promo_Id` int(11) NOT NULL,
  `Status` int(11) NOT NULL,
  `User_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `gallons`
--

CREATE TABLE `gallons` (
  `Code` varchar(10) NOT NULL,
  `Size` varchar(100) NOT NULL,
  `Color` varchar(100) NOT NULL,
  `Gallon_Type` varchar(100) NOT NULL,
  `Supplier_Id` int(11) NOT NULL,
  `Date_Delivered` date NOT NULL,
  `PurchasePrice` double NOT NULL,
  `Stocks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gallons`
--

INSERT INTO `gallons` (`Code`, `Size`, `Color`, `Gallon_Type`, `Supplier_Id`, `Date_Delivered`, `PurchasePrice`, `Stocks`) VALUES
('0000000000', '20 L', 'blue', 'Slim', 1, '2021-10-24', 5000, 200);

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
(10, '5 + 1', '+ 1 in every 5 gallon', '2021-10-15', '2021-10-31');

-- --------------------------------------------------------

--
-- Table structure for table `return_gallon`
--

CREATE TABLE `return_gallon` (
  `ID` int(11) NOT NULL,
  `Customer_Id` int(11) NOT NULL,
  `Gallon_Id` varchar(10) NOT NULL,
  `Gallon_Quantity` int(11) NOT NULL,
  `Date_Return` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  `ID` int(11) NOT NULL,
  `Fname` varchar(100) NOT NULL,
  `Mname` varchar(100) NOT NULL,
  `Lname` varchar(100) NOT NULL,
  `Company_Name` varchar(100) NOT NULL,
  `Company_Address` varchar(100) NOT NULL,
  `Contact` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`ID`, `Fname`, `Mname`, `Lname`, `Company_Name`, `Company_Address`, `Contact`) VALUES
(1, 'Jomari', 'Banayo', 'Mallare', 'MallareGallonsMaker', 'sampaguita general tinio ne', '0349203492');

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
(1, 1, 'Kevin', 'Kevin', 'Felix', 'Caluag', '2001-01-13', 'Nazareth general tinio ne', '09261364720', 'superadmin', 'ufxx|twi'),
(2, 2, 'Owner', 'Owner', 'Owner', 'Owner', '2001-01-13', 'San pedro general tinio ne', '09261364720', 'Owner', 'ufxx|twi'),
(3, 2, 'Joms', 'Joms', 'banayo', 'mallare', '2001-12-27', 'kmk', '4234', 'refiller', 'ufxx|twi');

-- --------------------------------------------------------

--
-- Table structure for table `walkins`
--

CREATE TABLE `walkins` (
  `ID` int(11) NOT NULL,
  `Customer_Id` int(11) NOT NULL,
  `Date_Refill` date NOT NULL,
  `Date_PickUp` date NOT NULL,
  `Gallon_Id` varchar(10) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Promo_Id` int(11) NOT NULL,
  `Status` int(11) NOT NULL,
  `User_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barrow_gallons`
--
ALTER TABLE `barrow_gallons`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `customers_barrowed_gallon_id` (`Customer_Id`),
  ADD KEY `gallon_id_borrowed_gallons` (`Gallon_Id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `deliveries`
--
ALTER TABLE `deliveries`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `customers_id_deliveries` (`Customer_Id`),
  ADD KEY `promo_id_deliveries` (`Promo_Id`),
  ADD KEY `user_id_deliveries` (`User_Id`),
  ADD KEY `gallon_id_deliveries` (`Gallon_Id`);

--
-- Indexes for table `gallons`
--
ALTER TABLE `gallons`
  ADD PRIMARY KEY (`Code`),
  ADD KEY `supplier_id_gallons` (`Supplier_Id`);

--
-- Indexes for table `promos`
--
ALTER TABLE `promos`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `return_gallon`
--
ALTER TABLE `return_gallon`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `customer_id` (`Customer_Id`),
  ADD KEY `gallon_id_return_gallon` (`Gallon_Id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`Role_id`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `users_role_id` (`Role_id`);

--
-- Indexes for table `walkins`
--
ALTER TABLE `walkins`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `customers_id_walkins` (`Customer_Id`),
  ADD KEY `promo_id_walkins` (`Promo_Id`),
  ADD KEY `user_id_walkins` (`User_Id`),
  ADD KEY `gallon_id_walkins` (`Gallon_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barrow_gallons`
--
ALTER TABLE `barrow_gallons`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `deliveries`
--
ALTER TABLE `deliveries`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `promos`
--
ALTER TABLE `promos`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `return_gallon`
--
ALTER TABLE `return_gallon`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `Role_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `suppliers`
--
ALTER TABLE `suppliers`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `walkins`
--
ALTER TABLE `walkins`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barrow_gallons`
--
ALTER TABLE `barrow_gallons`
  ADD CONSTRAINT `customers_barrowed_gallon_id` FOREIGN KEY (`Customer_Id`) REFERENCES `customers` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `gallon_id_borrowed_gallons` FOREIGN KEY (`Gallon_Id`) REFERENCES `gallons` (`Code`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `deliveries`
--
ALTER TABLE `deliveries`
  ADD CONSTRAINT `customers_id_deliveries` FOREIGN KEY (`Customer_Id`) REFERENCES `customers` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `gallon_id_deliveries` FOREIGN KEY (`Gallon_Id`) REFERENCES `gallons` (`Code`),
  ADD CONSTRAINT `promo_id_deliveries` FOREIGN KEY (`Promo_Id`) REFERENCES `promos` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `user_id_deliveries` FOREIGN KEY (`User_Id`) REFERENCES `users` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `gallons`
--
ALTER TABLE `gallons`
  ADD CONSTRAINT `supplier_id_gallons` FOREIGN KEY (`Supplier_Id`) REFERENCES `suppliers` (`ID`);

--
-- Constraints for table `return_gallon`
--
ALTER TABLE `return_gallon`
  ADD CONSTRAINT `customer_id` FOREIGN KEY (`Customer_Id`) REFERENCES `customers` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `gallon_id_return_gallon` FOREIGN KEY (`Gallon_Id`) REFERENCES `gallons` (`Code`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_role_id` FOREIGN KEY (`Role_id`) REFERENCES `roles` (`Role_id`);

--
-- Constraints for table `walkins`
--
ALTER TABLE `walkins`
  ADD CONSTRAINT `customers_id_walkins` FOREIGN KEY (`Customer_Id`) REFERENCES `customers` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `gallon_id_walkins` FOREIGN KEY (`Gallon_Id`) REFERENCES `gallons` (`Code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `promo_id_walkins` FOREIGN KEY (`Promo_Id`) REFERENCES `promos` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `user_id_walkins` FOREIGN KEY (`User_Id`) REFERENCES `users` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
