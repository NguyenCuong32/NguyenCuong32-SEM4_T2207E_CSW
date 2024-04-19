package com.t2207e.ExamCSW.service;

import com.t2207e.ExamCSW.entity.Player;
import com.t2207e.ExamCSW.reponsitory.IPlayerReponsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerService implements IPlayerService {
    private final IPlayerReponsitory playerReponsitory;
    @Override
    public void save(Player player) {
        playerReponsitory.save(player);
    }
}
