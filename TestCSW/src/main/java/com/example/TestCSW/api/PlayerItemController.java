package com.example.TestCSW.api;

import com.example.TestCSW.dto.PlayerBuyItemDTO;
import com.example.TestCSW.dto.PlayerInforDTO;
import com.example.TestCSW.entity.Message;
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
    public Message PlayerBuyItem(@RequestBody PlayerBuyItemDTO playerBuyItemDTO){
        playerItemService.PlayerBuyItem(playerBuyItemDTO.getItemId(), playerBuyItemDTO.getPlayerId());
        Message message = new Message();
        message.setStatus("TRUE");
        message.setErrorCode("200");
        return message;
    }
}
