package jc01_2020.Savonik.lesson02;

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
        int min, max;
        //int max = Math.max(Math.max(first,second),third);
        if ((first>=second)&&(first>=third)) {max = first;}
        else if ((second>=first)&&(second>=third)) {max = second;}
        else {max = third;}
        //int min = Math.min(Math.min(first,second),third);
        if ((first<=second)&&(first<=third)) {min = first;}
        else if ((second<=first)&&(second<=third)) {min = second;}
        else {min = third;}
        int mid = first+second+third-min-max;
        System.out.println(mid);

    }
}
