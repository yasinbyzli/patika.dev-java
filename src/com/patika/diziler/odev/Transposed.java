package com.patika.diziler.odev;

public class Transposed {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int[][] transposed = getTranspose(matrix);

        // example
        printMatrix(matrix);
        System.out.println("-----------------------------------");
        printMatrix(transposed);

    }

    static int[][] getTranspose(int[][] matrix) {

        int length1 = matrix.length;
        int length2 = matrix[0].length;
        int[][] transposed = new int[length2][length1];

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }

        return transposed;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
