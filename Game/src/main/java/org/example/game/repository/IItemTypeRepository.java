package org.example.game.repository;

import org.example.game.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemTypeRepository extends JpaRepository<ItemType, Integer> {
}
