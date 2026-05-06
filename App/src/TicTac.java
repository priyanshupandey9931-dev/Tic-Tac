import java.util.Random;

public class TicTac {

    static String currentPlayer;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Toss logic to decide first player and assign symbols
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = "Human";
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display result
    static void displayTossResult() {
        System.out.println("Toss Result:");
        System.out.println("First Player: " + currentPlayer);
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}