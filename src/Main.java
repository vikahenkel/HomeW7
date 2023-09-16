public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 7");

        System.out.println("Aufgabe 1");
        int deposit = 15000;
        int total = 0;
        int month = 1;
        int amount = 2_459_000;
        while (total <= amount) {
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
        int birthRatePerThousand = 17;
        int deathRatePerThousand = 8;
        int years = 10;
        for (int year = 1; year < years; year++) {
            population = population + population * (birthRatePerThousand - deathRatePerThousand) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("Aufgabe 4");
        int initialDeposit = 15000;
        int months = 0;
        int menge = 12_000_000;
        int prozentProMonat = 7;
        while (initialDeposit <= menge) {
            initialDeposit = initialDeposit + initialDeposit * prozentProMonat / 12;
            months++;
            System.out.println("Сумма накоплений " + initialDeposit);
            System.out.println("Чтобы накопить 12000000 понадобится " + months + " месяцев");
        }

        System.out.println("Aufgabe 5");
        int cash = 15000;
        int i = 0;
        int gesamt = 0;
        int ganz = 12_000_000;
        int percent = 7;
        for (; gesamt < ganz; i++) {
            gesamt = gesamt + gesamt * percent / 100;
            gesamt = gesamt + cash;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " итого " + gesamt);
            }
        }

        System.out.println("Aufgabe 6");
        percent = 7;
        cash = 15_000;
        int monat = 1;
        int monate = 9 * 12;
        while (monat <= monate) {
            cash = cash * (1 + percent);
            if (monat % 6 == 0) {
                System.out.println("Сумма накоплениий " + monat + " лет " + cash + " рублей");
            }
            monat++;
        }

        System.out.println("Aufgabe 7");
        int friday = 2;
        for (int day = 0; day <= 31; day++) {
            if (day % 7 == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт");
            }
        }

        System.out.println("Aufgabe 8");
        int push = 2023;
        int anfang = push - 200;
        int ende = push + 100;
        int periode = 79;
        for (int year = 0; year <= ende; year += periode ){
            if (year >= anfang) {
                System.out.println(year);
            }
        }
    }
}

