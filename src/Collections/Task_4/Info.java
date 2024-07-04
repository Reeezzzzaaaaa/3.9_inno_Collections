package Collections.Task_4;

import java.util.ArrayList;

public class Info {

    public static void main(String[] args) {

        ArrayList<Company> info = new ArrayList<>();
        ArrayList<Films> netflix = new ArrayList<>();
        ArrayList<Films> fox = new ArrayList<>();
        ArrayList<Films> sony = new ArrayList<>();

        netflix.add(new Films("Ход Королевы"));
        netflix.add(new Films("Очень странные дела"));
        netflix.add(new Films("Чёрное зеркало"));

        fox.add(new Films("Аватар"));
        fox.add(new Films("Один дома"));
        fox.add(new Films("Крепкий орешек"));

        sony.add(new Films("Братья из Гримсби"));
        sony.add(new Films("Человек-паук: Через вселенные"));
        sony.add(new Films("Однажды в… Голливуде"));

        info.add(new Company("Netflix", 1997, netflix));
        info.add(new Company("20 Century Fox", 1935, fox));
        info.add(new Company("Sony", 1946, sony));

        for (Company company : info) {

            String i = String.valueOf(company.getCompanyFilm());
            String l = i.replace("[", "");
            String filmsList = l.replace("]", "");
            System.out.println(company.getCompanyTitle() + ": " + filmsList);

        }

    }

}
