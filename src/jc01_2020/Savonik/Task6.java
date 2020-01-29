package jc01_2020.Savonik;

/*
 *
 * Вывести на экран "прямоугольник", образованный из двух видов символов.
 * Контур прямоугольника должен состоять из одного символа, а "заливка" - из другого.
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int horizontal = scanner.nextInt();
		int vertical = scanner.nextInt();
		//System.out.print("horizontal");
		//System.out.println("vertical");
		//int rectangle [][] = new int[horizontal][vertical];
		int i, j;
		for (i = 1; i <= horizontal; i++) {
			for (j = 1; j <= vertical; j++) {
				if ((i == 1) || (i == horizontal) || (j == 1) || (j == vertical)) {
					System.out.print("0");
				}
				else System.out.print("1");
			}
			System.out.println();
		}

	}
	}

