// UC8: Continuous Turn-Based Game Loop

public class TicTac {

    // Variable to track player turn
    static boolean isHumanTurn = true;

    // Variable to track game status
    static boolean gameOver = false;

    // Main method
    public static void main(String[] args) {

        int turnCount = 0;

        // Continuous game loop
        while (!gameOver) {

            // Human player turn
            if (isHumanTurn) {
                System.out.println("Human Player Turn");
            }

            // Computer player turn
            else {
                System.out.println("Computer Player Turn");
            }

            // Simulate move played
            System.out.println("Move Played");

            // Increase turn count
            turnCount++;

            // Check win or draw condition
            if (turnCount == 9) {
                gameOver = true;
                System.out.println("Game Draw");
            }

            // Switch turns
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over");
    }
}