package com.example.TestCSW.service;

import com.example.TestCSW.entity.Player;
import com.example.TestCSW.repository.IPlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService implements IPlayerService{
    private final IPlayerRepository playerRepository;

    @Autowired
    public PlayerService(IPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Transactional
    @Override
    public void save(Player player) {
        playerRepository.save(player);
    }
}
