import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Rich on 04-10-16.
 */
public class STDeck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<STCard> cards;

    public STDeck(){
        cards = new ArrayList<STCard>();
        for (int i = 0; i<NUM_CARDS_INIT; i++){
            cards.add(new STCard(i));

        }

    }
    public ArrayList<STCard> dealCards(int nCards) {
        ArrayList<STCard> ret = new ArrayList<STCard>();
        for (int i = 0; i < nCards; i++){
            int idx = new Random().nextInt(cards.size());
            STCard card = cards.remove(idx);
            ret.add(card);
            System.out.println("\nCard= "+card);

        }
        return ret;
    }
}
