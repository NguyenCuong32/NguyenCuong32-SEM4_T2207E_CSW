package com.t2207e.exam.controllers;


import com.t2207e.exam.dtos.PlayerBuyItemDTO;
import com.t2207e.exam.dtos.request.RequestCreatePlayer;
import com.t2207e.exam.dtos.request.RequestPlayerBuyItem;
import com.t2207e.exam.dtos.response.ResponseStatus;
import com.t2207e.exam.services.IPlayerService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerControllerAPI {

    final IPlayerService playerService;

    @GetMapping("/list")
    public List<PlayerBuyItemDTO> listPlayerBuyItem(){
        return playerService.listPlayerBuyItem();
    }

    @PostMapping("")
    public ResponseStatus createItem(@RequestBody @Valid RequestCreatePlayer request){
        return playerService.create(request);
    }

    @PostMapping("/buy_item")
    public ResponseStatus playerBuyItem(@RequestBody RequestPlayerBuyItem request){
        return playerService.playerBuyItem(request);
    }
}
