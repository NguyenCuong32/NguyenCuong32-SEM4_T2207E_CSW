CREATE PROCEDURE GetAllPlayerInfor()
BEGIN
    SELECT p.player_id, p.player_name, p.player_national, i.item_name, i.price, ii.item_type_name FROM player_item_t pi
    INNER JOIN item_t i ON pi.item_id = i.item_id
    INNER JOIN player_t p ON pi.player_id = p.player_id
    INNER JOIN item_type_t ii ON i.item_type_id = ii.item_type_id;
END

CREATE PROCEDURE PlayerBuyItem(IN itemId VARCHAR(20), IN playerId INT)
BEGIN
    INSERT INTO player_item_t(item_id, player_id) VALUE (itemId, playerId);
END