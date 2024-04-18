package demo.gamexxx.service;


import demo.gamexxx.common.ResponseObject;
import demo.gamexxx.entity.ItemT;
import demo.gamexxx.entity.ItemTypeT;
import demo.gamexxx.repository.ItemRepository;
import demo.gamexxx.repository.ItemTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
     private ItemRepository _itemRepository;

    @Autowired
    private ItemTypeRepository _itemTypeRepository;


    @Override
    public ResponseObject add(ItemT item) {
        try{
            Optional<ItemT> checkItem =_itemRepository.findById(item.getItemId());
            if (checkItem.isPresent()){
                return new ResponseObject("Thất bại",409,"Item: "+item.getItemId() +" đã tồn tại.");
            }else {
                Optional<ItemTypeT> checktype =_itemTypeRepository.findById(item.getItemTypeId());
                if (checktype.isPresent()){
                    _itemRepository.save(item);
                    return new ResponseObject("Thành công",200,item);
                }else {
                    return new ResponseObject("Thất bại",400,"Không tìm thấy item type.");
                }
            }

        }catch (Exception exception){
            return new ResponseObject("Thất bại",500,exception.getMessage());
        }
    }
}
