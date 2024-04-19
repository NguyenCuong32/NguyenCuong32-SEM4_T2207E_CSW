package org.example.csw.repositories;

import org.example.csw.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
