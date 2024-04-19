package org.example.csw.controllers;

import lombok.RequiredArgsConstructor;
import org.example.csw.models.Item;
import org.example.csw.services.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<?> insertItem(@RequestBody Item item) {
        itemService.insertItem(item);
        return ResponseEntity.status(HttpStatus.OK).body("{\"Status\": \"True\", \"ErrorCode\": \"200\"}");
    }
}
