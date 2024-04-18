package demo.gamexxx.repository;

import demo.gamexxx.entity.ItemTypeT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemTypeT ,Integer > {
}
