package com.example.demoapi.services;

import com.example.demoapi.entity.Procedure.playerInfo;
import com.example.demoapi.repository.playerinfoSP;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class playerinfoservice {
    private final playerinfoSP playerinfoSP;

    public playerinfoservice(com.example.demoapi.repository.playerinfoSP playerinfoSP) {
        this.playerinfoSP = playerinfoSP;
    }

@Transactional
    public List<playerInfo> getallplayer(){
          List<playerInfo> playerz =playerinfoSP.getplayerinfo();
          return playerz;
}
}
