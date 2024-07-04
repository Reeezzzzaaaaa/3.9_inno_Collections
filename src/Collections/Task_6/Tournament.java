package Collections.Task_6;

import Collections.Task_1.Player;
import java.util.HashMap;
import java.util.Map;

public class Tournament {

    public static void main(String[] args) {

        Map<Player, Integer> points = new HashMap<>();

        Player id1 = new Player(357357, "rrwr", true);
        Player id2 = new Player(4534, "zdrbzdr", true);
        Player id3 = new Player(4879, "i,fh", true);
        Player id4 = new Player(438749, "cbtdj", true);
        Player id5 = new Player(43878, "aawfgr", true);
        Player id6 = new Player(43848, "qwerty", true);
        Player id7 = new Player(789789, "asdasd", true);
        Player id8 = new Player(348874, "zxc", true);
        Player id9 = new Player(8767867, "tdasnm", true);
        Player id10 = new Player(7867867, "advea", true);

        points.put(id1, 0);
        points.put(id2, 0);
        points.put(id3, 0);
        points.put(id4, 10);
        points.put(id5, 0);
        points.put(id6, 0);
        points.put(id7, 12);
        points.put(id8, 11);
        points.put(id9, 13);
        points.put(id10, 5);

        points.entrySet().stream()
            .sorted(Map.Entry.<Player, Integer>comparingByValue().reversed())
            .limit(3)
            .forEach(System.out::println);


    }

}
