package jc01_2020.Savonik;

/*
 *
 * С клавиатуры вводится натуральное число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		long max = input%10;
		input=abs(input/10);
		while (input!=0) {
			if (input%10>max)
			{
				max = input%10;
			}
			else input = input / 10;
		}
		System.out.println("max = " + max);
		}
		
}
