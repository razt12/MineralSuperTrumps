import java.util.ArrayList;

/**
 * Created by Rich on 04-10-16.
 */
public class STPlayer {
    private ArrayList<STCard> cards;
    private String playerId;
    private String name;

    public STPlayer(String playerId){
        this.playerId=playerId;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }
    public String toString(){
        return name+". Player "+playerId +"Cards= "+cards;
    }
}
