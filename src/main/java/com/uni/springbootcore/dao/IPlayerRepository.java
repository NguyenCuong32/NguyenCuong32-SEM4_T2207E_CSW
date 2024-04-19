package com.uni.springbootcore.dao;

import com.uni.springbootcore.entity.PlayerT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerRepository extends JpaRepository<PlayerT,Integer> {
}
