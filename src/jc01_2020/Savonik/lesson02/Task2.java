package jc01_2020.Savonik.lesson02;

/*
 *
 * Делится ли введенное число на 3 без остатка
 *
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numeric = scanner.nextLong();

        if (numeric % 3 == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }
    }
}
