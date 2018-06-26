package mindchess;

/**
 *
 * @author victor
 */
public class Bishop implements chessPiece {
    String pieceName;
    char color;
    
    public Bishop(char color) {
        this.color = color;
        this.pieceName = "bishop";
    }
    
    @Override
    public boolean isValid(Move move) {
        return true;
    }
}
