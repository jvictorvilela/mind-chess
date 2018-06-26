package mindchess;

/**
 *
 * @author victor
 */
public class Match {
    private int idMatch;
    private int idPlayer1;
    private int idPlayer2;
    private int whitePlayerId;
    private Board board;
    private int moveCount;
    public Match(int idPlayer1, int idPlayer2) {
        this.idPlayer1 = idPlayer1;
        this.idPlayer2 = idPlayer2;
    }
}
