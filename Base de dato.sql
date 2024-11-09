create database CRUMBL;
USE CRUMBL;

CREATE TABLE USUARIOS(
id int auto_increment primary key,
correo varchar(100),
contraseña varchar(100)
);
SELECT * FROM USUARIOS;
insert into usuarios (correo,contraseña) value("ktrujillo@gmail.com","1234");

DROP TABLE clientes;

CREATE TABLE CLIENTES(
id int auto_increment primary key,
dpi int,
nombre varchar(150) unique,
telefono int(15),
direccion varchar(200),
razon varchar(100),
fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM CLIENTES;

CREATE TABLE PROVEEDOR(
id int auto_increment primary key,
ruc int(20),
nombre varchar(200) unique,
telefono int(15),
dirreccion varchar(200),
razon varchar(200),
fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
SELECT * FROM PROVEEDOR;

CREATE TABLE PRODUCTOS(
id int auto_increment primary key,
codigo varchar(30),
descripcion varchar(200),
cantidad int,
precio decimal(10,2),
fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
nombreProveedor varchar(100),
FOREIGN KEY (nombreProveedor) REFERENCES proveedor(nombre)
);
SELECT * FROM PRODUCTOS;

CREATE TABLE VENTAS(
id int auto_increment primary key,
cliente varchar(150),
vendedor varchar(200),
total decimal(10,2),
fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (cliente) REFERENCES clientes(nombre)
);
SELECT * FROM VENTAS;


CREATE TABLE DETALLE(
id int auto_increment primary key,
codigoProducto int,
cantidad int,
precio decimal(10,2),
idVenta int,
foreign key (idVenta) references ventaS(id)
);
SELECT * FROM DETALLE;

CREATE TABLE CONFIG(
id int auto_increment primary key,
nombreEmpresa varchar(200),
ruc varchar(20),
telefono int(15),
direccion varchar(200),
razon varchar(200)
);
SELECT * FROM CONFIG;