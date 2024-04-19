package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;

@Getter
public class RequestCreatePlayer {
    private String playerName;

    private String playerNational;
}