-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2026 a las 03:59:43
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `supermercado5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `dni` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombre`, `apellido`, `telefono`, `dni`) VALUES
(1, 'Juan Perez', '', '3804000000', '25478123'),
(2, 'Maria Gomez', '', '3804111111', '31245897'),
(3, 'Maria Jimenez', '', '3804222222', '28547123'),
(4, 'Carlos Nieto', '', '3804333333', '30214587'),
(5, 'Fernanda Cortez', '', '3804444444', '33412789'),
(6, 'Maria Lopez', '', '3804555555', '29845632'),
(7, 'Alberto Gonzalez', '', '3804666666', '27123654'),
(8, 'Fernanda Cortez', '', '3804777777', '32727245');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ventas`
--

CREATE TABLE `detalle_ventas` (
  `id_detalle` int(11) NOT NULL,
  `id_venta` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_unitario` decimal(10,2) NOT NULL,
  `subtotal` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_ventas`
--

INSERT INTO `detalle_ventas` (`id_detalle`, `id_venta`, `id_producto`, `cantidad`, `precio_unitario`, `subtotal`) VALUES
(1, 1, 1, 2, 2100.00, 4200.00),
(2, 2, 2, 2, 1350.00, 2700.00),
(3, 2, 14, 2, 2100.00, 4200.00),
(4, 3, 8, 3, 1200.00, 3600.00),
(5, 4, 8, 1, 1200.00, 1200.00),
(6, 5, 1, 2, 2100.00, 4200.00),
(7, 5, 8, 2, 1200.00, 2400.00),
(8, 6, 3, 3, 1500.00, 4500.00),
(9, 6, 8, 3, 1200.00, 3600.00),
(10, 6, 5, 1, 2300.00, 2300.00),
(11, 7, 2, 2, 1350.00, 2700.00),
(12, 7, 14, 1, 2100.00, 2100.00),
(13, 8, 2, 2, 1350.00, 2700.00),
(14, 8, 5, 1, 2300.00, 2300.00),
(15, 9, 3, 2, 1500.00, 3000.00),
(16, 9, 1, 1, 2100.00, 2100.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL,
  `codigo_producto` varchar(20) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `stock` int(11) NOT NULL DEFAULT 0,
  `categoria` varchar(50) DEFAULT NULL,
  `precio_compra` decimal(10,2) NOT NULL,
  `precio_venta` decimal(10,2) NOT NULL,
  `id_proveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `codigo_producto`, `nombre`, `stock`, `categoria`, `precio_compra`, `precio_venta`, `id_proveedor`) VALUES
(1, 'P001', 'Coca Cola 2.25L', 45, 'Bebida', 1200.00, 2100.00, 1),
(2, 'P002', 'Leche Entera 1L', 60, 'Lacteo', 860.00, 1400.00, 2),
(3, 'P003', 'Azucar 1Kg', 35, 'Almacen', 900.00, 1500.00, 2),
(5, 'P004', 'Coca Cola 3L', 23, 'Bebida', 1500.00, 2300.00, 1),
(6, 'P005', 'Pepsi 2.25L', 30, 'Bebida', 1100.00, 1800.00, 1),
(8, 'P007', 'Fideos Matarazzo Tallarin 500g', 26, 'Almacen', 700.00, 1200.00, 2),
(9, 'P008', 'Queso Untable Casancrem 290g', 28, 'Lacteo', 1900.00, 2700.00, 2),
(10, 'P009', 'Queso Untable Casancrem 290g', 28, 'Lacteo', 1900.00, 2700.00, 2),
(14, 'P010', 'Sprite', 22, 'Bebida', 1130.00, 2100.00, 1),
(16, 'P015', 'Arroz', 32, 'Despensa', 869.00, 1350.00, 2),
(23, 'P021', 'aceite', 25, 'natura', 4100.00, 5200.00, 2),
(24, 'P022', 'aceite 2l', 20, 'despensa', 4200.00, 5300.00, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `id_proveedor` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `cuit` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`id_proveedor`, `nombre`, `telefono`, `direccion`, `email`, `cuit`) VALUES
(1, 'Distribuidora Norte', '3804123456', NULL, 'norte@gmail.com', NULL),
(2, 'Mayorista Centro', '3804555555', NULL, 'centro@gmail.com', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

CREATE TABLE `stock` (
  `id_stock` int(11) NOT NULL,
  `fecha` datetime DEFAULT current_timestamp(),
  `id_producto` int(11) NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `stock`
--

INSERT INTO `stock` (`id_stock`, `fecha`, `id_producto`, `id_proveedor`, `cantidad`) VALUES
(1, '2026-11-09 18:32:51', 1, 1, 50),
(2, '2026-11-09 18:32:51', 2, 2, 30),
(3, '2026-11-09 18:32:51', 3, 2, 40);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id_venta` int(11) NOT NULL,
  `codigo_venta` varchar(20) NOT NULL,
  `fecha` datetime NOT NULL DEFAULT current_timestamp(),
  `id_cliente` int(11) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `hora` time DEFAULT NULL,
  `metodo_pago` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_venta`, `codigo_venta`, `fecha`, `id_cliente`, `total`, `hora`, `metodo_pago`) VALUES
(1, 'V1794331024159', '2026-11-10 14:17:04', 8, 4200.00, '14:16:05', 'Débito'),
(2, 'V1794331209277', '2026-11-10 14:20:09', 4, 6900.00, '14:19:07', 'Débito'),
(3, 'V1794331304737', '2026-11-10 14:21:44', 8, 3600.00, '14:20:10', 'Débito'),
(4, 'V1794331386808', '2026-11-10 14:23:06', 5, 1200.00, '14:21:46', 'Transferencia'),
(5, 'V1794334119494', '2026-11-10 15:08:39', 8, 6600.00, '15:07:22', 'Débito'),
(6, 'V1794334607069', '2026-11-10 15:16:47', 4, 10400.00, '15:15:40', 'Efectivo'),
(7, 'V1794335253957', '2026-11-10 15:27:33', 4, 4800.00, '15:26:52', 'Crédito'),
(8, 'V1794360818755', '2026-11-10 22:33:38', 8, 5000.00, '22:31:37', 'Efectivo'),
(9, 'V1794361231298', '2026-11-10 22:40:31', 8, 5100.00, '22:38:16', 'Efectivo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `id_venta` (`id_venta`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `codigo_producto` (`codigo_producto`),
  ADD KEY `id_proveedor` (`id_proveedor`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- Indices de la tabla `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id_stock`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_proveedor` (`id_proveedor`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id_venta`),
  ADD UNIQUE KEY `codigo_venta` (`codigo_venta`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  MODIFY `id_detalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `stock`
--
ALTER TABLE `stock`
  MODIFY `id_stock` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`id_venta`) REFERENCES `ventas` (`id_venta`),
  ADD CONSTRAINT `detalle_ventas_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id_producto`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id_proveedor`);

--
-- Filtros para la tabla `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id_producto`),
  ADD CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id_proveedor`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
