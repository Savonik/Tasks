package jc01_2020.Savonik.lesson06.task01;

public class Application {

    public static void main(String[] args) {
        Time time1 = new Time(4, 5, 1);
        Time time2 = new Time(3, 5, 1);
        Time time3 = new Time();

        System.out.println(time1.getFullSeconds());
        System.out.println(time1.compareTo(time2));
        time1.timePrint();
        time3.allTimePrint(1200);
    }
}

