// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int intVar = 3232232;
        byte byteVar = 111;
        short shortVar = 32121;
        long longVar = 8888888888L;

        float floatVar = 22811.12F;
        double doubleVar = 1111888.12;

        System.out.println("Значение переменной с типом int равно " + intVar);
        System.out.println("Значение переменной с типом byte равно " + byteVar);
        System.out.println("Значение переменной с типом short равно " + shortVar);
        System.out.println("Значение переменной с типом long равно " + longVar);
        System.out.println("Значение переменной с типом float равно " + floatVar);
        System.out.println("Значение переменной с типом double равно " + doubleVar);

        System.out.println("example 2");
        float var1 = 27.12F;
        long var2 = 987_678_965_549L;
        float var3 = 2.786F;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;
        System.out.println("gotovo");

        System.out.println("example 3");
        int teacher1Students = 23;
        int teacher2Students = 27;
        int teacher3Students = 30;
        int totalCountOfPaper = 480;

        System.out.println("На каждого ученика рассчитано " + (totalCountOfPaper / (teacher1Students + teacher2Students + teacher3Students)) + " листов бумаги");


        System.out.println("example 4");
        int bottles = 30;
        int minutes = 2;

        int period1 = 20 / minutes * bottles;
        int period2 = 24 * 60 / minutes * bottles;
        int period3 = 3 * 24 * 60 / minutes * bottles;
        int period4 = 30 * 24 * 68 / minutes * bottles;

        System.out.println(" За 20 минут машина произвела " + period1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + period2 + " штук бутылок");
        System.out.println("За 3 суто машина произвела " + period3 + " штук бутыло");
        System.out.println("За 1 месяц машина произвела " + period4 + "штук бутылок");

        System.out.println("example 5");
        int pots = 120;
        int whitePots = 2;
        int brownPots = 4;

        int numberOfClasses = pots / (whitePots + brownPots);
        int totalOfWhitePots = whitePots * numberOfClasses;
        int totaloBrownPots = brownPots * numberOfClasses;

        System.out.println(" В школе, где " + numberOfClasses + " нужно " + totalOfWhitePots + " банок белой краски и " + totaloBrownPots + " банка коричневой краски");

        System.out.println("example 6");
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int totalSum = bananas + milk + iceCream + eggs;
        System.out.println("Сумма в граммах = " + totalSum);
        System.out.println("Сумма в киллограммах = " + (totalSum / 1000.0));

        System.out.println("example 7");
        int diffWeightKg = 7;
        int diffWeight = diffWeightKg * 1000;

        int numberOfDays1 = diffWeight / 250;
        int numberOfDays2 = diffWeight / 500;

        System.out.println(" Потребуется " + numberOfDays1);
        System.out.println(" Потребуется " + numberOfDays2);

        System.out.println(" В среднем потребуется " +(numberOfDays1 + numberOfDays2) / 2.0);

        System.out.println("example 8");
        int salaryMaria = 67768;
        int salaryDenis = 83698;
        int salaryKristina = 76238;

        int increasedSalaryMaria = (int)  (salaryMaria * 1.1);
        int increasedSalaryDenis = (int)  (salaryDenis * 1.1);
        int increasedSalaryKristina = (int)  (salaryKristina * 1.1);

        int diffSalaryMeria = increasedSalaryMaria - salaryMaria;
        int diffSalaryDenis = increasedSalaryDenis - salaryDenis;
        int diffSalaryKristina = increasedSalaryKristina - salaryKristina;

        int diffSalaryMariaPerYear = diffSalaryMeria * 12;
        int diffSalaryDenisPerYear = diffSalaryDenis * 12;
        int diffSalaryKristinaPerYear = diffSalaryKristina * 12;

        System.out.println(" Маша теперь получает " + increasedSalaryMaria + " рубль годовой доход вырос на " + diffSalaryMariaPerYear + " рублей");
        System.out.println(" Денис теперь получает " + increasedSalaryMaria + " рубль годовой доход вырос на " + diffSalaryDenisPerYear + " рублей");
        System.out.println(" Кристина теперь получает " + increasedSalaryMaria + " рубль годовой доход вырос на " +diffSalaryKristinaPerYear + " рублей");

       }
    }
