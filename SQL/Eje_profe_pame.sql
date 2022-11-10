CREATE SCHEMA IF NOT EXISTS generation_schema;
#Este es un comentario
CREATE TABLE  `generation_schema`.`articulo` (
`articulo_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(30) NOT NULL,
`precio` INT NOT NULL,
PRIMARY KEY (`articulo_id`));

CREATE TABLE `generation_schema`.`cliente`(
`cliente_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(20) NOT NULL,
`email` VARCHAR(40) NOT NULL,
`fechaNacimiento` DATE NOT NULL,
`rut` VARCHAR(15) NOT NULL,
PRIMARY KEY(`cliente_id`));

CREATE TABLE `generation_schema`.`historial`(
`historial_id` INT NOT NULL AUTO_INCREMENT,
`pedido` varchar(30) not null,
PRIMARY KEY(`historial_id`));

ALTER TABLE generation_schema.cliente ADD historial_id INT NOT NULL;
#altera la tabla cliente, agrega una realcion que se va a llamar clienteHistorial que sera una foreign key llamada historial_id
#que hace referencia a la tabla historial y a su id
#ALTER TABLE generation_schema.cliente ADD CONSTRAINT clienteHistorial FOREIGN KEY (historial_id) REFERENCES generation_schema.historial(historial_id);

#para cambiar nombre de columna
ALTER TABLE generation_schema.historial CHANGE column nombre nombre_usuario varchar(20);

ALTER TABLE generation_schema.historial ADD cliente_id INT NOT NULL;
ALTER TABLE generation_schema.historial ADD CONSTRAINT historialCliente FOREIGN KEY (cliente_id) REFERENCES generation_schema.cliente(cliente_id);

#para borrar tablas sin llaves foraneas
#verificar que no tenga llaves foraneas
DROP TABLE generation_schema.historial;

#para borrar tablas con llaves foraneas
#primero borrar la fk con el nombre de la fk
ALTER TABLE generation_schema.cliente DROP foreign key clienteHistorial;
#luego borar con el historial
ALTER TABLE generation_schema.historial DROP foreign key clienteHistorial;

#por utimo volver a dropearlo

DROP TABLE generation_schema.historial;
DROP TABLE generation_schema.cliente;


