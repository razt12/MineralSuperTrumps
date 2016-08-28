import java.util.Scanner;

/**
 * Created by Rich on 28-08-16.
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to Mineral Supertrumps!\n" +
                "What would you like to do?\n" +
                "[1] Play a new game\n" +
                "[2] View the Mineral collection\n" +
                "[3] View the rules\n" +
                "[4] Help\n" +
                "[5] Quit\n");
        Scanner in = new Scanner(System.in);
        int selection = in.nextInt();
        switch (selection) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Mineral Supertrumps is a game designed to help players learn about the properties and uses of common rock-forming minerals.");
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
        }
    }
}
