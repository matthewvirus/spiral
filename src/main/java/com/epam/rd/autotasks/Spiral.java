package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int val = 1;
        if (rows != 1) {
            for (int i = 0; i < columns; i++) {
                matrix[0][i] = val++;
            }
            for (int i = 1; i < rows; i++) {
                matrix[i][columns - 1] = val++;
            }
            for (int i = columns - 1; i > 0; i--) {
                matrix[rows - 1][i - 1] = val++;
            }
            for (int i = rows - 1; i > 1; i--) {
                matrix[i - 1][0] = val++;
            }

            int nexRow = 1;
            int nextCol = 1;

            while (val < rows * columns) {
                while (matrix[nexRow][nextCol + 1] == 0) {
                    matrix[nexRow][nextCol] = val++;
                    nextCol++;
                }
                while (matrix[nexRow + 1][nextCol] == 0) {
                    matrix[nexRow][nextCol] = val++;
                    nexRow++;
                }
                while (matrix[nexRow][nextCol - 1] == 0) {
                    matrix[nexRow][nextCol] = val++;
                    nextCol--;
                }
                while (matrix[nexRow - 1][nextCol] == 0) {
                    matrix[nexRow][nextCol] = val++;
                    nexRow--;
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == 0) matrix[i][j] = val;
                }
            }
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = val++;
                }
            }
        }
        return matrix;
    }
}
