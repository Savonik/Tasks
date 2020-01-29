package jc01_2020.lesson03.Savonik;

/*
 *
 * Нарисовать диагонали квадрата с заданной длиной стороны
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();

		int i, j;
		for (i = 1; i <= length; i++) {
			for (j = 1; j <= length; j++) {
				if ((i == j)||(i+j==length+1) ) {
					System.out.print(".");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}





	}
}
