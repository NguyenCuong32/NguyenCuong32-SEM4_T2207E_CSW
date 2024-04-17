package com.t2207e.exam.repository;

import com.t2207e.exam.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface PlayerRepository extends JpaRepository<Player,Long> {
}
