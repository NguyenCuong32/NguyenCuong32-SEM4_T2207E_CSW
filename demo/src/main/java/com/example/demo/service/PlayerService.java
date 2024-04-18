package com.example.demo.service;
import com.example.demo.dto.PlayBuyItemDTO;
import com.example.demo.dto.PlayerCreateDTO;
import com.example.demo.dto.PlayerInfoDTO;
import com.example.demo.dto.ResponseData;
import com.example.demo.entity.Item;
import com.example.demo.entity.Player;
import com.example.demo.exception.GlobalException;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.PlayerRepository;
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

    public ResponseData createPlayer(PlayerCreateDTO request) {
        Player player = Player.builder()
                .playerName(request.getPlayerName())
                .playerNational(request.getPlayerNational())
                .build();
        playerRepository.save(player);
        return new ResponseData("True", "200");
    }

    public ResponseData updatePlayerItems(PlayBuyItemDTO request) {
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

    public List<PlayerInfoDTO> getPlayerInfoList() {
        String sql = "CALL get_all_player_info()";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        List<PlayerInfoDTO> playerInfos = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            PlayerInfoDTO info = new PlayerInfoDTO(
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
