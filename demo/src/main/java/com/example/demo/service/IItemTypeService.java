package com.example.demo.service;

import com.example.demo.entity.ItemType;

import java.util.List;
import java.util.Optional;

public interface IItemTypeService {
    Optional<ItemType> finItemTypeServiceById(Long itemtypeid);
    List<ItemType> finAl();
    ItemType saveItemType(ItemType itemType);

}
