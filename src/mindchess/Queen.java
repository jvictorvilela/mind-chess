package mindchess;

/**
 *
 * @author victor
 */
public class Queen implements chessPiece {
    String pieceName;
    char color;
    
    public Queen(char color) {
        this.color = color;
        this.pieceName = "queen";
    }
    
    @Override
    public boolean isValid(Move move) {
        return true;
    }
}
