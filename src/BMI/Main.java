package BMI;

public class Main {
    //To launch game
    public static void main(String[] args) {
        Game game = new Game();
        String player1 = game.inputPlayer1();
        String player2 = game.inputPlayer2();
        game.calculateWinner(player1, player2);
    }

    //To launch BMI
}
