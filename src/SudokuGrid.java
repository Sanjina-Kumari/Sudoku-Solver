import java.util.ArrayList;

/**
 * Framework for a Sudoku grid.
 */


public class SudokuGrid {
    /** The grid.  Empty cells have a value of 0. */
    private int[][] grid;
    private ArrayList<int[][]> solutions;

    /**
     * Constructs a Sudoku grid containing the provided values
     * @param grid the grid data
     */
    public SudokuGrid(int[][] grid) {
        this.grid = grid;
     this.solutions = new ArrayList<>();

    }

    /**
     * Fills the Sudoku grid with numbers using recursive backtracking.
     * @return whether the grid was successfully filled
     */
    public boolean fillGrid() {
    int row; //Row
    int col;


        for ( row = 0; row < grid.length; row++) { //base case

            for ( col = 0; col < grid[row].length; col++) {

                if (grid[row][col] == 0) { // if there is an emty cell

                    for (int num = 1; num <= 9; num++) {
                        if (SafePlacingNumber(grid, row, col, num)) {
                            grid[row][col] = num;


                            if (fillGrid()) {
                                return true;
                            }
                            grid[row][col] = 0; // for backtracking
                        }
                    }
                    return false;



                }
            }
        }

        return true;
    }


    public boolean SafePlacingNumber(int[][] board, int row, int col, int num) {

        // Check row
        for (int c = 0; c < board[row].length; c++) {
            if (board[row][c] == num) {

                return false;
            }
        }

        // Check column
        for (int r = 0; r < board.length; r++) {

            if (board[r][col] == num) {

                return false;
            }
        }

        // Check 3x3 box
        int startingRow = row - row % 3;

        int startingCol = col - col % 3;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                if (board[startingRow + r][startingCol + c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public void FindingAllSolutions() {

        this.solutions.clear(); // Reset solutions list

        FindingAllSolutions_helper();
    }


    private void  FindingAllSolutions_helper() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {

                if (grid[row][col] == 0) {

                    for (int num = 1; num <= 9; num++) {

                        if (SafePlacingNumber(grid, row, col, num)) {


                            grid[row][col] = num;
                            FindingAllSolutions_helper();

                            grid[row][col] = 0; // backtracking
                        }
                    }


                    return; // end the searching
                }
            }
        }

        // for storing the working solution
        int[][] solution2 = new int[9][9];
        for (int i = 0; i < 9; i++) {

            solution2[i] = grid[i].clone();
        }

        solutions.add(solution2);
    }


    public int getSolutionCount() {
        return solutions.size();
    }


    /**
     * Constructs a String representation of the grid.
     * @return the grid in a displayable row/column format
     */
    @Override
    public String toString() {
        StringBuilder bldr = new StringBuilder();
        for (int r = 0; r < this.grid.length; r++) {
            for (int c = 0; c < this.grid.length; c++) {
                if(grid[r][c] == 0 ) bldr.append("-");
                else bldr.append(grid[r][c] + " ");
            }
            if (r < this.grid.length-1) {
                bldr.append("\n");
            }
        }
        return bldr.toString();
    }
}
