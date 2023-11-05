public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        byte h = 4;
        short b = 9;
        int c = 14;
        long d = 26L;
        float e = 5.78f;
        double f = 13.65;
        System.out.println("Значение переменной h, с типом byte равно " + h);
        System.out.println("Значение переменной b, с типом short равно " + b);
        System.out.println("Значение переменной c, с типом int равно " + c);
        System.out.println("Значение переменной d, с типом long равно " + d);
        System.out.println("Значение переменной e, с типом float равно " + e);
        System.out.println("Значение переменной f, с типом double равно " + f);


        System.out.println("Задание №2");
        byte q = 67;
        short w = -159;
        short r = 569;
        int y = 27897;
        long t = 987678965549L;
        float u = 2.786f;
        double i = 27.12;
        System.out.println("Значение переменной q, с типом byte = " + q);
        System.out.println("Значение переменной w, с типом short = " + w);
        System.out.println("Значение переменной r, с типом short = " + r);
        System.out.println("Значение переменной y, с типом int = " + y);
        System.out.println("Значение переменной t, с типом long = " + t);
        System.out.println("Значение переменной u, с типом float = " + u);
        System.out.println("Значение переменной i, с типом double = " + i);


        System.out.println("Задание №3");
        short ludmilaPavlovna = 23;
        short annaSergeevna = 27;
        short ekaterinaAndreevna = 30;
        int papers = 480;
        int students = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("Всего учеников " + students);
        System.out.println("Всего бумаги " + papers);
        short eachStudents = 480 / 80;
        System.out.println("На каждого ученика рассчитано " + eachStudents + " листов бумаги");


        System.out.println("Задание №4");
        byte machinePerformance = 16;
        System.out.println("Производительность машины за 2 минуты = " + machinePerformance + " бутылок");
        short machinePerformance2 = 16 * 10;
        System.out.println("За 20 минут машина произвела " + machinePerformance2 + " бутылок");
        int machinePerformanceH = machinePerformance2 * 3;
        int machinePerformance3 = machinePerformanceH * 24;
        System.out.println("За сутки машина произвела " + machinePerformance3 + " бутылок");
        long machinePerformance4 = machinePerformance3 * 3;
        System.out.println("За 3 дня машина произвела " + machinePerformance4 + " бутылок");
        long machinePerformance5 = machinePerformance3 * 31;
        System.out.println("За месяц машина произвела " + machinePerformance5 + " бутылок");


        System.out.println("Задание №5");
        byte white = 2;
        byte brown = 4;
        short total = 120;
        int totalClasses = total / (white + brown);
        int totalWhite = white * totalClasses;
        int totalBrown = brown * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");


        System.out.println("Задание №6");
        byte bananas = 5;
        byte bananas1 = 80;
        short milk = 200;
        short milkMl100 = 105;
        byte ice = 2;
        short iceB = 100;
        byte eggs = 4;
        short eggs1 = 70;

        int totalBananas = bananas * bananas1;
        int totalMilk = (milk / 100) * milkMl100;
        int totalIce = ice * iceB;
        int totalEggs = eggs * eggs1;
        long totalGrams = totalBananas + totalMilk + totalIce + totalEggs;
        System.out.println("Количество граммов в спортзавтраке составляет = " + totalGrams + " граммов");
        float kg = 1000f;
        float totalKg = totalGrams / kg;
        System.out.println("Количество килограммов в спортзавтраке составляет = " + totalKg + " килограммов");


        System.out.println("Задание №7");
        byte fullKg = 7;
        short minGram = 250;
        short maxGram = 500;
        int fullGram = fullKg * 1000;
        int maxDay = fullGram / minGram;
        int minDay = fullGram / maxGram;
        int totalDays = (maxDay + minDay) / 2;
        System.out.println("Если спортсмен будет терять каждый день по " + minGram + " грамм, то понадобится " + maxDay + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + maxGram + " грамм, то понадобится " + minDay + " дней");
        System.out.println("Если брать в среднем, то понадобится " + totalDays + " день");


        System.out.println("Задание №8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int upMasha = masha / 100 * 10;
        int upDenis = denis / 100 * 10;
        int upKristina = kristina / 100 * 10;
        int newMonthMasha = masha + upMasha;
        int newMonthDenis = denis + upDenis;
        int newMothsKristina = kristina + upKristina;
        int newYearMasha = newMonthMasha * 12;
        int newYearDenis = newMonthDenis * 12;
        int newYearKristina = newMothsKristina * 12;
        int oldYearMasha = masha * 12;
        int oldYearDenis = denis * 12;
        int oldYearKristina = kristina * 12;
        int differenceMasha = newYearMasha - oldYearMasha;
        int differenceDenis = newYearDenis - oldYearDenis;
        int differenceKristina = newYearKristina - oldYearKristina;
        System.out.println("Маша теперь получает " + newMonthMasha + " рублей в месяц. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newMonthDenis + " рублей в месяц. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Маша теперь получает " + newMothsKristina + " рублей в месяц. Годовой доход вырос на " + differenceKristina + " рублей");












    }
}