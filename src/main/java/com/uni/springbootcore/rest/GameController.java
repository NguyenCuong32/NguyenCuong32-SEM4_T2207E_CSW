package com.uni.springbootcore.rest;

import com.uni.springbootcore.entity.ItemT;
import com.uni.springbootcore.entity.PlayerT;
import com.uni.springbootcore.service.ItemService;
import com.uni.springbootcore.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    private final PlayerService playerService;
    private final ItemService itemService;
    @Autowired
    public GameController(PlayerService playerService, ItemService itemService) {
        this.playerService = playerService;
        this.itemService = itemService;
    }
    @GetMapping("/playerinfor")
    public List<PlayerT> getPlayers(){
        System.out.println("listing players");
        return playerService.getEveryPlayers();
    }
    @PostMapping("/player")
    public String addPlayer(@RequestBody PlayerT newPlayer) {
        System.out.println("adding new player");
        playerService.savePlayer(newPlayer);
        return "Added new";
    }
    @PostMapping("/playerbuyitem")
    public String playerBuyItem(@RequestBody PlayerT newPlayer, @RequestBody ItemT newItem) {
        System.out.println("adding new player");
        playerService.savePlayer(newPlayer);
        return "Added new";
    }
    @PostMapping("/item")
    public String addItem(@RequestBody ItemT newItem) {
        System.out.println("adding new item");
        itemService.saveItem(newItem);
        return "Added new";
    }
}
