package com.example.TestCSW.service;

import com.example.TestCSW.entity.Item;
import com.example.TestCSW.repository.IItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService implements IItemService{
    public final IItemRepository itemRepository;

    @Autowired
    public ItemService(IItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional
    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }
}
