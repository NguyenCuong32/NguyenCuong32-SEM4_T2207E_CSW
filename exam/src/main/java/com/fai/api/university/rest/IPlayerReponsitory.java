package com.fai.api.university.rest;

import com.fai.api.university.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerReponsitory extends JpaRepository <Player,Integer> {
}
