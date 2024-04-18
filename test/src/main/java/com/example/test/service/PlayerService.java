package com.example.test.service;

import com.example.test.dto.PlayBuyItemRequest;
import com.example.test.dto.PlayerCreateRequest;
import com.example.test.dto.PlayerInfo;
import com.example.test.dto.ResponseData;
import com.example.test.entity.Item;
import com.example.test.entity.Player;
import com.example.test.exception.GlobalException;
import com.example.test.repository.ItemRepository;
import com.example.test.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final ItemRepository itemRepository;
    private final JdbcTemplate jdbcTemplate;

    public ResponseData createPlayer(PlayerCreateRequest request) {
        Player player = Player.builder()
                .playerName(request.getPlayerName())
                .playerNational(request.getPlayerNational())
                .build();
        playerRepository.save(player);
        return new ResponseData("True", "200");
    }

    public ResponseData updatePlayerItems(PlayBuyItemRequest request) {
        Player player = playerRepository.findById(request.getPlayerId()).orElseThrow(
                () -> new GlobalException("Player not found", 404)
        );
        Item item = itemRepository.findById(request.getItemId()).orElseThrow(
                () -> new GlobalException("Item not found", 404)
        );
        if (player.getItems().contains(item)) {
            return new ResponseData("False", "400");
        }
        player.getItems().add(item);
        playerRepository.save(player);
        return new ResponseData("True", "200");
    }

    public List<PlayerInfo> getPlayerInfoList() {
        String sql = "CALL get_all_player_info()";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        List<PlayerInfo> playerInfos = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            PlayerInfo info = new PlayerInfo(
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
