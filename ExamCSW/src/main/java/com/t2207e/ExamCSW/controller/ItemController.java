package com.t2207e.ExamCSW.controller;

import com.t2207e.ExamCSW.entity.Item;
import com.t2207e.ExamCSW.entity.Message;
import com.t2207e.ExamCSW.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/item")
    public Message SaveItem(@RequestBody Item item){
        itemService.save(item);
        Message message=new Message();
        message.Status="TRUE";
        message.ErrorCode="200";
        return message;
    }
}
