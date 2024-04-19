package com.fai.api.university.ApiController;

import com.fai.api.university.entity.Item;
import com.fai.api.university.entity.Message;
import com.fai.api.university.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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