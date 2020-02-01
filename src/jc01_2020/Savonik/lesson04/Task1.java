package jc01_2020.Savonik.lesson04;

/*
 *
 * В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов.
 * Пример: для массива {5, 1, 2, -2, -5, 8, 10} нужно учесть числа 2, 8 и 10
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int summ = 0;
		for (int k = 0; k < array.length; k++) {
			if ((array[k]>0)&&(array[k]%2==0)) {
				summ = summ+array[k];}
		}
		System.out.println(summ);
	}

}
