/**
Class for the deck of minerals
 */
public class Deck {
    private Minerals[] deck; //A deck is made of 54 minerals and 6 Supertrump cards
    private int cardsUsed;
    public Deck(){
        this(false);
    }
    public Deck(boolean includeSupertrump) {
        if (includeSupertrump)
            deck = new Minerals[60];
        else
            deck = new Minerals[54];
        int cardCt = 0; // How many cards have been created so far.
        for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int value = 1; value <= 13; value++ ) {
                deck[cardCt] = new Minerals(value,suit);
                cardCt++;
            }
        }
        if (includeSupertrump) {
            deck[52] = new Minerals(1,Minerals.JOKER);
            deck[53] = new Minerals(2,Minerals.JOKER);
        }
        cardsUsed = 0;
    }
}
