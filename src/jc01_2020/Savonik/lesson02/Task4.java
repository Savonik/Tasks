package jc01_2020.Savonik.lesson02;

/*
 *
 * Среди трех чисел найти среднее по величине
 *
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int min, max;

        if ((first >= second) && (first >= third)) {
            max = first;
        } else if ((second >= first) && (second >= third)) {
            max = second;
        } else {
            max = third;
        }

        if ((first <= second) && (first <= third)) {
            min = first;
        } else if ((second <= first) && (second <= third)) {
            min = second;
        } else {
            min = third;
        }

        int mid = first + second + third - min - max;

        System.out.println(mid);
    }
}
