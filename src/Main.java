public class Main {

    public static void main(String[] args) {
        System.out.println("Задача1");
        int x = 123214141;
        System.out.println("Значение переменной с типом" + x + " равно ");
        byte y = 22;
        System.out.println("Значение переменной с типом" + y + " равно ");
        short c = 12345;
        System.out.println("Значение переменной с типом" + c + " равно ");
        long f = 31243444;
        System.out.println("Значение переменной с типом" + f + " равно ");
        float g = 3.75f;
        System.out.println("Значение переменной с типом" + g + " равно ");
        double k = 1.3;
        System.out.println("Значение переменной с типом" + k + " равно ");


        System.out.println("Задача2");
        double d = 27.12;
        System.out.println(d);
        short h = 569;
        System.out.println(h);
        short q = -159;
        System.out.println(q);
        long w = 27897;
        System.out.println(w);
        byte r = 67;
        System.out.println(r);
        double t = 2.786;
        System.out.println(t);
        long u = 987678965549L;
        System.out.println(u);


        byte klass = 23;
        byte klass1 = 27;
        byte klass2 = 30;
        short paper = 480;
        int vsego = klass + klass1 + klass2;
        int exp = paper / vsego;
        System.out.println("На каждого ученика рассчитано " + exp + " листов бумаги ");

        System.out.println("Задача3");
        byte speed = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int speed1 = speed / 2;
        int finish = time1 * speed;
        System.out.println("За " + time1 + " машина произвела "+ finish + "штук бытылок");


        System.out.println("Задача4");
        byte period = 24;
        int pro = (time1 * 60) / 2;
        int finish1 = pro / 6;
        System.out.println("За " + period + " машина произвела "+ finish1 + "штук бытылок");


        byte period1 = 3;
        int pro2 = (72 * 60) / 2;
        int finish2 = pro2 / 6;
        System.out.println("За " + period1 + " машина произвела "+ finish2 + "штук бытылок");



        byte period2 = 31;
        int pro3 = (720 * 60) / 2;
        int finish3 = pro3 / 6;
        System.out.println("За " + period2 + " машина произвела "+ finish3 + "штук бытылок");


        System.out.println("Задача5");
        byte bank = 2;
        byte bank2 = 4;
        int vsego1 = bank + bank2;
        int klass5 = 120 / 6;
        int belay = 20 *2;
        int korichnevay = 20 * 4;
        System.out.println("В школе, где" + klass5 + " классов, нужно "+ belay + "банок белой краски и "+ korichnevay +"банок коричневой краски");
        System.out.println("Задача6");
        byte banan = 5 ;
        float milk = 200f;
        byte icecream = 2;
        byte eagle = 4;
        byte banangr = 80 ;
        float milkgr = 105f;
        byte icecreamgr = 100;
        byte eaglegr = 70;
        int vsegogr1 = banan * banangr;
        int vsegogr2 = (int) (milk * milkgr);
        int vsegogr3 = icecream * icecreamgr;
        int vsegogr4 = eagle * eaglegr;
        float gr = vsegogr1 + vsegogr2 + vsegogr3 + vsegogr4;
        int kg = (int) ((double) gr / 1000);
        System.out.println("кол граммов " +gr + " кг "+ kg);
        System.out.println("Задача7");
        int gr6 = 250;
        int gr7 = 500;
        short kg8 = 7;
        int gr10 = 7 * 1000;
        int dney3 = gr10 / 250;
        int dney4= gr10 / 500 ;
        int vseg = gr6 + gr7;
        int dney = dney3 + dney4;
        int sredneyDney = vseg / dney;
        System.out.println("кол дней по 250 " + dney3+ " каждый день по 500 "+ dney4 + "среднее значание дней " + sredneyDney);


        System.out.println("Задача8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int m = masha + 10;
        int d1 = denis + 10;
        int k1 = kristina + 10;
        int bez1 = masha * 12;
        long bez2 = denis * 12;
        int bez3 = kristina * 12;
        int posle = masha * 12;
        int posle2 = denis * 12;
        int posle3 = kristina * 12;
        System.out.println("Маша теперь получает " + m + " рублей " + " Годовой доход вырос на " + bez1 + " рублей ");
        System.out.println("Маша теперь получает " + d1 + " рублей " + " Годовой доход вырос на " + bez2 + " рублей ");
        System.out.println("Маша теперь получает " + k1 + " рублей " + " Годовой доход вырос на " + bez3 + " рублей ");




    }
























}