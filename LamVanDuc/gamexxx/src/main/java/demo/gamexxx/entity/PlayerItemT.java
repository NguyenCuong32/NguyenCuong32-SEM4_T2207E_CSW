package demo.gamexxx.entity;

import demo.gamexxx.common.PlayerItemTKey;
import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "player_item_T")
@IdClass(PlayerItemTKey.class)
public class PlayerItemT {

    @Id
    private String itemId;

    @Id
    private Integer playerId;


    public String getItemId(){
        return itemId;
    }

    public void setItemId(String itemId){
        this.itemId=itemId;
    }

    public Integer getPlayerId(){
        return playerId;
    }

    public void setPlayerId(Integer playerId){
        this.playerId=playerId;
    }
}
