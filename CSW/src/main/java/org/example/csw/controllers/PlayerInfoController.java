package org.example.csw.controllers;

import lombok.RequiredArgsConstructor;
import org.example.csw.services.PlayerInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playerinfo")
@RequiredArgsConstructor
public class PlayerInfoController {
    private final PlayerInfoService playerInfoService;

    @GetMapping
    public ResponseEntity<?> getPlayerInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(playerInfoService.getPlayerInfo());
    }

}
