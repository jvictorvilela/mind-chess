package mindchess;

/**
 *
 * @author victor
 */
public class King implements chessPiece {
    String pieceName;
    char color;
    
    public King(char color) {
        this.color = color;
        this.pieceName = "king";
    }
    
    @Override
    public boolean isValid(Move move) {
        return true;
    }
}
