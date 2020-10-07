package jc01_2020.Savonik.lesson04;

/*
 *
 * Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b] (квадратные скобки означают,
 * что крайние значения так же включаются в интервал).
 * Освободившиеся в конце массива элементы заполнить нулями.
 *
 * Пример: {4, 10, 18, 5, 11, 22, 13}. Интервал [10, 18].
 * Ответ:
 * 4
 * 5
 * 22
 * 0
 * 0
 * 0
 * 0
 *
 * Формат вывода:
 * значение каждой ячейки массива с новой строки
 *
 */


import java.util.Scanner;

public class TaskB1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int j;
        for (j = 0; j < array.length; j++) {      //замена на нули
            if ((array[j] >= a) && (array[j] <= b)) {
                array[j] = 0;
            }
        }
        //сортировка выбором макс и мин значения
        int s;
        for (int i = 0; i < array.length; i++) {
            for (s = i + 1; s < array.length; s++) {
                if (array[i] == 0) {
                    int change = array[i];
                    array[i] = array[s];
                    array[s] = change;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
    
		

