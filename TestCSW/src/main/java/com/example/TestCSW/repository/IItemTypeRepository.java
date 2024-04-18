package com.example.TestCSW.repository;

import com.example.TestCSW.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemTypeRepository extends JpaRepository<ItemType, Integer> {
}
