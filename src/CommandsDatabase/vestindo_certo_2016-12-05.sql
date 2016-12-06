# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.6.32)
# Database: vestindo_certo
# Generation Time: 2016-12-05 20:01:36 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table clima
# ------------------------------------------------------------

DROP TABLE IF EXISTS `clima`;

CREATE TABLE `clima` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `clima` WRITE;
/*!40000 ALTER TABLE `clima` DISABLE KEYS */;

INSERT INTO `clima` (`id`, `nome`)
VALUES
	(1,'Sol'),
	(2,'Chuva'),
	(3,'Nublado'),
	(4,'Seco');

/*!40000 ALTER TABLE `clima` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table evento
# ------------------------------------------------------------

DROP TABLE IF EXISTS `evento`;

CREATE TABLE `evento` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;

INSERT INTO `evento` (`id`, `nome`)
VALUES
	(1,'Faculdade'),
	(2,'Trabalho'),
	(3,'Festa'),
	(4,'Balada'),
	(5,'Casamento'),
	(6,'Academia');

/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table local
# ------------------------------------------------------------

DROP TABLE IF EXISTS `local`;

CREATE TABLE `local` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `local` WRITE;
/*!40000 ALTER TABLE `local` DISABLE KEYS */;

INSERT INTO `local` (`id`, `nome`)
VALUES
	(1,'Urbano'),
	(2,'Rural');

/*!40000 ALTER TABLE `local` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table look
# ------------------------------------------------------------

DROP TABLE IF EXISTS `look`;

CREATE TABLE `look` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_clima` tinyint(4) NOT NULL,
  `fk_evento` tinyint(4) NOT NULL,
  `fk_local` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table look_roupa
# ------------------------------------------------------------

DROP TABLE IF EXISTS `look_roupa`;

CREATE TABLE `look_roupa` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_look` smallint(6) NOT NULL,
  `fk_roupa` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table roupa
# ------------------------------------------------------------

DROP TABLE IF EXISTS `roupa`;

CREATE TABLE `roupa` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `imagem` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `descricao` text COLLATE utf8_unicode_ci,
  `fk_clima` tinyint(4) NOT NULL,
  `fk_evento` tinyint(4) NOT NULL,
  `fk_local` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table usuario
# ------------------------------------------------------------

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `senha` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;

INSERT INTO `usuario` (`id`, `nome`, `email`, `senha`)
VALUES
	(1,'Ricardo Mota','ricardo.hb@outlook.com','123456'),
	(2,'Teste','teste@teste.com','123456'),
	(3,'ricmota','',''),
	(4,'','',''),
	(5,'Rica','ric.mail','123');

/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table usuario_look
# ------------------------------------------------------------

DROP TABLE IF EXISTS `usuario_look`;

CREATE TABLE `usuario_look` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_usuario` smallint(6) NOT NULL,
  `fk_look` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table usuario_roupa
# ------------------------------------------------------------

DROP TABLE IF EXISTS `usuario_roupa`;

CREATE TABLE `usuario_roupa` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_roupa` smallint(6) NOT NULL,
  `fk_usuario` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
