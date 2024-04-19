package org.example.csw.controllers;

import lombok.RequiredArgsConstructor;
import org.example.csw.models.PlayerItem;
import org.example.csw.services.PlayerItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playerbuyitem")
@RequiredArgsConstructor
public class PlayerItemController {
    private final PlayerItemService playerItemService;

    @PostMapping
    public ResponseEntity<?> insertPlayerItem(@RequestBody PlayerItem playerItem) {
        playerItemService.insertPlayerItem(playerItem);
        return ResponseEntity.status(HttpStatus.OK).body("{\"Status\": \"True\", \"ErrorCode\": \"200\"}");
    }
}
