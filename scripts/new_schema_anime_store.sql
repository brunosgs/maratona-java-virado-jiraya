create database anime_store;

CREATE TABLE anime_store.producer (
	id INT auto_increment NOT NULL,
	name varchar(255) NOT NULL,
	CONSTRAINT producer_pk PRIMARY KEY (id)
);

CREATE TABLE anime_store.anime (
	id INT auto_increment NOT NULL,
	name varchar(300) NOT NULL,
	episodes INT NOT NULL,
	producer_id INT NOT NULL,
	CONSTRAINT anime_pk PRIMARY KEY (id),
	CONSTRAINT anime_producer_FK FOREIGN KEY (producer_id) REFERENCES anime_store.producer(id)
);