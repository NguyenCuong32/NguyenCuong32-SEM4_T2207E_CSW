package com.t2207e.ExamCSW.service;

import com.t2207e.ExamCSW.entity.Item;
import com.t2207e.ExamCSW.reponsitory.IItemReponsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService implements IItemService{
    private final IItemReponsitory itemReponsitory;
    @Override
    public void save(Item item) {
        itemReponsitory.save(item);
    }
}
