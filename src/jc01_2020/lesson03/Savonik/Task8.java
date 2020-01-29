package jc01_2020.lesson03.Savonik;

/*
 *
 * Вывести на экран таблицу умножения (от 1 до 9)
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

public class Task8 {
	public static void main(String[] args) {
		int i,k;
		for (i=1; i<10; i++){
			for (k=1; k<10; k++) {
				System.out.print(i+"х"+k+"="+i*k+"    " );
			}
			System.out.println(  );
		}
      
	}
}
