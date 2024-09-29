package homework_07;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int note = random.nextInt(13);

        System.out.println("ozenka" + note);

        int time = 45;
        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println(" kak vi radi");
                time += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("molodes");
                time += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("-----");
                time += 15;
                break;
            case 3:
                System.out.println("kasjak");
                time -= 10;
                break;
            case 2:
            case 1:
            case 0:
                System.out.println(" verbot");
                time = 0;
                break;
            default:
                System.out.println("Falsivka");

        }
if (time > 60) time = 60;
if (time < 0) time = 0;

        System.out.println("Ostatok vremeni: " + time);

    }
}
