package com.fai.api.university.service;

import com.fai.api.university.entity.Player;

import java.util.List;

public interface IPlayerItemService {
    List<Player> GetAllPlayerInformation();
    void PlayerBuyItem(String itemId, Integer playerId);
}
