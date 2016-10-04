/**
Class for the deck of minerals
 */
public class Deck {
    private Mineral[] deck; //A deck is made of 54 minerals and 6 Supertrump cards
    private int cardsUsed;
    public Deck(){
        this(false);
    }
    public Deck(boolean includeSupertrump) {
        if (includeSupertrump)
            deck = new Mineral[60];
        else
            deck = new Mineral[54];
        int cardCt = 0; // How many cards have been created so far.
        for (int i = 0; i<54; i++) {
            //deck[i]=new Mineral(i,false);


        }
        if (includeSupertrump) {
            deck[55] = new Mineral(55,false);
            //deck[56] = new Mineral(56,false);
        }
        cardsUsed = 0;
    }
}
