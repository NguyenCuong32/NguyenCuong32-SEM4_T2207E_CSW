package com.exam.game_xxx.services;

import com.exam.game_xxx.dtos.ItemTDTO;
import com.exam.game_xxx.exceptions.DataNotFoundException;
import com.exam.game_xxx.models.ItemT;

public interface IItemTService {
    ItemT createItemT (ItemTDTO itemT) throws DataNotFoundException;
}
