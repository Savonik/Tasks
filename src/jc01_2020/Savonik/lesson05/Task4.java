package jc01_2020.Savonik.lesson05;

/*
 *
 * Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все числа, которые
 * встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана строка
 * "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0. Каждый эдемент массива вывести
 * в консоль с новой строки
 *
 * Формат вывода:
 * число
 * число
 * число
 * ...
 *
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        string = string.replaceAll("[^0-9]+", " ");
        string = string.trim();
        String[] str = string.split(" ");
        int[] integ = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            integ[i] = Integer.parseInt(str[i]);
            System.out.println(integ[i]);
        }
    }
}
