// UC6: Place Move on Board
// TicTac class places a player's symbol on the board.

public class TicTac {

    // Tic Tac Toe board
    static char[][] board = new char[3][3];

    // Main method
    public static void main(String[] args) {

        // Place symbol X at row 0, column 0
        placeMove(0, 0, 'X');

        // Print updated board cell
        System.out.println("Symbol at [0][0] = " + board[0][0]);
    }

    // Method to place move on board
    static void placeMove(int row, int col, char symbol) {

        // Update board with symbol
        board[row][col] = symbol;
    }
}