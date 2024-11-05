-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-11-2024 a las 03:25:59
-- Versión del servidor: 8.0.39
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `klendar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `attachments`
--

CREATE TABLE `attachments` (
  `idattachments` int NOT NULL,
  `url` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `attachments_has_event`
--

CREATE TABLE `attachments_has_event` (
  `attachments_idattachments` int NOT NULL,
  `event_idevent` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `block`
--

CREATE TABLE `block` (
  `idblock` int NOT NULL,
  `month_idmonth` int NOT NULL,
  `day_idday` int NOT NULL,
  `number_idnumber` int NOT NULL,
  `year_idyear` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `block`
--

INSERT INTO `block` (`idblock`, `month_idmonth`, `day_idday`, `number_idnumber`, `year_idyear`) VALUES
(1, 1, 1, 1, 1),
(2, 1, 2, 2, 1),
(3, 1, 3, 3, 1),
(4, 1, 4, 4, 1),
(5, 1, 5, 5, 1),
(6, 1, 6, 6, 1),
(7, 1, 7, 7, 1),
(8, 1, 1, 8, 1),
(9, 1, 2, 9, 1),
(10, 1, 3, 10, 1),
(11, 1, 4, 11, 1),
(12, 1, 5, 12, 1),
(13, 1, 6, 13, 1),
(14, 1, 7, 14, 1),
(15, 1, 1, 15, 1),
(16, 1, 2, 16, 1),
(17, 1, 3, 17, 1),
(18, 1, 4, 18, 1),
(19, 1, 5, 19, 1),
(20, 1, 6, 20, 1),
(21, 1, 7, 21, 1),
(22, 1, 1, 22, 1),
(23, 1, 2, 23, 1),
(24, 1, 3, 24, 1),
(25, 1, 4, 25, 1),
(26, 1, 5, 26, 1),
(27, 1, 6, 27, 1),
(28, 1, 7, 28, 1),
(29, 1, 1, 29, 1),
(30, 1, 2, 30, 1),
(31, 1, 3, 31, 1),
(32, 2, 4, 1, 1),
(33, 2, 5, 2, 1),
(34, 2, 6, 3, 1),
(35, 2, 7, 4, 1),
(36, 2, 1, 5, 1),
(37, 2, 2, 6, 1),
(38, 2, 3, 7, 1),
(39, 2, 4, 8, 1),
(40, 2, 5, 9, 1),
(41, 2, 6, 10, 1),
(42, 2, 7, 11, 1),
(43, 2, 1, 12, 1),
(44, 2, 2, 13, 1),
(45, 2, 3, 14, 1),
(46, 2, 4, 15, 1),
(47, 2, 5, 16, 1),
(48, 2, 6, 17, 1),
(49, 2, 7, 18, 1),
(50, 2, 1, 19, 1),
(51, 2, 2, 20, 1),
(52, 2, 3, 21, 1),
(53, 2, 4, 22, 1),
(54, 2, 5, 23, 1),
(55, 2, 6, 24, 1),
(56, 2, 7, 25, 1),
(57, 2, 1, 26, 1),
(58, 2, 2, 27, 1),
(59, 2, 3, 28, 1),
(60, 2, 4, 29, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `block_has_event`
--

CREATE TABLE `block_has_event` (
  `block_idblock` int NOT NULL,
  `event_idevent` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `block_has_event`
--

INSERT INTO `block_has_event` (`block_idblock`, `event_idevent`) VALUES
(1, 1),
(16, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `day`
--

CREATE TABLE `day` (
  `idday` int NOT NULL,
  `dia` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `day`
--

INSERT INTO `day` (`idday`, `dia`) VALUES
(1, 'lunes'),
(2, 'martes'),
(3, 'miercoles'),
(4, 'jueves'),
(5, 'viernes'),
(6, 'sabado'),
(7, 'domingo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `event`
--

CREATE TABLE `event` (
  `idevent` int NOT NULL,
  `title` varchar(45) NOT NULL,
  `time` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `event`
--

INSERT INTO `event` (`idevent`, `title`, `time`) VALUES
(1, 'jugar fulbo', '22:16:05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `event_has_notification`
--

CREATE TABLE `event_has_notification` (
  `event_idevent` int NOT NULL,
  `notification_idnotification` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `interface`
--

CREATE TABLE `interface` (
  `idinterface` int NOT NULL,
  `block_idblock` int NOT NULL,
  `iduser` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `interface`
--

INSERT INTO `interface` (`idinterface`, `block_idblock`, `iduser`) VALUES
(1, 1, '1'),
(2, 2, '1'),
(3, 3, '1'),
(4, 4, '1'),
(5, 5, '1'),
(6, 6, '1'),
(7, 7, '1'),
(8, 8, '1'),
(9, 9, '1'),
(10, 10, '1'),
(11, 11, '1'),
(12, 12, '1'),
(13, 13, '1'),
(14, 14, '1'),
(15, 15, '1'),
(16, 16, '1'),
(17, 17, '1'),
(18, 18, '1'),
(19, 19, '1'),
(20, 20, '1'),
(21, 21, '1'),
(22, 22, '1'),
(23, 23, '1'),
(24, 24, '1'),
(25, 25, '1'),
(26, 26, '1'),
(27, 27, '1'),
(28, 28, '1'),
(29, 29, '1'),
(30, 30, '1'),
(31, 31, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `month`
--

CREATE TABLE `month` (
  `idmonth` int NOT NULL,
  `mes` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `month`
--

INSERT INTO `month` (`idmonth`, `mes`) VALUES
(1, 'enero'),
(2, 'febrero'),
(3, 'marzo'),
(4, 'abril'),
(5, 'mayo'),
(6, 'junio'),
(7, 'julio'),
(8, 'agosto'),
(9, 'septiembre'),
(10, 'octubre'),
(11, 'noviembre'),
(12, 'diciembre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notification`
--

CREATE TABLE `notification` (
  `idnotification` int NOT NULL,
  `type` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `number`
--

CREATE TABLE `number` (
  `idnumber` int NOT NULL,
  `numero` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `number`
--

INSERT INTO `number` (`idnumber`, `numero`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(16, 16),
(17, 17),
(18, 18),
(19, 19),
(20, 20),
(21, 21),
(22, 22),
(23, 23),
(24, 24),
(25, 25),
(26, 26),
(27, 27),
(28, 28),
(29, 29),
(30, 30),
(31, 31);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `year`
--

CREATE TABLE `year` (
  `idyear` int NOT NULL,
  `anio` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `year`
--

INSERT INTO `year` (`idyear`, `anio`) VALUES
(1, 2024);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `attachments`
--
ALTER TABLE `attachments`
  ADD PRIMARY KEY (`idattachments`);

--
-- Indices de la tabla `attachments_has_event`
--
ALTER TABLE `attachments_has_event`
  ADD PRIMARY KEY (`attachments_idattachments`,`event_idevent`),
  ADD KEY `fk_attachments_has_event_event1_idx` (`event_idevent`),
  ADD KEY `fk_attachments_has_event_attachments1_idx` (`attachments_idattachments`);

--
-- Indices de la tabla `block`
--
ALTER TABLE `block`
  ADD PRIMARY KEY (`idblock`),
  ADD KEY `fk_block_month_idx` (`month_idmonth`),
  ADD KEY `fk_block_day1_idx` (`day_idday`),
  ADD KEY `fk_block_number1_idx` (`number_idnumber`),
  ADD KEY `fk_block_year1_idx` (`year_idyear`);

--
-- Indices de la tabla `block_has_event`
--
ALTER TABLE `block_has_event`
  ADD PRIMARY KEY (`block_idblock`,`event_idevent`),
  ADD KEY `fk_block_has_event_event1_idx` (`event_idevent`),
  ADD KEY `fk_block_has_event_block1_idx` (`block_idblock`);

--
-- Indices de la tabla `day`
--
ALTER TABLE `day`
  ADD PRIMARY KEY (`idday`);

--
-- Indices de la tabla `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`idevent`);

--
-- Indices de la tabla `event_has_notification`
--
ALTER TABLE `event_has_notification`
  ADD PRIMARY KEY (`event_idevent`,`notification_idnotification`),
  ADD KEY `fk_event_has_notification_notification1_idx` (`notification_idnotification`),
  ADD KEY `fk_event_has_notification_event1_idx` (`event_idevent`);

--
-- Indices de la tabla `interface`
--
ALTER TABLE `interface`
  ADD PRIMARY KEY (`idinterface`),
  ADD KEY `fk_interface_block1_idx` (`block_idblock`);

--
-- Indices de la tabla `month`
--
ALTER TABLE `month`
  ADD PRIMARY KEY (`idmonth`);

--
-- Indices de la tabla `notification`
--
ALTER TABLE `notification`
  ADD PRIMARY KEY (`idnotification`);

--
-- Indices de la tabla `number`
--
ALTER TABLE `number`
  ADD PRIMARY KEY (`idnumber`);

--
-- Indices de la tabla `year`
--
ALTER TABLE `year`
  ADD PRIMARY KEY (`idyear`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `attachments`
--
ALTER TABLE `attachments`
  MODIFY `idattachments` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `block`
--
ALTER TABLE `block`
  MODIFY `idblock` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de la tabla `day`
--
ALTER TABLE `day`
  MODIFY `idday` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `event`
--
ALTER TABLE `event`
  MODIFY `idevent` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `interface`
--
ALTER TABLE `interface`
  MODIFY `idinterface` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `month`
--
ALTER TABLE `month`
  MODIFY `idmonth` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `number`
--
ALTER TABLE `number`
  MODIFY `idnumber` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `year`
--
ALTER TABLE `year`
  MODIFY `idyear` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `attachments_has_event`
--
ALTER TABLE `attachments_has_event`
  ADD CONSTRAINT `fk_attachments_has_event_attachments1` FOREIGN KEY (`attachments_idattachments`) REFERENCES `attachments` (`idattachments`),
  ADD CONSTRAINT `fk_attachments_has_event_event1` FOREIGN KEY (`event_idevent`) REFERENCES `event` (`idevent`);

--
-- Filtros para la tabla `block`
--
ALTER TABLE `block`
  ADD CONSTRAINT `fk_block_day1` FOREIGN KEY (`day_idday`) REFERENCES `day` (`idday`),
  ADD CONSTRAINT `fk_block_month` FOREIGN KEY (`month_idmonth`) REFERENCES `month` (`idmonth`),
  ADD CONSTRAINT `fk_block_number1` FOREIGN KEY (`number_idnumber`) REFERENCES `number` (`idnumber`),
  ADD CONSTRAINT `fk_block_year1` FOREIGN KEY (`year_idyear`) REFERENCES `year` (`idyear`);

--
-- Filtros para la tabla `block_has_event`
--
ALTER TABLE `block_has_event`
  ADD CONSTRAINT `fk_block_has_event_block1` FOREIGN KEY (`block_idblock`) REFERENCES `block` (`idblock`),
  ADD CONSTRAINT `fk_block_has_event_event1` FOREIGN KEY (`event_idevent`) REFERENCES `event` (`idevent`);

--
-- Filtros para la tabla `event_has_notification`
--
ALTER TABLE `event_has_notification`
  ADD CONSTRAINT `fk_event_has_notification_event1` FOREIGN KEY (`event_idevent`) REFERENCES `event` (`idevent`),
  ADD CONSTRAINT `fk_event_has_notification_notification1` FOREIGN KEY (`notification_idnotification`) REFERENCES `notification` (`idnotification`);

--
-- Filtros para la tabla `interface`
--
ALTER TABLE `interface`
  ADD CONSTRAINT `fk_interface_block1` FOREIGN KEY (`block_idblock`) REFERENCES `block` (`idblock`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
