-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.14 - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para vestindo_certo
CREATE DATABASE IF NOT EXISTS `vestindo_certo` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `vestindo_certo`;

-- Copiando estrutura para tabela vestindo_certo.clima
CREATE TABLE IF NOT EXISTS `clima` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.clima: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `clima` DISABLE KEYS */;
INSERT INTO `clima` (`id`, `nome`) VALUES
	(1, 'Sol'),
	(2, 'Chuva'),
	(3, 'Nublado'),
	(4, 'Seco');
/*!40000 ALTER TABLE `clima` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.evento
CREATE TABLE IF NOT EXISTS `evento` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.evento: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
INSERT INTO `evento` (`id`, `nome`) VALUES
	(1, 'Faculdade'),
	(2, 'Trabalho'),
	(3, 'Festa'),
	(4, 'Balada'),
	(5, 'Casamento'),
	(6, 'Academia');
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.local
CREATE TABLE IF NOT EXISTS `local` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.local: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `local` DISABLE KEYS */;
INSERT INTO `local` (`id`, `nome`) VALUES
	(1, 'Urbano'),
	(2, 'Rural');
/*!40000 ALTER TABLE `local` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.look
CREATE TABLE IF NOT EXISTS `look` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_clima` tinyint(4) NOT NULL,
  `fk_evento` tinyint(4) NOT NULL,
  `fk_local` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.look: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `look` DISABLE KEYS */;
/*!40000 ALTER TABLE `look` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.look_roupa
CREATE TABLE IF NOT EXISTS `look_roupa` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_look` smallint(6) NOT NULL,
  `fk_roupa` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.look_roupa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `look_roupa` DISABLE KEYS */;
/*!40000 ALTER TABLE `look_roupa` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.roupa
CREATE TABLE IF NOT EXISTS `roupa` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `imagem` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `descricao` text COLLATE utf8_unicode_ci,
  `fk_clima` tinyint(4) NOT NULL,
  `fk_evento` tinyint(4) NOT NULL,
  `fk_local` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.roupa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `roupa` DISABLE KEYS */;
/*!40000 ALTER TABLE `roupa` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `emal` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.usuario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.usuario_look
CREATE TABLE IF NOT EXISTS `usuario_look` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_usuario` smallint(6) NOT NULL,
  `fk_look` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.usuario_look: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario_look` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_look` ENABLE KEYS */;

-- Copiando estrutura para tabela vestindo_certo.usuario_roupa
CREATE TABLE IF NOT EXISTS `usuario_roupa` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `fk_roupa` smallint(6) NOT NULL,
  `fk_usuario` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela vestindo_certo.usuario_roupa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario_roupa` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_roupa` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
