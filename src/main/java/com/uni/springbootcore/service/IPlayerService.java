package com.uni.springbootcore.service;

import com.uni.springbootcore.entity.PlayerT;

import java.util.List;
import java.util.Optional;

public interface IPlayerService {
    List<PlayerT> getEveryPlayers();
    Optional<PlayerT> getPlayerById(int id);
    void savePlayer(PlayerT player);
}
