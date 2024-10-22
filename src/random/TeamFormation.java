package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamFormation {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Borysenko Leonid");
        names.add("Demishev Oleh");
        names.add("Derk Igor");
        names.add("Fesenko Bogdan");
        names.add("Held Svitlana");
        names.add("Kharina Olga");
        names.add("Khaustova Anzhelika");
        names.add("Karsten Elena");
        names.add("Kes Liana");
        names.add("Kibirieva Kateryna");
        names.add("Makharynets Tetiana");
        names.add("Morkvenaite Alisa");
        names.add("Nazarenko Alla");
        names.add("Neshyna Maria");
        names.add("Nesterov Ilya");
        names.add("Pushkar Dmitrii");
        names.add("Romanenko Viktoriia");
        names.add("Saratov Sergej");
        names.add("Stoianov Maksym");
        names.add("Sviatchenko Igor");
        names.add("Sydorenko Yuliia");
        names.add("Tereshchenko Kristina");
        names.add("Yemets Anastasiia");
        names.add("Zichler Nick");

        Collections.shuffle(names);

        List<List<String>> teams = new ArrayList<>();

        for (int i = 0; i < names.size(); i += 4) {
            List<String> team = new ArrayList<>();
            for (int j = i; j < i + 4 && j < names.size(); j++) {
                team.add(names.get(j));
            }
            teams.add(team);
        }

        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Команда " + (i + 1) + ": " + teams.get(i));
        }
    }
}