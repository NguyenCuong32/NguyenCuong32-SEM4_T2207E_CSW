package com.uni.springbootcore.service;

import com.uni.springbootcore.entity.ItemT;

import java.util.List;
import java.util.Optional;

public interface IItemService {
    List<ItemT> getEveryItems();
    Optional<ItemT> getItemById(int itemId);
    void saveItem(ItemT item);
}
