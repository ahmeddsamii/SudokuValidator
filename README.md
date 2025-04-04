# Sudoku Validator Function




## Overview

The `testSudokuValidity` function validates a Sudoku puzzle of dynamic size, meaning it can handle various Sudoku board sizes such as 4x4, 9x9, 16x16, and so on. The function checks whether the provided Sudoku grid adheres to the basic Sudoku rules:

1. Each row must contain unique numbers (excluding `"-"` placeholders).
2. Each column must contain unique numbers (excluding `"-"` placeholders).
3. Each subgrid (the smaller grids that make up the whole board) must also contain unique numbers (excluding `"-"` placeholders).
4. The numbers within the grid must fall within the range from 1 to the size of the grid (e.g., 1 to 4 for a 4x4 grid, 1 to 9 for a 9x9 grid, etc.).

The function works for any grid size that is a perfect square, such as 4x4, 9x9, 16x16, etc., and dynamically adjusts to these different sizes.

## Link of flowchart
https://drive.google.com/file/d/1U0Vpz4cMDcEFWCOSMOYmBmT_6Ss0adnj/view?usp=sharing

## Screenshot of the flowchart
![SudokuCheckerFlowChart drawio](https://github.com/user-attachments/assets/ad3ce448-7665-4306-bcb5-2643d58e3a8d)
