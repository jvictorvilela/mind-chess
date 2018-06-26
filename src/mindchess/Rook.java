package mindchess;

/**
 *
 * @author victor
 */
public class Rook implements chessPiece {
    String pieceName;
    char color;
    
    public Rook(char color) {
        this.color = color;
        this.pieceName = "rook";
    }
    
    @Override
    public boolean isValid(Move move) {
        return true;
    }
}
