package com.example.TestCSW.controller;

import com.example.TestCSW.entity.Response;
import com.example.TestCSW.entity.Player;
import com.example.TestCSW.service.PlayerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("player")
    public Response AddPlayer(@RequestBody Player player){
        playerService.save(player);
        Response message = new Response();
        message.setStatus("TRUE");
        message.setErrorCode("200");
        return message;
    }
}
