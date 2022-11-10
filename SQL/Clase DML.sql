INSERT INTO generation_schema.articulo (nombre, precio) VALUES ( 'Celular', 150000);
INSERT INTO generation_schema.articulo (nombre, precio) VALUES ( 'Audifonos inalam', 3.5);
INSERT INTO generation_schema.articulo (articulo_id,nombre,precio) VALUES ( 8,'Mouse', 50000);
INSERT INTO generation_schema.articulo (nombre,precio) VALUES ('PadMouse', 2000);
INSERT INTO generation_schema.articulo (articulo_id,nombre,precio) VALUES (7,'Lapiz', 50000);
INSERT INTO generation_schema.articulo (nombre,precio) VALUES ('Goma', 500);

#modifica datos

INSERT INTO generation_schema.articulo (articulo_id, nombre,precio) VALUES (7, 'Lapiz', 50000) 
ON duplicate key update nombre = 'LapizMina';

INSERT INTO generation_schema.articulo (articulo_id,nombre,precio) VALUES (8,'Mouse', 50000)
ON duplicate key update nombre = 'Mouse RGB';

INSERT INTO generation_schema.articulo (articulo_id,nombre,precio) VALUES (3,'Celular', 150000)
ON duplicate key update nombre = 'Iphone' , precio = 10000;


#limpia base de dato y cambia los valores en el numero de id seleccionado
UPDATE generation_schema.articulo
SET nombre='Celular Samsung', precio = 1000000
#siempre usar where !!PORFAVOR where es como el if
WHERE articulo_id =3;

UPDATE generation_schema.articulo
SET precio = 2000
WHERE nombre ='PadMouse';

UPDATE generation_schema.articulo
SET precio = 2500
WHERE precio >= 30000;

UPDATE generation_schema.articulo
SET precio = 5000
WHERE precio = 2500 AND nombre= 'Audifonos';
#AND Y OR NOT < > == se usa igual 

#sirve para quitar el modo niñera, se desactiva por base de datos es un tipo de permiso 
#SET SQL_SAFE_UPDATES = 0;

#volver modo niñera
#SET SQL_SAFE_UPDATES = 1;

#trae todos los datos de su tabla
SELECT * FROM generation_schema.articulo;

#para borrar solo un dato con where simepre
DELETE FROM generation_schema.articulo
WHERE nombre = 'Celular samsung';

#asi solo se borra todo
DELETE FROM generation_schema.articulo;








