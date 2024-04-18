package demo.gamexxx.service;

import demo.gamexxx.common.ResponseObject;
import demo.gamexxx.dto.DetailPlayerDTO;
import demo.gamexxx.entity.PlayerItemT;
import demo.gamexxx.entity.PlayerT;

import java.util.List;

public interface PlayerService {
    ResponseObject add(PlayerT player);

    ResponseObject buyItem(PlayerItemT playerItemT);

    List<DetailPlayerDTO> ListDetailPlayer();

}
