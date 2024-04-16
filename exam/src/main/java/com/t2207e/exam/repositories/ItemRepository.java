package com.t2207e.exam.repositories;

import com.t2207e.exam.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
    boolean existsByItemNameIgnoreCase(String itemName);
}
