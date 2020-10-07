package jc01_2020.Savonik.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long balance = input % 10;
        long newnumber = 0;

        while (input != 0) {
            newnumber = newnumber * 10 + balance;
            input = input / 10;
            balance = input % 10;
        }

        System.out.println("newnumber = " + newnumber);
    }
}

