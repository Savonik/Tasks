package jc01_2020.Savonik.lesson09.task05;

/*
 *
 * Заполнить два списка целыми числами. Из первого списка удалить все отрицательные числа. Из второго - все положительные.
 * Создать третий список, состоящий из оставшихся элементов первых двух. Из третьего списка удалить все элементы со
 * значением 0. Вывести итоговый список в консоль. Максимально использовать готовые методы коллекций
 *
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		ArrayList<Integer> listFinal= new ArrayList<>();
		System.out.println("1 список");
		for (int i = 0; i < 5; i++) {
			Integer numeric = scanner.nextInt();
			// Заполнить список
			list1.add(numeric);
		}
		System.out.println("2 список");
		for (int i = 0; i < 5; i++) {
			Integer numeric = scanner.nextInt();
			// Заполнить список
			list2.add(numeric);
		}
		list1.removeIf(i -> (i<0));
		list2.removeIf(i -> (i>0));
		listFinal.addAll(list1);
		listFinal.addAll(list2);
		listFinal.removeIf(i -> (i==0));
		System.out.println(listFinal);
	}
}
