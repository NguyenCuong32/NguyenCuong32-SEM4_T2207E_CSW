package org.example.csw.services;

import lombok.RequiredArgsConstructor;
import org.example.csw.models.Player;
import org.example.csw.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    public void insertPlayer(Player player) {
        playerRepository.save(player);
    }
}
