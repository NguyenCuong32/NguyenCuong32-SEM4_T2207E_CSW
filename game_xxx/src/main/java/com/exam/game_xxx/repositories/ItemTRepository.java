package com.exam.game_xxx.repositories;

import com.exam.game_xxx.models.ItemT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTRepository extends JpaRepository<ItemT,String> {

}
