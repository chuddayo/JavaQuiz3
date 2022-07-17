package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] col = new String[3];
        col[0] = board[0][value];
        col[1] = board[1][value];
        col[2] = board[2][value];
        return col;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0].equals(row[1]) && row[2].equals(row[1]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] col = getColumn(columnIndex);
        return col[0].equals(col[1]) && col[2].equals(col[1]);
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i)) {
                return getRow(i)[0];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (isColumnHomogeneous(i)) {
                return getColumn(i)[0];
            }
        }
        String diagonal1 = board[0][0] + board[1][1] + board[2][2];
        String diagonal2 = board[0][2] + board[1][1] + board[2][0];
        if (diagonal1.equals("XXX") || diagonal2.equals("XXX")) return "X";
        if (diagonal1.equals("OOO") || diagonal2.equals("OOO")) return "O";
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
