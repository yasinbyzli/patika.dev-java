package com.patika.graduationProjects;

import java.util.Scanner;

public class MineSweeper {

    int col;
    int row;
    boolean gameOver;
    boolean win;

    MineSweeper(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void run() {
        int[][] board = this.makeBoard(this.col, this.row);
        String[][] gamefield = this.getGamefield(this.col, this.row);
        int left = (this.col * this.row) - this.getMineNumber(this.col, this.row);

        Scanner s = new Scanner(System.in);
        createMap(gamefield);
        while (!this.gameOver) {
            System.out.print("Satır giriniz: ");
            int row = s.nextInt() - 1;
            System.out.print("Sütun giriniz: ");
            int col = s.nextInt() - 1;

            if (!checkEntry(col, row)) {
                System.out.println("Geçersiz kordinatlar girdiniz.");
                System.out.println("");
                continue;
            }
            if (checkMine(board[row][col])) {
                gamefield[row][col] = Integer.toString(this.countMines(board, row, col));
                if (--left > 0) {
                    createMap(gamefield);
                } else {
                    createMap(gamefield);
                    this.gameOver = true;
                    this.win = true;
                }

            } else {
                gamefield[row][col] = "*";
                createMap(gamefield);
                this.gameOver = true;
                this.win = false;
            }

        }

        if (win) {
            System.out.println("Oyunu Kazandınız!");

        } else {
            System.out.println("Oyunu Kaybettiniz!");

        }

    }

    boolean checkMine(int i) {
        if (i == 0)
            return true;
        else
            return false;
    }

    int[][] makeBoard(int col, int row) {
        int mineNumber = this.getMineNumber(this.col, this.row);

        int length = col * row;
        int[][] minefield = new int[row][col];

        while (mineNumber != 0) {
            int randomIndex = (int) (Math.random() * length);
            if (minefield[randomIndex % row][randomIndex / col] == 0) {
                minefield[randomIndex % row][randomIndex / col] = 1;
                mineNumber--;
            } else {
                continue;
            }

        }
        return minefield;

    }

    String[][] getGamefield(int col, int row) {
        String[][] gamefield = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gamefield[i][j] = "-";
            }
        }

        return gamefield;
    }

    int countMines(int[][] board, int row, int col) {
        if (row == 0) {
            if (col == 0) {
                return board[row][col] + board[row + 1][col] + board[row + 1][col + 1] + board[row][col + 1];
            } else if (col == board[0].length - 1) {
                return board[row][col] + board[row + 1][col] + board[row][col - 1] + board[row + 1][col - 1];
            } else {
                return board[row][col] + board[row + 1][col] + board[row][col - 1] + board[row + 1][col - 1]
                        + board[row + 1][col + 1] + board[row][col + 1];
            }
        } else if (row == board.length - 1) {
            if (col == 0) {
                return board[row][col] + board[row - 1][col] + board[row - 1][col + 1] + board[row][col + 1];
            } else if (col == board[0].length - 1) {
                return board[row][col] + board[row - 1][col] + board[row][col - 1] + board[row - 1][col - 1];
            } else {
                return board[row][col] + board[row - 1][col] + board[row][col - 1] + board[row - 1][col - 1]
                        + board[row - 1][col + 1] + board[row][col + 1];
            }
        } else {
            if (col == 0) {
                return board[row][col] + board[row - 1][col] + board[row - 1][col + 1] + board[row][col + 1]
                        + board[row + 1][col] + board[row + 1][col + 1];
            } else if (col == board[0].length - 1) {
                return board[row][col] + board[row - 1][col] + board[row][col - 1] + board[row - 1][col - 1]
                        + board[row + 1][col] + board[row + 1][col - 1];
            } else {
                return board[row][col] + board[row - 1][col] + board[row][col - 1] + board[row - 1][col - 1]
                        + board[row - 1][col + 1] + board[row][col + 1] + board[row + 1][col] + board[row + 1][col - 1]
                        + board[row + 1][col + 1];
            }
        }
    }

    void createMap(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void createMap(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        System.out.println();
    }

    int getMineNumber(int col, int row) {
        return col * row / 4;
    }

    boolean checkEntry(int col, int row) {
        if (col < 0 || col > this.col || row < 0 || row > this.row)
            return false;
        return true;
    }

}
