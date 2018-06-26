package mindchess;

/**
 *
 * @author victor
 */
public class Board {
    chessPiece[][] board;
    public Board() {
        board = new chessPiece[8][8];
        // inicializar vetor board com as peças
    }
    
    public boolean addMove(Move move) {
        return true;
    }
}
