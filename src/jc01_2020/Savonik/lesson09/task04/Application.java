package jc01_2020.Savonik.lesson09.task04;

/*
 *
 * Заполнить список натуральными числами (целые положительные). Вывести в консоль среднее арифметическое всех четных
 * значений
 *
 * N.B. Ноль не является натуральным числом
 *
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Application {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int summ = 0;
		int n=0;
		// Объявить список
		LinkedList<Integer> List1 = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			int numeric = scanner.nextInt();
			// Заполнить список
			List1.add(numeric);
			if ((numeric>0)&&(numeric%2==0)){summ=summ+numeric; n=n+1;}
		}
		if (n>0){
		System.out.println(summ/n);}
		else {System.out.println("четных чисел нет");}
	}

}
