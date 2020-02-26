package jc01_2020.Savonik.lesson10.task02;

/*
 *
 * Заполнить множество случайными числами от 0 до 100. Удалить все числа, которые больше 50. Результат вывести в консоль.
 * Используйте Iterator
 *
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            // Заполнить список
            Random r = new Random();
            int adding = r.nextInt(100);
            intSet.add(adding);
        }
        System.out.println(intSet);

        intSet.removeIf(integer -> integer > 50);
        System.out.println(intSet);
    }

}


