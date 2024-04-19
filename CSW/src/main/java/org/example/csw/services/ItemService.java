package org.example.csw.services;

import lombok.RequiredArgsConstructor;
import org.example.csw.models.Item;
import org.example.csw.repositories.ItemRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    public void insertItem(Item item) {
        itemRepository.save(item);
    }
}
