package com.fai.API.service;

import com.fai.API.api.entity.ItemT;
import com.fai.API.api.entity.Player;
import com.fai.API.api.entity.PlayerItemT;
import com.fai.API.api.entity.ResponseData;
import com.fai.API.api.exception.GlobalException;
import com.fai.API.api.repository.IItemRepository;
import com.fai.API.api.repository.IPlayerRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PlayerService {
    private final IPlayerRepository playerRepository;
    private final IItemRepository itemRepository;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PlayerService(IPlayerRepository playerRepository, IItemRepository itemRepository, IItemRepository itemRepository1, JdbcTemplate jdbcTemplate) {
        this.playerRepository = playerRepository;
        this.itemRepository = itemRepository1;
        this.jdbcTemplate = jdbcTemplate;
    }

    public ResponseData createPlayer(Player request) {
        Player player = Player.builder()
                .player_name(request.getPlayer_name())
                .player_national(request.getPlayer_national())
                .build();
        playerRepository.save(player);
        return new ResponseData("True", "200");
    }

    public List<Player> getPlayerInfoList() {
        String sql = "CALL get_all_player_info()";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        List<Player> playerInfos = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            Player info = new Player(
                    (Integer) row.get("player_id"),
                    (String) row.get("player_name"),
                    (String) row.get("player_national"),
                    (String) row.get("item_name"),
                    row.get("price") != null ? ((BigDecimal) row.get("price")) : null,
                    (String) row.get("item_type_name")
            );
            playerInfos.add(info);
        }
        return playerInfos;
    }
}
