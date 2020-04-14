package jc01_2020.Savonik.lesson10.task05;

/*
 *
 * Считать из консоли информацию вида "Покупатель товар количество", где Покупатель — имя покупателя (строка без пробелов),
 * товар — название товара (строка без пробелов), количество — количество приобретенных единиц товара. Сохранить эти
 * данные в карту. Имена покупателей и товаров уникальные. Для каждого покупателя вывести в консоль следующую информацию:
 * "Имя:
 * товар - общее купленное количество этого товара"
 *
 * Вся выходная информация должна быть отсортирована в алфавитном порядке
 *
 */

import java.util.*;

public class Application {

    public static void main(String[] args) {
        // Объявить список
		TreeMap<String, List<String>> map = new TreeMap<>();
        // Заполнить список
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                String buyer = scanner.nextLine();
                String ship = scanner.nextLine();
                String amount = scanner.nextLine();
                map.put(buyer, Arrays.asList(ship, amount));
                
                
            }
        }

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println("Имя: "+entry.getKey());
			System.out.println(entry.getValue().get(0)+" - "+entry.getValue().get(1));
			}
        
    } 

}
