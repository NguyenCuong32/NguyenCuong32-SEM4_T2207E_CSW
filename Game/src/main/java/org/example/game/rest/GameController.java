package org.example.game.rest;

import lombok.RequiredArgsConstructor;
import org.example.game.dto.ItemDto;
import org.example.game.dto.PlayerDto;
import org.example.game.dto.PlayerItemDto;
import org.example.game.service.IItemService;
import org.example.game.service.IPlayerItemService;
import org.example.game.service.IPlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class GameController {
    private final IItemService iItemService;
    private final IPlayerService iPlayerService;
    private final IPlayerItemService iPlayerItemService;

    @PostMapping("/item")
    public ResponseEntity<Map<String, String>> addItem(@RequestBody ItemDto itemDto) {
        iItemService.save(itemDto);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/player")
    public ResponseEntity<Map<String, String>> addItem(@RequestBody PlayerDto playerDto) {
        iPlayerService.save(playerDto);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/playerbuyitem")
    public ResponseEntity<Map<String, String>> addItem(@RequestBody PlayerItemDto playerItemDto) {
        iPlayerItemService.buyItem(playerItemDto);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");
        return ResponseEntity.ok().body(response);
    }
}
