package com.example.demoapi.repository;

import com.example.demoapi.entity.Procedure.playerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface playerinfoSP extends JpaRepository<playerInfo, Long > {

    @Query(value = "{call getallplayerinfo}",nativeQuery = true)
    public List<playerInfo> getplayerinfo();
}
