package org.example.game.service;

import lombok.RequiredArgsConstructor;
import org.example.game.dto.PlayerDto;
import org.example.game.dto.PlayerItemDto;
import org.example.game.entity.Item;
import org.example.game.entity.Player;
import org.example.game.entity.PlayerItem;
import org.example.game.repository.IItemRepository;
import org.example.game.repository.IPlayerItemRepository;
import org.example.game.repository.IPlayerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerItemService implements IPlayerItemService{
    private final IItemRepository iItemRepository;
    private final IPlayerRepository iPlayerRepository;
    private final IPlayerItemRepository iPlayerItemRepository;

    @Transactional
    @Override
    public void buyItem(PlayerItemDto playerItemDto) {
        Optional<Item> itemExisting = iItemRepository.findById(playerItemDto.getItem_id());
        Optional<Player> playerExisting = iPlayerRepository.findById(playerItemDto.getPlayer_id());
        if(itemExisting.isPresent() && playerExisting.isPresent()){
            PlayerItem playerItem = new PlayerItem();
            playerItem.setItem(itemExisting.get());
            playerItem.setPlayer(playerExisting.get());

            iPlayerItemRepository.save(playerItem);
        }else{
            throw new RuntimeException("Not found item_id or player_id");
        }

    }
}
