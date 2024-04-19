package com.exam.game_xxx.services;

import com.exam.game_xxx.dtos.PlayerTDto;
import com.exam.game_xxx.models.PlayerT;

public interface IPlayerTService {
    PlayerT createPlayerT (PlayerTDto playerTDto);
}
