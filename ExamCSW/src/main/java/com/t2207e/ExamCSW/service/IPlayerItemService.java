package com.t2207e.ExamCSW.service;

import com.t2207e.ExamCSW.entity.PlayerItem;

import java.util.List;

public interface IPlayerItemService {
    List<PlayerItem> GetAllPlayerInformation();
    void save(PlayerItem playerItem);
}
