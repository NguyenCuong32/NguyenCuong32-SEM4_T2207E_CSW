package com.example.test.controller;

import com.example.test.dto.*;
import com.example.test.service.ItemService;
import com.example.test.service.PlayerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final ItemService itemService;
    private final PlayerService playerService;

    @PostMapping("/item")
    public ResponseData createItem(@RequestBody @Valid ItemCreateRequest request) {
        return itemService.createItem(request);
    }

    @PostMapping("/player")
    public ResponseData createPlayer(@RequestBody @Valid PlayerCreateRequest request) {
        return playerService.createPlayer(request);
    }

    @PostMapping("/playerbuyitem")
    public ResponseData playBuyItem(@RequestBody @Valid PlayBuyItemRequest request) {
        return playerService.updatePlayerItems(request);
    }

    @GetMapping("/playerinfor")
    public List<PlayerInfo> getPlayerInfoList() {
        return playerService.getPlayerInfoList();
    }

}
