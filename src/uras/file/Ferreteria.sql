use ferreteria;

drop table if exists ventas;
drop table if exists ventas_productos;
drop table if exists productos;
drop table if exists proveedores;


CREATE TABLE proveedores (

id_proveedores MEDIUMINT (3) not NULL AUTO_INCREMENT,

nombre VARCHAR (60) not NULL,

direccion VARCHAR (100) not NULL,

estado CHAR (20) not NULL,

telefono INT (10) not NULL,

email VARCHAR (70) not NULL,

primary key (id_proveedores)

);


CREATE TABLE ventas (

folio MEDIUMINT (3) not NULL AUTO_INCREMENT,

total CHAR (7) not NULL,

vendedor VARCHAR (70) not NULL,

primary key (folio)
);


CREATE TABLE ventas_productos (

id_ventas MEDIUMINT (3) not NULL AUTO_INCREMENT,

id_prod MEDIUMINT (3) not NULL,

nombre VARCHAR (70) not NULL,

precio FLOAT (20) not NULL,

cantidad INT (3) not NULL,

total CHAR (7) not NULL,

vendedor VARCHAR (70) not NULL,

primary key (id_ventas)
);



CREATE TABLE productos (


id MEDIUMINT (3)not NULL AUTO_INCREMENT,

nombre VARCHAR (70) not NULL,

precio FLOAT (20) not NULL,

cantidad INT (3) not NULL,

total FLOAT (20) not NULL,

id_proveedores MEDIUMINT(3) NOT NULL,

primary key (id)

);


insert into productos values (NULL,"pinzas", "40", "20", "0","1");
insert into productos values (NULL,"clavos 1/3", "45", "30", "0","2");
insert into productos values (NULL,"Desarmador", "80", "10", "0","1");
insert into productos values (NULL,"Aflojatodo 4 oz", "38", "50", "0","2");
insert into productos values (NULL,"Aflojatodo 2 oz", "20", "50", "0","3");
insert into productos values (NULL,"Abrazaderas 5/8(16mm)", "33", "600", "0","3");
insert into productos values (NULL,"Abrazaderas 3/4(19mm)", "150", "600", "0","4");
insert into productos values (NULL,"Acido muriatico 1/2 lt", "150", "50", "0","4");
insert into productos values (NULL,"Cardas de Copa Lisa", "120", "30", "0","5");
insert into productos values (NULL,"Carda de Copa con Zanco de 1/4", "135", "30", "0","2");
insert into productos values (NULL,"Arandela Biselada 3mm", "1", "1000", "0","1");
insert into productos values (NULL,"Arandela Biselada 4mm", "1", "1000", "0","5");
insert into productos values (NULL,"Cable de Acero 5x7 8mm Galv", "60", "200", "0","2");
insert into productos values (NULL,"Cable de Acero 5x7 12mm Galv", "70", "200", "0","3");
insert into productos values (NULL,"Hacha Camping  500G", "150", "30", "0","4");
insert into productos values (NULL,"Lija al Agua G-180", "10", "200", "0","4");
insert into productos values (NULL,"Lija al Agua G-400", "10", "200", "0","1");
insert into productos values (NULL,"Linterna", "110", "30", "0","2");
insert into productos values (NULL,"Martillo 30 mm", "130", "30", "0","3");
insert into productos values (NULL,"Mosqueton a Boton Cromado N1", "150", "100", "0","1");
insert into productos values (NULL,"Mosqueton a Boton Cromado N2", "150", "100", "0","2");
insert into productos values (NULL,"Rastrillo 12 Dientes", "115", "100", "0","5");
insert into productos values (NULL,"Punta Montada Rosa W-217","110", "140", "0","5");


insert into productos values (NULL,"Epinzas", "40", "20", "0","1");
insert into productos values (NULL,"Eclavos 1/3", "45", "30", "0","2");
insert into productos values (NULL,"EDesarmador", "80", "10", "0","1");
insert into productos values (NULL,"EAflojatodo 4 oz", "38", "50", "0","2");
insert into productos values (NULL,"EAflojatodo 2 oz", "20", "50", "0","3");
insert into productos values (NULL,"EAbrazaderas 5/8(16mm)", "33", "600", "0","3");
insert into productos values (NULL,"EAbrazaderas 3/4(19mm)", "150", "600", "0","4");
insert into productos values (NULL,"EAcido muriatico 1/2 lt", "150", "50", "0","4");
insert into productos values (NULL,"ECardas de Copa Lisa", "120", "30", "0","5");
insert into productos values (NULL,"ECarda de Copa con Zanco de 1/4", "135", "30", "0","2");
insert into productos values (NULL,"EArandela Biselada 3mm", "1", "1000", "0","1");
insert into productos values (NULL,"EArandela Biselada 4mm", "1", "1000", "0","5");
insert into productos values (NULL,"ECable de Acero 5x7 8mm Galv", "60", "200", "0","2");
insert into productos values (NULL,"ECable de Acero 5x7 12mm Galv", "70", "200", "0","3");
insert into productos values (NULL,"EHacha Camping  500G", "150", "30", "0","4");
insert into productos values (NULL,"ELija al Agua G-180", "10", "200", "0","4");
insert into productos values (NULL,"ELija al Agua G-400", "10", "200", "0","1");
insert into productos values (NULL,"ELinterna", "110", "30", "0","2");
insert into productos values (NULL,"EMartillo 30 mm", "130", "30", "0","3");
insert into productos values (NULL,"EMosqueton a Boton Cromado N1", "150", "100", "0","1");



insert into productos values (NULL,"Gpinzas", "40", "20", "0","1");
insert into productos values (NULL,"Gclavos 1/3", "45", "30", "0","2");
insert into productos values (NULL,"GDesarmador", "80", "10", "0","1");
insert into productos values (NULL,"GAflojatodo 4 oz", "38", "50", "0","2");
insert into productos values (NULL,"GAflojatodo 2 oz", "20", "50", "0","3");
insert into productos values (NULL,"GAbrazaderas 5/8(16mm)", "33", "600", "0","3");
insert into productos values (NULL,"GAbrazaderas 3/4(19mm)", "150", "600", "0","4");
insert into productos values (NULL,"GAcido muriatico 1/2 lt", "150", "50", "0","4");
insert into productos values (NULL,"GCardas de Copa Lisa", "120", "30", "0","5");
insert into productos values (NULL,"GCarda de Copa con Zanco de 1/4", "135", "30", "0","2");
insert into productos values (NULL,"GArandela Biselada 3mm", "1", "1000", "0","1");
insert into productos values (NULL,"GArandela Biselada 4mm", "1", "1000", "0","5");
insert into productos values (NULL,"GCable de Acero 5x7 8mm Galv", "60", "200", "0","2");
insert into productos values (NULL,"GCable de Acero 5x7 12mm Galv", "70", "200", "0","3");
insert into productos values (NULL,"GHacha Camping  500G", "150", "30", "0","4");
insert into productos values (NULL,"GLija al Agua G-180", "10", "200", "0","4");
insert into productos values (NULL,"GLija al Agua G-400", "10", "200", "0","1");
insert into productos values (NULL,"GLinterna", "110", "30", "0","2");
insert into productos values (NULL,"GMartillo 30 mm", "130", "30", "0","3");
insert into productos values (NULL,"GMosqueton a Boton Cromado N1", "150", "100", "0","1");

insert into productos values (NULL,"Rpinzas", "40", "20", "0","1");
insert into productos values (NULL,"Rclavos 1/3", "45", "30", "0","2");
insert into productos values (NULL,"RDesarmador", "80", "10", "0","1");
insert into productos values (NULL,"RAflojatodo 4 oz", "38", "50", "0","2");
insert into productos values (NULL,"RAflojatodo 2 oz", "20", "50", "0","3");
insert into productos values (NULL,"RAbrazaderas 5/8(16mm)", "33", "600", "0","3");
insert into productos values (NULL,"RAbrazaderas 3/4(19mm)", "150", "600", "0","4");
insert into productos values (NULL,"RAcido muriatico 1/2 lt", "150", "50", "0","4");
insert into productos values (NULL,"RCardas de Copa Lisa", "120", "30", "0","5");
insert into productos values (NULL,"RCarda de Copa con Zanco de 1/4", "135", "30", "0","2");
insert into productos values (NULL,"RArandela Biselada 3mm", "1", "1000", "0","1");
insert into productos values (NULL,"RArandela Biselada 4mm", "1", "1000", "0","5");
insert into productos values (NULL,"RCable de Acero 5x7 8mm Galv", "60", "200", "0","2");
insert into productos values (NULL,"RCable de Acero 5x7 12mm Galv", "70", "200", "0","3");
insert into productos values (NULL,"RHacha Camping  500G", "150", "30", "0","4");
insert into productos values (NULL,"RLija al Agua G-180", "10", "200", "0","4");
insert into productos values (NULL,"RLija al Agua G-400", "10", "200", "0","1");
insert into productos values (NULL,"RLinterna", "110", "30", "0","2");
insert into productos values (NULL,"RMartillo 30 mm", "130", "30", "0","3");
insert into productos values (NULL,"RMosqueton a Boton Cromado N1", "150", "100", "0","1");

insert into productos values (NULL,"Spinzas", "40", "20", "0","1");
insert into productos values (NULL,"Sclavos 1/3", "45", "30", "0","2");
insert into productos values (NULL,"SDesarmador", "80", "10", "0","1");
insert into productos values (NULL,"SAflojatodo 4 oz", "38", "50", "0","2");
insert into productos values (NULL,"SAflojatodo 2 oz", "20", "50", "0","3");
insert into productos values (NULL,"SAbrazaderas 5/8(16mm)", "33", "600", "0","3");
insert into productos values (NULL,"SAbrazaderas 3/4(19mm)", "150", "600", "0","4");
insert into productos values (NULL,"SAcido muriatico 1/2 lt", "150", "50", "0","4");
insert into productos values (NULL,"SCardas de Copa Lisa", "120", "30", "0","5");
insert into productos values (NULL,"SCarda de Copa con Zanco de 1/4", "135", "30", "0","2");
insert into productos values (NULL,"SArandela Biselada 3mm", "1", "1000", "0","1");
insert into productos values (NULL,"SArandela Biselada 4mm", "1", "1000", "0","5");
insert into productos values (NULL,"SCable de Acero 5x7 8mm Galv", "60", "200", "0","2");
insert into productos values (NULL,"SCable de Acero 5x7 12mm Galv", "70", "200", "0","3");
insert into productos values (NULL,"SHacha Camping  500G", "150", "30", "0","4");
insert into productos values (NULL,"SLija al Agua G-180", "10", "200", "0","4");
insert into productos values (NULL,"SLija al Agua G-400", "10", "200", "0","1");
insert into productos values (NULL,"SLinterna", "110", "30", "0","2");
insert into productos values (NULL,"SMartillo 30 mm", "130", "30", "0","3");
insert into productos values (NULL,"SMosqueton a Boton Cromado N1", "150", "100", "0","1");


insert into proveedores values (NULL, "OROPESA S.A. de C.V","Calle 10. col. Libertadores", "Sonora", "99182931", "oropesa@hotmail.com");
insert into proveedores values (NULL, "Toolcraft S.A. de C.V","C/ Cuevas de Ambrosio, 75", "Sonora ", "766921546", "toolcraft@hotmail.com");
insert into proveedores values (NULL, "Austromex S.A. de C.V","Calle Avendaño, 66", "Sonora", "602890115", "autromex@hotmail.com");
insert into proveedores values (NULL, "Fandeli S.A. de C.V","C/ Henan Cortes, 42", "Sonora", "662520451", "fandeli@hotmail.com");
insert into proveedores values (NULL, "Santul S.A. de C.V","C/ Benito Guinea, 39", "Sonora", "746273747", "santul@hotmail.com");



ALTER TABLE productos add foreign key (id_proveedores) references proveedores(id_proveedores) on DELETE CASCADE;
