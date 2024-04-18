package com.example.demoapi.services;

import com.example.demoapi.entity.players;
import com.example.demoapi.repository.playerRepository;
import org.springframework.stereotype.Service;

@Service
public class playerservice {
    private final playerRepository playerRepository;

    public playerservice(com.example.demoapi.repository.playerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public players addplayer(players player){
       return playerRepository.save(player);
    }

}
