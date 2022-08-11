package Backtrack;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(solvequeen(board,0));
    }

    private static int solvequeen(boolean[][] board, int row) {
        if(row== board.length) {
            displayboard(board);
            return 1;
        }
        int count =0;
        for (int col = 0; col < board.length; col++) {
            if(isSafetoplace(board,row,col)){
                board[row][col]=true;
                count+=solvequeen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static void displayboard(boolean[][] board) {
        for (boolean[] row:
                board) {
            for (boolean element:row) {
                if (element) System.out.print(" Q ");
                else System.out.print(" X ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSafetoplace(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col])return false;

        }
        int leftwall=Math.min(row,col);
        for (int i = 1; i <= leftwall; i++) {
            if(board[row-i][col-i])return false;
        }
        int rightwall=Math.min(row, board.length-col-1);
        for (int i = 1; i <= rightwall; i++) {
            if(board[row-i][col+i])return false;
        }
        return true;
    }
}

