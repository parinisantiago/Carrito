-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost:3306
-- Tiempo de generación: 22-10-2018 a las 04:45:06
-- Versión del servidor: 5.7.23-0ubuntu0.16.04.1
-- Versión de PHP: 7.0.32-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `danaide`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Carrito`
--

CREATE TABLE `Carrito` (
  `idCarrito` bigint(20) NOT NULL,
  `carritoTipo` varchar(255) NOT NULL,
  `precio` double DEFAULT NULL,
  `descuento` double DEFAULT NULL,
  `idUsuario` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Carrito`
--

INSERT INTO `Carrito` (`idCarrito`, `carritoTipo`, `precio`, `descuento`, `idUsuario`) VALUES
(1, 'V', 10174.52, 0, 2),
(2, 'E', 10174.52, 0, 1),
(3, 'V', 10174.52, 0, 2),
(4, 'E', 0, 0, NULL),
(5, 'V', 109594.51999999999, 702, 2),
(6, 'V', 87222.4, 21805.6, 2),
(7, 'V', 80161.6, 20040.4, 2),
(8, 'V', 100003, 0, 2),
(9, 'V', 88067.432, 22016.858000000004, 2),
(10, 'V', 80736.416, 20184.104, 2),
(11, 'N', 99999, 0, 1),
(12, 'V', 755.616, 188.90400000000002, 2),
(13, 'N', 110096.52, 200, 1),
(14, 'E', 100796.52, 500, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Carrito_productos`
--

CREATE TABLE `Carrito_productos` (
  `idCarrito` bigint(20) NOT NULL,
  `idProducto` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Carrito_productos`
--

INSERT INTO `Carrito_productos` (`idCarrito`, `idProducto`) VALUES
(1, 1),
(2, 1),
(3, 1),
(5, 1),
(13, 1),
(14, 1),
(1, 2),
(2, 2),
(3, 2),
(5, 2),
(6, 2),
(8, 2),
(10, 2),
(12, 2),
(13, 2),
(14, 2),
(1, 3),
(2, 3),
(3, 3),
(5, 3),
(10, 3),
(12, 3),
(13, 3),
(14, 3),
(1, 4),
(2, 4),
(3, 4),
(5, 4),
(7, 4),
(13, 4),
(14, 4),
(1, 5),
(2, 5),
(3, 5),
(5, 5),
(6, 5),
(9, 5),
(13, 5),
(1, 6),
(2, 6),
(3, 6),
(5, 6),
(9, 6),
(10, 6),
(12, 6),
(13, 6),
(14, 6),
(1, 8),
(2, 8),
(3, 8),
(5, 8),
(6, 8),
(13, 8),
(14, 8),
(1, 9),
(2, 9),
(3, 9),
(5, 9),
(6, 9),
(7, 9),
(12, 9),
(13, 9),
(14, 9),
(1, 10),
(2, 10),
(3, 10),
(5, 10),
(9, 10),
(13, 10),
(14, 10),
(1, 11),
(2, 11),
(3, 11),
(5, 11),
(7, 11),
(10, 11),
(12, 11),
(13, 11),
(14, 11),
(5, 12),
(7, 12),
(9, 12),
(13, 12),
(14, 12),
(5, 13),
(6, 13),
(7, 13),
(8, 13),
(9, 13),
(10, 13),
(11, 13),
(13, 13),
(14, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Danaide`
--

CREATE TABLE `Danaide` (
  `idDanaide` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Danaide`
--

INSERT INTO `Danaide` (`idDanaide`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Producto`
--

CREATE TABLE `Producto` (
  `idProducto` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `productos` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Producto`
--

INSERT INTO `Producto` (`idProducto`, `nombre`, `precio`, `productos`) VALUES
(1, 'Papas Fritas', 3, 1),
(2, 'Hamburguesa', 4, 1),
(3, 'Salchichas', 123.23, 1),
(4, 'Yerba', 12, 1),
(5, 'Jugo', 9000, 1),
(6, 'Gaseosa', 749.29, 1),
(8, 'mani', 2, 1),
(9, 'merluza', 23, 1),
(10, 'alfajor', 213, 1),
(11, 'caramelo', 45, 1),
(12, 'salamin', 123, 1),
(13, 'mondiola', 99999, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuario`
--

CREATE TABLE `Usuario` (
  `idUser` bigint(20) NOT NULL,
  `usuarioTipo` varchar(255) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `dni` varchar(255) DEFAULT NULL,
  `carritoActual` bigint(20) DEFAULT NULL,
  `usuarios` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Usuario`
--

INSERT INTO `Usuario` (`idUser`, `usuarioTipo`, `nombre`, `dni`, `carritoActual`, `usuarios`) VALUES
(1, 'N', 'PEPE', '123', NULL, 1),
(2, 'V', 'PIPO', '321', NULL, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Carrito`
--
ALTER TABLE `Carrito`
  ADD PRIMARY KEY (`idCarrito`),
  ADD KEY `FK69332x5pha07bvhjuxc3lkbxf` (`idUsuario`);

--
-- Indices de la tabla `Carrito_productos`
--
ALTER TABLE `Carrito_productos`
  ADD PRIMARY KEY (`idCarrito`,`idProducto`),
  ADD KEY `FK2ep3mlruupy7gnm8vp082jwxr` (`idProducto`);

--
-- Indices de la tabla `Danaide`
--
ALTER TABLE `Danaide`
  ADD PRIMARY KEY (`idDanaide`);

--
-- Indices de la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `FKqarsmr0hejny37lmg1vnk69g` (`productos`);

--
-- Indices de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD PRIMARY KEY (`idUser`),
  ADD UNIQUE KEY `UK_ldqqrtf9hiltekkxqg7px2v8f` (`carritoActual`),
  ADD KEY `FKfgopluaj7qd42e7sa67hm0g7k` (`usuarios`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Carrito`
--
ALTER TABLE `Carrito`
  ADD CONSTRAINT `FK69332x5pha07bvhjuxc3lkbxf` FOREIGN KEY (`idUsuario`) REFERENCES `Usuario` (`idUser`);

--
-- Filtros para la tabla `Carrito_productos`
--
ALTER TABLE `Carrito_productos`
  ADD CONSTRAINT `FK2ep3mlruupy7gnm8vp082jwxr` FOREIGN KEY (`idProducto`) REFERENCES `Producto` (`idProducto`),
  ADD CONSTRAINT `FKm20k9mh9yofyy1898lfi86s8i` FOREIGN KEY (`idCarrito`) REFERENCES `Carrito` (`idCarrito`);

--
-- Filtros para la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD CONSTRAINT `FKqarsmr0hejny37lmg1vnk69g` FOREIGN KEY (`productos`) REFERENCES `Danaide` (`idDanaide`);

--
-- Filtros para la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD CONSTRAINT `FKfgopluaj7qd42e7sa67hm0g7k` FOREIGN KEY (`usuarios`) REFERENCES `Danaide` (`idDanaide`),
  ADD CONSTRAINT `FKq2fep0wjfmm6jjpct4moo26fr` FOREIGN KEY (`carritoActual`) REFERENCES `Carrito` (`idCarrito`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
