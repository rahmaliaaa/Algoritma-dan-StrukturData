-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2024 at 09:29 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siresto`
--

-- --------------------------------------------------------

--
-- Table structure for table `bahan_baku`
--

CREATE TABLE `bahan_baku` (
  `nama_bahan_baku` varchar(50) NOT NULL,
  `stok_bahan_baku` smallint(6) NOT NULL,
  `satuan_bahan_baku` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bahan_baku`
--

INSERT INTO `bahan_baku` (`nama_bahan_baku`, `stok_bahan_baku`, `satuan_bahan_baku`) VALUES
('Air', 6000, 'ml'),
('Alpukat', 57, 'buah'),
('Apel', 36, 'buah'),
('Ayam', 30, 'ekor'),
('Bawang putih', 6, 'Siung'),
('Bebek', 26, 'ekor'),
('Beras', 1250, 'gram'),
('Cumi', 50, 'ons'),
('Garam', 5329, 'gram'),
('Gula', 3560, 'gram'),
('Gurame', 48, 'ekor'),
('Kailan', 67, 'Ikat'),
('Keju', 2360, 'gram'),
('Kopi', 1948, 'gram'),
('Teh', 123, 'kantong'),
('Telur', 63, 'butir'),
('Tepung', 10000, 'gram');

-- --------------------------------------------------------

--
-- Table structure for table `bahan_baku_menu`
--

CREATE TABLE `bahan_baku_menu` (
  `nama_menu_bb` varchar(50) NOT NULL,
  `nama_bahan` varchar(50) NOT NULL,
  `jumlah_bb` smallint(6) NOT NULL,
  `satuan_bb` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bahan_baku_menu`
--

INSERT INTO `bahan_baku_menu` (`nama_menu_bb`, `nama_bahan`, `jumlah_bb`, `satuan_bb`) VALUES
('Air mineral', 'Air', 300, 'ml'),
('Ayam goreng tepung', 'Ayam', 1, 'ekor'),
('Ayam goreng tepung', 'Garam', 20, 'gram'),
('Ayam goreng tepung', 'Tepung', 100, 'gram'),
('Bebek goreng mentega', 'Bebek', 1, 'ekor'),
('Bebek goreng mentega', 'Garam', 25, 'gram'),
('Bubur ayam', 'Ayam', 1, 'ekor'),
('Bubur ayam', 'Beras', 200, 'gram'),
('Cah kailan', 'Bawang putih', 1, 'siung'),
('Cah kailan', 'Garam', 5, 'gram'),
('Cah kailan', 'Kailan', 1, 'ikat'),
('Cumi bakar', 'Cumi', 3, 'ons'),
('Cumi goreng', 'Cumi', 4, 'ons'),
('Cumi goreng', 'Tepung', 50, 'gram'),
('Es teh', 'Air', 400, 'ml'),
('Es teh', 'Teh', 1, 'kantong'),
('Es teh manis', 'Air', 400, 'ml'),
('Es teh manis', 'Gula', 5, 'gram'),
('Es teh manis', 'Teh', 1, 'kantong'),
('Gurame bakar', 'Gurame', 1, 'ekor'),
('Gurame goreng asam manis', 'Gula', 10, 'gram'),
('Gurame goreng asam manis', 'Gurame', 1, 'ekor'),
('Jus alpukat', 'Air', 100, 'ml'),
('Jus alpukat', 'Alpukat', 1, 'buah'),
('Jus apel', 'Air', 50, 'ml'),
('Jus apel', 'Apel', 2, 'buah'),
('Kue keju', 'Keju', 250, 'gram'),
('Kue keju', 'Telur', 3, 'buah'),
('Kue tiramisu', 'Kopi', 5, 'gram'),
('Kue tiramisu', 'Telur', 3, 'buah');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` char(5) NOT NULL,
  `nama_karyawan` varchar(50) NOT NULL,
  `TglLahir` date DEFAULT NULL,
  `No_KTP` char(16) NOT NULL,
  `Posisi` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `TglLahir`, `No_KTP`, `Posisi`) VALUES
('16901', 'Alan Nolan', '1979-02-19', '7867313192486378', 'manager'),
('16902', 'Adi Stone', '1981-07-06', '3958957716354255', 'koki'),
('16903', 'Benadict Goff', '1989-01-07', '5138557373336434', 'koki'),
('16904', 'Benjamin Hadi', '1990-06-11', '8654380767277662', 'koki'),
('16905', 'Cassandra Bishop', '1987-07-06', '9810599846936552', 'staff'),
('16906', 'Charles Talley', '1986-11-21', '1742870859287685', 'staff'),
('16907', 'Charles Walters', '1992-05-24', '6101796466188583', 'staff'),
('16908', 'Curran Tradi', '1981-06-22', '2571924567963357', 'cashier'),
('16909', 'Darrel Owen', '1992-06-07', '9045108692648731', 'koki'),
('16910', 'Evan Fleming', '1974-07-25', '2188923777981912', 'cashier'),
('16911', 'Fiona Moran', '1977-07-27', '9551219455894049', 'staff'),
('16912', 'Hermione Ferguson', '1971-05-10', '6706949116938119', 'koki'),
('16913', 'Hilary Bradley', '1973-09-11', '9732119515542017', 'koki');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` char(5) NOT NULL,
  `nama_kategori` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
('33331', 'Makanan'),
('33332', 'Minuman'),
('33333', 'Cemilan'),
('33334', 'Pencuci Mulut');

-- --------------------------------------------------------

--
-- Table structure for table `koki`
--

CREATE TABLE `koki` (
  `Id_koki` char(5) NOT NULL,
  `sertifikasi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `koki`
--

INSERT INTO `koki` (`Id_koki`, `sertifikasi`) VALUES
('16902', 'Pastry'),
('16903', 'Fry'),
('16904', 'Pastry'),
('16909', 'Fry'),
('16912', 'Grill'),
('16913', 'Pantry');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `nama_menu` varchar(50) NOT NULL,
  `harga_menu` int(11) NOT NULL,
  `id_kategori` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`nama_menu`, `harga_menu`, `id_kategori`) VALUES
('Air mineral', 5000, '33332'),
('Ayam goreng tepung', 30000, '33331'),
('Bebek goreng mentega', 30000, '33331'),
('Bubur ayam', 20000, '33331'),
('Cah kailan', 25000, '33331'),
('Cumi bakar', 30000, '33333'),
('Cumi goreng', 30000, '33333'),
('Es teh', 3000, '33332'),
('Es teh manis', 5000, '33332'),
('Gurame bakar', 28000, '33331'),
('Gurame goreng asam manis', 28000, '33331'),
('Jus alpukat', 15000, '33332'),
('Jus apel', 15000, '33332'),
('Kue keju', 25000, '33334'),
('Kue tiramisu', 30000, '33334');

-- --------------------------------------------------------

--
-- Table structure for table `menu_harian`
--

CREATE TABLE `menu_harian` (
  `nama_menu_harian` varchar(50) NOT NULL,
  `tanggal_menu_harian` date NOT NULL,
  `id_koki_harian` char(5) NOT NULL,
  `Jumlah` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu_harian`
--

INSERT INTO `menu_harian` (`nama_menu_harian`, `tanggal_menu_harian`, `id_koki_harian`, `Jumlah`) VALUES
('Air mineral', '2016-07-04', '16903', 5),
('Air mineral', '2016-07-04', '16912', 2),
('Air mineral', '2016-09-05', '16913', 3),
('Ayam goreng tepung', '2016-07-17', '16909', 8),
('Bebek goreng mentega', '2016-07-17', '16912', 5),
('Bebek goreng mentega', '2016-08-03', '16904', 8),
('Bebek goreng mentega', '2016-08-09', '16912', 5),
('Bebek goreng mentega', '2016-08-16', '16903', 3),
('Bebek goreng mentega', '2016-08-28', '16902', 4),
('Bebek goreng mentega', '2016-08-28', '16903', 3),
('Bebek goreng mentega', '2016-08-28', '16904', 5),
('Bebek goreng mentega', '2016-09-02', '16902', 4),
('Bebek goreng mentega', '2016-09-04', '16904', 5),
('Bubur ayam', '2016-08-02', '16909', 6),
('Bubur ayam', '2016-08-07', '16902', 7),
('Bubur ayam', '2016-08-14', '16903', 6),
('Bubur ayam', '2016-08-21', '16909', 4),
('Bubur ayam', '2016-08-23', '16903', 7),
('Bubur ayam', '2016-08-29', '16909', 4),
('Bubur ayam', '2016-09-02', '16903', 7),
('Cah kailan', '2016-07-05', '16902', 3),
('Cah kailan', '2016-07-10', '16904', 6),
('Cah kailan', '2016-07-17', '16904', 3),
('Cah kailan', '2016-08-22', '16902', 5),
('Cah kailan', '2016-08-24', '16904', 2),
('Cah kailan', '2016-08-28', '16909', 10),
('Cah kailan', '2016-08-30', '16902', 5),
('Cah kailan', '2016-09-02', '16904', 2),
('Cah kailan', '2016-09-03', '16909', 10),
('Cumi bakar', '2016-07-07', '16912', 7),
('Cumi goreng', '2016-07-05', '16902', 2),
('Cumi goreng', '2016-07-19', '16902', 6),
('Cumi goreng', '2016-07-26', '16904', 10),
('Cumi goreng', '2016-08-01', '16904', 9),
('Es teh', '2016-07-05', '16903', 5),
('Es teh', '2016-07-11', '16904', 10),
('Es teh', '2016-07-20', '16902', 10),
('Es teh', '2016-07-27', '16902', 5),
('Es teh', '2016-08-07', '16909', 8),
('Es teh', '2016-08-08', '16904', 1),
('Es teh', '2016-08-16', '16904', 8),
('Es teh', '2016-08-22', '16904', 10),
('Es teh', '2016-08-29', '16904', 8),
('Es teh', '2016-09-01', '16904', 10),
('Es teh manis', '2016-07-31', '16913', 5),
('Es teh manis', '2016-08-07', '16904', 10),
('Es teh manis', '2016-08-14', '16913', 8),
('Es teh manis', '2016-08-28', '16913', 3),
('Gurame bakar', '2016-08-01', '16909', 8),
('Gurame bakar', '2016-08-07', '16902', 8),
('Gurame bakar', '2016-08-07', '16913', 3),
('Gurame bakar', '2016-08-22', '16903', 10),
('Gurame bakar', '2016-08-23', '16903', 6),
('Gurame bakar', '2016-08-29', '16903', 10),
('Gurame bakar', '2016-08-31', '16903', 6),
('Gurame goreng asam manis', '2016-07-10', '16912', 4),
('Gurame goreng asam manis', '2016-07-12', '16902', 5),
('Jus alpukat', '2016-07-06', '16904', 3),
('Jus alpukat', '2016-07-12', '16909', 3),
('Jus alpukat', '2016-07-13', '16903', 3),
('Jus alpukat', '2016-07-26', '16913', 1),
('Jus apel', '2016-08-15', '16912', 7),
('Kue keju', '2016-07-10', '16909', 1),
('Kue keju', '2016-07-18', '16909', 7),
('Kue keju', '2016-07-24', '16904', 6),
('Kue keju', '2016-07-25', '16902', 8),
('Kue keju', '2016-07-26', '16902', 2),
('Kue keju', '2016-07-26', '16903', 4),
('Kue keju', '2016-08-01', '16902', 9),
('Kue tiramisu', '2016-08-03', '16902', 8),
('Kue tiramisu', '2016-08-14', '16909', 8),
('Kue tiramisu', '2016-08-16', '16902', 10),
('Kue tiramisu', '2016-08-28', '16902', 10);

-- --------------------------------------------------------

--
-- Table structure for table `pembelian_bahan_baku`
--

CREATE TABLE `pembelian_bahan_baku` (
  `Nota` varchar(10) NOT NULL,
  `nama_bahan_dibeli` varchar(50) NOT NULL,
  `jumlah_dibeli` smallint(6) NOT NULL,
  `satuan_dibeli` varchar(10) NOT NULL,
  `Harga_satuan_dibeli` int(11) NOT NULL,
  `waktu_dibeli` date NOT NULL,
  `IdSupplier` char(5) DEFAULT NULL,
  `IdKaryawan` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembelian_bahan_baku`
--

INSERT INTO `pembelian_bahan_baku` (`Nota`, `nama_bahan_dibeli`, `jumlah_dibeli`, `satuan_dibeli`, `Harga_satuan_dibeli`, `waktu_dibeli`, `IdSupplier`, `IdKaryawan`) VALUES
('71043', 'Tepung', 2000, 'gram', 8, '2016-09-02', '10008', '16905'),
('71550', 'Kopi', 500, 'gram', 40, '2016-07-25', '10011', '16907'),
('71706', 'Teh', 10, 'kantong', 1500, '2016-07-25', '10011', '16905'),
('71838', 'Telur', 20, 'butir', 2000, '2016-09-02', '10001', '16905'),
('72131', 'Kopi', 750, 'gram', 37, '2016-08-15', '10008', '16905'),
('72634', 'Bawang putih', 4, 'siung', 10000, '2016-07-08', '10006', '16906'),
('72794', 'Cumi', 5, 'ons', 8000, '2016-08-01', '10009', '16906'),
('72816', 'Kailan', 8, 'Ikat', 10000, '2016-08-29', '10001', '16911'),
('73001', 'Kopi', 400, 'gram', 43, '2016-07-12', '10001', '16905'),
('73138', 'Gurame', 10, 'ekor', 15000, '2016-09-02', '10010', '16905'),
('73142', 'Bebek', 1, 'ekor', 32000, '2016-07-12', '10002', '16907'),
('73414', 'Gula', 800, 'gram', 50, '2016-08-15', '10008', '16905'),
('73460', 'Cumi', 5, 'ons', 8400, '2016-09-01', '10009', '16906'),
('73528', 'Beras', 1500, 'gram', 77, '2016-08-06', '10008', '16911'),
('73576', 'Gula', 1000, 'gram', 50, '2016-07-08', '10008', '16905'),
('73584', 'Telur', 7, 'butir', 2000, '2016-08-01', '10011', '16911'),
('74233', 'Teh', 15, 'kantong', 1500, '2016-07-08', '10008', '16905'),
('74541', 'Garam', 2000, 'gram', 50, '2016-08-07', '10008', '16905'),
('74544', 'Gurame', 8, 'ekor', 15000, '2016-09-03', '10010', '16905'),
('75011', 'Kailan', 10, 'Ikat', 3000, '2016-07-08', '10011', '16906'),
('75437', 'Teh', 30, 'kantong', 1500, '2016-09-01', '10001', '16905'),
('75689', 'Air', 1500, 'ml', 30, '2016-08-29', '10001', '16911'),
('75696', 'Teh', 10, 'kantong', 1500, '2016-07-01', '10008', '16905'),
('75788', 'Ayam', 5, 'ekor', 25000, '2016-08-15', '10007', '16906'),
('76759', 'Apel', 5, 'buah', 5000, '2016-08-23', '10004', '16905'),
('77263', 'Apel', 10, 'buah', 5000, '2016-09-02', '10005', '16906'),
('77335', 'Alpukat', 8, 'buah', 8000, '2016-08-23', '10004', '16905'),
('77429', 'Kailan', 10, 'Ikat', 2900, '2016-07-01', '10011', '16905'),
('77651', 'Teh', 6, 'kantong', 1500, '2016-08-01', '10011', '16905'),
('78247', 'Keju', 500, 'gram', 40, '2016-09-01', '10001', '16905'),
('78302', 'Gurame', 2, 'ekor', 15000, '2016-07-08', '10009', '16907'),
('78452', 'Tepung', 2500, 'gram', 8, '2016-07-01', '10011', '16905'),
('78627', 'Tepung', 500, 'gram', 16, '2016-09-01', '10001', '16905'),
('78898', 'Bebek', 3, 'ekor', 35000, '2016-08-23', '10002', '16907'),
('79027', 'Gurame', 3, 'ekor', 15000, '2016-09-01', '10009', '16907'),
('79221', 'Garam', 1000, 'gram', 50, '2016-07-08', '10008', '16911'),
('79276', 'Ayam', 7, 'ekor', 25000, '2016-07-12', '10006', '16905'),
('79344', 'Bebek', 9, 'ekor', 35000, '2016-08-23', '10003', '16907'),
('79817', 'Alpukat', 5, 'buah', 8000, '2016-07-12', '10004', '16906');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` char(5) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `Telepon` varchar(15) NOT NULL,
  `Email` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `Telepon`, `Email`) VALUES
('10001', 'Airawati Shop', '087865764567', ''),
('10002', 'Ali Sumihar Shop', '087656434321', 'AliSumi@yahoo.com'),
('10003', 'Bagas Aras Shop', '081234565432', ''),
('10004', 'Bertua Shop', '081234567865', 'Bertuasss@gmail.com'),
('10005', 'Chintya Shop', '081234567654', 'Chintya25@yahoo.com'),
('10006', 'Dame Damanik Shop', '081245768932', 'Dame.damanik@yahoo.com'),
('10007', 'Dame Uli Shop', '081234568211', 'Dameuli@gmail.com'),
('10008', 'Emil Sutrisno Shop', '082456784356', 'EmilSutrisno@yahoo.com'),
('10009', 'Ifan Shop', '087654567876', 'ifan@gmail.com'),
('10010', 'Igun Ranaro Shop', '085678415678', ''),
('10011', 'Joni Shop', '08765467876', 'joni@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bahan_baku`
--
ALTER TABLE `bahan_baku`
  ADD PRIMARY KEY (`nama_bahan_baku`);

--
-- Indexes for table `bahan_baku_menu`
--
ALTER TABLE `bahan_baku_menu`
  ADD PRIMARY KEY (`nama_menu_bb`,`nama_bahan`),
  ADD KEY `nama_bahan` (`nama_bahan`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`),
  ADD UNIQUE KEY `No_KTP` (`No_KTP`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `koki`
--
ALTER TABLE `koki`
  ADD PRIMARY KEY (`Id_koki`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`nama_menu`),
  ADD KEY `id_kategori` (`id_kategori`);

--
-- Indexes for table `menu_harian`
--
ALTER TABLE `menu_harian`
  ADD PRIMARY KEY (`nama_menu_harian`,`tanggal_menu_harian`,`id_koki_harian`),
  ADD KEY `id_koki_harian` (`id_koki_harian`);

--
-- Indexes for table `pembelian_bahan_baku`
--
ALTER TABLE `pembelian_bahan_baku`
  ADD PRIMARY KEY (`Nota`),
  ADD KEY `nama_bahan_dibeli` (`nama_bahan_dibeli`),
  ADD KEY `IdSupplier` (`IdSupplier`),
  ADD KEY `IdKaryawan` (`IdKaryawan`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bahan_baku_menu`
--
ALTER TABLE `bahan_baku_menu`
  ADD CONSTRAINT `bahan_baku_menu_ibfk_1` FOREIGN KEY (`nama_menu_bb`) REFERENCES `menu` (`nama_menu`),
  ADD CONSTRAINT `bahan_baku_menu_ibfk_2` FOREIGN KEY (`nama_bahan`) REFERENCES `bahan_baku` (`nama_bahan_baku`);

--
-- Constraints for table `koki`
--
ALTER TABLE `koki`
  ADD CONSTRAINT `koki_ibfk_1` FOREIGN KEY (`Id_koki`) REFERENCES `karyawan` (`id_karyawan`);

--
-- Constraints for table `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id_kategori`);

--
-- Constraints for table `menu_harian`
--
ALTER TABLE `menu_harian`
  ADD CONSTRAINT `menu_harian_ibfk_1` FOREIGN KEY (`nama_menu_harian`) REFERENCES `menu` (`nama_menu`),
  ADD CONSTRAINT `menu_harian_ibfk_2` FOREIGN KEY (`id_koki_harian`) REFERENCES `koki` (`Id_koki`);

--
-- Constraints for table `pembelian_bahan_baku`
--
ALTER TABLE `pembelian_bahan_baku`
  ADD CONSTRAINT `pembelian_bahan_baku_ibfk_1` FOREIGN KEY (`nama_bahan_dibeli`) REFERENCES `bahan_baku` (`nama_bahan_baku`),
  ADD CONSTRAINT `pembelian_bahan_baku_ibfk_2` FOREIGN KEY (`IdSupplier`) REFERENCES `supplier` (`id_supplier`),
  ADD CONSTRAINT `pembelian_bahan_baku_ibfk_3` FOREIGN KEY (`IdKaryawan`) REFERENCES `karyawan` (`id_karyawan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
