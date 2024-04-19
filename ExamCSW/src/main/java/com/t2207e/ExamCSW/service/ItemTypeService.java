package com.t2207e.ExamCSW.service;

import com.t2207e.ExamCSW.entity.ItemType;
import com.t2207e.ExamCSW.reponsitory.IItemTypeReponsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemTypeService implements IItemTypeService {
    private final IItemTypeReponsitory itemTypeReponsitory;
    @Override
    public void save(ItemType itemType) {
        itemTypeReponsitory.save(itemType);
    }
}
