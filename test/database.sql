DROP DATABASE IF EXISTS `csw_test`;

CREATE DATABASE `csw_test`;

SET default_storage_engine=INNODB;

USE `csw_test`;

CREATE TABLE item_type_t (
	item_type_id INT AUTO_INCREMENT NOT NULL,
	item_type_name VARCHAR(50),
	PRIMARY KEY (item_type_id)
);

CREATE TABLE item_t (
	item_id VARCHAR(10) NOT NULL,
	item_name VARCHAR(120),
	item_type_id INT,
	price DECIMAL(21, 6),
	PRIMARY KEY (item_id),
	CONSTRAINT FK_ItemTable_ItemTypeTable FOREIGN KEY (item_type_id) REFERENCES item_type_t (item_type_id)
);

CREATE TABLE player_t (
	player_id INT AUTO_INCREMENT NOT NULL,
	player_name VARCHAR(120),
	player_national VARCHAR(50),
	PRIMARY KEY (player_id)
);

CREATE TABLE player_item_t (
	item_id VARCHAR(10) NOT NULL,
	player_id INT NOT NULL,
	PRIMARY KEY (item_id, player_id),
	CONSTRAINT FK_PlayerItem_ItemTable FOREIGN KEY (item_id) REFERENCES
	item_t (item_id),
	CONSTRAINT FK_PlayerItem_PlayerTable FOREIGN KEY (player_id) REFERENCES player_t (player_id)
);

INSERT INTO item_type_t (item_type_name) VALUES ('Attach'), ('Defense');

INSERT INTO item_t (item_id, item_name, item_type_id, price) VALUES
(1, 'Sword', 1, 12),
(2, 'Shield', 2, 7),
(3, 'Bomb', 1, 3),
(4, 'Potion', 2, 5);

INSERT INTO player_t (player_id, player_name, player_national) VALUES
(1, 'John Doe', 'USA'),
(2, 'Chandler Bing', 'UK'),
(3, 'Jessie John', 'Canada');

INSERT INTO player_item_t (item_id, player_id) VALUES
(1, 1), (2, 1), (3, 1),
(2, 2), (3, 2), (4, 2);


DROP PROCEDURE IF EXISTS `get_all_player_info`;
DELIMITER //
CREATE PROCEDURE `get_all_player_info` ()
BEGIN
    SELECT 
		p.*,
        i.item_name,
        i.price,
        t.item_type_name
    FROM `player_t` p
    LEFT JOIN `player_item_t` pi ON p.player_id = pi.player_id
    LEFT JOIN `item_t` i ON pi.item_id = i.item_id
    LEFT JOIN `item_type_t` t ON i.item_type_id = t.item_type_id;
END //
DELIMITER ;

CALL get_all_player_info();


