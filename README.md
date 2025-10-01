# Sudoku-Solver
Watch as recursive backtracking conquers Sudoku puzzles faster than you can say "numbers"!  A Java-based Sudoku solver that reads puzzles from files and solves them using recursive backtracking. Perfect for understanding algorithms while watching puzzles solve themselves.

# Overview
This project implements a recursive backtracking algorithm to solve standard 9×9 Sudoku puzzles. The solver systematically explores possibilities, backtracks when conflicts arise, and efficiently finds valid solutions.


# Features
🧩 Solves any valid 9×9 Sudoku puzzle

⚡ Efficient recursive backtracking implementation

📁 File-based puzzle input system

🔍 Optional: Find all solutions and check uniqueness

🎯 Clean, modular Java codebase

# Quick Start / Setting Up the Program 
Prerequisites
Java JDK 21+
IntelliJ IDEA or any Java IDE

# Installation & Running
git clone https://github.com/Sanjina-Kumari/SudokuSolver.git
cd SudokuSolver
javac src/*.java
java src/SudokuSolverMain
When prompted, enter your puzzle filename (e.g., puzzle01_9.txt)

# Project Structure
    text
    SudokuSolver/
    ├── src/
    │   ├── SudokuSolverMain.java    # Entry point
    │   └── SudokuGrid.java          # Core solver logic
    ├── puzzles/                     # Sample puzzles
    │   ├── puzzle01_9.txt
    │   └── puzzle02_9.txt
    └── README.md
    Example Puzzle
    Input (puzzle01_9.txt):

## Example Puzzle
    # Input (puzzle01_9.txt):
        9
        - - - - - 1 6 5 7
        1 3 - - 5 - - - -
        - - - - 2 - - 1 -
        - - - - - 2 5 - -
        - 2 - 8 7 5 - 4 -
        - - 1 9 - - - - -
        - 5 - - 8 - - - -
        - - - - 3 - - 6 2
        2 8 4 7 - - - - -
   
    # Output:
    
        Solved Sudoku Grid:
        5 4 2 3 6 1 6 5 7
        1 3 7 4 5 9 2 8 6
        ...

# Troubleshooting
   - Compilation issues: Verify JDK installation and file paths
   - File not found: Ensure puzzle files are in correct directory
   - Incorrect solutions: Check puzzle format and algorithm implementation
    
# Extensions
    - Find all possible solutions for a puzzle
    - Verify solution uniqueness
    - Support for different grid sizes
    
# Developer
  Developed by Sanjina Kumari at Pacific Lutheran University.
 
  For questions or feedback, feel free to reach out at sanjinamandhwani1@gmail.com!

# 📜 Acknowledgements
Project inspired by coursework in **CSCI 270 at Pacific Lutheran University**.  

Starter dataset and UML guidance provided by faculty.  

