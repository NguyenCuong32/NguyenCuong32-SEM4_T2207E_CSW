package com.example.TestCSW.repository;

import com.example.TestCSW.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<Item, String> {
}
