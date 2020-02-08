package jc01_2020.Savonik.lesson05;

/*
 *
 * Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца. Регистр букв не учитывать
 *
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
        String string;
        string = str.replaceAll("\\s+", "");
        char[] StringArray = string.toCharArray();
        for(int i = 0, j = string.length() - 1; i < string.length()/2; i++, j--)
          {
              if (StringArray[i]!=StringArray[j]) {
                System.out.println("Нет");
                break;
              }
          }
        System.out.println("Да");
    }
    
}
