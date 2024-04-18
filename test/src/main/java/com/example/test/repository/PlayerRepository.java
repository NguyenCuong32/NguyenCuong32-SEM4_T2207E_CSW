package com.example.test.repository;

import com.example.test.dto.PlayerInfo;
import com.example.test.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    @Procedure("get_all_player_info")
    List<PlayerInfo> getAllPlayerInfo();

}
