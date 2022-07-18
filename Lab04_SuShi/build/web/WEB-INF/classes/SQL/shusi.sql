-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 10, 2020 lúc 01:29 AM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `shusi`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `entry`
--

CREATE TABLE `entry` (
  `id` int(11) NOT NULL,
  `image` varchar(100) NOT NULL,
  `title` text NOT NULL,
  `content` text NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `entry`
--

INSERT INTO `entry` (`id`, `image`, `title`, `content`, `date`) VALUES
(1, 'sushi.jpg', '24 types of sushi rolls', 'Lorem ipsum dolor sit amet, consectetuer adipiscing\r\n                                            elit, sed diam nonummy nibh euismod tincidunt ut\r\n                                            laoreet dolore magna aliquam erat volutpat. Ut wisi\r\n                                            enim ad minim veniam, quis nostrud exerci tation\r\n                                            ullamcorper suscipit lobortis nisl ut aliquip ex ea\r\n                                            commodo consequat. Duis autem vel eum iriure dolor in\r\n                                            hendrerit in vulputate velit esse molestie consequat,\r\n                                            vel illum dolore eu feugiat nulla facilisis at vero\r\n                                            eros et accumsan et iusto odio dignissim qui blandit\r\n                                            praesent luptatum zzril delenit augue duis dolore te\r\n                                            feugait nulla facilisi. Nam liber tempor cum soluta\r\n                                            nobis eleifend option congue nihil imperdiet doming id\r\n                                            quod mazim placerat facer possim assum.', '2020-11-16'),
(2, 'sushis.jpg', '24 types of sushi rolls', 'Lorem ipsum dolor sit amet, consectetuer adipiscing\r\n                                            elit, sed diam nonummy nibh euismod tincidunt ut\r\n                                            laoreet dolore magna aliquam erat volutpat. Ut wisi\r\n                                            enim ad minim veniam, quis nostrud exerci tation\r\n                                            ullamcorper suscipit lobortis nisl ut aliquip ex ea\r\n                                            commodo consequat. Duis autem vel eum iriure dolor in\r\n                                            hendrerit in vulputate velit esse molestie consequat,\r\n                                            vel illum dolore eu feugiat nulla facilisis at vero\r\n                                            eros et accumsan et iusto odio dignissim qui blandit\r\n                                            praesent luptatum zzril delenit augue duis dolore te\r\n                                            feugait nulla facilisi. Nam liber tempor cum soluta\r\n                                            nobis eleifend option congue nihil imperdiet doming id\r\n                                            quod mazim placerat facer possim assum.', '2020-11-18');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `menu`
--

CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `title` text NOT NULL,
  `price` varchar(100) NOT NULL,
  `content` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `menu`
--

INSERT INTO `menu` (`id`, `title`, `price`, `content`) VALUES
(1, 'Claritas est etiam processus', '15.00', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy\r\n                                nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.'),
(2, 'Duis autem vel eum iriure dolor.', '20.00', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.'),
(3, 'Eodem modo typi, qui nunc nobis videntur..', '25.00', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `entry`
--
ALTER TABLE `entry`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `entry`
--
ALTER TABLE `entry`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `menu`
--
ALTER TABLE `menu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
