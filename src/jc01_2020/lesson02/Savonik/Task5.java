package jc01_2020.lesson02.Savonik;

/*
*
* Определить, является ли год, который ввел пользователем, високосным или невисокосным.
*
* Високосные года делятся нацело на 4.
* Однако из этого правила есть исключение: столетия, которые не делятся нацело на 400, високосными не являются.
*
* 1980 - Високосный
* 1978 - Обычный
*
*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (((year%4==0)&&(year%100!=0))||(year%400==0))  {
            System.out.println("Високосный");
        }
        else
        { System.out.println("Обычный");
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
            System.out.print(mid);
            
            
            
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
