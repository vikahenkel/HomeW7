public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 7");

        System.out.println("Aufgabe 1");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Вклад " + total);
            month++;
            System.out.println("Месяц " + month + ", сумма накопленний равна " + total);
        }

        System.out.println("Aufgabe 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Aufgabe 3");
        int population = 12_000_000;
        double birthRate = 0.017;
        double deathRate = 0.008;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            population += (int) ((population * birthRate - population * deathRate) / years);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("Aufgabe 4");
        int initialDeposit = 15000;
        int months = 0;
        while (initialDeposit < 12_000_000) {
            initialDeposit = initialDeposit + initialDeposit * 7 / 12;
            months++;
            System.out.println("Сумма накоплений " + initialDeposit);
            System.out.println("Чтобы накопить 12000000 понадобится " + months + " месяцев");
        }

        System.out.println("Aufgabe 5");
        int cash = 15000;
        int i = 0;
        int gesamt = 0;
        for (; gesamt < 12_000_000; i++) {
            gesamt = gesamt + ((gesamt * 7 / 100) / 12);
            gesamt = gesamt + cash;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " итого " + gesamt);
            }
        }

        System.out.println("Aufgabe 6");
        int savingsPeriodYear = 9;
        int contribution = 15000;
        int bankInterest = 7;
        for (int year = 1; year <= years; year++) {
            bankInterest = contribution * bankInterest;
            if (savingsPeriodYear % 2 == 0) {
                System.out.println("Сумма накоплениий " + year + " лет " + contribution);
            }
        }
// совсем не понимаю это задание, нужно конкретное объяснение..Конспект к уроку не поняетен,для меня как новичка
        System.out.println("Aufgabe 7");
        int day = 5;
        int date = 3;
        for (int dayNumber = 5; dayNumber <= 31; dayNumber = date++) {
        if (dayNumber % 7 == 0) {
            System.out.println("Сегодня пятница " + date + "-е, число. Необходимо подготовить отчёт.");
            continue;
            }
        }

        System.out.println("Aufgabe 8");
        int startJahr = 1896;
        for (int y = 1896; y <= 2123; y = y + 79) {
                System.out.println(y);
        }
    }
}

