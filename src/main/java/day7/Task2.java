package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int stamina1 = random.nextInt(90 + 100);
        int stamina2 = random.nextInt(90 + 100);
        int stamina3 = random.nextInt(90 + 100);
        int stamina4 = random.nextInt(90 + 100);
        int stamina5 = random.nextInt(90 + 100);
        int stamina6 = random.nextInt(90 + 100);

        Player player1 = new Player(stamina1);
        Player player2 = new Player(stamina2);
        Player player3 = new Player(stamina3);
        Player player4 = new Player(stamina4);
        Player player5 = new Player(stamina5);
        Player player6 = new Player(stamina6);
        Player player7 = new Player(10);

        System.out.println(Player.numberOfPlayers);

        player1.info();

        for (int counter = 0; counter<100; counter++){
            player1.run();
        }
        System.out.println(Player.numberOfPlayers);

    }
}