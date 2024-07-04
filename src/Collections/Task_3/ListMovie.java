package Collections.Task_3;

import java.util.ArrayList;

public class ListMovie {

    public static void main(String[] args) {

        ArrayList<Movie> film = new ArrayList<>();

        film.add(
            new Movie("Властелин колец", 8.6, "Фэнтези", "Новая Зеландия", true));
        film.add(
            new Movie("Темный рыцарь", 8.5, "Нуар", "США", true));
        film.add(
            new Movie("Большой куш", 8.6, "Кинокомедия", "Великобритания", false));

        System.out.println(film.get(1));
    }

}
