package com.fai.API.api.repository;

import com.fai.API.api.entity.ItemTypeT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<ItemTypeT, Integer> {
}
