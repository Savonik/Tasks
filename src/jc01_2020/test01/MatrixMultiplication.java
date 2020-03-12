package jc01_2020.test01;

/*
*
* Написать программу для умножения произвольных матриц. Вывести в консоль матрицу А, матрицу В и результирующую матрицу С.
*
* Теория:
* 1) количество строк матрицы А должно быть равно количеству столбцов матрицы В
* 2) Результатом умножения матрицы Am×n на матрицу Bn×k будет матрица Cm×k такая, что элемент матрицы C,
* стоящий в i-той строке и j-том столбце (Сij), равен сумме произведений элементов i-той строки матрицы A на
* соответствующие элементы j-того столбца матрицы B.
*
*
*    A
* 1  2  3
* 4	 5	6
* 7	 8	9
*
*    B
* 1  2  3  4
* 4  3  2  1
* 1  2  3  4
*
* С = A * B
* 12  14  16  18
* 30  35  40  45
* 48  56  64  72
*
*/

import java.util.Scanner;

public class MatrixMultiplication {

	static int[][] a;
	static int[][] b;
	static int[][] c;
	static int rowsA;
	static int columnsA;
	static int rowsB;
	static int columnsB;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Кол-во строк матрицы А
		rowsA = scanner.nextInt();
//		Кол-во столбцов матрицы А
		columnsA = scanner.nextInt();
//		Кол-во строк матрицы B
		rowsB = scanner.nextInt();
//		Кол-во столбцов матрицы B
		columnsB = scanner.nextInt();

		a = new int[rowsA][columnsA];
		b = new int[rowsB][columnsB];
		c = new int[rowsA][columnsB];

		// Заполнить массивы А и В с помощью scanner.nextInt(). Тестовые данные заполняются построчно для каждого массива
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsA; j++) {
				a[j][i] = scanner.nextInt();
			}
		}

		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < columnsB; j++) {
				b[j][i] = scanner.nextInt();
			}
		}
		
		// Вывести в консоль матрицу А
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsA; j++) {
				System.out.print(a[j][i] +" " );
			}
			System.out.println();
		}

		// Вывести в консоль матрицу В

		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < columnsB; j++) {
				System.out.print(b[j][i] + " " );
			}
			System.out.println();
		}

		// Перемножить матрицы
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				for (int k = 0; k < columnsB; k++) {
					c[j][i] = a[j][i]*b[j][i] + a[j][k]*b[k][i] + a[j][k]*b[k][i];
				}
				
			}
		}

		// Вывести результирующую матрицу по одному значению через пробел (порядок вывода - построчно)

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				System.out.println(c[j][i] + " "); 
			}
			System.out.println();
		}

	}
	

}
