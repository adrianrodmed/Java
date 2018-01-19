-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-01-2018 a las 14:46:28
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `periodico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `IdCategoria` int(11) NOT NULL,
  `Descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`IdCategoria`, `Descripcion`) VALUES
(1, 'Deportes'),
(2, 'Cultura'),
(3, 'Economía'),
(5, 'Social');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `noticias`
--

CREATE TABLE `noticias` (
  `IdNoticia` int(11) NOT NULL,
  `Mail` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `IdCategoria` int(11) DEFAULT NULL,
  `Titulo` varchar(252) COLLATE latin1_spanish_ci DEFAULT NULL,
  `Contenido` text COLLATE latin1_spanish_ci,
  `Fecha` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `noticias`
--

INSERT INTO `noticias` (`IdNoticia`, `Mail`, `IdCategoria`, `Titulo`, `Contenido`, `Fecha`) VALUES
(1, 'adrian@gmail.com', 1, 'Asensio, salvador en Leganés: \"A veces entra todo y a veces nada\"', 'Marco Asensio salvó al Real Madrid este jueves en Butarque. Estaba llamado a ser el hombre del partido el mallorquín, y así fue. Eso sí, tuvo que esperar hasta el minuto 89 para celebrar su gol. El primero después de 69 días y 14 partidos de sequía.\r\n\r\nFue en Leganés, para firmar el único tanto del encuentro y ayudar a los blancos a acercarse a las semifinales de la Copa del Rey. Asensio aprovechó el centro de Theo al primer palo y se sacó una volea de las suyas.Es el octavo gol de Marco esta temporada, y el segundo en Copa del Rey. Es pichichi del equipo de la Liga junto a Cristiano, Bale e Isco con cuatro dianas. Y sus otras dos dianas fueron en la Supercopa de España frente al Barcelona.Tras el partido, el goleador habló: \"Teníamos que sacar un buen resultado y lo hemos hecho. Los equipos contrarios también juegan y el Lega es un gran equipo que trabaja bien en defensa y es normal que nos haya costado. A veces son dinámicas, a veces entra todo y a veces nada. Hay que seguir trabajando en la mejora del equipo. A medida que vayan entrando los goles y a medida que vayamos ganando todo fluye\".', '2018-01-19 09:57:31'),
(2, 'julian@gmail.com', 1, 'En un lugar de la mancha', 'De cuyo nombre no quiero acordarme', '2018-01-19 13:18:20');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`IdCategoria`);

--
-- Indices de la tabla `noticias`
--
ALTER TABLE `noticias`
  ADD PRIMARY KEY (`IdNoticia`),
  ADD KEY `IdCategoria` (`IdCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `IdCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `noticias`
--
ALTER TABLE `noticias`
  MODIFY `IdNoticia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `noticias`
--
ALTER TABLE `noticias`
  ADD CONSTRAINT `noticias_ibfk_1` FOREIGN KEY (`IdCategoria`) REFERENCES `categorias` (`IdCategoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
