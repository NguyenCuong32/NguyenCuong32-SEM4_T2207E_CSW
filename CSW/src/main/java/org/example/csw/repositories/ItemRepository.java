package org.example.csw.repositories;

import org.example.csw.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
