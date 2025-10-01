import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A very simple text-based UI for Sudoku.
 * @author  D. Wolff
 */
public class SudokuSolverMain {
    
    /**
     * Loads the puzzle file and starts the solver, then displays results.
     *
     * @param args the command line arguments (ignored)
     */
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Puzzle file name: ");
        String fileName = scan.nextLine();
        int[][] puzzle = parse(fileName);
        if( puzzle != null ) {
            solve(new SudokuGrid(puzzle));
        }
    }

    public static int[][] parse(String fileName) {
        try( Scanner fScan = new Scanner(new File(fileName)) ) {
            int puzzleSize = fScan.nextInt();
            fScan.nextLine();

            int[][] puzzle = new int[puzzleSize][puzzleSize];
            for (int i = 0; i < puzzleSize; i++) {
                String row = fScan.nextLine();
                String[] parts = row.split("\\s+");
                for (int j = 0; j < puzzleSize; j++) {
                    if (!parts[j].equals("-"))
                        puzzle[i][j] = Integer.parseInt(parts[j]);
                }
            }

            return puzzle;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return null;
        }
    }

    private static void solve(SudokuGrid puzzle) {
        System.out.println("Solving...");
        boolean result = puzzle.fillGrid();
        if(result) {
            System.out.println(puzzle);
        } else {
            System.out.println("NO SOLUTION");
        }
    }
}
