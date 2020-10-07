package jc01_2020.Savonik.lesson05;

/*
 *
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] StringArray = str.toCharArray();

        for (int i = 0; i < StringArray.length; i++) {
            for (int j = 0; j < StringArray.length; j++)
                if ((StringArray[j] == StringArray[i]) && (i != j)) {
                    StringArray[j] = ' ';
                }
        }

        String valueOfChar = String.valueOf(StringArray);
        String newString = valueOfChar.replaceAll(" ", "");
        System.out.println(newString);
    }
}
