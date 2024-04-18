package com.example.test.repository;

import com.example.test.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {
}
