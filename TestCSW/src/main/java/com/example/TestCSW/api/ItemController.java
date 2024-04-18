package com.example.TestCSW.api;

import com.example.TestCSW.entity.Item;
import com.example.TestCSW.entity.Message;
import com.example.TestCSW.entity.Player;
import com.example.TestCSW.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("item")
    public Message AddItem(@RequestBody Item item){
        itemService.save(item);
        Message message = new Message();
        message.setStatus("TRUE");
        message.setErrorCode("200");
        return message;
    }
}
