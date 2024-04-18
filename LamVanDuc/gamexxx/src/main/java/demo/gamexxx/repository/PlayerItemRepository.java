package demo.gamexxx.repository;

import demo.gamexxx.common.PlayerItemTKey;
import demo.gamexxx.entity.PlayerItemT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerItemRepository extends JpaRepository<PlayerItemT, PlayerItemTKey> {
}
