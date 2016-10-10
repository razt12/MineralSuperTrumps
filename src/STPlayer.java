import java.util.ArrayList;

/**
 * Created by Rich on 04-10-16.
 */
public class STPlayer {
    private ArrayList<STCard> cards;
    private int playerId;
    private String name;

    public STPlayer(int playerId, String name){
        this.name=name;
        this.playerId=playerId;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }
    public String toString(){
        return "Hello " + name+".\nYou are player "+playerId +"\nYou have drawn cards: "+cards;
    }
    public String playerIdToString(){
        return "Player "+playerId;
    }
}
