package com.t2207e.ExamCSW.reponsitory;

import com.t2207e.ExamCSW.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerReponsitory extends JpaRepository<Player,Integer> {
}
