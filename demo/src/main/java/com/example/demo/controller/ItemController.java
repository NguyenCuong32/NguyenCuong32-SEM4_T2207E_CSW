package com.example.demo.controller;

import com.example.demo.dto.ItemCreateDTO;
import com.example.demo.dto.ResponseData;
import com.example.demo.service.ItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/item")
    public ResponseData createItem(@RequestBody @Valid ItemCreateDTO request) {
        return itemService.createItem(request);
    }
}
