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
        String podstr = scanner.nextLine();
        String newpodstr = scanner.nextLine();
        boolean isContain1 = str.contains(podstr);
        String newStr = str.replace(podstr, newpodstr);
        System.out.println(newStr);
    }
}
