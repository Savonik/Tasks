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
import static java.lang.System.*;

public class Task3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("Арнери", "Альфреппппппппппппппппппппппппппда");
		map.put("Карпова", "Беатпппппппппппппппппппприса");
		map.put("Эйнштейн", "Айппппппппппппппппппппгуль");
		map.put("Тесла", "Аврорпппппппппппппппппппа");
		map.put("Фаренгейт", "Агпппппппппппппппппппнесса");
		map.put("Ньютон", "Исппппппппппппппппппппппппппа");
		map.put("Максвелл", "Шппппппка");
		map.put("Ампер", "Леокадирря");
		map.put("Хокинг", "Капитолрррррррпппппппппппппррррррина");
		map.put("Рент", "Брониррррррррррппппппппппппппрслава");
		map.put("Сахарова", "Алексапппппппппппндра");

	map.entrySet().stream()
			.peek(i -> out.println(i.getValue()))
			.peek(i -> i.setValue(i.getValue() + i.getKey()))
			.filter(i -> i.getValue().length() <= 16)
			.max(Comparator.comparingInt(i -> i.getValue().length())).ifPresent(out::println);

		
	}
}
