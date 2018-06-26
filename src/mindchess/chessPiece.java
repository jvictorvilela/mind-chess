package mindchess;

/**
 *
 * @author victor
 */
public interface chessPiece {
    public boolean isValid(Move move); // método que verifica se o movimento é válido para a peça, sem considerar se a jogada é realmente válida para a partida
}
