import java.util.Scanner;

/**
 * Created by Rich on 28-08-16.
 */
public class Game {

    public static void main(String[] args) {
        int quit = 0;
        //Selection structure
        while (quit == 0){
            showMenu();
            Scanner in = new Scanner(System.in);
            int selection = getUserMenuInput();
            switch (selection) {
                case 1:
                    startNewGame();
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Mineral Supertrumps is a game designed to help players learn about the properties and uses of common rock-forming minerals.\n");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }

    private static void startNewGame() {
        String name = getName();
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealRandomCardsToEachPlayer();
        game.selectPlayer();
        STPlayer humPlayer = game.getHumanPlayer();
        humPlayer.setName(name);
        showPlayer(humPlayer);
    }


    private static void showPlayer(STPlayer humPlayer){
        System.out.println();
        System.out.println("Human player= " + humPlayer.toString());
    }

    private static int getNumPlayers() {
        int choice = 0;
        while (choice != 3 && choice != 4 && choice != 5) {
            System.out.println("Please enter the number of players.");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
        }
        System.out.println("\nYou have selected "+ choice +" players.\n");
        return choice;
    }

    private static int getUserMenuInput() {
        int choice;
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        return choice;
    }

    private static void showMenu() {
        System.out.println("Welcome to Mineral Supertrumps!\n" +
                "What would you like to do?\n" +
                "[1] Play a new game\n" +
                "[2] View the Mineral collection\n" +
                "[3] View the rules\n" +
                "[4] Help\n" +
                "[5] Quit\n");
    }

    public static String getName() {
        System.out.println("Please enter your name: ");
        String name;
        Scanner in = new Scanner(System.in);
        name = in.next();
        return name;
    }
}
