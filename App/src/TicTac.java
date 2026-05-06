// UC5: Validate User Move
// TicTac class validates whether a move is inside the board boundaries
// and whether the selected cell is empty.

public class TicTac {

    // Tic Tac Toe board
    static char[][] board = {
            {'X', 'O', 'X'},
            {'O', ' ', 'X'},
            {' ', 'O', ' '}
    };

    // Main method
    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        // Check move validity
        if (isValidMove(row, col)) {
            System.out.println("Move Accepted");
        } else {
            System.out.println("Move Rejected");
        }
    }

    // Method to validate move
    static boolean isValidMove(int row, int col) {

        // Boundary checking
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        // Move is valid
        return true;
    }
}