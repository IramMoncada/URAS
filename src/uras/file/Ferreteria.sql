use ferreteria;

drop table if exists ventas;
drop table if exists ventas_productos;
drop table if exists productos;
drop table if exists proveedores;
drop table if exists almacen;
drop table if exists usuarios;
drop table if exists facturacion;
drop table if exists AdminUsu;


CREATE TABLE proveedores (

id_proveedores MEDIUMINT (3) not NULL AUTO_INCREMENT,

nombre VARCHAR (60) not NULL,

direccion VARCHAR (100) not NULL,

estado VARCHAR (20) not NULL,

telefono VARCHAR (20) not NULL,

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

nombre VARCHAR (70) not NULL,

precio FLOAT (20) not NULL,

cantidad INT (3) not NULL,

total CHAR (7) not NULL,

vendedor VARCHAR (70) not NULL,

primary key (id_ventas)
);

CREATE TABLE facturacion (

id_factura MEDIUMINT (3) not NULL AUTO_INCREMENT,
nombre VARCHAR (60) not NULL,
rfc VARCHAR (60) not NULL,
direccion VARCHAR (100) not NULL,
razon CHAR (60) not NULL,
email VARCHAR (70) not NULL,
neto float(20) not NULL,
iva  float(20) not NULL,
total float (20) not NULL,
fecha_solicitud DATETIME ,
primary key (id_factura)
);

CREATE TABLE AdminUsu (
  curp varchar(30) NOT NULL,
  nombre varchar(60) NOT NULL,
  direccion varchar(100) NOT NULL,
  telefono varchar(30) NOT NULL,
  tipo_usu varchar(20) NOT NULL,
  turno varchar(20) NOT NULL,
  email varchar(50) NOT NULL,
  nick varchar(20) NOT NULL,
  password varchar(100) NOT NULL,
  invitado_inicio date DEFAULT NULL,
  invitado_fin date DEFAULT NULL
);



CREATE TABLE productos (

nombre VARCHAR (70) not NULL,
precio FLOAT (20) not NULL,
cantidad INT (4) not NULL,
ubicacion VARCHAR (4) not NULL,
id_proveedores MEDIUMINT(3) NOT NULL,
primary key (nombre)
);


CREATE TABLE usuarios (

id_RFC VARCHAR (20) not NULL,
nombre VARCHAR (45) not NULL,
direccion VARCHAR (100) not NULL,
telefono INT (20) not NULL,
email VARCHAR (70) not NULL,
turno VARCHAR (10) not NULL,
tipo VARCHAR (15) not NULL,
primary key (id_RFC)
);

CREATE TABLE almacen (

id_mov MEDIUMINT(4) not NULL AUTO_INCREMENT,
tipo VARCHAR (7) not NULL,
producto VARCHAR (70) not NULL,
cantidad MEDIUMINT (4) not NULL,
hora VARCHAR(10) not NULL,
fecha VARCHAR (10) not NULL,
responsable VARCHAR (80) not NULL,
primary key (id_mov)

);

/*1-10*/
insert into proveedores values (NULL, "SANLI", "295 Rooty Hill Road North Plumpton NSW 2761", "AUSTRALIA", "1800466068", "support@sanli.com.au");
insert into proveedores values (NULL, "PORTOTECNICA", "Viale Treviso, 63 30026 Summaga di Portogruaro (VE)", "ITALIA", "390421205511", "infoipcportotecnica@ipcleaning.com");
insert into proveedores values (NULL, "SAGOLA", "2nd street. No.5C. Hall 6. Industrial Park Benito JuÃ¡rez P.C. 76120", "ESPAÃ‘A", "34945214150", "sagolamexico@sagolamexico.mx");
insert into proveedores values (NULL, "BRIGHT", "Calle de Chihuahua Roma Nte. 06700 Ciudad de MÃ©xico, D.F.", "MEXICO", "0185274448", "cambia@thinkbright.mx");
insert into proveedores values (NULL, "MITUTOYO", "Av. Mollendo No. 956 Col. Lindavista C.P. 07300 Gustavo A. Madero, D.F.", "JAPON", "015585959409", "ventasex@herramientassanders.com.mx");
insert into proveedores values (NULL, "EMARESA", "Santa Adela 9901 - MaipÃº - Santiago", "CHILE", "56224602000", "forestal@emaresa.cl");
insert into proveedores values (NULL, "COCACO-ANGELITO", "Col Frederich 43", "ALEMANIA", "524441001195", "info@mercado-ideal.com");
insert into proveedores values (NULL, "SUPER EGO-ROTHENBERGER", "Ctra. Durango-Elorrio Km 2 48220 Abadiano - Bizkaia", "ESPAÃ‘A", "34946210145", "sat@super-ego.es");
insert into proveedores values (NULL, "SAMOA", "Pol. Ind. Porceyo, I-14 Camino del FontÃ¡n, 831 33392 GijÃ³n", "ESPAÃ‘A", "34985381488", "info@samoaindustrial.com");
insert into proveedores values (NULL, "DREMEL", "Av. Pdte. Plutarco ElÃ­as Calles 1331, Nativitas, 03500 Benito JuÃ¡rez, CDMX", "Pais", "18004373635", "dremel@support.com");

/*11-20*/
insert into proveedores values (NULL, "O.T.C.", "Avda. La Ferreria, nÂº40 Pol. Ind. La Ferreria", "U.S.A.", "34935641599", "info@productosaditivos.com");
insert into proveedores values (NULL, "HITMOUNT", "CALLE AGUSTIN LARA NO. 69-B", "China", "886227135577", "info@himount.com");
insert into proveedores values (NULL, "TLP", "Carretera de Murcia s/n Albacete Castilla-La Mancha", "ESPAÃ‘A", "0034 967 598 548 ", "tlp-info@contact.com");
insert into proveedores values (NULL, "HELA", "CALLE MATAMOROS NO.280", "EspaÃ±a", "5519603965", "hela@contact.com");
insert into proveedores values (NULL, "GORILLA", "AV. INDEPENDENCIA NO. 985", "Taiwan", "0128753090", "gorilla-contact@mail.com");
insert into proveedores values (NULL, "REPUESTOS TALADROS", "17 Kangding Street", "CHINA", "861058085000", "tal@contact.com");
insert into proveedores values (NULL, "UCESA", "7635 N La cholla Blvd Tucson, AZ", "U.S.A.", "2123244152", "info@ucesa-contact.com");
insert into proveedores values (NULL, "SMART TOOLS", "12 Jingyuan Street", "CHINA", "862032203330", "smart-tools@contact.com");
insert into proveedores values (NULL, "VICE-GRIP", "3901 W Ina Rd Tucson, AZ", "U.S.A.", "2073244265", "vice-grip@info.com");
insert into proveedores values (NULL, "QUIMICA Y ADHESIVOS", "Filadelphia 119", "MÃ‰XICO", "5526789056", "quim-adh@contacto-info.com");

/*21-30*/
insert into proveedores values (NULL, "MARSON", "13241 Weidner Street Pacoima", "U.S.A.", "8184850500", "contact@marson.com");
insert into proveedores values (NULL, "GAN MAR", "Av. Casade Alisat 27", "ARGENTINA", "972210151", "info@gan-mar.com");
insert into proveedores values (NULL, "STANLEY", "1737 Crucero DR. San Jose", "U.S.A.", "8008136134", "stanley-contact@info.com");
insert into proveedores values (NULL, "TRAMONTINA", "303 H Street 457", "U.S.A.", "6198195773", "tramontina@contact-info.com");
insert into proveedores values (NULL, "ROBINAIR", "42-15 Crescent Street, Suite 304", "U.S.A.", "7187845080", "support@robinair.com");
insert into proveedores values (NULL, "SOQUINA", "Salmeron 100", "ESPAÃ‘A", "935936933", "support@soquina.com");
insert into proveedores values (NULL, "DURACELL", "St. Pere, 2n", "U.S.A.", "8005512355", "duracell@info.com");
insert into proveedores values (NULL, "VARIOS NACIONALES", "Sonora 22", "MÃ‰XICO", "5560137890", "contact-productos@info.com");
insert into proveedores values (NULL, "SCANAVINI", "11500 Mopac Expwy", "US.A.", "5126830100", "support@scanavini.com");
insert into proveedores values (NULL, "YUEJIAN GROUP", "Novotel Xinqiao", "CHINA", "01065133366", "info@yuejian.com");

/*31-40*/
insert into proveedores values (NULL, "BATA", "3019 W Ina Rd", "Suecia", "575098653", "support@bata.com");
insert into proveedores values (NULL, "DORMEL", "Passeig de St Joan 7 Pral", "BRASIL", "9630196094", "support@dormel.com");
insert into proveedores values (NULL, "TECNOTEST", "Cerrada de Amado Nervo", "ITALIA", "4059306728", "contact-info@tecnotest.com");
insert into proveedores values (NULL, "SAMHONG", "Shonguei North 56", "COREA", "2019764982", "info@samhong.com");
insert into proveedores values (NULL, "FLOOD", "55 Fruit St Boston, MA", "U.S.A.", "1677392290", "contact@flood.com");
insert into proveedores values (NULL, "ODIS", "251 E Huron St, Chicago Il", "U.S.A.", "1132926200", "contacto@infodis.com");
insert into proveedores values (NULL, "FELDHOFF", "Hilaf atlet 67", "ALEMANIA", "5926793706", "info@feldhoff.com");
insert into proveedores values (NULL, "BELLOTA", "Paseo de la isla 7", "ESPAÃ‘A", "947540511", "contact@bellota.com");
insert into proveedores values (NULL, "PROTO", "North ilinois AZ", "U.S.A.", "59382696", "protomail@contact.com");
insert into proveedores values (NULL, "TELWIN", "Italia 21 Col Francia", "ITALIA", "5939766447", "telwin-support@info.com");

/*41-..*/
insert into proveedores values (NULL, "MEGA", "C. de salud la baÃ±eza", "ESPAÃ‘A", "947201221", "info@mega-contact.com");
insert into proveedores values (NULL, "CASCO", "Husttle 32", "ALEMANIA", "telefono", "info@casco.com");
insert into proveedores values (NULL, "FELO", "Santa Catalina 3", "ESPAÃ‘A", "987540511", "felo@support.com");

/*1-20*/
insert into productos values ("ABRAZADERA DE ACERO GALVANIZADO DE 1/2 - 1", "123.12", "20", "A1","1");
insert into productos values ("ABRAZADERA DE LA ESPIGA PARA PT407H", "11", "130", "A2","1");
insert into productos values ("ABRAZADERA DE RESISTENCIA", "740", "25", "A3","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 1", "1226", "20", "A4","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 1/2", "305", "30", "A5","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 1/8", "40", "50", "A6","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 3/16", "72", "40", "A7","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 3/4", "640", "25", "A8","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 3/8", "198", "34", "A9","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 5/16", "117", "43", "A10","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 5/8", "450", "22", "A11","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 7/16", "262", "46", "A12","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 7/8", "907", "17", "A13","1");
insert into productos values ("ABRAZADERA P/CABLE GALVANIZADA 9/16", "435", "26", "A14","1");
insert into productos values ("ABRAZADERA PARA FILTRO", "9", "20", "A15","2");
insert into productos values ("ACCESORIOS DE INFLADO P/COMPRESOR", "2283", "20", "A16","3");
insert into productos values ("ACCIONADOR DE REVERSA", "985", "30", "A17","4");
insert into productos values ("ACEITE ANTICORROSIVO", "15", "120", "A18","5");
insert into productos values ("ACEITE PARA  MEZCLA DE   5  LITROS", "180", "120", "A19","6");
insert into productos values ("ACEITERA TUBO FLEXIBLE DE 250 ML.", "40", "67", "A20","7");

/*21-40*/
insert into productos values ("ACOPLAMIENTO", "800", "18", "A21","8");
insert into productos values ("ACOPLAMIENTO CON BOQUILLA 4 GRAPAS", "80", "40", "A22","9");
insert into productos values ("ACOPLAMIENTO MINI SIERRA PARA FRESADORA", "600", "14", "A23","10");
insert into productos values ("ACOPLE RAPIDO DETERGENTE", "340", "24", "A24","2");
insert into productos values ("ACOPLE RAPIDO HEMBRA", "60", "30", "A25","2");
insert into productos values ("ACOPLE RAPIDO MACHO", "260", "25", "A26","2");
insert into productos values ("ADAPTADOR FORD", "800", "16", "A27","11");
insert into productos values ("ADAPTADOR DE LA VALVULA PARA PT8074-6", "97", "90", "A28","12");
insert into productos values ("ADAPTADOR DE MANOMETRO", "70", "45", "A29","13");
insert into productos values ("ADAPTADOR MECANIZADO", "360", "200", "A30","8");
insert into productos values ("ADAPTADOR PARA GRATAS 12", "50", "300", "A31","14");
insert into productos values ("ADAPTADOR PARA GRATAS 14", "60", "200", "A32","14");
insert into productos values ("ADHESIVO SUPERIOR MUTIPROPOSITO 1064 ML.", "300", "100", "A33","15");
insert into productos values ("ADHESIVO SUPERIOR MUTIPROPOSITO 118 ML.", "60", "300", "A34","15");
insert into productos values ("ADHESIVO SUPERIOR MUTIPROPOSITO 532 ML.", "180", "200", "A35","15");
insert into productos values ("ALAMBRE", "17", "400", "A36","16");
insert into productos values ("ALDABA FIERRO CINCADO DE 2", "24", "200", "A37","17");
insert into productos values ("ALDABA FIERRO CINCADO DE 3", "33", "200", "A38","17");
insert into productos values ("ALDABA FIERRO CINCADO DE 4", "38", "200", "A39","17");
insert into productos values ("ALDABA FIERRO CINCADO DE 5", "57", "200", "A40","17");

/*41-60*/
insert into productos values ("ALDABA FIERRO CINCADO DE 6", "72", "150", "A41","17");
insert into productos values ("ALICATE DE CERCA DE 10 DE ACERO FORJADO", "40", "50", "A42","18");
insert into productos values ("ALICATE DE CORTE DIAGONAL 6", "160", "40", "A43","19");
insert into productos values ("ALICATE DE CORTE DIAGONAL 7", "180", "40", "A44","19");
insert into productos values ("ALICATE DE CORTE DIAGONAL 8", "220", "40", "A45","19");
insert into productos values ("AMPOLLETA DEL FOCO", "120", "50", "A46","2");
insert into productos values ("AMPOLLETA NEON 24V", "40", "60", "A47","2");
insert into productos values ("ANILLO DE FIBRA", "440", "20", "A48","2");
insert into productos values ("ANILLO DE FIBRA W 151", "180", "20", "A49","2");
insert into productos values ("ANILLO DE FONDO", "200", "20", "A50","2");
insert into productos values ("ANILLO DE PROTECCION", "20", "20", "A51","2");
insert into productos values ("ANILLO DE TEFLON", "30", "40", "A52","2");
insert into productos values ("ANILLO PLASTICO", "36", "50", "A53","2");
insert into productos values ("ANTICORROSIVO WD-40 CHICO", "56", "30", "A54","20");
insert into productos values ("ANTICORROSIVO WD-40 FLEXI-TAPA", "88", "30", "A55","20");
insert into productos values ("ANTICORROSIVO WD-40 GRANDE", "89", "30", "A56","20");
insert into productos values ("ANTIOXIDO BLANCO DE 485 ML.", "44", "40", "A57","21");
insert into productos values ("ANTIOXIDO GRIS DE 485 ML.", "44", "40", "A58","21");
insert into productos values ("ANTIOXIDO NEGRO DE 485 ML.", "44", "40", "A59","21");
insert into productos values ("ANTIOXIDO ROJO DE 485 ML.", "44", "40", "A60","21");

/*61-80*/
insert into productos values ("ARANDELA", "2", "500", "A61","2");
insert into productos values ("ASPA VENTILADOR", "20", "40", "A62","22");
insert into productos values ("ASPAS DE ROTOR PARA PT792", "22", "30", "A63","12");
insert into productos values ("ASPAS DEL ROTOR PARA PT127", "23", "30", "A64","12");
insert into productos values ("ASPAS DEL ROTOR PARA PT262", "40", "30", "A65","12");
insert into productos values ("ASPIRADOR DE POLVO Y AGUA EX - 1515", "4000", "11", "A66","2");
insert into productos values ("ASPIRADOR DE POLVO Y AGUA EX - 1615", "8400", "11", "A67","2");
insert into productos values ("ASPIRADOR DE POLVO Y AGUA EX - 1629", "10200", "11", "A68","2");
insert into productos values ("ATORNILLADOR ELECTRICO PARA DRYWALL POTENCIA 520 W.", "1060", "15", "A69","23");
insert into productos values ("AZADA CON ENCAJE DE MANGO SOLDADO 6 DE 90 X 153 MM.", "20", "30", "A70","24");
insert into productos values ("AZADA CON ENCAJE DE MANGO SOLDADO 7 DE 90 X 179 MM.", "30", "30", "A71","24");
insert into productos values ("AZADA ESTAMPADA SIN MANGO DE 570 GRS.", "32", "30", "A72","24");
insert into productos values ("BALANCEADOR MOTOR DE VENTILADOR PT774562", "404", "12", "A73","12");
insert into productos values ("BALANZA  P/AC375", "4400", "13", "A74","25");
insert into productos values ("BALANZA DE 35 KG. PARA ACM3000", "2200", "13", "A75","25");
insert into productos values ("BANDA DE LIJA TRIO 60  GR", "20", "30", "A76","10");
insert into productos values ("BANDA DE LIJA TRIO 120 GR", "44", "30", "A77","10");
insert into productos values ("BANDA DE LIJA TRIO 240 GR", "44", "30", "A78","10");
insert into productos values ("BANDA PARA LIJAR 13 MM, GRANO 60", "54", "30", "A79","10");
insert into productos values ("BANDA PARA LIJAR 13 MM, GRANO 120", "19", "30", "A80","10");

/*81-100*/
insert into productos values ("BARNIZ MARINO 1/4 GALON", "80", "15", "A81","26");
insert into productos values ("BATERIA ALCALINA 9 VOLTS.", "44", "60", "A82","27");
insert into productos values ("BIDONES PLASTICOS DE 5 LTS.", "400", "12", "A83","28");
insert into productos values ("BIDONES PLASTICOS DE 10 LTS.", "500", "12", "A84","28");
insert into productos values ("BIDONES PLASTICOS DE 15 LTS.", "750", "12", "A85","28");
insert into productos values ("BIDONES PLASTICOS DE 20 LTS.", "1000", "12", "A86","28");
insert into productos values ("BIELA", "400", "50", "A87","2");
insert into productos values ("BISAGRA BR.CROMADO 3 X 3", "6", "100", "A88","29");
insert into productos values ("BISAGRA BR.CROMADO 3.1/2 X 3.1/2", "7", "100", "A89","29");
insert into productos values ("BISAGRA BR.SATINADO 3 X 3", "8", "100", "A90","29");
insert into productos values ("BISAGRA BR.SATINADO 4 X 4", "12", "100", "A91","29");
insert into productos values ("BISAGRA BRONCE GOLILLA 3 X 3", "10", "100", "A92","29");
insert into productos values ("BISAGRA BRONCE GOLILLA 4 X 4", "15", "50", "A93","29");
insert into productos values ("BISAGRA CROMADA GOLILLA 3 X 3", "14", "50", "A94","29");
insert into productos values ("BISAGRA CROMADA GOLILLA 4 X 4", "16", "50", "A95","29");
insert into productos values ("BOLA", "12", "200", "A96","2");
insert into productos values ("BOLA D 7/32", "8", "100", "A97","2");
insert into productos values ("BOMBA ANTICALCAREA", "300", "12", "A98","2");
insert into productos values ("BOQILLA DE CORTE 0", "3", "40", "A99","30");
insert into productos values ("BOQILLA DE CORTE 1", "3", "40", "B1","30");

/*101-120*/
insert into productos values ("BOQILLA DE CORTE 2", "3", "40", "B2","30");
insert into productos values ("BOQILLA DE CORTE 3", "3", "40", "B3","30");
insert into productos values ("BOQUILLA D 1.6 FORM", "11", "50", "B4","2");
insert into productos values ("BOQUILLA D 1.8", "12", "50", "B5","2");
insert into productos values ("BOQUILLA D 2.2", "11", "50", "B6","2");
insert into productos values ("BOQUILLA D.1.25 BEIGE", "12", "50", "B7","2");
insert into productos values ("BOQUILLA D.1.35 AZUL OSCURO", "12", "50", "B8","2");
insert into productos values ("BOQUILLA DE AIRE 17-S..C-64", "200", "15", "B9","3");
insert into productos values ("BOQUILLA DE AIRE NÂº 21..C-29", "300", "15", "B10","3");
insert into productos values ("BOQUILLA DE AIRE NÂº 67", "500", "15", "B11","3");
insert into productos values ("BOQUILLA QUEMADOR 0.85", "27", "20", "B12","2");
insert into productos values ("BOQUILLA QUEMADOR 1.00", "28", "20", "B13","2");
insert into productos values ("BOQUILLA QUEMADOR 1.25", "29", "20", "B14","2");
insert into productos values ("BOTAS INDUSTRIALES PVC NÂº 40 PUNTERA REFORZADA", "120", "30", "B15","31");
insert into productos values ("BOTAS INDUSTRIALES PVC NÂº 41 PUNTERA REFORZADA", "120", "30", "B16","31");
insert into productos values ("BOTAS INDUSTRIALES PVC NÂº 42 PUNTERA REFORZADA", "120", "30", "B17","31");
insert into productos values ("BOTAS INDUSTRIALES PVC NÂº 43-44 PUNTERA REFORZADA", "120", "30", "B18","31");
insert into productos values ("BOTAS INDUSTRIALES PVC NÂº 45-46 PUNTERA REFORZADA", "120", "30", "B19","31");
insert into productos values ("BOTELLA PARA INYECCION DE ACEITE", "400", "40", "B20","25");
insert into productos values ("BOTELLA PERFORADA P/DRENAJE DE ACEITE", "320", "40", "B21","25");

/*121-140*/
insert into productos values ("BOTON DESCARGA DE ACEITE", "180", "40", "B22","25");
insert into productos values ("BROCA A/R TITANIO DE 1.0 MM.", "10", "30", "B23","32");
insert into productos values ("BROCA A/R TITANIO DE 1.5 MM.", "10.5", "30", "B24","32");
insert into productos values ("BROCA A/R TITANIO DE 2.0 MM.", "20", "30", "B25","32");
insert into productos values ("BROCA A/R TITANIO DE 2.5 MM.", "20.5", "30", "B26","32");
insert into productos values ("BROCA A/R TITANIO DE 2.8 MM.", "20.8", "30", "B27","32");
insert into productos values ("BROCA A/R TITANIO DE 3.0 MM.", "30", "30", "B28","32");
insert into productos values ("BROCA A/R TITANIO DE 3.5 MM.", "30.5", "30", "B29","32");
insert into productos values ("BROCA A/R TITANIO DE 4.0 MM.", "40", "30", "B30","32");
insert into productos values ("BROCA A/R TITANIO DE 4.5 MM.", "40.5", "30", "B31","32");
insert into productos values ("BROCA A/R TITANIO DE 5.0 MM.", "50", "30", "B32","32");
insert into productos values ("BROCA A/R TITANIO DE 5.5 MM.", "50.5", "30", "B33","32");
insert into productos values ("BROCA A/R TITANIO DE 6.0 MM.", "60", "30", "B34","32");
insert into productos values ("BROCA A/R TITANIO DE 6.5 MM.", "60.5", "30", "B35","32");
insert into productos values ("BROCA A/R TITANIO DE 7.0 MM.", "70", "30", "B36","32");
insert into productos values ("BROCA A/R TITANIO DE 7.5 MM.", "70.5", "30", "B37","32");
insert into productos values ("BROCA A/R TITANIO DE 8.0 MM.", "80", "30", "B38","32");
insert into productos values ("BROCA A/R TITANIO DE 8.5 MM.", "80.5", "30", "B39","32");
insert into productos values ("BROCA A/R TITANIO DE 9.0 MM.", "90", "30", "B40","32");
insert into productos values ("BROCA A/R TITANIO DE 9.5 MM.", "90.5", "30", "B41","32");

/*141-160*/
insert into productos values ("BROCA CONCRETO DE 3.0 X 75 MM.", "854", "20", "B42","32");
insert into productos values ("BROCA CONCRETO DE 4.0 X 75 MM.", "854", "20", "B43","32");
insert into productos values ("BROCA CONCRETO DE 5.0 X 100 MM.", "943", "20", "B44","32");
insert into productos values ("BROCA CONO MORSE A/R 3/4 (CM2)", "35", "20", "B45","32");
insert into productos values ("BROCA CONO MORSE A/R 3/8 (CM1)", "13", "20", "B46","32");
insert into productos values ("BROCA CONO MORSE A/R 5/8 (CM2)", "26.6", "20", "B47","32");
insert into productos values ("BUJE CENTRAL", "45", "30", "B48","4");
insert into productos values ("BULON", "9", "40", "B49","2");
insert into productos values ("CABEZAL DE CILINDRO", "500", "15", "B50","4");
insert into productos values ("CABLE", "50", "100", "B51","4");
insert into productos values ("CABLE DE ALIMENTACION", "81", "15", "B52","33");
insert into productos values ("CABLE DE ALTA", "20", "200", "B53","2");
insert into productos values ("CABLE DE CARGA", "129", "20", "B54","34");
insert into productos values ("CABLE DE COMUNICACION", "154", "30", "B55","34");
insert into productos values ("CABLE DE SEÃ‘AL", "77", "14", "B56","34");
insert into productos values ("CABLE TOE", "12", "200", "B57","34");
insert into productos values ("CAIMAN DE 10", "50", "20", "B58","17");
insert into productos values ("CAJA DE VALVULA..C-90", "9", "30", "B59","3");
insert into productos values ("CALIBRADOR PROFUNDIDAD DE 300 MM", "153", "100", "B60","5");
insert into productos values ("CANCAMO ABIERTO NÂ° 1 FIERRO CINCADO", "7", "30", "B61","17");

/*161-180*/
insert into productos values ("CANDADO DE SEGURIDAD X-0", "320", "30", "B62","35");
insert into productos values ("CANDADO NÂ° 120 STANDARD (20 MM.)", "40", "30", "B63","36");
insert into productos values ("CANDADO NÂ° 125 STANDARD (25 MM.)", "60", "30", "B64","36");
insert into productos values ("CANDADO NÂ° 130 STANDARD (30 MM.)", "88", "30", "B65","36");
insert into productos values ("CANDADO NÂ° 140 STANDARD (40 MM.)", "132", "30", "B66","36");
insert into productos values ("CANDADO NÂ° 150 STANDARD (50 MM.)", "202", "30", "B67","36");
insert into productos values ("CANDADO NÂ° 160 STANDARD (60 MM.)", "280", "30", "B68","36");
insert into productos values ("CAÃ‘ERIA DE COBRE COMBUSTIBLE", "30", "30", "B69","2");
insert into productos values ("CARCASA SOLAR  UNIVERSE", "257", "20", "B70","2");
insert into productos values ("CAUTIN ELECTRICO DE 40 W.", "340", "20", "B71","37");
insert into productos values ("CAUTIN ELECTRICO DE 50 W.", "340", "20", "B72","37");
insert into productos values ("CAUTIN ELECTRICO DE 60 W.", "341", "24", "B73","37");
insert into productos values ("CAUTIN ELECTRICO DE 75 W.", "380", "50", "B74","37");
insert into productos values ("CILINDRO", "200", "40", "B75","4");
insert into productos values ("CINCEL ACERO HEXAGONAL DE 3/4 X  8", "21", "40", "B76","38");
insert into productos values ("CINCEL ACERO HEXAGONAL DE 3/4 X 10", "46", "50", "B77","38");
insert into productos values ("CINCEL ACERO HEXAGONAL DE 3/4 X 12", "54", "60", "B78","38");
insert into productos values ("CIRCUITO ELECTRICO", "71", "20", "B79","2");
insert into productos values ("CIRCUITO INTEGRADO", "19", "40", "B80","33");
insert into productos values ("CODO DE 1/2", "140", "40", "B81","2");

/*181-200*/
insert into productos values ("COJINETE", "18", "40", "B82","8");
insert into productos values ("COMPAS EXTERIOR DE 6", "30", "50", "B83","7");
insert into productos values ("COMPAS RECTO DE 6", "50", "30", "B84","7");
insert into productos values ("CONTACTOR", "59", "60", "B85","2");
insert into productos values ("CORREA DENTADA D.13 X 1225", "52", "50", "B86","2");
insert into productos values ("CORTADOR DE CAÃ‘ERIAS DE 2 A 4", "162", "30", "B87","8");
insert into productos values ("DADO [] 1/4 DE 1/2 LARGO POLIG.", "7", "60", "B88","39");
insert into productos values ("DADO [] 1/4 DE 1/4 LARGO POLIG.", "6", "70", "B89","39");
insert into productos values ("DADO [] 1/4 DE 3/8 LARGO POLIG.", "6", "50", "B90","39");
insert into productos values ("DADO [] 1/4 DE 3/16 LARGO POLIG.", "5", "60", "B91","39");
insert into productos values ("DADO []1/2 DE 16 MM. POLIGONAL", "6", "70", "B92","39");
insert into productos values ("DADO []1/2 DE 17 MM. POLIGONAL", "6.5", "500", "B93","39");
insert into productos values ("DADO []1/2 DE 18 MM. POLIGONAL", "7", "30", "B94","39");
insert into productos values ("DESTORNILLADOR CRUZ 2 X 4 M/GOMA", "30", "50", "B95","23");
insert into productos values ("DESTORNILLADOR CRUZ 2 X 6 M/GOMA", "42", "50", "B96","23");
insert into productos values ("DESTORNILLADOR CRUZ 2 X 8 M/GOMA", "44", "50", "B97","23");
insert into productos values ("DESTORNILLADOR CRUZ 2 X 10 M/GOMA", "52", "40", "B98","23");
insert into productos values ("DESTORNILLADOR ELECTRICISTA 3/16 X 3", "32", "50", "B99","23");
insert into productos values ("DESTORNILLADOR ELECTRICISTA 3/16 X 6", "60", "60", "C1","23");
insert into productos values ("DESTORNILLADOR PLANO 1/4 X 2 M/GOMA", "26", "70", "C2","23");

/*201-220*/
insert into productos values ("DESTORNILLADOR PLANO 1/4 X 4 M/GOMA", "30", "60", "C3","23");
insert into productos values ("DESTORNILLADOR PLANO 1/4 X 6 M/GOMA", "38", "70", "C4","23");
insert into productos values ("DIFUSOR DE GAS", "68", "60", "C5","40");
insert into productos values ("DIODO", ".5", "600", "C6","2");
insert into productos values ("DISTANCIADOR", ".9", "500", "C7","8");
insert into productos values ("EJE CENTRAL", "22", "400", "C8","4");
insert into productos values ("EJE DE MANDO", "7.8", "500", "C9","8");
insert into productos values ("EJE EMBOLO", "14.7", "400", "C10","9");
insert into productos values ("EJE SALIDA", ".350", "500", "C11","22");
insert into productos values ("EJE V", "300", "200", "C12","8");
insert into productos values ("ELECTRODOS CALDERA", "200", "400", "C13","2");
insert into productos values ("EMBOLO", "200", "20", "C14","8");
insert into productos values ("EMBOLO BOMBA NEUMATICA DE ENGRASE", "34", "500", "C15","9");
insert into productos values ("EMPAQUETADURA", "102", "20", "C16","2");
insert into productos values ("EMPAQUETADURA DE GOMA", "101", "30", "C17","2");
insert into productos values ("EMPAQUETADURA DE ASBESTO", "200", "30", "C18","2");
insert into productos values ("EMPAQUETADURA DE CARCASA", "36", "20", "C19","2");
insert into productos values ("EMPUJADOR DE LA BOLA", "60", "20", "C20","3");
insert into productos values ("ENCHUFE RAPIDO MACHO 3/8 NPT", "30", "30", "C21","41");
insert into productos values ("ENCHUFE RAPIDO HEMBRA 3/8 NPT", "40", "30", "C22","41");

/*221-240*/
insert into productos values ("ENGRANAJE GRUESO", "34", "50", "C23","22");
insert into productos values ("ENGRANAJE GRUESO P/TECLE 0.5 TON.", "33", "50", "C24","22");
insert into productos values ("ENGRANAJE HELICOIDAL", "58", "40", "C25","22");
insert into productos values ("ENGRANAJE INTERMEDIO", ".939", "59", "C26","22");
insert into productos values ("ENROLLADOR", "30", "40", "C27","2");
insert into productos values ("ENTRADA AIRE GIRATORIA TORNAMESA", "18", "400", "C28","4");
insert into productos values ("ENTRADA AIRE TORNAMESA", "19", "300", "C29","4");
insert into productos values ("ENTRADA PODER CABEZAL", "40", "20", "C30","34");
insert into productos values ("ESCUADRA PLANA 100 X 70 MM.", "75", "30", "C31","5");
insert into productos values ("ESCUADRA PLANA 150 X 100 MM.", "90", "40", "C32","5");
insert into productos values ("ESCUADRA PLANA 250 X 165 MM.", "180", "20", "C33","5");
insert into productos values ("ESCUADRA PLANA 300 X 200 MM.", "232", "40", "C34","5");
insert into productos values ("ESCUADRA PLANA 400 X 250 MM.", "283", "10", "C35","5");
insert into productos values ("ESPATULA MANGO PLASTICO 2", "30", "400", "C36","23");
insert into productos values ("ESPATULA MANGO PLASTICO 3", "32", "200", "C37","23");
insert into productos values ("ESPATULA MANGO PLASTICO 4", "38", "13", "C38","23");
insert into productos values ("ESPATULA MANGO PLASTICO 5", "42", "40", "C39","23");
insert into productos values ("EXTENSION []1/2 DE 2.5", "54", "20", "C40","23");
insert into productos values ("EXTENSION []1/4 DE 3", "32", "40", "C41","39");
insert into productos values ("EXTENSION []1/4 DE 6", "36", "50", "C42","39");

/*241-260*/
insert into productos values ("EXTENSION []3/4 DE 4", "54", "20", "C43","39");
insert into productos values ("FILTRO ENTRADA", "34", "400", "C44","9");
insert into productos values ("FRENO MOTOR", "60", "200", "C45","22");
insert into productos values ("FUENTE DE PODER", "429", "20", "C46","33");
insert into productos values ("FUSIBLE 0.5 AMP", "5", "400", "C47","2");
insert into productos values ("FUSIBLE 5 X 20 2A", "6", "300", "C48","2");
insert into productos values ("GRILLETE CABLE GALVANIZADO 1", "4", "200", "C49","1");
insert into productos values ("GRILLETE CABLE GALVANIZADO 1/2", "3", "100", "C50","1");
insert into productos values ("GRILLETE CABLE GALVANIZADO 1/4", "2", "100", "C51","1");
insert into productos values ("GRILLETE CABLE GALVANIZADO 3/4", "1", "100", "C52","1");
insert into productos values ("GUARNICION", "80", "100", "C53","2");
insert into productos values ("GUIA BOLA", "34", "20", "C54","2");
insert into productos values ("GUIA DE PISTON", "44", "30", "C55","2");
insert into productos values ("HACHA CON MANGO CORTO DE 600 GR.", "60", "20", "C56","42");
insert into productos values ("HACHA CON MANGO CORTO DE 800 GR.", "70", "40", "C57","42");
insert into productos values ("HACHA CON MANGO CORTO DE 1.000 GR.", "140", "20", "C58","42");
insert into productos values ("HACHA CON MANGO LARGO DE 1.250 GR.", "320", "30", "C59","42");
insert into productos values ("HAMMER", "400", "20", "C60","12");
insert into productos values ("HILO ENTRADA DE AGUA", "30", "30", "C61","2");
insert into productos values ("HILO SALIDA MANGUERA PRESION", "40", "40", "C62","2");

/*261-280*/
insert into productos values ("HOJA SIERRA PARA ARCO MADERA DE 24", "38", "40", "C63","7");
insert into productos values ("HOJA SIERRA PARA ARCO MADERA DE 30", "42", "50", "C64","7");
insert into productos values ("HOJA SIERRA PARA ARCO MADERA DE 36", "44", "50", "C65","7");
insert into productos values ("INTERRUPTOR", "30", "50", "C66","4");
insert into productos values ("INTERRUPTOR 220V-110V", "22", "400", "C67","8");
insert into productos values ("INTERRUPTOR BIPOLAR 16A", "10", "200", "C68","2");
insert into productos values ("LETRA DE ZINC PARA PINTAR DE 30 MM.", "34", "20", "C69","7");
insert into productos values ("LETRA DE ZINC PARA PINTAR DE 40 MM.", "42", "20", "C70","7");
insert into productos values ("LETRA DE ZINC PARA PINTAR DE 50 MM.", "50", "20", "C71","7");
insert into productos values ("LETRA DE ZINC PARA PINTAR DE 60 MM.", "60", "20", "C72","7");
insert into productos values ("LIJA AL AGUA EN PLIEGO NÂº 80", "56", "20", "C73","2");
insert into productos values ("LIJA AL AGUA EN PLIEGO NÂº100", "56", "20", "C74","2");
insert into productos values ("LIJA AL AGUA EN PLIEGO NÂº150", "56", "20", "C75","2");
insert into productos values ("LIJA AL AGUA EN PLIEGO NÂº200", "56", "20", "C76","2");
insert into productos values ("LIJA AL AGUA EN PLIEGO NÂº260", "56", "20", "C77","2");
insert into productos values ("LIJA ESMERIL EN PLIEGO NÂº 0 (120)", "78", "20", "C78","2");
insert into productos values ("LIJA ESMERIL EN PLIEGO NÂº 1 (100)", "78", "20", "C79","2");
insert into productos values ("LIJA ESMERIL EN PLIEGO NÂº 2 (60)", "78", "20", "C80","2");
insert into productos values ("LIJA MADERA EN PLIEGO NÂº 0", "38", "20", "C81","2");
insert into productos values ("LIJA MADERA EN PLIEGO NÂº 1", "38", "20", "C82","2");

/*281-300*/
insert into productos values ("LIJA MADERA EN PLIEGO NÂº 2", "38", "20", "C83","2");
insert into productos values ("LLAVE CORONA IMPACTO 1", "36", "40", "C84","39");
insert into productos values ("LLAVE CORONA IMPACTO 2", "78", "35", "C85","39");
insert into productos values ("LLAVE CORONA IMPACTO 3", "156", "30", "C86","39");
insert into productos values ("LLAVE CORONA-CORONA 6X7 MM.", "12", "30", "C87","39");
insert into productos values ("LLAVE CORONA-CORONA 8X9 MM.", "12", "30", "C88","39");
insert into productos values ("LLAVE ESTRUCTURAL DE COLA DE 1", "26", "20", "C89","39");
insert into productos values ("LLAVE ESTRUCTURAL DE COLA DE 3/4", "19", "40", "C90","39");
insert into productos values ("LLAVE ESTRUCTURAL DE COLA DE 5/8", "16", "30", "C91","39");
insert into productos values ("LLAVE ESTRUCTURAL DE COLA DE 7/8", "26", "30", "C92","39");
insert into productos values ("LLAVE FRANCESA DE 4 CROMADA", "17", "20", "C93","39");
insert into productos values ("LLAVE FRANCESA DE 4 FOSFATADA", "15.5", "30", "C94","39");
insert into productos values ("LLAVE FRANCESA DE 6 CROMADA", "18", "34", "C95","39");
insert into productos values ("LLAVE FRANCESA DE 6 FOSFATADA", "16.1", "40", "C96","39");
insert into productos values ("LLAVE PUNTA-CORONA 6 MM.", "9", "30", "C97","39");
insert into productos values ("LLAVE PUNTA-CORONA 7 MM.", "9.6", "50", "C98","39");
insert into productos values ("LLAVE PUNTA-CORONA 8 MM.", "10", "40", "C99","39");
insert into productos values ("LLAVE PUNTA-CORONA 9 MM.", "11", "60", "D1","39");
insert into productos values ("LLAVE PUNTA-PUNTA 1/2X9/16", "10.5", "30", "D2","39");
insert into productos values ("LLAVE PUNTA-PUNTA 1/4X5/16", "10", "40", "D3","39");

/*301-320*/
insert into productos values ("LLAVE STILLSON BOCA RECTA DE 8", "64", "60", "D4","23");
insert into productos values ("LLAVE STILLSON BOCA RECTA DE 10", "120", "40", "D5","23");
insert into productos values ("LLAVE STILLSON BOCA RECTA DE 12", "160", "30", "D6","23");
insert into productos values ("LLAVE STILLSON BOCA RECTA DE 14", "220", "40", "D7","23");
insert into productos values ("LLAVE STILLSON BOCA RECTA DE 18", "300", "50", "D8","23");
insert into productos values ("LLAVE STILLSON BOCA RECTA DE 24", "350", "40", "D9","23");
insert into productos values ("LLAVE STILLSON BOCA RECTA DE 36", "420", "50", "D10","23");
insert into productos values ("LLAVE TORQUE []1 DE 200 A 1000 LB/PIE", "1686", "11", "D11","39");
insert into productos values ("LLAVE TORQUE []1 DE 400 A 2000 LB/PIE", "2878", "11", "D12","39");
insert into productos values ("MACETA PLASTICA DE 27 MM.", "20", "40", "D13","7");
insert into productos values ("MACETA PLASTICA DE 32 MM.", "32", "50", "D14","7");
insert into productos values ("MACETA PLASTICA DE 35 MM.", "44", "20", "D15","7");
insert into productos values ("MACETA PLASTICA DE 40 MM.", "50", "30", "D16","7");
insert into productos values ("MACETA PLASTICA DE 50 MM.", "70", "20", "D17","7");
insert into productos values ("MACETA PLASTICA DE 60 MM.", "100", "40", "D18","7");
insert into productos values ("MANGO DE AGARRE", "54", "20", "D19","2");
insert into productos values ("MANGO LANZA PULSAR-DIAMANT", "17", "20", "D20","2");
insert into productos values ("MANGO LANZA SUPER-MIKI", "19", "20", "D21","2");
insert into productos values ("MANGO PARA SUJETAR CINCELES", "40", "200", "D22","39");
insert into productos values ("MANGUITO", "40", "200", "D23","2");

/*321-340*/
insert into productos values ("MANIVELA", "60", "30", "D24","22");
insert into productos values ("MARTILLO CARPINTERO DE 18 MM.", "80", "40", "D25","23");
insert into productos values ("MARTILLO CARPINTERO DE 23 MM.", "100.4", "50", "D26","23");
insert into productos values ("MARTILLO CARPINTERO DE 27 MM.", "130", "30", "D27","23");
insert into productos values ("MARTILLO CARPINTERO DE 29 MM.", "140", "50", "D28","23");
insert into productos values ("MARTILLO CARPINTERO M/METAL 27 MM.", "150", "60", "D29","23");
insert into productos values ("MARTILLO MECANICO DE 1 LB.", "100.2", "30", "D30","23");
insert into productos values ("MARTILLO MECANICO DE 2 LB.", "130.2", "30", "D31","23");
insert into productos values ("MARTILLO MECANICO DE 1/2 LB.", "80.4", "20", "D32","23");
insert into productos values ("MARTILLO MECANICO DE 3/4 LB.", "80.8", "35", "D33","23");
insert into productos values ("MARTILLO PLASTICO DE 14 ONZAS (400GRS)", "100", "40", "D34","23");
insert into productos values ("MARTILLO PLASTICO DE 18 ONZAS (510GRS)", "120", "40", "D35","23");
insert into productos values ("MARTILLO PLASTICO DE 18 ONZAS (550GRS)", "140", "50", "D36","23");
insert into productos values ("MARTILLO PLASTICO DE 21 ONZAS (600GRS)", "160", "20", "D37","23");
insert into productos values ("MARTILLO PLASTICO DE 42 ONZAS (1190GR)", "180", "50", "D38","23");
insert into productos values ("MEDIDOR DE ACEITE", "120", "30", "D39","2");
insert into productos values ("METRO DE MANGUERA DE DETERGENTE", "40", "50", "D40","2");
insert into productos values ("MOTOR ELECTRICO 24 V P/LAVA PAVIMENTO", "319.23", "60", "D41","2");
insert into productos values ("MOTOR ELECTRICO 3.5 HP-380 V", "488.73", "20", "D42","2");
insert into productos values ("MOTOR HIDROLAVADORA 3HP-220V", "775.99", "40", "D43","2");

/*341-360*/
insert into productos values ("MOTOR MONOFASICO DE 3 HP", "592.5", "60", "D44","2");
insert into productos values ("MOTOR QUEMADOR 110V", "239.91", "60", "D45","2");
insert into productos values ("MUELLE D 4.3 X 11 X 7.3", "22", "40", "D46","2");
insert into productos values ("MUELLE D 7.6 X 29 44", "72", "20", "D47","2");
insert into productos values ("MUELLE D 9.4 X 14 IP", "40", "50", "D48","2");
insert into productos values ("MUELLE D 18.5 X 11 44", "36", "39", "D49","2");
insert into productos values ("MUELLE D 8.0 X 24", "50", "60", "D50","2");
insert into productos values ("MUELLE D.10 X 46.5 X 1.5 T.300", "62", "50", "D51","2");
insert into productos values ("NAPOLEON CORTE REDONDO DE 14", "18.60", "60", "D52","23");
insert into productos values ("NAPOLEON CORTE REDONDO DE 18", "23.90", "70", "D53","23");
insert into productos values ("NAPOLEON CORTE REDONDO DE 24", "31.26", "20", "D54","23");
insert into productos values ("NAPOLEON CORTE REDONDO DE 30", "42.77", "40", "D55","23");
insert into productos values ("NAPOLEON CORTE REDONDO DE 36", "70.38", "50", "D56","23");
insert into productos values ("PALANCA DE REVERSA PARA PT4072", "20", "60", "D57","12");
insert into productos values ("PALANCA DE REVERSA PARA PT407H", "10", "50", "D58","12");
insert into productos values ("PALANCA DE VALVULA DE ADMISION PT388", "17", "70", "D59","12");
insert into productos values ("PALANCA DEL GATILLO PARA PT013", "12", "60", "D60","12");
insert into productos values ("PALANCA DEL PASADOR PARA PT103", "15", "50", "D61","12");
insert into productos values ("PANEL CON DISPLAY", "61", "20", "D62","4");
insert into productos values ("PANEL DE CONTROL CB 953", "45.21", "40", "D63","4");

/*361-380*/
insert into productos values ("PELOTA DE FLOTADOR", "80", "20", "D64","2");
insert into productos values ("PERILLA REGULACION", "36", "20", "D65","2");
insert into productos values ("PERILLA REGULADOR PRESION", "49", "30", "D66","2");
insert into productos values ("PERNO ALLEN 5 X 6 MM", "20", "40", "D67","2");
insert into productos values ("PERNO ALLEN 5 X 6 MM VALVULA VAPOR", "24", "50", "D68","2");
insert into productos values ("PERNO ALLEN 6 X 18", "20", "60", "D69","2");
insert into productos values ("PERNO LATERAL CARCASA", "30", "30", "D70","2");
insert into productos values ("PICAPORTE 106A ACHAROLADO 40 MM", "10", "60", "D71","17");
insert into productos values ("PICAPORTE 106A ACHAROLADO 50 MM", "12", "77", "D72","17");
insert into productos values ("PICAPORTE 106A ACHAROLADO 60 MM", "14", "80", "D73","17");
insert into productos values ("PICAPORTE 106A ACHAROLADO 70 MM", "16", "30", "D74","17");
insert into productos values ("PICAPORTE 106A ACHAROLADO 80 MM", "18", "50", "D75","17");
insert into productos values ("PICAPORTE 106A ACHAROLADO 100 MM", "20", "60", "D76","17");
insert into productos values ("PICAPORTE SOBREPUESTO BRONCE 300 MM", "22", "40", "D77","17");
insert into productos values ("PICAPORTE SOBREPUESTO BRONCE 400 MM", "24", "50", "D78","17");
insert into productos values ("PICAPORTE SOBREPUESTO BRONCE 500 MM", "26", "70", "D79","17");
insert into productos values ("PINZA DE APRETE RAPIDO 0-1", "22", "40", "D80","19");
insert into productos values ("POLEA", "32", "40", "D81","4");
insert into productos values ("PUNTA CRUZ PHILLIPS INDUSTRIAL PH0 X 25M", "30", "50", "D82","43");
insert into productos values ("PUNTA CRUZ PHILLIPS INDUSTRIAL PH0X50MM.", "40", "60", "D83","43");

/*381-400*/
insert into productos values ("PUNTA CRUZ PHILLIPS INDUSTRIAL PH1 X 25M", "40", "20", "D84","43");
insert into productos values ("PUNTA PLANA INDSUTRIAL 6,0 X 25 MM", "30", "50", "D85","43");
insert into productos values ("PUNTA PLANA INDUSTRIAL 3,0 X 25 MM", "25", "60", "D86","43");
insert into productos values ("PUNTA PLANA INDUSTRIAL 4,0 X 25 MM", "30", "25", "D87","43");
insert into productos values ("PUNTA PLANA INDUSTRIAL 5,0 X 25 MM", "35", "40", "D88","43");
insert into productos values ("PUNTA TORX INDUSTRIAL T10 X 25 MM", "30", "50", "D89","43");
insert into productos values ("PUNTA TORX INDUSTRIAL T10 X 50 MM", "32", "60", "D90","43");
insert into productos values ("PUNTA TORX INDUSTRIAL T15 X 25 MM", "35", "30", "D91","43");
insert into productos values ("PUNTA TORX INDUSTRIAL T15 X 50 MM", "40", "20", "D92","43");
insert into productos values ("PUNTA TORX TIATNIO T25 X 25 MM", "22", "30", "D93","43");
insert into productos values ("PUNTA TORX TITANIO T10 X 25 MM", "30", "20", "D94","43");
insert into productos values ("PUNTA TORX TITANIO T20 X 25 MM", "35", "23", "D95","43");
insert into productos values ("RESISTENCIA 220 OHM 1 W", "2", "500", "D96","33");
insert into productos values ("RESISTENCIA DE 495/01", "5", "200", "D97","33");
insert into productos values ("RESORTE", "8", "200", "D98","33");
insert into productos values ("ROLDANA CABLE TRIPLE DE 3", "6", "200", "D99","18");
insert into productos values ("ROLDANA CABLE TRIPLE DE 4", "7", "200", "C1","18");
insert into productos values ("ROLDANA CABLE TRIPLE DE 5", "8", "100", "C2","18");
insert into productos values ("ROLDANA CABLE TRIPLE DE 6", "9", "100", "C3","18");
insert into productos values ("SELLO BOMBA MOTOR IP W15 ZT", "22", "20", "C4","2");

/*401-420*/
insert into productos values ("SELLO CONEXION BOMBA-MOTOR", "25", "40", "C5","2");
insert into productos values ("SELLO METALICO", "30", "20", "C6","2");
insert into productos values ("SENSOR DE ANGULO", "7.7", "40", "C7","4");
insert into productos values ("SENSOR DE GIRO", "37.17", "50", "C8","4");
insert into productos values ("SENSOR P/BALANCEADORA", "37.17", "60", "C9","4");
insert into productos values ("SERRUCHO PROFESIONAL DE 18 8 DTS.", "200", "30", "C10","23");
insert into productos values ("SERRUCHO PROFESIONAL DE 20 8 DTS.", "210", "30", "C11","23");
insert into productos values ("SERRUCHO PROFESIONAL DE 22 8 DTS.", "230", "40", "C12","23");
insert into productos values ("TORNILLO HUECO 3/8", "6", "400", "C13","2");
insert into productos values ("TORNILLO M 5 X 0.8 X 7.5", "3", "200", "C14","2");
insert into productos values ("TORNILLO MECANICO CON YUNQUE DE 3", "7", "200", "C15","23");
insert into productos values ("TORNILLO MECANICO CON YUNQUE DE 4", "8", "100", "C16","23");
insert into productos values ("TORNILLO MECANICO CON YUNQUE DE 5", "8.5", "50", "C17","23");
insert into productos values ("TORNILLO MECANICO CON YUNQUE DE 6", "9", "40", "C18","23");
insert into productos values ("TORNILLO MECANICO CON YUNQUE DE 8", "10", "40", "C19","23");
insert into productos values ("TORNILLO MECANICO SIN YUNQUE DE 3", "4", "30", "C20","23");
insert into productos values ("TORNILLO MECANICO SIN YUNQUE DE 4", "5", "20", "C21","23");
insert into productos values ("TORNILLO MECANICO SIN YUNQUE DE 5", "6", "50", "C22","23");
insert into productos values ("TORNILLO MECANICO SIN YUNQUE DE 6", "6.5", "60", "C23","23");
insert into productos values ("TORNILLO MECANICO SIN YUNQUE DE 8", "7", "60", "C24","23");

insert into AdminUsu values ("MOJI941115HDFNSR07","Iram Moncada Jasso","","","Administrador","","darkwatch_zero16@hotmail.com","admin","2pvf5MNzQww=",NULL,NULL);
insert into AdminUsu values ("SAGL969496HDFSRS04","Sastre Garcia Luis Enrique","Av Te n45","57415468","Vendedor","Matutino","luis.6496@hotmail.com","LuGa","2pvf5MNzQww=",NULL,NULL);
insert into AdminUsu values ("EARJ950927MDFSBS09","Estrada Robreño Jessica Lissette","Av Te n45","57415468","Vendedor","Vespertino","jess_270995@hotmail.com","laJess","2pvf5MNzQww=",NULL,NULL);

ALTER TABLE productos add foreign key (id_proveedores) references proveedores(id_proveedores) on DELETE CASCADE;
ALTER TABLE almacen add foreign key (producto) references productos(nombre);