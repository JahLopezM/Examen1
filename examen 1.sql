CREATE DATABASE Evento;
use Eventos;

CREATE TABLE `Artista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `artista` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `concierto` VALUES (1,'Eminem'),(2,'Dua Lipa'),(3,'Shakira'),(4,'J balvin'),(5,'BadBunny');

CREATE TABLE `Datos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `costo` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `capacidad` varchar(45) NOT NULL,
  `lugar` varchar(45) NOT NULL,
  `artista_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`Artista_id`),
  KEY `fk_datos_artista_idx` (`artista_id`),
  CONSTRAINT `fk_datos_Artista_idx` FOREIGN KEY (`Artista_id`) REFERENCES `Artista` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;

INSERT INTO `datos` VALUES (1,'25000','22/07','120','heredia',1);
INSERT INTO `datos` VALUES (2,'50000','13/02','456','San Jose',3);
INSERT INTO `datos` VALUES (3,'70000','16/12','800','Panama',5);

