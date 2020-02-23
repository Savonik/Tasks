package jc01_2020.Savonik.lesson09.task06;

/*
 *
 * Создать и заполнить любыми числами два списка: обычный и связанный. Размер списков - 1 млн элементов.
 * В каждый список добавить 100_000 раз в нулевую позицию значение 0. Вывести в консоль длительности вставки 100_000
 * элементов для обычного и связанного списков.
 *
 * N.B. Поищите сами как засечь время.
 *
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {
        // Объявить список
        LinkedList<Integer> list1 = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
		long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            // Заполнить список
            list1.add(0, 0);
        }
		System.out.println(System.currentTimeMillis() - time);
        
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			// Заполнить список
			list2.add(0, 0);
		}
		System.out.println(System.currentTimeMillis() - time1);
    }

}
