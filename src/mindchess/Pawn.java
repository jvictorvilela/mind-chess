package mindchess;

/**
 *
 * @author victor
 */
public class Pawn implements chessPiece {
    String pieceName;
    char color;
    
    public Pawn(char color) {
        this.color = color;
        this.pieceName = "pawn";
    }
    
    @Override
    public boolean isValid(Move move) {
        return true;
    }
}
