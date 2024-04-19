package com.exam.game_xxx.services;

import com.exam.game_xxx.dtos.PlayerItemTDto;
import com.exam.game_xxx.exceptions.DataNotFoundException;
import com.exam.game_xxx.models.PlayerItemT;

public interface IPlayerItemService {
    PlayerItemT createPlayerItemT(PlayerItemTDto playerItemTDto) throws DataNotFoundException;
}
