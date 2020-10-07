package jc01_2020.test01;

/*
 *
 * Считать из консоли строку, состоящую из цифр.
 * Вычислить firstSum как сумму каждого четвертого элемента. В сумму включать только те цифры, которые больше 5
 * Вычислить secondSum как сумму каждого второго элемента. В сумму включать только те цифры, которые меньше 5
 * Вывести в консоль большее из значений firstSum и secondSum или слово "равны", если они совпадают
 *
 */

import java.util.Scanner;

public class Comparision {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int firstSum = 0;
        int secondSum = 0;
        String input = input1.replaceAll(" ", "");
        int[] integ = new int[input.length()];
        String[] str = input.split("");
        
        for (int i = 0; i < input.length(); i++) {
            integ[i] = Integer.parseInt(str[i]);
            if (((i + 1) % 4 == 0) && (integ[i] > 5)) {
                firstSum += integ[i];
            }

            if (((i + 1) % 2 == 0) && (integ[i] < 5)) {
                secondSum += integ[i];
            }
        }
        
        if (firstSum > secondSum) {
            System.out.println(firstSum);
        } else if (secondSum > firstSum) {
            System.out.println(secondSum);
        } else System.out.println("равны");
    }
}

