package demo.gamexxx.repository;


import demo.gamexxx.entity.ItemT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemT,String> {
}
