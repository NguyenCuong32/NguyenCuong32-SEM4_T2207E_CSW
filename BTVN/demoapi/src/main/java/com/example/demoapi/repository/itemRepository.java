package com.example.demoapi.repository;

import com.example.demoapi.entity.items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepository extends JpaRepository<items, String> {

}
