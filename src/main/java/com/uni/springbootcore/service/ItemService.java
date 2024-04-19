package com.uni.springbootcore.service;

import com.uni.springbootcore.dao.IItemRepository;
import com.uni.springbootcore.entity.ItemT;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ItemService implements IItemService{
    private final IItemRepository itemRepository;

    public ItemService(IItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<ItemT> getEveryItems() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<ItemT> getItemById(int itemId) {
        return itemRepository.findById(itemId);
    }

    @Override
    public void saveItem(ItemT item) {
        itemRepository.save(item);
    }
}
