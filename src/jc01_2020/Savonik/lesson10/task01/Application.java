package jc01_2020.Savonik.lesson10.task01;

/*
 *
 * Заполнить произвольное множество строками. Вывести в консоль размер множества. Добавить строку, которая уже есть во
 * множестве. Убедиться, что размер не изменился
 *
 */

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		HashSet<String> strSet = new HashSet<>();
		strSet.add("String1");
		strSet.add("String2");
		strSet.add("String3");
		strSet.add("String4");
		System.out.println("Size = " +strSet.size());
		strSet.add("String4");
		System.out.println("NewSize = " +strSet.size());
	}

}
