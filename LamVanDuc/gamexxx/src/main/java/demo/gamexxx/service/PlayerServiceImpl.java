package demo.gamexxx.service;

import demo.gamexxx.common.PlayerItemTKey;
import demo.gamexxx.common.ResponseObject;
import demo.gamexxx.dto.DetailPlayerDTO;
import demo.gamexxx.entity.ItemT;
import demo.gamexxx.entity.PlayerItemT;
import demo.gamexxx.entity.PlayerT;
import demo.gamexxx.repository.ItemRepository;
import demo.gamexxx.repository.PlayerItemRepository;
import demo.gamexxx.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository _playerRepository;

    @Autowired
    private PlayerItemRepository _playerItemRepository;

    @Autowired
    private ItemRepository _itemRepository;

    @Override
    public ResponseObject add(PlayerT player) {

        try {
            Optional<PlayerT> playerT = _playerRepository.findByPlayerName(player.getPlayerName());
            if (playerT.isPresent()){
                return new ResponseObject("Thất bại",409,"Player đã tồn tại.");
            }else {
                _playerRepository.save(player);
                return new ResponseObject("Thành công",200,player);
            }

        }catch (Exception ex){
            return new ResponseObject("Thất bại",500,ex.getMessage());
        }

    }

    @Override
    public ResponseObject buyItem(PlayerItemT playerItemT) {
        try {
            Optional<PlayerT> playerT = _playerRepository.findById(playerItemT.getPlayerId());
            if (playerT.isEmpty()){
                return new ResponseObject("Thất bại",404,"Player không tồn tại.");
            }else {
                Optional<ItemT> item = _itemRepository.findById(playerItemT.getItemId());
                if (playerT.isEmpty()){
                    return new ResponseObject("Thất bại",404,"Item không tồn tại.");
                }else {
                    PlayerItemTKey key = new PlayerItemTKey(playerItemT.getItemId(),playerItemT.getPlayerId());
                    Optional<PlayerItemT> checkItem = _playerItemRepository.findById(key);
                    if (checkItem.isPresent()){
                        return new ResponseObject("Thất bại",409,"Player đã tồn tại item.");
                    }else {
                        _playerItemRepository.save(playerItemT);
                        return new ResponseObject("Thành công",200,playerT);
                    }
                }
            }

        }catch (Exception ex){
            return new ResponseObject("Thất bại",500,ex.getMessage());
        }
    }

    @Override
    public List<DetailPlayerDTO> ListDetailPlayer() {

            List<Object[]> results = _playerRepository.findAllPlayers();
            List<DetailPlayerDTO> dtos = new ArrayList<>();

            for (Object[] result : results) {
                dtos.add(new DetailPlayerDTO(
                        (Integer) result[0], // playerId
                        (String) result[1], // playerName
                        (String) result[2], // playerNational
                        (String) result[3], // itemId
                        (String) result[4], // itemName
                        (BigDecimal) result[5], // price
                        (Integer) result[6], // itemTypeId
                        (String) result[7] // itemTypeName
                ));
            }
        return dtos;
    }
}
