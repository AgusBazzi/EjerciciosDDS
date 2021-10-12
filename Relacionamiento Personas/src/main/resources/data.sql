INSERT INTO usuario (usuario, password) VALUES ("juan86", "pepito12");
INSERT INTO estandar (dni, nombre, apellido, fecha_de_nacimiento, ciudad, localidad_residencia, foto, id) VALUES
    ("43989888", "Juan", "Perez", NULL, "BsAs", "Mar del Plata", "/43989888/foto", (SELECT id FROM usuario WHERE usuario='juan86'));