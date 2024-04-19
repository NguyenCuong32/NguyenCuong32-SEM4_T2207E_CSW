package com.t2207e.ExamCSW.service;

import com.t2207e.ExamCSW.entity.PlayerItem;
import com.t2207e.ExamCSW.reponsitory.IPlayerItemReponsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PlayerItemService implements IPlayerItemService{
    private final IPlayerItemReponsitory playerItemReponsitory;
    @Override
    public List<PlayerItem> GetAllPlayerInformation() {
        return null;
    }

    @Override
    public void save(PlayerItem playerItem) {
        playerItemReponsitory.save(playerItem);
    }
}
