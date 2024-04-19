package com.exam.game_xxx.services;

import com.exam.game_xxx.dtos.ItemTDTO;
import com.exam.game_xxx.exceptions.DataNotFoundException;
import com.exam.game_xxx.models.ItemT;
import com.exam.game_xxx.models.ItemTypeT;
import com.exam.game_xxx.repositories.ItemTRepository;
import com.exam.game_xxx.repositories.ItemTypeTRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemTService implements IItemTService {

    private final ItemTRepository itemTRepository;
    private final ItemTypeTRepository itemTypeTRepository;

    @Override
    public ItemT createItemT(ItemTDTO itemT) throws DataNotFoundException {
        ItemTypeT existingItemTypeT = itemTypeTRepository.findById(itemT.getItemTypeTId()).orElseThrow(() -> new DataNotFoundException("Cannot find category with id: " + itemT.getItemTypeTId()));
        ItemT newItemT = new ItemT();
        newItemT.setItemId(itemT.getItemId());
        newItemT.setItemName(itemT.getItemName());
        newItemT.setPrice(itemT.getPrice());
        newItemT.setItemTypeT(existingItemTypeT);
        return itemTRepository.save(newItemT);
    }
}
