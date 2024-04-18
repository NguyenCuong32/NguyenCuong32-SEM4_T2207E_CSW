//package com.example.test.repository;
//
//import com.example.test.dto.PlayerInfo;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.query.Procedure;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//public interface PlayerInfoRepository extends JpaRepository<PlayerInfo, Integer> {
//
//    @Procedure("get_all_player_info")
//    List<PlayerInfo> getAllPlayerInfo();
//
//}
