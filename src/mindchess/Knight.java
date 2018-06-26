package mindchess;

/**
 *
 * @author victor
 */
public class Knight implements chessPiece {
    String pieceName;
    char color;
    
    public Knight(char color) {
        this.color = color;
        this.pieceName = "knight";
    }
    
    @Override
    public boolean isValid(Move move) {
        return true;
    }
}
