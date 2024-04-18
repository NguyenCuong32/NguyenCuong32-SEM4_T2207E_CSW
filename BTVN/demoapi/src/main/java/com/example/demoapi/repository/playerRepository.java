package com.example.demoapi.repository;

import com.example.demoapi.entity.players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playerRepository extends JpaRepository<players , Integer> {
}
