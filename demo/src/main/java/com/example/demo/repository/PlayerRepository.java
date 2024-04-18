package com.example.demo.repository;

import com.example.demo.dto.PlayerInfoDTO;
import com.example.demo.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    @Procedure("get_all_player_info")
    List<PlayerInfoDTO> getAllPlayerInfo();

}

