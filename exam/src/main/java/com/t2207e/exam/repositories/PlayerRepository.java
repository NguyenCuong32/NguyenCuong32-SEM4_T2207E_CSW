package com.t2207e.exam.repositories;

import com.t2207e.exam.dtos.PlayerBuyItemDTO;
import com.t2207e.exam.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    @Query(value = "select new com.t2207e.exam.dtos.PlayerBuyItemDTO( " +
            "   p.playerId, " +
            "   p.playerName, " +
            "   p.playerNational," +
            "   i.itemName," +
            "   i.price," +
            "   it.itemTypeName" +
            ")" +
            "from Player p " +
            " inner join PlayerItem pi on pi.playerId = p.playerId" +
            " inner join Item i on i.itemId = pi.itemId" +
            " inner join ItemType it on it.itemTypeId = i.itemType.itemTypeId" +


            " ORDER BY p.playerId DESC")
    List<PlayerBuyItemDTO> getPlayerByItem();

}
