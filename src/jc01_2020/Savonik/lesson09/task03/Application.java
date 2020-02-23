package jc01_2020.Savonik.lesson09.task03;

/*
 *
 * Заполнить список строками. 5 раз перенести последний элемент списка в начало. Вывести в консоль значения списка в
 * виде массива (["str1","str2","str3"...])
 *
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		LinkedList<String> List1 = new LinkedList<>();
		for (int i = 0; i <8 ; i++) {
			String str = scanner.nextLine();
			// Заполнить список
			List1.add(str);
		}
		List1.addFirst(List1.getLast()); List1.removeLast();
		List1.addFirst(List1.getLast()); List1.removeLast();
		List1.addFirst(List1.getLast()); List1.removeLast();
		List1.addFirst(List1.getLast()); List1.removeLast();
		List1.addFirst(List1.getLast()); List1.removeLast();
		System.out.println("List1 = " + List1);
	}

}
