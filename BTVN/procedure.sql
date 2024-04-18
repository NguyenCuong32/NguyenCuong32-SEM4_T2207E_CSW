DROP PROCEDURE IF EXISTS getallplayerinfo;
 
CREATE PROCEDURE getallplayerinfo()
BEGIN
SELECT
		 UUID() as id,
          a.player_id,
          b.player_name,
          b.player_national,
         c.item_name,
         c.price,
         d.item_type_name
         FROM player_item_t a
         INNER JOIN  player_t b ON a.player_id = b.player_id
         INNER JOIN item_t c ON a.item_id = c.item_id
         left JOIN item_type_t d on c.item_type_id = d.item_type_id;
END;

CALL getallplayerinfo();