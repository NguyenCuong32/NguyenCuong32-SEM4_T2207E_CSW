package com.example.demo.controller;

import com.example.demo.dto.ItemCreateDTO;
import com.example.demo.dto.ResponseData;
import com.example.demo.service.ItemService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/item")
@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/")
    public ResponseData createItem(@RequestBody @Valid ItemCreateDTO request) {
        return itemService.createItem(request);
    }
}
