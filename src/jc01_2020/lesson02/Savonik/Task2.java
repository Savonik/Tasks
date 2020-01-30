package jc01_2020.lesson02.Savonik;

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
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }

    public static class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
    
            int max = Math.max(Math.max(first,second),third);
            int min = Math.min(Math.min(first,second),third);
            int mid = first+second+third-min-max;
            System.out.println(mid);
            
            
            
            /*
            
            int medium = first+second+third;
            if {first-medium
    if ((first > second && first < third) || (first > third && first < second)) {
                System.out.println("first среднее");
            }
            else
            if ((second > first && second < third) || (second > third && second < first)) {
                System.out.println("second среднее");
            }
            else
            if ((third > second && third < first) || (third < second && third > first)) {
                System.out.println("third среднее");
                */
    
    
    
    
        }
    }
}
