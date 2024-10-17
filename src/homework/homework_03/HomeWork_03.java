package homework.homework_03;

public class HomeWork_03 {

    public static void main(String[] args) {

        // Task 1
        int yearsOld = 40;
        double priceMilk = 1.19;
        String name = "Igor";

        System.out.println("Years old: " + yearsOld);
        System.out.println("Price Milk: " + priceMilk);
        System.out.println("My Name: " + name);

        // Task 2
        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;
        // average - средняя
        int result = (var1 + var2 + var3 + var4) / 4;
        System.out.println("Result: " + result);
        int rest = (var1 + var2 + var3 + var4) % 4;
        System.out.println("Rest: " + rest);

        // Task 3,*1
        double A = 1000;
        double B = 500;

        int discount = 10;  // skidka int v osnovnom

        double sumDiscount = (A + B) * discount / 100;
        double sumPrice = A + B - sumDiscount;
        double sumPrice1 = (A + B) * (100 - discount) / 100;

        System.out.println("Discount sum: " + sumDiscount);
        System.out.println("Summa so skidkoi: " + sumPrice);
        System.out.println("Summa so skidkoi: " + sumPrice1);

        // Task 3,*2
        int mon = 27;
        int tue = 30;
        int wed = 28;
        int thu = 22;
        int fri = 26;
        int sat = 28;
        int sun = 24;

        int days = 7;
        // todo
        int sumWeek = (mon + tue + wed + thu + fri + sat + sun);

        int avarageTemp = sumWeek / days;

        System.out.println("SumWeek: " + sumWeek);
        System.out.println("The average air temperature: " + avarageTemp);

        // TODO fix data

        // Task 4
        // Ne ponyal zadanie

        /* длинный комментарий

         */


    }
}
