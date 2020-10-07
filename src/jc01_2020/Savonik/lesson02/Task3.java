package jc01_2020.Savonik.lesson02;

/*
 * */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        long second = scanner.nextLong();

        if (second == 0) {
            System.out.println("Недопустимая операция");
        } else if (first % second == 0) {
            System.out.println("Делится. Частное = " + first / second);
        } else {
            System.out.println("Не делится. Частное = " + first / second + ". Остаток = " + first % second);
        }

    }
}
