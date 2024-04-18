INSERT INTO item_t (item_id ,item_name ,item_type_id,price) 
VALUES ('no1', 'Hero 1', 1, 5.00),('no2', 'Hero 2', 2, 6.00)

INSERT INTO player_t (player_name ,player_national ) 
VALUES ('nguyen', 'Viet Nam'),('ken', 'japan')

INSERT INTO player_item_t (item_id ,player_id ) 
VALUES ('no1', 1),('no2', 2)