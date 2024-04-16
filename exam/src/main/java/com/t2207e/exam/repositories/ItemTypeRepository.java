package com.t2207e.exam.repositories;

import com.t2207e.exam.entities.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {
}
