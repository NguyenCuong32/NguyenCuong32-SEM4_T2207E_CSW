package com.fai.api.university.service;

import com.fai.api.university.entity.Player;
import com.fai.api.university.rest.IPlayerReponsitory;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PlayerService implements IPlayerService{
    private final IPlayerReponsitory playerRepository;

    @Autowired
    public PlayerService(IPlayerReponsitory playerRepository) {
        this.playerRepository = playerRepository;
    }
    @Transactional
    @Override
    public void save(Player player) {
        playerRepository.save(player);
    }
}
