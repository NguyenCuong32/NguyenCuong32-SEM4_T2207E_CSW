package com.example.demo.service;

import com.example.demo.dto.ItemCreateDTO;
import com.example.demo.dto.ResponseData;
import com.example.demo.entity.Item;
import com.example.demo.entity.ItemType;
import com.example.demo.exception.GlobalException;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.ItemTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {

    private final ItemRepository itemRepository;
    private final ItemTypeRepository itemTypeRepository;

    public ResponseData createItem(ItemCreateDTO request) {
        // First find ItemType from id
        ItemType itemType = itemTypeRepository.findById(request.getItemTypeId()).orElseThrow(
                () -> new GlobalException("Item type not found", 404)
        );

        // Then create item
        Item item = Item.builder()
                // I want to generate a random id for the item but max string is 10
                .itemId(UUID.randomUUID().toString().substring(0, 10))
                .itemName(request.getItemName())
                .itemType(itemType)
                .price(request.getPrice())
                .build();
        itemRepository.save(item);

        return new ResponseData("True", "200");
    }

}