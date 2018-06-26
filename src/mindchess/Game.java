package mindchess;
import DAO.PlayerDAO;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Game {
    Player player;
    Match match;
    Scanner input = new Scanner(System.in);
    
    public Game() {
        this.player = null;
        this.match = null;
    }
    
    public void startGame() { // retorna falso caso o jogo tenha finalizado
        if (player == null) {
            int opt;
            // mensagem de boas vindas
            System.out.println("Welcome to mindChess 1.0");

            // menu inicial
            do {
                System.out.println("1 - to login");
                System.out.println("2 - to register");
                opt = input.nextInt();
            } while (opt < 1 || opt > 2);

            // autenticação do usuário
            switch (opt) {
                case 1: player = authenticateUser();
                        break;
                case 2: player = registerUser();
            }
        }
        
        if (player == null) {
            System.exit(0);
        }
        
        boolean status = true; // se for falso, o jogo será finalizado
        // página inicial do usuário
        while (status) {
            printOnlinePlayers();
            getNews();
            status = writeString(input.nextLine());
        }
    }
    
    private Player login(String user, String password) { // retorna o player ou null caso não exista
        PlayerDAO dao = new PlayerDAO();
        return dao.authenticate(user, password);
        
    }
    
    private Player authenticateUser() { //método que pede o usuário e senha ao usuário, e retorna o objeto Player
        Player player;
        input.nextLine();
        do {
            System.out.println("User:");
            String user = input.nextLine();
            System.out.println("Password:");
            String password = input.nextLine();
            player = login(user, password);
            if (player == null) {
                System.out.println("Incorrect user or password");
            }
        } while (player == null);
        return player;
    }
    
    private Player registerUser() { // método para registar usuário. retorna o usuário registrado
        String nick = "";
        String password = "";
        
        
        return null;
    }
    
    private Player createUser(String nick, String senha) {
        PlayerDAO dao = new PlayerDAO();
        return dao.createUser(nick, senha);
    }
    
    private void printOnlinePlayers() {
        // imprimir todos os players online
    }
    
    private boolean writeString(String str) { // método que lê a string e direciona o usuario para o local desejado
        if (str.equals("")) {
            return true;
        }
        String[] array = str.split(" ");
        if (array.length > 2 || array.length == 0) {
            return true;
        }
        switch (array[0]) {
            case "match": // mandar convite de partida para jogador informado
                break;
            case "accept-match": // aceitar convite de partida
                break;
        }
        return true;
    }
    
    private void getNews() { // método que verifica se existem novas novidades para o usuário (convite para partidas, mensagens...)
        
    }
}
