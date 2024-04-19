package com.example.TestCSW.controller;

import com.example.TestCSW.dto.PlayerBuyItemDTO;
import com.example.TestCSW.dto.PlayerInforDTO;
import com.example.TestCSW.entity.Response;
import com.example.TestCSW.service.PlayerItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PlayerItemController {
    private final PlayerItemService playerItemService;

    public PlayerItemController(PlayerItemService playerItemService) {
        this.playerItemService = playerItemService;
    }

    @GetMapping("playerinfor")
    public List<PlayerInforDTO> PlayerInfor(){
        return playerItemService.GetAllPlayerInformation();
    }

    @PostMapping("playerbuyitem")
    public Response PlayerBuyItem(@RequestBody PlayerBuyItemDTO playerBuyItemDTO){
        playerItemService.PlayerBuyItem(playerBuyItemDTO.getItemId(), playerBuyItemDTO.getPlayerId());
        Response response = new Response();
        response.setStatus("TRUE");
        response.setErrorCode("200");
        return response;
    }
}
