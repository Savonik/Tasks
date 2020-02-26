package jc01_2020.Savonik.lesson10.task04;

/*
 *
 * Заполнить карту записями вида "фамилия" - "имя". Вывести в консоль все пары значений. Удалить из карты все записи с
 * одинаковыми "именами" (если 2 и более человек имеют одинаковое имя, то удалить всех) и вывести в консоль оставшиеся записи.
 *
 */

import java.util.*;

public class Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, String> map = new HashMap<>();
            ArrayList<String> s = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                String surname = scanner.nextLine();
                String firstName = scanner.nextLine();
                map.put(surname, firstName);
            }
            System.out.println("newMap = "+map);
            for (Map.Entry<String, String> entry1 : map.entrySet()) {
                int count = 0;
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    if (entry1.getValue().equals(entry2.getValue())) {
                        count++;
                    }
                }
                if (count >= 2) { s.add(entry1.getKey()); }
            }
            s.forEach(map::remove);
            System.out.println("filteredMap = " + map);
        }
    }
}
