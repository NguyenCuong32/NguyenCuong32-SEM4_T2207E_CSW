package com.fai.api.university.service;

import com.fai.api.university.entity.Item;
import com.fai.api.university.rest.IItemReponsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ItemService implements IItemService{
    public final IItemReponsitory itemRepository;

    @Autowired
    public ItemService(IItemReponsitory itemRepository) {
        this.itemRepository = itemRepository;
    }
    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }
}
