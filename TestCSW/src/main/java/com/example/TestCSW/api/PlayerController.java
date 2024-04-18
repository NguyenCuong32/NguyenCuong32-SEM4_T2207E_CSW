package com.example.TestCSW.api;

import com.example.TestCSW.dto.PlayerBuyItemDTO;
import com.example.TestCSW.entity.Message;
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
    public Message AddPlayer(@RequestBody Player player){
        playerService.save(player);
        Message message = new Message();
        message.setStatus("TRUE");
        message.setErrorCode("200");
        return message;
    }
}
