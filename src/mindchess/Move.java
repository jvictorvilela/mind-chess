package mindchess;

/**
 *
 * @author victor
 */
public class Move {
    String move;
    int idPlayer;
    int idMatch;
    int moveNumber;
    public Move(String move, int idPlayer, int idMatch, int moveNumber) {
        this.move = move;
        this.idPlayer = idPlayer;
        this.idMatch = idMatch;
        this.moveNumber = moveNumber;
    }
}
