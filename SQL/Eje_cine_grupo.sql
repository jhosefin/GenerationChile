CREATE SCHEMA IF NOT EXISTS Cine_Autoservicio;

CREATE TABLE `cine_autoservicio`.`venta`(
`venta_id` INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (`venta_id`));

CREATE TABLE `cine_autoservicio`.`cliente`(
`cliente_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (20) not null,
PRIMARY KEY (`cliente_id`));

CREATE TABLE `cine_autoservicio`.`tarjeta`(
`tarjeta_id` INT NOT NULL AUTO_INCREMENT,
`datos` VARCHAR (50) not null,
`banco` VARCHAR (30) NOT NULL,
PRIMARY KEY (`tarjeta_id`));

ALTER TABLE cine_autoservicio.tarjeta ADD cliente_id INT NOT NULL;
ALTER TABLE cine_autoservicio.tarjeta ADD CONSTRAINT clienteTarjeta FOREIGN KEY (cliente_id) REFERENCES cine_autoservicio.cliente(cliente_id);

CREATE TABLE `cine_autoservicio`.`boleto`(
`boleto_id` INT NOT NULL AUTO_INCREMENT,
`precio` INT NOT NULL,
PRIMARY KEY (`boleto_id`));

ALTER TABLE cine_autoservicio.venta ADD cliente_id INT NOT NULL;
ALTER TABLE cine_autoservicio.venta ADD CONSTRAINT clienteVenta FOREIGN KEY (cliente_id) REFERENCES cine_autoservicio.cliente(cliente_id);

ALTER TABLE cine_autoservicio.venta ADD boleto_id INT NOT NULL;
ALTER TABLE cine_autoservicio.venta ADD CONSTRAINT ventaBoleto FOREIGN KEY (boleto_id) REFERENCES cine_autoservicio.boleto(boleto_id);


CREATE TABLE `cine_autoservicio`.`funcion`(
`funcion_id` INT NOT NULL AUTO_INCREMENT,
`horario` datetime NOT NULL,
PRIMARY KEY (`funcion_id`));

ALTER TABLE cine_autoservicio.boleto ADD funcion_id INT NOT NULL;
ALTER TABLE cine_autoservicio.boleto ADD CONSTRAINT funcionBoleto FOREIGN KEY (funcion_id) REFERENCES cine_autoservicio.funcion(funcion_id);

CREATE TABLE `cine_autoservicio`.`pelicula`(
`pelicula_id` INT NOT NULL AUTO_INCREMENT,
`tituloPelicula` varchar(30) NOT NULL,
PRIMARY KEY (`pelicula_id`));

CREATE TABLE `cine_autoservicio`.`sala`(
`sala_id` INT NOT NULL AUTO_INCREMENT,
`tipoSala` VARCHAR(20) NOT NULL,
`capacidad` INT NOT NULL,
PRIMARY KEY(`sala_id`)); 

ALTER TABLE cine_autoservicio.funcion ADD pelicula_id INT NOT NULL;
ALTER TABLE cine_autoservicio.funcion ADD CONSTRAINT funcionPelicula FOREIGN KEY (pelicula_id) REFERENCES cine_autoservicio.pelicula(pelicula_id);

ALTER TABLE cine_autoservicio.funcion ADD sala_id INT NOT NULL;
ALTER TABLE cine_autoservicio.funcion ADD CONSTRAINT funcionSala FOREIGN KEY (sala_id) REFERENCES cine_autoservicio.sala(sala_id);

CREATE TABLE `cine_autoservicio`.`venta_comida`(
`venta_comida_id` INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (`venta_comida_id`));

CREATE TABLE `cine_autoservicio`.`comida`(
`comida_id` INT NOT NULL AUTO_INCREMENT,
`precio` INT NOT NULL,
`cantidad` INT NOT NULL,
`tipoDeComida` VARCHAR(30) NOT NULL,
PRIMARY KEY(`comida_id`)); 

ALTER TABLE cine_autoservicio.venta_comida ADD comida_id INT NOT NULL;
ALTER TABLE cine_autoservicio.venta_comida ADD CONSTRAINT Venta_ComidayComida FOREIGN KEY (comida_id) REFERENCES cine_autoservicio.comida(comida_id);

ALTER TABLE cine_autoservicio.venta_comida ADD cliente_id INT NOT NULL;
ALTER TABLE cine_autoservicio.venta_comida ADD CONSTRAINT Venta_ComidayCliente FOREIGN KEY (cliente_id) REFERENCES cine_autoservicio.cliente(cliente_id);


#borrando fk de comida en venta comida para modificar nombre
DROP TABLE cine_autoservicio.comida;
ALTER TABLE cine_autoservicio.venta_comida DROP foreign key Venta_ComidayComida;
ALTER TABLE cine_autoservicio.comida DROP foreign key Venta_ComidayComida;