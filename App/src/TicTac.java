// UC9: Check Winning Condition

public class TicTac {

    // Tic Tac Toe board
    static char[][] board = {
            {'X', 'X', 'X'},
            {'O', ' ', 'O'},
            {' ', ' ', ' '}
    };

    // Main method
    public static void main(String[] args) {

        // Check if player X has won
        System.out.println(hasWon('X'));
    }

    // Method to check winning condition
    static boolean hasWon(char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                    board[i][1] == symbol &&
                    board[i][2] == symbol) {

                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {

            if (board[0][i] == symbol &&
                    board[1][i] == symbol &&
                    board[2][i] == symbol) {

                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
                board[1][1] == symbol &&
                board[2][2] == symbol) {

            return true;
        }

        // Check opposite diagonal
        if (board[0][2] == symbol &&
                board[1][1] == symbol &&
                board[2][0] == symbol) {

            return true;
        }

        // No winning condition found
        return false;
    }
}