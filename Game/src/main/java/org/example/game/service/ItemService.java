package org.example.game.service;

import lombok.RequiredArgsConstructor;
import org.example.game.dto.ItemDto;
import org.example.game.entity.Item;
import org.example.game.entity.ItemType;
import org.example.game.repository.IItemRepository;
import org.example.game.repository.IItemTypeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService implements IItemService{
    private final IItemRepository iItemRepository;
    private final IItemTypeRepository iItemTypeRepository;

    @Transactional
    @Override
    public void save(ItemDto itemDto) {
        Optional<ItemType> itemTypeExisting = iItemTypeRepository.findById(itemDto.getItem_type_id());
        if (itemTypeExisting.isPresent()){
            Item item = new Item();
            item.setItem_id(itemDto.getItem_id());
            item.setItem_name(itemDto.getItem_name());
            item.setPrice(itemDto.getPrice());
            item.setItemType(itemTypeExisting.get());

            iItemRepository.save(item);
        }
        else {
            throw new RuntimeException("Not found item type");
        }

    }
}
