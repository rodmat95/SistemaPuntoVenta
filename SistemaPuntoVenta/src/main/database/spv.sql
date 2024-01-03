-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-01-2024 a las 00:09:45
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `spv`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 1,
  `creado_en` timestamp NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id`, `nombre`, `descripcion`, `estado`, `creado_en`, `actualizado_en`) VALUES
(1, 'Celulares', 'celulares', 1, '2023-10-26 13:33:23', '2023-11-10 11:09:21'),
(2, 'Portatiles', 'portatiles', 1, '2023-10-27 16:15:38', '2023-11-10 11:09:41'),
(3, 'Teclados', 'teclados', 1, '2023-11-10 11:10:14', '2023-11-10 11:10:36'),
(4, 'Mouse', 'mouse', 1, '2023-11-11 10:18:50', '2023-11-11 10:18:50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `numero` varchar(25) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `dni` int(11) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 1,
  `creado_en` timestamp NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `nombre`, `numero`, `direccion`, `dni`, `estado`, `creado_en`, `actualizado_en`) VALUES
(1, 'Jaime', '987654321', 'Ca. Calle 123', 999999999, 1, '2023-10-28 02:48:20', '2023-11-11 00:22:49'),
(2, 'Alverto', '963852741', 'Av. Avenida 123', 888888888, 1, '2023-10-28 05:57:37', '2023-11-11 10:17:06'),
(3, 'Manuel', '987456321', 'Jr. Jiron 123', 66666666, 1, '2023-11-11 03:01:13', '2023-11-11 03:01:13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ventas`
--

CREATE TABLE `detalle_ventas` (
  `id` bigint(20) NOT NULL,
  `venta_id` bigint(20) NOT NULL,
  `producto_id` bigint(20) NOT NULL,
  `precio_unitario` double(8,2) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `descuento` double(8,2) NOT NULL,
  `precio_total` double(8,2) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 1,
  `creado_en` timestamp NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_ventas`
--

INSERT INTO `detalle_ventas` (`id`, `venta_id`, `producto_id`, `precio_unitario`, `cantidad`, `descuento`, `precio_total`, `estado`, `creado_en`, `actualizado_en`) VALUES
(1, 1, 1, 4399.49, 0, 0.00, 21997.45, 1, '2023-11-11 01:40:58', '2023-11-11 01:40:58'),
(2, 1, 4, 479.00, 0, 5269.00, 21076.00, 1, '2023-11-11 01:40:58', '2023-11-11 01:40:58'),
(3, 1, 2, 4999.00, 0, 12497.50, 112477.50, 1, '2023-11-11 01:40:58', '2023-11-11 01:40:58'),
(4, 2, 3, 3900.00, 2, 0.00, 7800.00, 1, '2023-11-11 10:13:30', '2023-11-11 10:13:30'),
(5, 2, 1, 4399.49, 1, 0.00, 4399.49, 1, '2023-11-11 10:13:30', '2023-11-11 10:13:30'),
(6, 2, 4, 479.00, 15, 359.25, 6825.75, 1, '2023-11-11 10:13:30', '2023-11-11 10:13:30'),
(7, 2, 2, 4999.00, 5, 0.00, 24995.00, 1, '2023-11-11 10:13:30', '2023-11-11 10:13:30'),
(8, 3, 2, 4999.00, 1, 0.00, 4999.00, 1, '2023-11-11 10:17:26', '2023-11-11 10:17:26'),
(9, 4, 2, 4999.00, 2, 0.00, 9998.00, 1, '2024-01-03 23:04:59', '2024-01-03 23:04:59');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` bigint(20) NOT NULL,
  `categoria_id` bigint(20) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `precio` double(8,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 1,
  `creado_en` timestamp NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `categoria_id`, `nombre`, `descripcion`, `precio`, `stock`, `estado`, `creado_en`, `actualizado_en`) VALUES
(1, 1, 'Asus Rog Phone 7', '512GB\n16GB Ram\n6,000 Mah', 4399.49, 13, 1, '2023-10-27 15:29:30', '2023-11-11 08:20:49'),
(2, 2, 'Asus TUF Gaming A15', 'AMD Ryzen 7\n512GB SSD\n16GB RAM\nRTX 4060', 4999.00, 6, 1, '2023-10-27 17:29:30', '2023-11-10 15:25:08'),
(3, 1, 'Red Magic 8 Pro', '256GB\n12GB Ram\nMate', 3900.00, 9, 1, '2023-10-27 17:31:31', '2023-11-11 10:12:24'),
(4, 3, 'Razer Huntsman V2', 'QWERTY\nClicky Optical Purple\nInglés US\nColor negro\nRGB', 479.00, 21, 1, '2023-11-10 15:28:51', '2023-11-10 15:30:09'),
(5, 4, 'Logitech G Pro X Superlight', 'SENSOR: HERO	\nRESOLUCIÓN: 100 - 25,600 DPI	\nTASA INFORME: 1000 Hz (1 ms)	\nMICROPROCESADOR: ARM de 32 bits', 415.80, 7, 1, '2023-11-11 10:20:49', '2023-11-11 10:20:49');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `contrasenia` varchar(255) NOT NULL,
  `puesto` varchar(255) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 1,
  `creado_en` timestamp NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `contrasenia`, `puesto`, `estado`, `creado_en`, `actualizado_en`) VALUES
(1, 'Rodrigo', 'admin', 'Administrador', 1, '2023-10-26 13:33:23', '2023-11-10 05:04:04'),
(2, 'Juan', 'juan', 'Trabajador', 1, '2023-10-27 15:22:43', '2023-11-10 05:03:58');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` bigint(20) NOT NULL,
  `usuario_id` bigint(20) NOT NULL,
  `cliente_id` bigint(20) NOT NULL,
  `fecha_venta` date NOT NULL DEFAULT current_timestamp(),
  `descuento` double(8,2) NOT NULL,
  `subtotal` double(8,2) NOT NULL,
  `igv` double(8,2) NOT NULL,
  `cantidad_total` double(8,2) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 1,
  `creado_en` timestamp NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `usuario_id`, `cliente_id`, `fecha_venta`, `descuento`, `subtotal`, `igv`, `cantidad_total`, `estado`, `creado_en`, `actualizado_en`) VALUES
(1, 2, 3, '2023-11-10', 17766.50, 155550.95, 27999.17, 183550.12, 1, '2023-11-11 01:40:57', '2023-11-11 01:40:57'),
(2, 1, 1, '2023-11-11', 359.25, 44020.24, 7923.64, 51943.88, 1, '2023-11-11 10:13:26', '2023-11-11 10:13:26'),
(3, 1, 2, '2023-11-11', 0.00, 4999.00, 899.82, 5898.82, 1, '2023-11-11 10:17:24', '2023-11-11 10:17:24'),
(4, 1, 2, '2024-01-03', 0.00, 9998.00, 1799.64, 11797.64, 1, '2024-01-03 23:04:55', '2024-01-03 23:04:55');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `venta_id` (`venta_id`),
  ADD KEY `producto_id` (`producto_id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categoria_id` (`categoria_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuario_id` (`usuario_id`),
  ADD KEY `cliente_id` (`cliente_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_ventas_ibfk_2` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
