package Collections.Task_5;

import Collections.Task_1.Player;
import java.util.HashMap;
import java.util.Map;

public class PlayerList {

    public static void main(String[] args) {

        Map<Player, Integer> players = new HashMap<>();
        Player gamer1 = new Player(357357, "rrwr", true);
        Player gamer2 = new Player(4534, "zdrbzdr", true);
        Player gamer3 = new Player(4879, "i,fh", true);
        Player gamer4 = new Player(438749, "cbtdj", true);
        Player gamer5 = new Player(43878, "aawfgr", true);
        Player gamer6 = new Player(43848, "qwerty", true);
        Player gamer7 = new Player(789789, "asdasd", true);
        Player gamer8 = new Player(348874, "zxc", true);
        Player gamer9 = new Player(8767867, "tdasnm", true);
        Player gamer10 = new Player(7867867, "advea", true);

        players.put(gamer1, 1);
        players.put(gamer2, 2);
        players.put(gamer3, 3);
        players.put(gamer4, 4);
        players.put(gamer5, 5);
        players.put(gamer6, 6);
        players.put(gamer7, 7);
        players.put(gamer8, 8);
        players.put(gamer9, 9);
        players.put(gamer10, 10);

        Player gamer11 = new Player(4879, "i,fh", true);
        players.put(gamer11, 11);

        for (int i = 1; i <= players.size(); i++) {
            System.out.println(i);
        }
    }
}

//        Map<Integer, Player> players = new HashMap<>();
//
//        Player gamer1 = new Player(357357, "rrwr", true);
//        Player gamer2 = new Player(4534, "zdrbzdr", true);
//        Player gamer3 = new Player(4879, "i,fh", true);
//        Player gamer4 = new Player(438749, "cbtdj", true);
//        Player gamer5 = new Player(43878, "aawfgr", true);
//        Player gamer6 = new Player(43848, "qwerty", true);
//        Player gamer7 = new Player(789789, "asdasd", true);
//        Player gamer8 = new Player(348874, "zxc", true);
//        Player gamer9 = new Player(8767867, "tdasnm", true);
//        Player gamer10 = new Player(7867867, "advea", true);
//
//        players.put(1, gamer1);
//        players.put(2, gamer2);
//        players.put(3, gamer3);
//        players.put(4, gamer4);
//        players.put(5, gamer5);
//        players.put(6, gamer6);
//        players.put(7, gamer7);
//        players.put(8, gamer8);
//        players.put(9, gamer9);
//        players.put(10, gamer10);

//        Player newGamer = new Player(4879, "i,fh", true);
//        players.put(11, newGamer);
//
//        int size = players.size();
//
//        for (int i = 1; i <= size; i++) {
//            if (players.get(i).hashCode() == newGamer.hashCode()) {
//                players.put(i, newGamer);
//                size = size - 1;
//            }
//            System.out.println(i + " - " + players.get(i));
//        }
//    }
//
//}
