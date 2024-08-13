package arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> setRow = new HashSet<>();
        Set<Character> setCol = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (setRow.contains(board[i][j]) && Character.isDigit(board[i][j])) {
                    return false;
                } else {
                    setRow.add(board[i][j]);
                }

                if (setCol.contains(board[j][i]) && Character.isDigit(board[j][i])) {
                    return false;
                } else {
                    setCol.add(board[j][i]);
                }
            }
            setRow.clear();
            setCol.clear();
        }

        Set<Character> setSubBoard = new HashSet<>();
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j++) {
                for (int k = i; k < i + 3; k++) {
                    if (setSubBoard.contains(board[j][k]) && Character.isDigit(board[j][k])) {
                        return false;
                    } else {
                        setSubBoard.add(board[j][k]);
                    }
                }
                if ((j + 1) % 3 == 0)
                setSubBoard.clear();
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'8', '7', '9', '.', '.', '.', '2', '.', '.'},
                {'6', '5', '2', '4', '1', '9', '.', '.', '8'},
                {'3', '4', '1', '.', '8', '.', '.', '7', '9'}
        };
        //System.out.println(isValidSudoku(board));
        System.out.println(isValidSudoku(board));


    }
}
