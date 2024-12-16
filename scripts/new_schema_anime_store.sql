create database anime_store;

-- anime_store.producer definition
CREATE TABLE `producer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `date_to` timestamp NOT NULL,
  PRIMARY KEY (`id`)
);

-- anime_store.anime definition
CREATE TABLE `anime` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(300) NOT NULL,
  `episodes` int NOT NULL,
  `date_to` timestamp NOT NULL,
  `producer_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `anime_producer_FK` (`producer_id`),
  CONSTRAINT `anime_producer_FK` FOREIGN KEY (`producer_id`) REFERENCES `producer` (`id`)
);