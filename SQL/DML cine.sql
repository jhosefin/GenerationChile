#base de datos Cliente
INSERT INTO cine_autoservicio.cliente (cliente_id,nombre) VALUES (1,'felipe');
INSERT INTO cine_autoservicio.cliente (nombre) VALUES ('marcos');
INSERT INTO cine_autoservicio.cliente (nombre) VALUES ('cristian');

#base de datos tarjeta asociada a cliente
INSERT INTO cine_autoservicio.tarjeta (datos,banco,cliente_id) VALUES ('juan pepito', 'banco antonio',2);
INSERT INTO cine_autoservicio.tarjeta (datos,banco,cliente_id) VALUES ('felipe', 'banco bci',3);
INSERT INTO cine_autoservicio.tarjeta (datos,banco,cliente_id) VALUES ('coni', 'banco falabella',1);

#base de dato pelicula 
INSERT INTO cine_autoservicio.pelicula (tituloPelicula) VALUES ('matrix');
INSERT INTO cine_autoservicio.pelicula (tituloPelicula) VALUES ('konosuba');
INSERT INTO cine_autoservicio.pelicula (tituloPelicula) VALUES ('avengers');

INSERT INTO cine_autoservicio.sala (tipoSala,capacidad) VALUES ('3D',200);
INSERT INTO cine_autoservicio.sala (tipoSala,capacidad) VALUES ('4XD',100);
INSERT INTO cine_autoservicio.sala (tipoSala,capacidad) VALUES ('2D',150);

INSERT INTO cine_autoservicio.comida (precio,cantidad,tipoDeComida) VALUES (2000,1,'cabritas');
INSERT INTO cine_autoservicio.comida (precio,cantidad,tipoDeComida) VALUES (3000,2,'bebidas');
INSERT INTO cine_autoservicio.comida (precio,cantidad,tipoDeComida) VALUES (5000,2,'combo');

INSERT INTO cine_autoservicio.funcion (horario,pelicula_id,sala_id) VALUES (20221109023903,2,1);
INSERT INTO cine_autoservicio.funcion (horario,pelicula_id,sala_id) VALUES (20221024144008,1,3);
INSERT INTO cine_autoservicio.funcion (horario,pelicula_id,sala_id) VALUES (20220109092509,3,2);

INSERT INTO cine_autoservicio.boleto (funcion_id,precio) VALUES (3,5400);
INSERT INTO cine_autoservicio.boleto (funcion_id,precio) VALUES (1,5000);
INSERT INTO cine_autoservicio.boleto (funcion_id,precio) VALUES (2,10000);

INSERT INTO cine_autoservicio.venta (cliente_id,boleto_id) VALUES (1,3);
INSERT INTO cine_autoservicio.venta (cliente_id,boleto_id) VALUES (2,2);
INSERT INTO cine_autoservicio.venta (cliente_id,boleto_id) VALUES (3,1);

INSERT INTO cine_autoservicio.venta_comida (comida_id,cliente_id) VALUES (1,3);
INSERT INTO cine_autoservicio.venta_comida (comida_id,cliente_id) VALUES (2,2);
INSERT INTO cine_autoservicio.venta_comida (comida_id,cliente_id) VALUES (3,1);


SELECT * FROM cine_autoservicio.cliente;
SELECT * FROM cine_autoservicio.tarjeta;
SELECT * FROM cine_autoservicio.pelicula;
SELECT * FROM cine_autoservicio.sala;
SELECT * FROM cine_autoservicio.comida;
SELECT * FROM cine_autoservicio.funcion;
SELECT * FROM cine_autoservicio.boleto;
SELECT * FROM cine_autoservicio.venta;
SELECT * FROM cine_autoservicio.venta_comida;

SELECT cliente.nombre , venta.boleto_id
FROM cine_autoservicio.cliente
LEFT JOIN cine_autoservicio.venta on cine_autoservicio.cliente.cliente_id = cine_autoservicio.venta.cliente_id;

SELECT boleto.precio , venta.cliente_id
FROM cine_autoservicio.boleto
LEFT JOIN cine_autoservicio.venta on cine_autoservicio.boleto.boleto_id = cine_autoservicio.venta.boleto_id;


SELECT cliente.nombre,boleto.precio
FROM cine_autoservicio.venta
INNER JOIN cliente
ON cine_autoservicio.cliente_id=cliente.cliente_id;

SELECT boleto.precio, venta.cliente_id , cliente.nombre
FROM cine_autoservicio.boleto, cine_autoservicio.cliente
INNER JOIN cine_autoservicio.venta ON cine_autoservicio.cliente.cliente_id=cine_autoservicio.venta.cliente_id
INNER JOIN cine_autoservicio.venta ON cine_autoservicio.boleto.boleto_id=cine_autoservicio.venta.boleto_id
ORDER BY cine_autoservicio.venta.cliente_id;
