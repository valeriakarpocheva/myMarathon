package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }
    public void print(){
        int i = 0;
        int y = 0;
        for(i = 0; i < board.length; i++){
            for(y = 0; y < board.length; y++){
                System.out.print(board[i][y]);
                if(y==7){
                    System.out.println();
                }
            }
        }

    }
}
