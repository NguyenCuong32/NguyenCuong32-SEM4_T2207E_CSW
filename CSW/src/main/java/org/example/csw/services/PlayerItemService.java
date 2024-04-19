package org.example.csw.services;

import lombok.RequiredArgsConstructor;
import org.example.csw.models.PlayerItem;
import org.example.csw.repositories.PlayerItemRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerItemService {
    private final PlayerItemRepository playerItemRepository;
    public void insertPlayerItem(PlayerItem playerItem) {
        playerItemRepository.save(playerItem);
    }
}
