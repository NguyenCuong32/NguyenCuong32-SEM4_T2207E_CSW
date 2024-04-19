package com.fai.api.university.rest;

import com.fai.api.university.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemTypeReponsitory extends JpaRepository<ItemType,Integer> {
}
