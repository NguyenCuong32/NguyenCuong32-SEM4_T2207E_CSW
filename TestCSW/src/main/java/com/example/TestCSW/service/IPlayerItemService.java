package com.example.TestCSW.service;

import com.example.TestCSW.dto.PlayerInforDTO;
import com.example.TestCSW.entity.PlayerItem;

import java.util.List;

public interface IPlayerItemService {
    List<PlayerInforDTO> GetAllPlayerInformation();
    void PlayerBuyItem(String itemId, Integer playerId);
}