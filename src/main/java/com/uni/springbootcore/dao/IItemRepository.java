package com.uni.springbootcore.dao;

import com.uni.springbootcore.entity.ItemT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<ItemT,Integer> {
}
