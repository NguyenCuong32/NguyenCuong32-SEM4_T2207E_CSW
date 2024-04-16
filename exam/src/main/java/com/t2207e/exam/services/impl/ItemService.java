package com.t2207e.exam.services.impl;

import com.t2207e.exam.dtos.request.RequestCreateItem;
import com.t2207e.exam.dtos.response.ResponseStatus;
import com.t2207e.exam.entities.Item;
import com.t2207e.exam.entities.ItemType;
import com.t2207e.exam.repositories.ItemRepository;
import com.t2207e.exam.repositories.ItemTypeRepository;
import com.t2207e.exam.services.IItemService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemService implements IItemService{

    final ItemRepository itemRepository;
    final ItemTypeRepository itemTypeRepository;
    @Override
    @Transactional
    public ResponseStatus create(RequestCreateItem request) {

        if(itemRepository.existsByItemNameIgnoreCase(request.getItemName()))
            throw new RuntimeException("Name Item already existed");

        ItemType itemType = itemTypeRepository.findById(request.getItemType())
                .orElseThrow(() -> new RuntimeException("name item already existed"));

        Item item = Item.builder()
                .itemId(generateUniqueId())
                .itemName(request.getItemName())
                .itemType(itemType)
                .price(request.getPrice()).build();
        itemRepository.save(item);

        return ResponseStatus
                .builder()
                .status("True")
                .errorCode(Short.parseShort(String.valueOf(HttpStatus.OK.value())))
                .build();
    }



    private String generateUniqueId() {
        String uuid = null;
        boolean isUnique = false;

        while (!isUnique) {
            uuid = UUID.randomUUID().toString();

            uuid = uuid.substring(0, 10);

            if (!checkIfIdExistsInDatabase(uuid)) {
                isUnique = true;
            }
        }
        return uuid;
    }

    private boolean checkIfIdExistsInDatabase(String id) {
        return itemRepository.existsById(id);
    }

}
