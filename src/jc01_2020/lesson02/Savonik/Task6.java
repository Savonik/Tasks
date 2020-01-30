package jc01_2020.lesson02.Savonik;

/*
*
* Вводится целое число, обозначающее код символа по таблице ASCII.
* Определить, это код английской буквы или какой-либо иной символ.
*
*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
    char a=(char)code;
    if ((a>='A'&&a<='Z')||(a>=97&& a<=122))  {
        System.out.println("Да");
    }
        else
    { System.out.println("Нет");
    }

}
}
