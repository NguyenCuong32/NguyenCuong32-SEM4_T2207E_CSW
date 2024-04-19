package org.example.csw.repositories;

import org.example.csw.models.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {
}
