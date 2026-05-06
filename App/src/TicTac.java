// UC7: Computer Makes a Random Move (Easy Level)

import java.util.Random;

public class TicTac {

    // Tic Tac Toe board
    static char[][] board = {
            {'X', ' ', 'O'},
            {' ', 'X', ' '},
            {' ', ' ', ' '}
    };

    // Computer symbol
    static char computerSymbol = 'O';

    // Main method
    public static void main(String[] args) {

        // Computer makes a move
        computerMove();

        // Print updated board
        printBoard();
    }

    // Method for computer random move
    static void computerMove() {

        Random random = new Random();

        while (true) {

            // Generate random row and column
            int row = random.nextInt(3);
            int col = random.nextInt(3);

            // Check if cell is empty
            if (board[row][col] == ' ') {

                // Place computer symbol
                board[row][col] = computerSymbol;

                System.out.println("Computer placed O at: " + row + ", " + col);
                break;
            }
        }
    }

    // Method to print board
    static void printBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}