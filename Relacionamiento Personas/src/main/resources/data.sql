INSERT INTO usuario (usuario, password) VALUES ("juan86", "pepito12");
INSERT INTO estandar (dni, nombre, apellido, fecha_de_nacimiento, ciudad, localidad_residencia, foto, id) VALUES
    ("43989888", "Juan", "Perez", NULL, "BsAs", "Mar del Plata", "/43989888/foto", (SELECT id FROM usuario WHERE usuario='juan86'));
INSERT INTO usuario (usuario, password) VALUES ("12lucia", "abcd");
INSERT INTO estandar (dni, nombre, apellido, fecha_de_nacimiento, ciudad, localidad_residencia, foto, id) VALUES
    ("42983333", "Lucia", "Lopez", NULL, "BsAs", "Caba", "/42983333/foto", (SELECT id FROM usuario WHERE usuario='12lucia'));
INSERT INTO delegacion (estado, id_usuario_delegado, id_usuario_que_delega) VALUES
    ("EnEspera", (SELECT id FROM usuario WHERE usuario='juan86'), (SELECT id FROM usuario WHERE usuario='12lucia'))