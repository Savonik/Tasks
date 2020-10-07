package jc01_2020.Savonik.lesson05;

/*
 *
 *
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subString = scanner.nextLine();
        String newSubString = scanner.nextLine();

        String newStr = str.replace(subString, newSubString);
        System.out.println(newStr);
    }
}
