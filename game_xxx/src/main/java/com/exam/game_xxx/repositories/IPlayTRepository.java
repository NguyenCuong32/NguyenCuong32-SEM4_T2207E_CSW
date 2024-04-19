package com.exam.game_xxx.repositories;

import com.exam.game_xxx.models.PlayerT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayTRepository extends JpaRepository<PlayerT,Integer> {
}
