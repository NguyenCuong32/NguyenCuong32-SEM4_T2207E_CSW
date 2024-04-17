package com.t2207e.exam.repository;

import com.t2207e.exam.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ItemRepository extends JpaRepository <Item,String> {
    boolean existsByItemNameIgnoreCase(String name);
}
