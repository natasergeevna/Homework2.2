public class Main {
    public static void main(String[] args) {
        //task 1
        byte apples = 5;
        short cherry = 200;
        int peas = 3000000;
        float temperature = 36.6f;
        double gasoline = 67.9;
        System.out.println("Значение переменной apples с типом byte равно " + apples);
        System.out.println("Значение переменной cherry с типом short равно " + cherry);
        System.out.println("Значение переменной peas с типом int равно " + peas);
        System.out.println("Значение переменной temperature с типом float равно " + temperature);
        System.out.println("Значение переменной gasoline с типом double равно " + gasoline);
        System.out.println("\n");

        //task 2
        float var1 = 27.12f;
        long var2 = 987678965549L;
        double var3 = 2.786;
        boolean var4 = false;
        short var5 = 569;
        int var6 = -159;
        char var7 = 27897;
        byte var8 = 67;

        //task 3
        short allPaper = 480;
        byte peopleLP = 23;
        byte peopleAS = 27;
        byte peopleEA = 30;
        int allPeoples = peopleEA + peopleAS + peopleLP;
        int paperOnePeople = allPaper / allPeoples;
        System.out.println("На каждого ученика рассчитано " + paperOnePeople + " листов бумаги");
        System.out.println("\n");

        //task 4
        byte s = 16;
        byte time = 2;
        int speed = s / time;
        int minuts = 20 * speed;
        System.out.println("За 20 минут работы машина произвела " + minuts + " штук");
        int day = 24 * 60 * speed;
        System.out.println("За день работы машина произвела " + day + " штук");
        int threeDay = 3 * day;
        System.out.println("За 3 дня работы машина произвела " + threeDay + " штук");
        int mounhs = 30 * day;
        System.out.println("За месяц работы машина произвела " + mounhs + " штук");
        System.out.println("\n");

        //task 5
        byte totalPaint = 120;
        byte wihte = 2;
        byte brown = 4;
        int classOne = totalPaint / (wihte + brown);
        int allWihte = classOne * wihte;
        int allBrown = classOne * brown;
        System.out.println("В школе, где " + classOne + " классов, нужно " + allWihte + " банок белой краски и " + allBrown + " банок коричневой краски");
        System.out.println("\n");

        //task 6
        byte banana = 5;
        byte bananaWeight = 80;
        short milk = 2;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int totalWeight = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + egg * eggWeight;
        float kgWeight = totalWeight / 1000;  //что-то не то с выводом
        System.out.println("Такой завтрак будет весить " + kgWeight + " кг");
        System.out.println("\n");

        //task 7
        short kg = 7000;
        short gr1 = 250;
        short gr2 = 500;
        int day1 = kg / gr1;
        int day2 = kg / gr2;
        int srDay = (day1 + day2) / 2;
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(srDay);
        System.out.println("\n");

        //task 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double nMasha = masha + masha * 0.1;
        double nDenis = denis + denis * 0.1;
        double nKristina = kristina + kristina * 0.1;
        double rm = nMasha - masha;
        double rd = nDenis - denis;
        double rk = nKristina - kristina;
        System.out.println("Маша теперь получает " + nMasha + " рублей. Годовой доход вырос на " + rm + "рублей");
        System.out.println("Денис теперь получает " + nDenis + " рублей. Годовой доход вырос на " + rd + "рублей");
        System.out.println("Кристина теперь получает " + nKristina + " рублей. Годовой доход вырос на " + rk + "рублей");
    }
}