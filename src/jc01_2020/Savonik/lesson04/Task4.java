package jc01_2020.Savonik.lesson04;

/*
 *
 * В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами (их порядок не важен).
 * Сами минимальный и максимальный элементы в сумму не включать.
 *
 * Пример: {10, 30, 20, 15, 8, 21, 14}. max = 30, min 8. В сумму должны пойти значения 20 и 15. Ответ: 35
 *
 * Формат вывода:
 * одно число
 */
import java.util.Scanner;

import static java.lang.Math.abs;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		  int min=array[0];
		  int minindex = 0;
		  int maxindex = 0;
		  for (int k = 1; k < array.length; k++) {
			  if (array[k] <= min) {
	          min = array[k]; minindex = k;
			  }
		  }
		  
		  int max=array[0];
		  for (int k = 1; k < array.length; k++){
			  if (array[k] >= max) {
				  max = array[k]; maxindex = k;
			  }
		  }
		
		  int summ = 0;
		if (maxindex>minindex) {
		  for (int i= minindex+1; i < maxindex; i++) {
			  summ += array[i];
		  }
		}
		else if (maxindex<minindex) {
			for (int i= maxindex+1; i <minindex ; i++) {
				summ += array[i];
			}
		}
	
		
		System.out.println(summ);
	}
}
