package Collections.Task_2;

import java.util.ArrayList;

public class List<S> {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<String>();

        tasks.add("Проснуться");
        tasks.add("Работать 1");
        tasks.add("Работать 2");
        tasks.add("Работать 3");
        tasks.add("Спать");

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println("Задача " + (i + 1) + ": " + tasks.get(i));
        }

        for (String task : tasks) {
            System.out.println("Задача " + (tasks.indexOf(task) + 1) + ": " + task);
        }
    }
}
