package com.t2207e.exam.repositories;

import com.t2207e.exam.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
