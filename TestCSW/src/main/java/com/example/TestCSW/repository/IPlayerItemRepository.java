package com.example.TestCSW.repository;

import com.example.TestCSW.dto.PlayerInforDTO;
import com.example.TestCSW.entity.PlayerItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPlayerItemRepository extends JpaRepository<PlayerItem, PlayerItem.PlayerItemId> {

    @Procedure(name = "GetAllPlayerInformation")
    List<Object[]> GetAllPlayerInfor();
    @Procedure(name = "PlayerBuyItem")
    void PlayerBuyItem(@Param("itemId") String itemId, @Param("playerId") Integer playerId);

}