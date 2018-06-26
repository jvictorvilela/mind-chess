package mindchess;

/**
 *
 * @author victor
 */
public class Player {
    int id;
    String nick;
    public Player(int id, String nick) {
        this.id = id;
        this.nick = nick;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
