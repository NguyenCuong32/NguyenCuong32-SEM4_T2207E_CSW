package com.example.TestCSW.repository;

import com.example.TestCSW.dto.PlayerInforDTO;
import com.example.TestCSW.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPlayerRepository extends JpaRepository<Player,Integer> {
    List<PlayerInforDTO> GetAllPlayerInformation();
    void PlayerBuyItem(String itemId, Integer playerId);
}
