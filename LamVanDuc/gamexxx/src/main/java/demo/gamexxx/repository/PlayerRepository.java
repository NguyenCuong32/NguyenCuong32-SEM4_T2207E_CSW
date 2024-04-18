package demo.gamexxx.repository;


import demo.gamexxx.dto.DetailPlayerDTO;
import demo.gamexxx.entity.PlayerT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerT, Integer> {
    Optional<PlayerT> findByPlayerName(String name);

//    @Query("SELECT p.playerId, p.playerName, p.playerNational, " +
//            "i.itemId, i.itemName, i.price, " +
//            "it.itemTypeId, it.itemTypeName " +
//            "FROM PlayerEntity p " +
//            "LEFT JOIN p.playerItems pi " +
//            "LEFT JOIN pi.item i " +
//            "LEFT JOIN i.itemType it")
//    List<Object[]> findAllPlayerItem();
@Query(value = "CALL findAllDetailPlayer()", nativeQuery = true)
List<Object[]> findAllPlayers();

}
