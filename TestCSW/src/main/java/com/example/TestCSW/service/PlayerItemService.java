package com.example.TestCSW.service;

import com.example.TestCSW.dto.PlayerInforDTO;
import com.example.TestCSW.entity.PlayerItem;
import com.example.TestCSW.repository.IPlayerItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerItemService implements IPlayerItemService{
    private final IPlayerItemRepository playerItemRepository;

    @Autowired
    public PlayerItemService(IPlayerItemRepository playerItemRepository) {
        this.playerItemRepository = playerItemRepository;
    }

    @Transactional
    @Override
    public List<PlayerInforDTO> GetAllPlayerInformation() {
        List<Object[]> resultList = playerItemRepository.GetAllPlayerInfor();

        return resultList.stream()
                .map(result -> {
                    PlayerInforDTO playerInforDTO = new PlayerInforDTO();
                    playerInforDTO.setPlayerId((Integer) result[0]);
                    playerInforDTO.setPlayerName((String) result[1]);
                    playerInforDTO.setPlayerNational((String) result[2]);
                    playerInforDTO.setItemName((String) result[3]);
                    playerInforDTO.setPrice((BigDecimal) result[4]);
                    playerInforDTO.setItemTypeName((String) result[5]);
                    return playerInforDTO;
                })
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public void PlayerBuyItem(String itemId, Integer playerId) {
        playerItemRepository.PlayerBuyItem(itemId,playerId);
    }
}
