package com.t2207e.ExamCSW.controller;

import com.t2207e.ExamCSW.entity.Message;
import com.t2207e.ExamCSW.entity.PlayerItem;
import com.t2207e.ExamCSW.service.PlayerItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class PlayerItemController {
    private final PlayerItemService playerItemService;;
    @PostMapping("playerbuyitem")
    public Message SavePlayerItem(@RequestBody PlayerItem playerItem){
        playerItemService.save(playerItem);
        Message message=new Message();
        message.Status="200";
        message.ErrorCode="True";
        return message;
    }
}
