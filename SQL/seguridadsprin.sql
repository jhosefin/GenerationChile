create schema if not exists spring_security;
INSERT INTO spring_security.user (id,enabled,password,username) 
VALUES(1,1,"$2a$04$d2VP7NcWAlIQLrb4gpUqCeUZUwcAYSa6rcIa2W8S8z0rM8DJbCA8m","admin");

INSERT INTO spring_security.user (id,enabled,password,username) 
VALUES(2,1,"$2a$04$d2VP7NcWAlIQLrb4gpUqCeUZUwcAYSa6rcIa2W8S8z0rM8DJbCA8m","user");

INSERT INTO spring_security.authority (id,authority) VALUES (1,"ROLE_ADMIN");
INSERT INTO spring_security.authority (id,authority) VALUES (2,"ROLE_USER");
INSERT INTO spring_security.authority_user (usuario_id, authority_id) VALUES (1,1);
INSERT INTO spring_security.authority_user (usuario_id, authority_id) VALUES (1,2);
INSERT INTO spring_security.authority_user (usuario_id, authority_id) VALUES (2,2);
