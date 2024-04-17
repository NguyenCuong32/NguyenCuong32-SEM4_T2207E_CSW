package com.t2207e.exam.repository;

import com.t2207e.exam.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ItemTypeRepository extends JpaRepository<ItemType,Integer> {
}
