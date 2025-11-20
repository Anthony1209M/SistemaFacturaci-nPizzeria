USE pizzeria;

CREATE TABLE usuario(id_usuario INT PRIMARY KEY auto_increment , nombre VARCHAR(50) NOT NULL, 
apellido VARCHAR(50) NOT NULL, telefono VARCHAR(50) NOT NULL, usuario VARCHAR(50) NOT NULL,
contrasena VARCHAR(50) NOT NULL, rol VARCHAR(50) NOT NULL, CONSTRAINT usuario_unico UNIQUE (usuario), 
CONSTRAINT nombre_unico UNIQUE(nombre, apellido));

INSERT INTO usuario (nombre, apellido, telefono, usuario, contrasena, rol)
VALUES("Jose", "Gomez", "809-546-6225", "Jose01", "1234", "Admin" );

INSERT INTO usuario (nombre, apellido, telefono, usuario, contrasena, rol)
VALUES("Pedro", "Jimenez", "809-765-8542", "Pedro01", "1234", "Regular" );

CREATE TABLE Factura(id_factura INT PRIMARY KEY auto_increment, id_usuario INT NOT NULL, 
total DECIMAL(10, 2) NOT NULL, fecha DATE NOT NULL, FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario) ) auto_increment = 100;

CREATE TABLE Producto(id_producto INT PRIMARY KEY auto_increment, nombre VARCHAR(50) NOT NULL UNIQUE, 
categoria VARCHAR(50) NOT NULL UNIQUE, stock INT NOT NULL CHECK(stock >= 0), precio decimal(10,2) NOT NULL);

CREATE TABLE detalle_factura(id_detalle INT PRIMARY KEY auto_increment, id_factura INT NOT NULL, id_producto INT NOT NULL, 
cantidad INT NOT NULL CHECK(cantidad >= 1), sub_total DECIMAL(10,2) NOT NULL , precio_u decimal(10, 2) NOT NULL,
FOREIGN KEY(id_factura) REFERENCES factura(id_factura), FOREIGN KEY(id_producto) REFERENCES producto(id_producto));

DROP TABLE detalle_factura;