package jc01_2020.Savonik.lesson13;

/*
 *
 * Создать приложение-напоминалку о количестве дней до дней рождения. Использовать карту. Ключ - имя человека,
 * значение - дата рождения (в прошлом, LocalDate). Реализовать метод по добавлению записи в карту (входные параметры имя и дата
 * строкой в формате "дд/мм/гггг"). Реализовать метод, который выведет в консоль имена и оставшиеся дни до
 * ближайшего дня рождения всех ("имя - осталось дней", каждое с новой строки). Отдельно реализовать метод, который
 * вернет кол-во дней для одного конкретного человека (входной параметр - имя)
 *
 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import static java.lang.Integer.*;
import static java.lang.String.format;
import static java.time.LocalDate.now;
import static java.time.LocalDate.of;


public class Task3 {
	public static void main(String[] args) {
	addPerson("Иван", "12/2/1993");
	addPerson("Марьян", "20/8/1991");
	addPerson("Сергей", "30/1/1990");
	
	daysBeforePerson("Иван");
	daysBeforePerson("Сергей");
	daysBeforeAll();
	
	}
	
	public static Map<String, LocalDate> map = new HashMap<>();
	
	public static void addPerson (String name, String bDay) {
	String [] arrayBDay = bDay.split("/");
		map.put(name, of(parseInt(arrayBDay[2]), parseInt(arrayBDay[1]), parseInt(arrayBDay[0])));
	}

	public static void daysBeforeAll() {
		int daysBefore;
		for (Entry<String, LocalDate> entry : map.entrySet()) {
			if (entry.getValue().getDayOfYear() - LocalDate.now().getDayOfYear() > 0) {
				daysBefore = entry.getValue().withYear(now().getYear()).getDayOfYear() - LocalDate.now().getDayOfYear();
			} else
				daysBefore = LocalDate.now().lengthOfYear() - LocalDate.now().getDayOfYear() + entry.getValue().withYear(now().getYear() + 1).getDayOfYear();
			System.out.println(format("%s осталось дней %s", entry.getKey(), daysBefore));
		}
	}

	
	public static void daysBeforePerson(String name) {
		int daysBefore;
		if (map.get(name).withYear(now().getYear()).getDayOfYear() - LocalDate.now().getDayOfYear() > 0)
		{daysBefore = map.get(name).withYear(now().getYear()).getDayOfYear() - LocalDate.now().getDayOfYear();}
		else daysBefore = LocalDate.now().lengthOfYear() - LocalDate.now().getDayOfYear() + map.get(name).withYear(now().getYear() + 1).getDayOfYear();
		System.out.println(format("%s осталось дней %s", name, daysBefore));
		}
		
	}


