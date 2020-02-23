package jc01_2020.Savonik.lesson09.task01;

/*
 *
 * Заполнить список строками. Вывести в консоль самую длинную строку
 *
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        LinkedList<String> List1 = new LinkedList<>();
        String max = "";
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            // Заполнить список
            List1.add(str);
            if (str.length() > max.length()) {
            	max=str;
            }
        }
        System.out.println(max);
    }
}
