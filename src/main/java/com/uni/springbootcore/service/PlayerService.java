package com.uni.springbootcore.service;

import com.uni.springbootcore.dao.IPlayerRepository;
import com.uni.springbootcore.entity.PlayerT;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlayerService implements IPlayerService{
    private final IPlayerRepository playerRepository;

    public PlayerService(IPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<PlayerT> getEveryPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Optional<PlayerT> getPlayerById(int id) {
        return playerRepository.findById(id);
    }

    @Override
    public void savePlayer(PlayerT player) {
        playerRepository.save(player);
    }
}
