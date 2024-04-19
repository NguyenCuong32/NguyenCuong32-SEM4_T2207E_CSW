package org.example.csw.controllers;

import lombok.RequiredArgsConstructor;
import org.example.csw.models.Player;
import org.example.csw.services.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @PostMapping
    public ResponseEntity<?> insertPlayer(@RequestBody Player player) {
        playerService.insertPlayer(player);
        return ResponseEntity.status(HttpStatus.OK).body("{\"Status\": \"True\", \"ErrorCode\": \"200\"}");
    }
}
