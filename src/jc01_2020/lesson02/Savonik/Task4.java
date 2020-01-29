package Lesson2;

/*
*
* Среди трех чисел найти среднее по величине
*
*/

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
       
        int max = Math.max(Math.max(first,second),third);
        int min = Math.min(Math.min(first,second),third);
       int mid = first+second+third-min-max;
        System.out.println("средним из них будем считать "+ mid);
        
        
        
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
