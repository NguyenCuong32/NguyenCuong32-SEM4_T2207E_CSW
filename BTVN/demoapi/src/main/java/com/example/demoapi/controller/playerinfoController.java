package com.example.demoapi.controller;

import com.example.demoapi.entity.Procedure.playerInfo;
import com.example.demoapi.services.playerinfoservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class playerinfoController {
    public final playerinfoservice playerinfoservice;

    public playerinfoController(com.example.demoapi.services.playerinfoservice playerinfoservice) {
        this.playerinfoservice = playerinfoservice;
    }

    @GetMapping("/playerinfor")
    public List<playerInfo> getplayer(){
        return playerinfoservice.getallplayer();
    }


}
