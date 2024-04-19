package com.exam.game_xxx.repositories;

import com.exam.game_xxx.models.ItemTypeT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTypeTRepository extends JpaRepository<ItemTypeT,Integer> {
}
