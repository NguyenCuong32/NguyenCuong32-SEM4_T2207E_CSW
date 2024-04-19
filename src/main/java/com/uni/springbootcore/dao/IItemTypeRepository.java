package com.uni.springbootcore.dao;

import com.uni.springbootcore.entity.ItemTypeT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemTypeRepository extends JpaRepository<ItemTypeT,Integer> {
}
