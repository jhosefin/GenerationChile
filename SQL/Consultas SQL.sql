SELECT * FROM generation_schema.articulo;
SELECT * FROM generation_schema.cliente;
SELECT * FROM generation_schema.historial;

INSERT INTO generation_schema.historial (pedido) VALUES ('tres tazas');
ALTER TABLE generation_schema.historial ADD pedido varchar(20);

INSERT INTO generation_schema.cliente (nombre,email, fechaNacimiento, rut)
VALUES ('Benjamin Bustos', 'benjabustos@gmail.com', 16/11/1995, '12456985-9');

INSERT INTO generation_schema.cliente (nombre,email, fechaNacimiento, rut)
VALUES ('Nicolas Noiman', 'nicolas.noiman@gmail.com', '1995-12-22', '12456985-9');

INSERT INTO generation_schema.historial(pedido,cliente_id) VALUES ('TRES TAZAS', 1);
INSERT INTO generation_schema.historial(pedido,cliente_id) VALUES ('dos TAZAS', 2);

#quiero traer los datos de las compras que ha hecho nico

#asi no se hace
SELECT nombre,email,rut,pedido
#asi si

SELECT cliente.nombre,cliente.email,cliente.rut,historial.pedido
FROM generation_schema.cliente
LEFT JOIN generation_schema.historial on generation_schema.cliente.cliente_id = generation_schema.historial.cliente_id;

SELECT cliente.nombre,cliente.email,cliente.rut,historial.pedido
FROM generation_schema.cliente
RIGHT JOIN generation_schema.historial on generation_schema.cliente.cliente_id = generation_schema.historial.cliente_id;

SELECT cliente.nombre,cliente.email,cliente.rut,historial.pedido
FROM generation_schema.cliente
INNER JOIN generation_schema.historial on generation_schema.cliente.cliente_id = generation_schema.historial.cliente_id;



#-------------------------------------

#para contar cuantos resultados me trae mi consulta
SELECT count(cliente.nombre)
FROM generation_schema.cliente
RIGHT JOIN generation_schema.historial on generation_schema.cliente.cliente_id = generation_schema.historial.cliente_id
where cliente.nombre = 'Nicolas Noiman';

#para sumar valores
SELECT SUM(precio)
FROM generation_schema.articulo
WHERE nombre = 'Lapiz' OR nombre = 'PadMouse';

#Para sacar el promedio
SELECT AVG(precio)
FROM generation_schema.articulo
WHERE nombre = 'Lapiz' OR nombre = 'PadMouse';

#-----------------------------------------------------#

select * from generation_schema.articulo;
#me trae todo los datos que hay entre esos parametros ingresados
SELECT * 
FROM generation_schema.articulo
WHERE precio BETWEEN 4 and 2000;

#trae de lado y lado lo que tenga pareciso a esa condición% derecha o izquierda
SELECT *
FROM generation_schema.articulo
WHERE nombre LIKE '%mou%';



















