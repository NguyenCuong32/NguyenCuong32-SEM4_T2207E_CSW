package demo.gamexxx.entity;


import jakarta.persistence.*;

@Table(name = "player_t")
@Entity
public class PlayerT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;
    private String playerName;
    private String playerNational;


    public Integer getPlayerId(){
        return playerId;
    }

    public void setPlayerId(Integer playerId){
        this.playerId=playerId;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }

    public String getPlayerNational(){
        return playerNational;
    }

    public void setPlayerNational(String playerNational){
        this.playerNational=playerNational;
    }

}
