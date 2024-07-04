package Collections.Task_1;

public class Gamer {

    public static void main(String[] args) {

        Player player1 = new Player(584953, "Dendi", true);
        Player player2 = new Player(584953, "Dendi", true);

        System.out.println(player1 == player2);

        System.out.println(player1.equals(player2));
    }

}
