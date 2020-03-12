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
		
		map.put("Савоник", "Татьяна");
		map.put("Саливник", "Тоттьяnhugjkilop;['на");
		map.put("Савоюк", "Атьяна");
		map.put("Савоник", "Татьяна");
		map.put("Савоник", "Татьяна");
		map.put("Савоник", "Татьяна");
		map.put("Савоник", "Татьяна");
		map.put("Савоник", "Татьяна");
		map.put("Савоник", "Татьяна");
		map.put("Савоник", "Татьяна");
		map.put("Савоник", "Татьяна");

		out.println(map);
		
		map.forEach((key, value) -> map.replace(key, key+value));

		Map<String, String> filteredMap = map.entrySet().stream()
				.filter(i -> i.getValue().length() <=16)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		out.println(filteredMap);
		
		//Integer longName = filteredMap.entrySet()
		//		.stream().max((entry1, entry2) -> entry1.getValue().length().compareTo(entry2.getValue().length())?);
		
		
		
		//String longName = "0";
		//for (Map.Entry<String, String> entry : filteredMap.entrySet())
		//{if (entry.getValue().length() > longName.length())
		//	longName = entry.getValue();
		//}
					
				
		// use map here: longName = map...
		
	//out.println("longName = " + longName);
	}
	
}
