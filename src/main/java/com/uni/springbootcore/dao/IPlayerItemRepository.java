package com.uni.springbootcore.dao;

import com.uni.springbootcore.entity.PlayerItemT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerItemRepository extends JpaRepository<PlayerItemT,Integer> {
}
