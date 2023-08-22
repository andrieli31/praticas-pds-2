DROP DATABASE banco_teste;

CREATE DATABASE banco_teste;
USE banco_teste;

CREATE TABLE IF NOT EXISTS `pessoa` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `primeiro_nome` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  PRIMARY KEY (`id`)
);