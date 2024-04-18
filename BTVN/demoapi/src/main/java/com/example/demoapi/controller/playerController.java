package com.example.demoapi.controller;

import com.example.demoapi.entity.ResponseObject;
import com.example.demoapi.entity.players;
import com.example.demoapi.services.playerservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class playerController {
    private final playerservice playerservice;

    public playerController(com.example.demoapi.services.playerservice playerservice) {
        this.playerservice = playerservice;
    }

    @PostMapping("/player")
    public ResponseEntity<ResponseObject> addplayer(@RequestBody players player){
        playerservice.addplayer(player);
        int errorCode = HttpStatus.OK.value();
        String errorCodeString = Integer.toString(errorCode);
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("true", errorCodeString)
        );
    }
}
