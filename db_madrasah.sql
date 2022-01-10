-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2022 at 09:26 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_madrasah`
--

-- --------------------------------------------------------

--
-- Table structure for table `nilaisantri`
--

CREATE TABLE `nilaisantri` (
  `nis` int(100) NOT NULL,
  `nama_santri` varchar(50) NOT NULL,
  `tauhid` int(11) NOT NULL,
  `tasawuf` int(11) NOT NULL,
  `fiqh` int(11) NOT NULL,
  `hadits` int(11) NOT NULL,
  `nahwu` int(11) NOT NULL,
  `shorof` int(11) NOT NULL,
  `lugot` int(11) NOT NULL,
  `tafsir` int(11) NOT NULL,
  `jumlah_nilai` int(100) NOT NULL,
  `rata_rata` int(11) NOT NULL,
  `huruf` varchar(1) NOT NULL,
  `hasil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nilaisantri`
--

INSERT INTO `nilaisantri` (`nis`, `nama_santri`, `tauhid`, `tasawuf`, `fiqh`, `hadits`, `nahwu`, `shorof`, `lugot`, `tafsir`, `jumlah_nilai`, `rata_rata`, `huruf`, `hasil`) VALUES
(101, 'Fathulloh', 90, 90, 90, 90, 90, 90, 90, 90, 720, 90, 'A', 'Lulus'),
(102, 'Nur Nela', 80, 70, 70, 70, 70, 70, 70, 80, 580, 72, 'B', 'Lulus'),
(103, 'Syaira', 50, 40, 50, 60, 70, 50, 60, 70, 450, 56, 'D', 'Tidak Lulus');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `nilaisantri`
--
ALTER TABLE `nilaisantri`
  ADD PRIMARY KEY (`nis`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
