public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Домашнее задание 1"); // int, byte, short, long, float, double.
        int int1 = Integer.MAX_VALUE;
        System.out.println("Значение переменной int1 с типом int равно " + int1);
        byte byte1 = Byte.MAX_VALUE;
        System.out.println("\"Значение переменной byte1 с типом byte равно " + byte1);
        short short1 = Short.MAX_VALUE;
        System.out.println("Значение переменной short1 с типом short равно " + short1);
        long long1 = Long.MAX_VALUE;
        System.out.println("Значение переменной long1 с типом long равно " + long1);
        float float1 = Float.MAX_VALUE;
        System.out.println("Значение переменной float1 с типом float равно " + float1);
        double double1 = Double.MAX_VALUE;
        System.out.println("Значение переменной double1 с типом double равно " + double1);
    }

    public static void task2() {
        System.out.println("Домашнее задание 2");
        double double1 = 27.12;
        System.out.println(double1);
        long long1 = 987678965549l;
        System.out.println(long1);
        float float1 = 2.786f;
        System.out.println(float1);
        short short3 = 569;
        System.out.println(short3);
        short short1 = -159;
        System.out.println(short1);
        short short2  = 27897;
        System.out.println(short2);
        byte byte1 = 67;
        System.out.println(byte1);
    }

    public static void task3() {
        System.out.println("Домашнее задание 3");
        char sheetPaper = 480;                              //всего листов бумаги
        byte LP = 23;                                       // Людмила Павловна всего учеников
        byte AS = 27;                                       //Анны Сергеевны всего учеников
        byte EA = 30;                                       //Екатерины Андреевны всего учеников
        int totalStudents = LP + AS + EA;
        int sheetsForStudents = sheetPaper / totalStudents;  //бумагу поделили всем по ровну
        System.out.println("На каждого ученика расчитано " + sheetsForStudents + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Домашнее задание 4");
        int machinePerformance = 16 * 2;      //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        machinePerformance = machinePerformance / 2;   //Производительность машины за минуту
        int minutesPerDay = 24 * 60;                   // количество минут в сутках
        int minutesIntThreeDay = minutesPerDay * 3;    // количество минут в трех сутках
        int minutesPerMonth = minutesPerDay * 30;// количество минут в одном месяце

        int minutes20 = machinePerformance * 20;        // сделает за 20 минут
        int day = machinePerformance * minutesPerDay;   // сделает в день
        int threeDay = minutesIntThreeDay * machinePerformance; // сделает за 3 дня
        int month = minutesPerMonth * machinePerformance; // сделает за месяц

        System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Домашнее задание 5");
        byte totalCans = 120;          //всего банок с краской
        byte brownPaint = 4;           //банок с коричневой краской на один класс
        byte whitePaint = 2;           //банок с белой краской на один класс
        int clas = brownPaint + whitePaint ; //количество банок на один класс

        int totalClas = totalCans / clas; //всего классов
        int totalBrown = brownPaint * totalClas; //всего банок с коричневой краской
        int totalWhite = whitePaint * totalClas; //всего банок с белой краской
        System.out.println("В школе, где" + totalClas + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Домашнее задание 6");
        byte totalBananas = 5;
        byte gramsIn_A_banana = 80;
        int weight_Of_bananas = gramsIn_A_banana * totalBananas; //общий вес бананов в граммах

        short milk = 200;
        short grams_Of_milk = 105;
        int weight_Of_milk = 105 * 2; //общий вес молока

        byte totalIceCream = 2;
        byte iceCream = 100;
        int weight_Of_iceCream = totalIceCream * iceCream; // общий вес мороженного

        byte totalEgg = 4;
        byte egg = 70;
        int wight_Of_egg = totalEgg * egg;

        int wight = wight_Of_egg + weight_Of_iceCream + weight_Of_milk + weight_Of_bananas;
        System.out.println(wight +"гр");
        System.out.println(wight / 1.000 + "кг");
    }

    public static void task7() {
        System.out.println("Домашнее задание 7");
        byte purpose = 7;// цель сбросить 7 кг
        int purpose1 = 7000; // цель сбросить в граммах
        short day = 250;     // грамм теряет в день
        short day1 = 500;    // грамм теряет в день
        int totalDay = purpose1 / day; // займет дней если по 250г
        int totalDay1 = purpose1 / day1; // займет дней если по 500г
        int average = purpose1 / ((day1 + day) / 2); // средний показатель сколько займет дней
        System.out.println(totalDay + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(totalDay1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(average + " дней может потребоваться дней в среднем, чтобы добиться результата похудения.");
    }

    public static void task8() {
        System.out.println("Домашнее задание 8");
        byte years3 = 3; // количество лет для повышения зп на 10%
        int masha = 67760; // зп у Маши
        int denis = 83690; // зп у Дениса
        int kristina = 73230; // зп у Кристины

        int salaryIncreaseMasha = masha + (masha / 100 * 10); // прибавка Маше в 10% к зп
        int salaryIncreaseDenis = denis + (denis / 100 * 10); // прибавка Денису 10% к зп
        int salaryIncreaseKristina = kristina + (kristina / 100 * 10); // прибавка Кристине 10% к зп

        int annualIncomeMasha = masha * 12; //годовой доход без добавок Маши
        int annualIncomeDenis = denis * 12; //годовой доход без добавок Дениса
        int annualIncomeKristina = kristina * 12; //годовой доход без добавок Кристины

        int annualIncomeMasha1 = salaryIncreaseMasha * 12; // годовой доход Маши с добавкой 10%
        int annualIncomeDenis1 = salaryIncreaseDenis * 12; // годовой доход Дениса с добавкой в 10%
        int annualIncomeKristina1 = salaryIncreaseKristina * 12; // годовой доход Кристины с добавкой в 10%

        int differenceMasha = annualIncomeMasha1 - annualIncomeMasha; // на эту сумму вырос годовой доход Маши
        int differenceDenis = annualIncomeDenis1 - annualIncomeDenis; // на эту сумму вырос годовой доход Дениса
        int differenceKristina = annualIncomeKristina1 - annualIncomeKristina; // на эту сумму вырос годовой доход Кристины

        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");



    }
}
