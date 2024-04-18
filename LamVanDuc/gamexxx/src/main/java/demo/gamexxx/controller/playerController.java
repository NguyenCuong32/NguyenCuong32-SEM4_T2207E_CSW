package demo.gamexxx.controller;

import demo.gamexxx.common.ResponseObject;
import demo.gamexxx.dto.DetailPlayerDTO;
import demo.gamexxx.entity.ItemT;
import demo.gamexxx.entity.PlayerItemT;
import demo.gamexxx.entity.PlayerT;
import demo.gamexxx.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class playerController {

    @Autowired
    private PlayerService _playerService;

    @PostMapping("/player")
    public ResponseEntity<ResponseObject> add(@RequestBody PlayerT playerT){
        try{
            ResponseObject respon =  _playerService.add(playerT);
            return ResponseEntity.status(respon.getStatus()).body(respon);

        }catch (Exception exception){
            return ResponseEntity.status(500).body(new ResponseObject("Thất bại",500,exception));
        }
    }

    @PostMapping("/playerbuyitem")
    public ResponseEntity<ResponseObject> buyItem(@RequestBody PlayerItemT playerItemT){
        try{
            ResponseObject respon =  _playerService.buyItem(playerItemT);
            return ResponseEntity.status(respon.getStatus()).body(respon);

        }catch (Exception exception){
            return ResponseEntity.status(500).body(new ResponseObject("Thất bại",500,exception));
        }
    }
    @GetMapping("/playerinfo")
    public ResponseEntity<ResponseObject> playerinfo(){
        try{
            List<DetailPlayerDTO> respon =  _playerService.ListDetailPlayer();
            ResponseObject responseObject = new ResponseObject("Thành công", 200, respon);
            return ResponseEntity.status(200).body(responseObject);

        }catch (Exception exception){
            return ResponseEntity.status(500).body(new ResponseObject("Thất bại",500,exception));
        }
    }

}
