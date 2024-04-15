package com.example.demo.repository;

import com.example.demo.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTypeRepository extends JpaRepository<ItemType,Long> {
}
