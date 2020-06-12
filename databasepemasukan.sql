-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2020 at 01:57 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `databasepemasukan`
--

-- --------------------------------------------------------

--
-- Table structure for table `pemasukan`
--

CREATE TABLE `pemasukan` (
  `Tanggal` int(30) NOT NULL,
  `Nama Pembeli` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Minuman` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Banyaknya` int(30) NOT NULL,
  `Harga / minuman` int(30) NOT NULL,
  `Total harga` int(30) NOT NULL,
  `Bayar` int(30) NOT NULL,
  `Kembali` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemasukan`
--

INSERT INTO `pemasukan` (`Tanggal`, `Nama Pembeli`, `Minuman`, `Banyaknya`, `Harga / minuman`, `Total harga`, `Bayar`, `Kembali`) VALUES
(6062020, 'Randi', 'Jambu', 2, 5000, 10000, 10000, 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
