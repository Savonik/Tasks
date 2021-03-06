package jc01_2020.Savonik.lesson05;

/*
 *
 * Определить, является ли введенное слово идентификатором, т.е. начинается ли оно с английской буквы в любом регистре
 * или знака подчеркивания и не содержит других символов, кроме букв английского алфавита (в любом регистре), цифр и
 * знака подчеркивания.
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String regexp = "^[A-Za-z_]{1}+[\\w]+[\\w]$";
        Pattern p = Pattern.compile(regexp);
        Matcher matcher = p.matcher(str);

        if (matcher.find()) {
            System.out.println("Да");
        } else System.out.println("Нет");
    }
}
