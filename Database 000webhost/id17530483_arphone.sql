-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 03, 2021 at 11:06 AM
-- Server version: 10.5.12-MariaDB
-- PHP Version: 7.3.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id17530483_arphone`
--

-- --------------------------------------------------------

--
-- Table structure for table `augmented_reality`
--

CREATE TABLE `augmented_reality` (
  `id` int(30) NOT NULL,
  `id_spesifikasi` int(30) NOT NULL,
  `nama_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `file` varchar(150) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `augmented_reality`
--

INSERT INTO `augmented_reality` (`id`, `id_spesifikasi`, `nama_type`, `file`) VALUES
(6, 1, 'Asus Zenfone 6', 'https://arphone.000webhostapp.com/apiarphone/file/zenfone6.sfb'),
(7, 5, 'Samsung S10+', 'https://arphone.000webhostapp.com/apiarphone/file/samsungs10+.sfb');

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id_brand` int(30) NOT NULL,
  `nama_brand` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `img_brand` varchar(150) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id_brand`, `nama_brand`, `img_brand`) VALUES
(1, 'samsung', 'https://i.pinimg.com/736x/f8/e3/4a/f8e34a4763987dcab1c15888cb0830d0.jpg'),
(2, 'vivo', 'https://media.hitekno.com/thumbs/2018/12/27/63152-logo-vivo/730x480-img-63152-logo-vivo.jpg'),
(3, 'asus', 'https://logodix.com/logo/1057003.jpg'),
(4, 'iphone', 'https://www.freepnglogos.com/uploads/apple-iphone-logo-png-1.png'),
(5, 'huawei', 'https://malline.id/src/2019/03/Huawei-logo.jpg'),
(6, 'oneplus', 'https://s1.eestatic.com/2021/01/08/actualidad/549705426_169080795_1706x960.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `smartphone`
--

CREATE TABLE `smartphone` (
  `id_smartphone` int(30) NOT NULL,
  `id_brand` int(30) NOT NULL,
  `nama_type` text COLLATE utf8_unicode_ci NOT NULL,
  `gambar_type` text COLLATE utf8_unicode_ci NOT NULL,
  `layar_singkat` text COLLATE utf8_unicode_ci NOT NULL,
  `kamera_singkat` text COLLATE utf8_unicode_ci NOT NULL,
  `soc_singkat` text COLLATE utf8_unicode_ci NOT NULL,
  `battery_singkat` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `smartphone`
--

INSERT INTO `smartphone` (`id_smartphone`, `id_brand`, `nama_type`, `gambar_type`, `layar_singkat`, `kamera_singkat`, `soc_singkat`, `battery_singkat`) VALUES
(2, 3, 'Asus Zenfone 6', 'https://www.gizmochina.com/wp-content/uploads/2019/05/Asus-Zenfone-6-ZS630KL.jpg', '6,4 inch 1080x2340 pixel <br> IPS 60Hz', '48MP <br> 4K 60fps', '6/128GB RAM <br> Snapdragon 855', '5000mAh Fast Charging 3.0 18w <br> Li-Po'),
(5, 1, 'Samsung S10+', 'https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-s10-plus-new.jpg', '6,4 inch 1440x3040 pixel <br> Dinamic Amoled 60Hz, HDR10+', '16MP <br> 4K 60fps', '6/12GB RAM <br> Exynos 9820', '4100mAh Fast Charging 3.0 18w <br> Li-ion'),
(6, 3, 'Asus Zenfone 7', 'https://fdn2.gsmarena.com/vv/bigpic/asus-zenfone7-pro-zs670ks-zs671ks.jpg', '6,67 inch 1080x2400 pixel <br> IPS 90Hz', '64MP <br> 4K 60fps', '6/8GB RAM <br> Snapdragon 865 - 5G Ready', '5000mAh Fast Charging 30w <br> Li-po'),
(7, 1, 'Samsung S10', 'https://ng.jumia.is/unsafe/fit-in/680x680/filters:fill(white)/product/49/416376/1.jpg?2732', '6,1 inch 1440x3040 pixel <br> IPS 60Hz', '16MP <br> 4K 60fps', '6/8GB RAM <br> Exynos 9820', '3400mAh Fast Charging 3.0 15w <br>Wireless Charging 15w <br>Li-Po'),
(8, 2, 'Vivo X60', 'https://fdn2.gsmarena.com/vv/bigpic/vivo-x60-global-new.jpg', '6,56 inch 1080x2376 pixel <br> AMOLED 120Hz, HDR10+', '48MP <br> 4K 60fps', '8/12GB RAM <br> Snapddragon 870 5G', '4300mAh Fast Charging 33w <br>Li-Po'),
(9, 2, 'Vivo X60 Pro', 'https://cdn.eraspace.com/pub/media/catalog/product/h/v/hvi-x60p-blu1_1.jpg', '6,56 inch 1080x2376 pixel <br> AMOLED 120Hz, HDR10+', '48MP <br> 4K 60fps', '12GB RAM <br> Snapddragon 870 5G', '4200mAh Fast Charging 33w <br>Li-Po'),
(10, 4, 'iPhone 11', 'https://cdn.dxomark.com/wp-content/uploads/medias/post-39867/apple_iphone_11-1024x768.jpg', '6,1 inch 828x1792 pixel <br> Retina IPS 60Hz', '12MP <br> 4K 60fps', '4GB RAM <br> Apple A13 Bionic', '3100mAh Fast Charging 18w <br>Li-Po'),
(11, 4, 'iPhone 11 Pro', 'https://cdn.eraspace.com/pub/media/catalog/product/a/p/apple_iphone_11_pro_max_space_grey_new_5.jpg', '5,8 inch 1125x2436 pixel <br> Retina XDR OLED 60Hz, HDR10+', '12MP <br> 4K 60fps', '4GB RAM <br> Apple A13 Bionic', '3046mAh Fast Charging 18w <br>Li-Po'),
(12, 5, 'Huawei P50', 'https://fdn2.gsmarena.com/vv/bigpic/huawei-p50-pro.jpg', '6,5 inch 1224x2700 pixel <br> OLED 90Hz', '50MP <br> 4K 60fps', '8GB RAM <br> Snapdragon 888', '4100mAh Fast Charging 66w <br>Li-Po'),
(13, 5, 'Huawei P50 Pro', 'https://p.turbosquid.com/ts-thumb/Vg/jMmFKG/vO/00/jpg/1627845097/600x600/fit_q87/858c8a8639f0b1dc264aac09f8d986627793874d/00.jpg', '6,6 inch 1228x2700 pixel <br> OLED 120Hz', '50MP <br> 4K 60fps', '8/12GB RAM <br> Kirin 9000', '4360mAh Fast Charging 66w <br>Li-Po'),
(14, 6, 'One PLus 9', 'https://khaleejitech.com/wp-content/uploads/2021/03/oneplus-9.jpg', '6,55 inch 1080x2400 pixel <br> AMOLED 120Hz, HDR10+', '50MP <br> 8K 30fps', '8/12GB RAM <br> Snapdragon 888 5G', '4500mAh Fast Charging 65w <br>Wireless Charging 15w <br>Li-Po'),
(15, 6, 'One PLus 9 Pro', 'https://www.notebookcheck.net/uploads/tx_nbc2/4_zu_3_OnePlus_9_Pro.jpg', '6,7 inch 1440x3216 pixel <br> AMOLED 120Hz, HDR10+', '50MP <br> 8K 30fps', '8/12GB RAM <br> Snapdragon 888 5G', '4500mAh Fast Charging 65w <br>Wireless Charging 50w <br>Li-Po');

-- --------------------------------------------------------

--
-- Table structure for table `spesifikasi`
--

CREATE TABLE `spesifikasi` (
  `id_spesifikasi` int(30) NOT NULL,
  `id_smartphone` int(30) NOT NULL,
  `nama_type` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `gambar_type` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `network` text COLLATE utf8_unicode_ci NOT NULL,
  `launch` text COLLATE utf8_unicode_ci NOT NULL,
  `body` text COLLATE utf8_unicode_ci NOT NULL,
  `display` text COLLATE utf8_unicode_ci NOT NULL,
  `platform` text COLLATE utf8_unicode_ci NOT NULL,
  `memory` text COLLATE utf8_unicode_ci NOT NULL,
  `main_kamera` text COLLATE utf8_unicode_ci NOT NULL,
  `selfie_kamera` text COLLATE utf8_unicode_ci NOT NULL,
  `sound` text COLLATE utf8_unicode_ci NOT NULL,
  `comms` text COLLATE utf8_unicode_ci NOT NULL,
  `feature` text COLLATE utf8_unicode_ci NOT NULL,
  `battery` text COLLATE utf8_unicode_ci NOT NULL,
  `misc` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `spesifikasi`
--

INSERT INTO `spesifikasi` (`id_spesifikasi`, `id_smartphone`, `nama_type`, `gambar_type`, `network`, `launch`, `body`, `display`, `platform`, `memory`, `main_kamera`, `selfie_kamera`, `sound`, `comms`, `feature`, `battery`, `misc`) VALUES
(1, 2, 'Asus Zenfone 6', 'https://dlcdnwebimgs.asus.com/gain/a99aab4d-dd51-4c0b-bbf7-cb9686bc79aa/', 'GSM / HSPA / LTE\r\nGSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2\r\nHSDPA 850 / 900 / 1900 / 2100 - A version\r\nHSDPA 800 / 850 / 900 / 1700(AWS) / 1800 / 1900 / 2100 - B version, C version\r\n1, 2, 3, 5, 7, 8, 20, 28, 38, 40, 41 - A version\r\n1, 2, 3, 4, 5, 7, 8, 18, 19, 26, 28, 38, 39, 41, 46 - B version\r\n1, 2, 3, 4, 5, 7, 8, 12, 17, 18, 19, 26, 28, 38, 39, 41, 46 - C version\r\nHSPA 42.2/5.76 Mbps, LTE-A (5CA) Cat18 1200/150 Mbps', '2019, May 16\r\nAvailable. Released 2019, May', '159.1 x 75.4 x 9.2 mm (6.26 x 2.97 x 0.36 in)\r\n190 g (6.70 oz)\r\nGlass front (Gorilla Glass 6), glass back (Gorilla Glass 3), aluminum frame\r\nSIM Dual SIM (Nano-SIM, dual stand-by)', 'IPS LCD, HDR10\r\n6.4 inches, 100.5 cm2 (~83.8% screen-to-body ratio)\r\n1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density)\r\nCorning Gorilla Glass 6', 'Android 9.0 (Pie), upgradable to Android 11, ZenUI\r\nQualcomm SM8150 Snapdragon 855 (7 nm)\r\nOcta-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\r\nAdreno 640', 'micro SDXC (dedicated slot)\r\n64GB 6GB RAM, 128GB 6GB RAM, 256GB 8GB RAM, 512GB 12GB RAM\r\nUFS 2.1', '48 MP, f/1.8, 26mm (wide), 1/2.0\", 0.8µm, PDAF, Laser AF\r\n13 MP, f/2.4, 11mm (ultrawide)\r\nDual-LED flash, HDR, auto panorama (motorized rotation)\r\n4K@30/60fps, 1080p@30/60/240fps, 720p@480fps; gyro-EIS (except @240/480fps)', 'Motorized flip-up main camera module\r\nDual-LED flash, HDR, auto panorama (motorized rotation)\r\n4K@30/60fps, 1080p@30/60/240fps, 720p@480fps; gyro-EIS (except @240/480fps)', 'Yes, with stereo speakers\r\nYes\r\n24-bit/192kHz audio', 'Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\r\n5.0, A2DP, LE, aptX HD\r\nYes, with dual-band A-GPS, GLONASS, BDS, GALILEO, QZSS\r\nYes\r\nFM radio\r\nUSB Type-C 2.0', 'Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass', 'Li-Po 5000 mAh, non-removable\r\nFast charging 18W\r\nQuick Charge 4.0\r\nReverse charging 10W\r\nUp to 624 h (3G)\r\nUp to 33 h (3G)', 'Midnight Black, Twilight Silver\r\nASUS_I01WD, ZS630KL, I01WD\r\nPrice	About 500 EUR'),
(5, 5, 'Samsung S10+', 'https://cf.shopee.co.id/file/37920592661c4a94cb9dcbf7f1fa9ee9', 'GSM / HSPA / LTE <br>GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 <br>HSDPA 850 / 900 / 1900 / 2100 - A version <br>HSDPA 800 / 850 / 900 / 1700(AWS) / 1800 / 1900 / 2100 - B version, C version <br>1, 2, 3, 5, 7, 8, 20, 28, 38, 40, 41 - A version <br>1, 2, 3, 4, 5, 7, 8, 18, 19, 26, 28, 38, 39, 41, 46 - B version <br>1, 2, 3, 4, 5, 7, 8, 12, 17, 18, 19, 26, 28, 38, 39, 41, 46 - C version <br>HSPA 42.2/5.76 Mbps, LTE-A (5CA) Cat18 1200/150 Mbps', '2019, May 16 <br>Available. Released 2019, May', '159.1 x 75.4 x 9.2 mm (6.26 x 2.97 x 0.36 in) <br>190 g (6.70 oz) <br>Glass front (Gorilla Glass 6), glass back (Gorilla Glass 3), aluminum frame <br>SIM Dual SIM (Nano-SIM, dual stand-by)', 'IPS LCD, HDR10 <br>6.4 inches, 100.5 cm2 (~83.8% screen-to-body ratio) <br>1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density) <br>Corning Gorilla Glass 6', 'Android 9.0 (Pie), upgradable to Android 11, ZenUI <br>Qualcomm SM8150 Snapdragon 855 (7 nm) <br>Octa-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485) <br>Adreno 640', 'micro SDXC (dedicated slot) <br>64GB 6GB RAM, 128GB 6GB RAM, 256GB 8GB RAM, 512GB 12GB RAM <br>UFS 2.1', '48 MP, f/1.8, 26mm (wide), 1/2.0, 0.8µm, PDAF, Laser AF <br>13 MP, f/2.4, 11mm (ultrawide) <br>Dual-LED flash, HDR, auto panorama (motorized rotation) <br>4K@30/60fps, 1080p@30/60/240fps, 720p@480fps; gyro-EIS (except @240/480fps)', 'Motorized flip-up main camera module <br>Dual-LED flash, HDR, auto panorama (motorized rotation) <br>4K@30/60fps, 1080p@30/60/240fps, 720p@480fps; gyro-EIS (except @240/480fps)', 'Yes, with stereo speakers <br>Yes <br>24-bit/192kHz audio', 'Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot <br>5.0, A2DP, LE, aptX HD <br>Yes, with dual-band A-GPS, GLONASS, BDS, GALILEO, QZSS <br>Yes <br>FM radio <br>USB Type-C 2.0', 'Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass', 'Li-Po 5000 mAh, non-removable <br>Fast charging 18W <br>Quick Charge 4.0 <br>Reverse charging 10W <br>Up to 624 h (3G) <br>Up to 33 h (3G)', 'Midnight Black, Twilight Silver <br>Models <br>ASUS_I01WD, ZS630KL, I01WD <br>Price About 500 EUR'),
(6, 6, 'asus zenfone 7', 'https://asset.kompas.com/crops/a4NpXJYQScv1DjB-4W3O_ALnF6c=/0x0:1200x800/750x500/data/photo/2020/08/26/5f46235364554.jpg', 'GSM / HSPA / LTE <br GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 <br>HSDPA 850 / 900 / 1900 / 2100 - A version <br>HSDPA 800 / 850 / 900 / 1700(AWS) / 1800 / 1900 / 2100 - B version, C version <br>1, 2, 3, 5, 7, 8, 20, 28, 38, 40, 41 - A version <br>1, 2, 3, 4, 5, 7, 8, 18, 19, 26, 28, 38, 39, 41, 46 - B version <br>1, 2, 3, 4, 5, 7, 8, 12, 17, 18, 19, 26, 28, 38, 39, 41, 46 - C version <br>HSPA 42.2/5.76 Mbps, LTE-A (5CA) Cat18 1200/150 Mbps', '2019, May 16 <br>Available. Released 2019, May', '159.1 x 75.4 x 9.2 mm (6.26 x 2.97 x 0.36 in) <br>190 g (6.70 oz) <br>Glass front (Gorilla Glass 6), glass back (Gorilla Glass 3), aluminum frame <br>SIM Dual SIM (Nano-SIM, dual stand-by)', 'IPS LCD, HDR10 <br>6.4 inches, 100.5 cm2 (~83.8% screen-to-body ratio) <br>1080 x 2340 pixels, 19.5:9 ratio (~403 ppi density) <br>Corning Gorilla Glass 6', 'Android 9.0 (Pie), upgradable to Android 11, ZenUI <br>Qualcomm SM8150 Snapdragon 855 (7 nm) <br>Octa-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485) <br>Adreno 640', 'micro SDXC (dedicated slot) <br>64GB 6GB RAM, 128GB 6GB RAM, 256GB 8GB RAM, 512GB 12GB RAM <br>UFS 2.1', '48 MP, f/1.8, 26mm (wide), 1/2.0, 0.8µm, PDAF, Laser AF <br>13 MP, f/2.4, 11mm (ultrawide) <br>Dual-LED flash, HDR, auto panorama (motorized rotation) <br>4K@30/60fps, 1080p@30/60/240fps, 720p@480fps; gyro-EIS (except @240/480fps)', 'Motorized flip-up main camera module <br>Dual-LED flash, HDR, auto panorama (motorized rotation) <br>4K@30/60fps, 1080p@30/60/240fps, 720p@480fps; gyro-EIS (except @240/480fps)', 'Yes, with stereo speakers <br>Yes <br>24-bit/192kHz audio', 'Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot <br>5.0, A2DP, LE, aptX HD <br>Yes, with dual-band A-GPS, GLONASS, BDS, GALILEO, QZSS <br>Yes <br>FM radio <br>USB Type-C 2.0', 'Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass', 'Li-Po 5000 mAh, non-removable <br>Fast charging 18W <br>Quick Charge 4.0 <br>Reverse charging 10W <br>Up to 624 h (3G) <br>Up to 33 h (3G)', 'Midnight Black, Twilight Silver <br>Models <br>ASUS_I01WD, ZS630KL, I01WD <br>Price About 500 EUR');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `augmented_reality`
--
ALTER TABLE `augmented_reality`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_spesifikasi` (`id_spesifikasi`);

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`id_brand`);

--
-- Indexes for table `smartphone`
--
ALTER TABLE `smartphone`
  ADD PRIMARY KEY (`id_smartphone`),
  ADD KEY `id_brand` (`id_brand`);

--
-- Indexes for table `spesifikasi`
--
ALTER TABLE `spesifikasi`
  ADD PRIMARY KEY (`id_spesifikasi`),
  ADD KEY `id_smartphone` (`id_smartphone`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `augmented_reality`
--
ALTER TABLE `augmented_reality`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `id_brand` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `smartphone`
--
ALTER TABLE `smartphone`
  MODIFY `id_smartphone` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `spesifikasi`
--
ALTER TABLE `spesifikasi`
  MODIFY `id_spesifikasi` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `augmented_reality`
--
ALTER TABLE `augmented_reality`
  ADD CONSTRAINT `augmented_reality_ibfk_1` FOREIGN KEY (`id_spesifikasi`) REFERENCES `spesifikasi` (`id_spesifikasi`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `smartphone`
--
ALTER TABLE `smartphone`
  ADD CONSTRAINT `smartphone_ibfk_1` FOREIGN KEY (`id_brand`) REFERENCES `brand` (`id_brand`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `spesifikasi`
--
ALTER TABLE `spesifikasi`
  ADD CONSTRAINT `spesifikasi_ibfk_1` FOREIGN KEY (`id_smartphone`) REFERENCES `smartphone` (`id_smartphone`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
