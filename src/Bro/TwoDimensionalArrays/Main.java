package Bro.TwoDimensionalArrays;

public class Main {
    // 2D array = An array where each element is an array.
    //            Useful for storing a Matix of data.

    /*
    What a 2D array actually is
    A 2D array in Java isn't some special structure — it's just an array of arrays. When you write int[][] grid = new int[3][4];,
    you're creating one array that holds 3 references, and each of those references points to its own separate array of 4 ints.
    So grid is not a flat block of 12 numbers — it's a container of 3 independent rows.
    This is the single most important thing to grasp, because everything else follows from it.
    How to picture it
    Think of it like a spreadsheet. grid[row][col] — the first index picks the row, the second picks the column within that row.
             col 0   col 1   col 2   col 3
    row 0  [   0       0       0       0   ]
    row 1  [   0       0       0       0   ]
    row 2  [   0       0       0       0   ]
     */

    public static void main(String[] args) {

        // This is an array of arrays. If we lay the data out in rows x and columns y like below

        String[][] xy = {{"       ", "Column 1 ", "Column 2 ", "Column 3 "},
                {"Row 1 ", "    11      ", "   12    ", "   13    "},
                {"Row 2 ", "    21      ", "   22    ", "   23    "},
                {"Row 3 ", "    31      ", "   32    ", "   33    "}};

        for (String[] rows : xy) {
            for (String columns : rows) {
                System.out.print(columns);
            }
            System.out.println();
        }

        System.out.println();

        String[][] groceries = {{"Apple ", "Orange ", "Banana"},
                {"Potato ", "Onion ", "Carrot"},
                {"Chicken ", "Pork ", "Fish"}};

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food);
            }
            System.out.println();
        }


    }


}
