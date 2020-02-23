package jc01_2020.Savonik.lesson09.task02;

/*
 *
 * Заполнить список строками. Каждую новую строку вставлять в начало списка. Вывести в консоль строку, с которой
 * начинается список
 *
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		LinkedList<String> List1 = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			// Заполнить список
			List1.addFirst(str);
		}
		String first = List1.getFirst();
		System.out.println(first); // вывод первого элемента
	}

}
