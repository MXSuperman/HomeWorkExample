package MXN;

public class Main {

    public static void main(String[] args) {

    // Задание 1

    byte Weght = 91;
    short crackers = 700;
    int grape = 1001;
    long paper = 5000000L;
    float ice = 4.7F;
    double temperature = -25;
    char bar = 41;
    boolean isWeight = Weght <= 101;

    // Задание 2

        double sportsmanBlue = 78.2;
        double sportsmanPink = 82.7;
        double weightAllSporstsams = sportsmanBlue + sportsmanPink;
        double weightDiffewrence = sportsmanPink - sportsmanBlue;
        System.out.println("Общиӣ вес спортсменов " + weightAllSporstsams + " кг");
        System.out.println("Разница в весе спортсменов " + weightDiffewrence + " кг");

        // Задание 3

        byte banana = 5;
        byte milk = 2;
        byte iceCreamPlombire = 2;
        byte eggRaw = 4;
        int productsWeight = banana * 80 + milk * 105 + iceCreamPlombire * 100 + eggRaw * 70;
        System.out.println("Общиӣ вес продутов " + productsWeight + " в гр");

        float totalWeightProducts = 1090;
        float oneKilog = totalWeightProducts / 1000;
        System.out.println("Общииӣ вес продуктов " + oneKilog + " в кг");

        // Задание 4

        byte goalsLoseWeight = 7;
        int oneKilo = goalsLoseWeight * 1000;
        System.out.println("Цель похудеть на " + oneKilo + " грамм");

        short perDay = 250;
        short goalsLose = 7000;
        int goal = goalsLose / perDay;
        System.out.println("Понадобится " + goal + " днеӣ теряя 250 грамм в день");

        short perDay1 = 500;
        short goalsLose1 = 7000;
        int goal1 = goalsLose1 / perDay1;
        System.out.println("Понадобится " + goal1 + " днеӣ теряя 500 грамм в день");

        // Задание 5

        int mashaSalary = 67760;
        byte totalOneYear = 12;
        float bonus = 0.10f;
        float premium = mashaSalary * bonus;
        float newSalary = mashaSalary + premium;
        int perYearBefore = mashaSalary * totalOneYear;
        float perYearAfter = newSalary * totalOneYear;
        float differenrts = perYearAfter - perYearBefore;
        System.out.println("Зарпалта за год до повышения Маши " + perYearBefore + " руб");
        System.out.println("Зарплата за год после повышения Маши " + perYearAfter + " руб");
        System.out.println("Разница за год зарпалаты Маши до повышения " + differenrts + " руб");

        int denisSalary = 83690;
        float premium1 = denisSalary * bonus;
        float newSalary1 = denisSalary + premium1;
        int perYearBefore1 = denisSalary * totalOneYear;
        float perYearAfter1 = newSalary1 * totalOneYear;
        float differents1 = perYearAfter1 - perYearBefore1;
        System.out.println("Зарпалта за год до повышения Дениса " + perYearBefore1 + " руб");
        System.out.println("Зарплата за год после повышения Дениса " + perYearAfter1 + " руб");
        System.out.println("Разница зарпалаты за год до повышения Дениса " + differents1 + " руб");

        int khristinaSalary = 76230;
        float premium2 = khristinaSalary * bonus;
        float newSalary2 = khristinaSalary + premium2;
        int perYearBefore2 = khristinaSalary * totalOneYear;
        float perYearAfter2 = newSalary2 * totalOneYear;
        float differents2 = perYearAfter2 - perYearBefore2;
        System.out.println("Зарпалта за год до повышения Кристины " + perYearBefore2 + " руб");
        System.out.println("Зарплата за год  после повышения Кристины " + perYearAfter2 + " руб");
        System.out.println("Разница за год зарпалаты Кристины до повышения " + differents2 + " руб");
    }
}
