// UC10: Detect Draw Condition

public class TicTac {

    // Tic Tac Toe board
    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    // Main method
    public static void main(String[] args) {

        // Check draw condition
        System.out.println(isDraw());
    }

    // Method to detect draw
    static boolean isDraw() {

        // Traverse board to check empty cells
        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 3; c++) {

                // If empty cell found
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }

        // No empty cells found
        return true;
    }
}