import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rich on 04-10-16.
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL =8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    private STDeck deck;
    private int yourPlayerId;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
        deck = new STDeck();
    }

    public void selectDealer() {
        int dealer = selectRandomNumber(numPlayers,1);
        System.out.println("The dealer is player " + dealer);
    }

    private int selectRandomNumber(int max,int min) {
        Random rand = new Random();
        dealerId = rand.nextInt((max - min) + 1) +min;
        return dealerId;
    }

    public void dealRandomCardsToEachPlayer(String name) {

        players = new STPlayer[numPlayers];
        for(int i = 0; i<numPlayers;i++){
            players[i] = new STPlayer(i, "bot"+i);
            System.out.println(players[i]);

        }

        for (STPlayer player : players){
            ArrayList<STCard> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
        }
        System.out.println(players[0]);
        System.out.println(players[1]);
        System.out.println(players[2]);
        System.out.println(players[3]);
    }

    public void selectPlayer() {
        yourPlayerId=1;
    }

    public STPlayer getHumanPlayer() {
        return players[yourPlayerId];
    }

    public void selectCurrentTurn() {
    }
}
