package org.example.csw.repositories;

import org.example.csw.models.PlayerItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerItemRepository extends JpaRepository<PlayerItem, PlayerItem.PlayerItemId> {
}
