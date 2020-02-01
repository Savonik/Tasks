package jc01_2020.Savonik.lesson02;

/*
 *
 * Делится ли введенное число на 3 без остатка
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numeric = scanner.nextLong();

        if (numeric % 3 == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }
    }


    public static class Task1 {
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
}
