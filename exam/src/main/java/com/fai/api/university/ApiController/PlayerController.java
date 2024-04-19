package com.fai.api.university.ApiController;

import com.fai.api.university.entity.Message;
import com.fai.api.university.entity.Player;
import com.fai.api.university.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    @PostMapping("player")
    public Message SavePlayer(@RequestBody Player player){
        playerService.save(player);
        Message message=new Message();
        message.Status="TRUE";
        message.ErrorCode="200";
        return message;
    }
}