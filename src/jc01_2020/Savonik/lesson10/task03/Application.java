package jc01_2020.Savonik.lesson10.task03;

/*
 *
 * Считать из консоли строку (в строке латинские буквы в разном регистре и пробелы). Вывести в консоль 5 первых уникальных
 * букв, отсортированных по алфавиту. Буквы в разных регистрах считаются одинаковыми. Решить задачу за наименьшее
 * количество действий
 *
 */

import java.util.Scanner;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = ((scanner.nextLine()).replaceAll(" ", "")).toLowerCase();
		char[] strToArray = str.toCharArray();
		TreeSet<String> letters = new TreeSet<>();
		for (char c : strToArray) {
			letters.add(String.valueOf(c));
			if (letters.size() > 5) letters.remove(letters.last());
		}
		System.out.println(letters);
	}
}
