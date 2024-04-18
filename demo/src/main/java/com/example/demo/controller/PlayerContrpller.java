package com.example.demo.controller;

import com.example.demo.dto.PlayBuyItemDTO;
import com.example.demo.dto.PlayerCreateDTO;
import com.example.demo.dto.PlayerInfoDTO;
import com.example.demo.dto.ResponseData;
import com.example.demo.service.PlayerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerContrpller {
    private final PlayerService playerService;

    @PostMapping("/player")
    public ResponseData createPlayer(@RequestBody @Valid PlayerCreateDTO request) {
        return playerService.createPlayer(request);
    }

    @PostMapping("/playerbuyitem")
    public ResponseData playBuyItem(@RequestBody @Valid PlayBuyItemDTO request) {
        return playerService.updatePlayerItems(request);
    }

    @GetMapping("/playerinfor")
    public List<PlayerInfoDTO> getPlayerInfoList() {
        return playerService.getPlayerInfoList();
    }
}
