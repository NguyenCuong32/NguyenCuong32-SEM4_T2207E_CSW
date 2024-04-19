package com.exam.game_xxx.services;

import com.exam.game_xxx.dtos.PlayerItemTDto;
import com.exam.game_xxx.exceptions.DataNotFoundException;
import com.exam.game_xxx.models.ItemT;
import com.exam.game_xxx.models.PlayerItemT;
import com.exam.game_xxx.models.PlayerT;
import com.exam.game_xxx.repositories.IPlayTRepository;
import com.exam.game_xxx.repositories.ItemTRepository;
import com.exam.game_xxx.repositories.PlayerItemTRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerItemService implements  IPlayerItemService{
    private final PlayerItemTRepository playerItemTRepository;
    private final ItemTRepository itemTRepository;
    private final IPlayTRepository iPlayTRepository;
    @Override
    public PlayerItemT createPlayerItemT(PlayerItemTDto playerItemTDto) throws DataNotFoundException {
        ItemT existingItemT = itemTRepository.findById(playerItemTDto.getItemId()).orElseThrow(() -> new DataNotFoundException("Cannot find item t with id: " + playerItemTDto.getItemId()));
        PlayerT existingPlayerT = iPlayTRepository.findById(playerItemTDto.getPlayerId()).orElseThrow(() -> new DataNotFoundException("Cannot player item t with id: " + playerItemTDto.getPlayerId()));
        PlayerItemT newPlayerItemT = new PlayerItemT();
        newPlayerItemT.setItemT(existingItemT);
        newPlayerItemT.setItemId(existingItemT.getItemId());
        newPlayerItemT.setPlayerId(existingPlayerT.getPlayerId());
        newPlayerItemT.setPlayerT(existingPlayerT);
        return playerItemTRepository.save(newPlayerItemT);
    }
}
