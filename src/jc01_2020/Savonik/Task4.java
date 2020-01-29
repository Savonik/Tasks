package jc01_2020.Savonik;

/*
 *
 * Вычислить факториал введенного числа. n >= 0 (0! = 1)
 * n! = 1 * 2 * 3 * 4 * ... * n
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();
		int factorial = 1;
		for (int i=1; i<=numeric; i++){
			factorial = factorial * i; 
		}
		System.out.println("factorial = " + factorial);
	}
}
