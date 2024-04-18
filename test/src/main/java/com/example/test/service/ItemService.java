package com.example.test.service;

import com.example.test.dto.ItemCreateRequest;
import com.example.test.dto.ResponseData;
import com.example.test.entity.Item;
import com.example.test.entity.ItemType;
import com.example.test.exception.GlobalException;
import com.example.test.repository.ItemRepository;
import com.example.test.repository.ItemTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {

    private final ItemRepository itemRepository;
    private final ItemTypeRepository itemTypeRepository;

    public ResponseData createItem(ItemCreateRequest request) {
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
