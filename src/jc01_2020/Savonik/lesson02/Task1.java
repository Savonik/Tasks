package jc01_2020.Savonik.lesson02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeric = scanner.nextInt();

        switch (numeric){
            case 1:
                System.out.println("Число 1");
                break;

            case 2:
                System.out.println("Число 2");
                break;

            case 3:
                System.out.println("Число 3");
                break;

            default:
                System.out.println("Другое число");

        }

    }
}