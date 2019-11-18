package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][]board = new String[3][3];

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];
        for (int i = 0; i < row.length ; i++) {
           row[i] = board[value][i];
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < column.length ; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0].equals(row[1])&& row[0].equals(row[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        String[] column = getColumn(columnIndex);
        return column[0].equals(column[1])&& column[0].equals(column[2]);
    }

    public String getWinner() {
           if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])){
               return getRow(0)[0];
           }
        if(board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2])){
            return getRow(2)[0];
        }
        for(int i =0 ; i < board.length;  i++){
            if(isRowHomogenous(i)){
                return(getRow(i)[0]);
            }
            if(isColumnHomogeneous(i)){
                return(getColumn(i)[0]);
            }
        }
      return null;
    }

    public String[][] getBoard() {

        return null;
    }
}
