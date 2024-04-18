package com.example.TestCSW.repository;

import com.example.TestCSW.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerRepository extends JpaRepository<Player, Integer> {
}
