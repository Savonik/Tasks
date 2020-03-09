package jc01_2020.Savonik.lesson12;

/*
 *
 * Создать карту вида "фамилия"-"имя" из 20 элементов. Длина и фамилии, и имени от 5 до 10 символов
 * 1) Вывести в консоль все значения карты
 * 2) переписать все значения как имя + фамилия
 * 3) оставить в стриме все имена, которые не длиннее 16 символов
 * 4) Вывести в консоль самое длинное имя
 *
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.entrySet()
				.forEach( i -> map.put(scanner.nextLine(), scanner.nextLine()));
	
		// full the map
		//range(0, 10)
		//		.mapToObj(i -> scanner.nextLine()).forEachOrdered(str -> {
			//String str1 = scanner.nextLine();
			//map.put(str, str1);
		//});
		// Заполнить список

		System.out.println(map);
			//List1.add(numeric);
		//String longName = null; // use map here: longName = map...
		//System.out.println("longName = " + longName);
	}
	
}
