package demo.gamexxx.controller;


import demo.gamexxx.service.ItemService;
import demo.gamexxx.common.ResponseObject;
import demo.gamexxx.entity.ItemT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    @PostMapping()
    public ResponseEntity<ResponseObject> add(@RequestBody ItemT item){
        try{
            ResponseObject respon =  itemService.add(item);
            return ResponseEntity.status(respon.getStatus()).body(respon);

        }catch (Exception exception){
            return ResponseEntity.status(500).body(new ResponseObject("Thất bại",500,exception));
        }
    }
}
