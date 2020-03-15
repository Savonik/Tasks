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

import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class Task3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("Арнери", "Альфреда");
		map.put("Карпова", "Беатриса");
		map.put("Эйнштейн", "Айгуль");
		map.put("Тесла", "Аврора");
		map.put("Фаренгейт", "Агнесса");
		map.put("Ньютон", "Исидора");
		map.put("Максвелл", "Шарлотта");
		map.put("Ампер", "Леокадия");
		map.put("Хокинг", "Капитолина");
		map.put("Рентген", "Бронислава");
		map.put("Сахарова", "Александра");
		
		map.forEach((key, value) -> map.replace(key, key+value));

		Map<String, String> filteredMap = map.entrySet().stream()
				.filter(i -> i.getValue().length() <=16)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		out.println(filteredMap);

		String longName = Objects.requireNonNull(filteredMap.entrySet().stream()
				.max(Comparator.comparingInt(entry -> entry.getValue().length())).orElse(null)).getValue();

		System.out.println("longName = " + longName);
	}
}
