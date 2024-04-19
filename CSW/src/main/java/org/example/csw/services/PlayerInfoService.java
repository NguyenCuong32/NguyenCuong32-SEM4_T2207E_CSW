package org.example.csw.services;

import lombok.RequiredArgsConstructor;
import org.example.csw.models.Player;
import org.example.csw.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerInfoService {
    private final PlayerRepository playerRepository;

    public List<Player> getPlayerInfo() {
        return playerRepository.findAll();
    }
}
