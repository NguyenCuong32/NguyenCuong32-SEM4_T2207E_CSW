package com.t2207e.exam.services;

import com.t2207e.exam.dtos.PlayerBuyItemDTO;
import com.t2207e.exam.dtos.request.RequestCreatePlayer;
import com.t2207e.exam.dtos.request.RequestPlayerBuyItem;
import com.t2207e.exam.dtos.response.ResponseStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPlayerService {

    ResponseStatus create(RequestCreatePlayer request);

    ResponseStatus playerBuyItem(RequestPlayerBuyItem request);

    List<PlayerBuyItemDTO> listPlayerBuyItem();
}
