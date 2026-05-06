public class TicTac {

    public static void main(String[] args) {

        int slot = 7; // example input

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // Convert slot to row index (0–2)
    static int getRowFromSlot(int slot) {
        int index = slot - 1;   // convert to 0-based
        return index / 3;
    }

    // Convert slot to column index (0–2)
    static int getColFromSlot(int slot) {
        int index = slot - 1;   // convert to 0-based
        return index % 3;
    }
}