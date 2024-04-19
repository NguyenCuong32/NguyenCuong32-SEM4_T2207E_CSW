package com.t2207e.ExamCSW.reponsitory;

import com.t2207e.ExamCSW.entity.PlayerItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerItemReponsitory extends JpaRepository<PlayerItem, PlayerItem.PlayerItemId> {
}
