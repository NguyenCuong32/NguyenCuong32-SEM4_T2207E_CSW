package com.exam.game_xxx.repositories;

import com.exam.game_xxx.models.PlayerItemId;
import com.exam.game_xxx.models.PlayerItemT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerItemTRepository extends JpaRepository<PlayerItemT, PlayerItemId> {

}
