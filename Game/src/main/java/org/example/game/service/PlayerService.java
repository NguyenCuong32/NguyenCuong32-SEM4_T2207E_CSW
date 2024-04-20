package org.example.game.service;

import lombok.RequiredArgsConstructor;
import org.example.game.dto.PlayerDto;
import org.example.game.entity.Player;
import org.example.game.repository.IPlayerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PlayerService implements IPlayerService{
    private final IPlayerRepository iPlayerRepository;

    @Transactional
    @Override
    public void save(PlayerDto playerDto) {
        Player player = new Player();
        player.setPlayer_name(playerDto.getPlayer_name());
        player.setPlayer_national(playerDto.getPlayer_national());

        iPlayerRepository.save(player);
    }
}
