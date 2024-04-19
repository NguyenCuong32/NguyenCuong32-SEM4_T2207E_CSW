package com.fai.API.api.repository;

import com.fai.API.api.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface IPlayerRepository extends JpaRepository<Player, Integer> {
    @Procedure("get_all_player_info")
    List<Player> getAllPlayerInfo();
}
