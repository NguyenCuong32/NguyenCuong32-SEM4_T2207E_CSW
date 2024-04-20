package org.example.game.repository;

import org.example.game.entity.PlayerItem;
import org.example.game.entity.PlayerItemId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerItemRepository extends JpaRepository<PlayerItem, PlayerItemId> {
}
