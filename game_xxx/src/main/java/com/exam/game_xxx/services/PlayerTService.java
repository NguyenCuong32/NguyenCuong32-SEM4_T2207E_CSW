package com.exam.game_xxx.services;

import com.exam.game_xxx.dtos.PlayerTDto;
import com.exam.game_xxx.models.PlayerT;
import com.exam.game_xxx.repositories.IPlayTRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerTService implements IPlayerTService{
    private final IPlayTRepository iPlayTRepository;
    @Override
    public PlayerT createPlayerT(PlayerTDto playerTDto) {
        PlayerT newPlayerT = new PlayerT();
        newPlayerT.setPlayerName(playerTDto.getPlayerName());
        newPlayerT.setPlayerNational(playerTDto.getPlayerNational());
        return iPlayTRepository.save(newPlayerT);
    }
}
