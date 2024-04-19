package com.example.TestCSW.controller;
import com.example.TestCSW.entity.Item;
import com.example.TestCSW.entity.Response;
import com.example.TestCSW.service.ItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("item")
    public Response AddItem(@RequestBody Item item){
        itemService.save(item);
        Response message = new Response();
        message.setStatus("TRUE");
        message.setErrorCode("200");
        return message;
    }
}
