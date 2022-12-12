#Se crea el nombre del schema 
CREATE SCHEMA IF NOT EXISTS tienda_jose;

#Se crean 9 tablas que tienen relacion con la tienda de Don Jose, Para que pueda obtener sus ganancias y ventas.
CREATE TABLE `tienda_jose`.`boleta`(
 `boleta_id`        INT NOT NULL ,
 `fecha`            DATE NOT NULL ,
 `nombre_comercio`  VARCHAR(45) NOT NULL ,
 `valor_total`      INT NOT NULL ,
PRIMARY KEY (`boleta_id`));

CREATE TABLE `tienda_jose`.`cliente`(
 `cliente_id` INT NOT NULL ,
 `nombre`     VARCHAR(45) NOT NULL ,
 `apellido`   VARCHAR(45) NOT NULL ,
 `rut`        VARCHAR(45) NOT NULL ,
 `telefono`   VARCHAR(45) NOT NULL ,
 `categoria`  VARCHAR(45) NOT NULL ,
PRIMARY KEY (`cliente_id`));

CREATE TABLE `tienda_jose`.`detalle_compra`(
 `detalle_compra` INT NOT NULL ,
 `cantidad`        INT NOT NULL ,
PRIMARY KEY (`detalle_compra`));

CREATE TABLE `tienda_jose`.`detalle_venta`(
 `detalle_venta_id` INT NOT NULL ,
 `cantidad`         INT NOT NULL ,
 `total`            INT NOT NULL ,
PRIMARY KEY (`detalle_venta_id`));


CREATE TABLE `tienda_jose`.`factura`(
 `factura_id`     INT NOT NULL ,
 `numero_factura` VARCHAR(45) NOT NULL ,
 `monto_total`    INT NOT NULL ,
PRIMARY KEY (`factura_id`));

CREATE TABLE `tienda_jose`.`forma_de_pago`(
 `forma_de_pago_id` INT NOT NULL ,
 `nombre`           VARCHAR(45) NOT NULL ,
PRIMARY KEY (`forma_de_pago_id`));


#---- Esta tabla tiene otra manera de alterar e introducir la FK en la tabla
CREATE TABLE `tienda_jose`.`producto`(
 `producto_id`         INT NOT NULL ,
 `nombre`              VARCHAR(45) NOT NULL ,
 `tipo_de_producto_id` INT NOT NULL ,
 `precio`              INT NOT NULL ,
 `stock`               INT NOT NULL ,
PRIMARY KEY (`producto_id`),
KEY `FK_2` (`tipo_de_producto_id`),
CONSTRAINT `producto_TipoDeProducto` FOREIGN KEY `FK_2` (`tipo_de_producto_id`) REFERENCES `tipo_de_producto` (`tipo_de_producto_id`));

CREATE TABLE `tienda_jose`.`proveedor`(
 `proveedor_id` INT NOT NULL ,
 `nombre`       VARCHAR(45) NOT NULL ,
 `direccion`    VARCHAR(45) NOT NULL ,
 `telefono`     VARCHAR(45) NOT NULL ,
PRIMARY KEY (`proveedor_id`));

CREATE TABLE `tienda_jose`.`tipo_de_producto`(
 `tipo_de_producto_id` INT NOT NULL ,
 `categoria`           VARCHAR(45) NOT NULL ,
PRIMARY KEY (`tipo_de_producto_id`));


##----------- Se crean las FK de las tablas con sus relaciones--------------##

# Para relacionar tabla detalle de venta con su producto y boleta
ALTER TABLE tienda_jose.detalle_venta ADD producto_id INT NOT NULL;
ALTER TABLE tienda_jose.detalle_venta ADD CONSTRAINT detalleVenta_producto FOREIGN KEY (producto_id) REFERENCES tienda_jose.producto(producto_id);

ALTER TABLE tienda_jose.detalle_venta ADD boleta_id INT NOT NULL;
ALTER TABLE tienda_jose.detalle_venta ADD CONSTRAINT detalleVenta_boleta FOREIGN KEY (boleta_id) REFERENCES tienda_jose.boleta(boleta_id);

# Para relacionar la tabla boleta con cliente y su forma de pago
ALTER TABLE tienda_jose.boleta ADD cliente_id INT NOT NULL;
ALTER TABLE tienda_jose.boleta ADD CONSTRAINT boleta_cliente FOREIGN KEY (cliente_id) REFERENCES tienda_jose.cliente(cliente_id);

ALTER TABLE tienda_jose.boleta ADD forma_de_pago_id INT NOT NULL;
ALTER TABLE tienda_jose.boleta ADD CONSTRAINT boleta_formaDePago FOREIGN KEY (forma_de_pago_id) REFERENCES tienda_jose.forma_de_pago(forma_de_pago_id);

# Para relacionar el detalle de la compra con su producto y factura
ALTER TABLE tienda_jose.detalle_compra ADD producto_id INT NOT NULL;
ALTER TABLE tienda_jose.detalle_compra ADD CONSTRAINT detalleCompra_producto FOREIGN KEY (producto_id) REFERENCES tienda_jose.producto(producto_id);

ALTER TABLE tienda_jose.detalle_compra ADD factura_id INT NOT NULL;
ALTER TABLE tienda_jose.detalle_compra ADD CONSTRAINT detalleCompra_factura FOREIGN KEY (factura_id) REFERENCES tienda_jose.factura(factura_id);

#Para relacionar la factura con el proveedor
ALTER TABLE tienda_jose.factura ADD proveedor_id INT NOT NULL;
ALTER TABLE tienda_jose.factura ADD CONSTRAINT factura_proveedor FOREIGN KEY (proveedor_id) REFERENCES tienda_jose.proveedor(proveedor_id);

##------------ Aca insrtamos valores a la tabla tipo de producto
INSERT INTO tienda_jose.tipo_de_producto (tipo_de_producto_id,categoria) VALUES (1,'congelado');
INSERT INTO tienda_jose.tipo_de_producto (tipo_de_producto_id,categoria) VALUES (2,'perecedero');
INSERT INTO tienda_jose.tipo_de_producto (tipo_de_producto_id,categoria) VALUES (3,'duradero');
INSERT INTO tienda_jose.tipo_de_producto (tipo_de_producto_id,categoria) VALUES (4,'refrigerado');
INSERT INTO tienda_jose.tipo_de_producto (tipo_de_producto_id,categoria) VALUES (5,'peligrosidad');
SELECT * FROM tienda_jose.tipo_de_producto;

#------Aca insertamos valores a la tabla producto
INSERT INTO tienda_jose.producto (producto_id,nombre,tipo_de_producto_id,precio,stock) VALUES (1,'pollo',1,5000,50);
INSERT INTO tienda_jose.producto (producto_id,nombre,tipo_de_producto_id,precio,stock) VALUES (2,'lata de atún',2,1990,25);
INSERT INTO tienda_jose.producto (producto_id,nombre,tipo_de_producto_id,precio,stock) VALUES (3,'arroz',3,2600,90);
INSERT INTO tienda_jose.producto (producto_id,nombre,tipo_de_producto_id,precio,stock) VALUES (4,'queso',4,7000,20);
INSERT INTO tienda_jose.producto (producto_id,nombre,tipo_de_producto_id,precio,stock) VALUES (5,'cloro',5,1500,40);
SELECT * FROM tienda_jose.producto;


##Mostrando la relacion tabla producto y tipo de producto
SELECT tipo_de_producto.categoria , producto.producto_id, producto.nombre , producto.precio, producto.stock
FROM tienda_jose.producto
INNER JOIN tienda_jose.tipo_de_producto on tienda_jose.tipo_de_producto.tipo_de_producto_id = tienda_jose.producto.tipo_de_producto_id;

## Otra manera de mostrar la relación
SELECT tipo_de_producto.categoria , producto.*
FROM tienda_jose.producto
INNER JOIN tienda_jose.tipo_de_producto ON tienda_jose.tipo_de_producto.tipo_de_producto_id = tienda_jose.producto.tipo_de_producto_id;


