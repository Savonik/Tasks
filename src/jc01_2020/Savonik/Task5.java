package jc01_2020.Savonik;

/*
 *
 * Найти все совершенные числа до 10000. Совершенное число - это такое число, которое равно сумме всех своих делителей,
 * кроме себя самого.
 * Например, число 6 является совершенным, т.к. кроме себя самого делится на числа 1, 2 и 3, которые в сумме дают 6.
 *
 * Формат вывода (ошибки недопустимы):
 * каждое число в новой строке
 *
 */

public class Task5 {
	public static void main(String[] args) {
	
			int n,k,sum;
			for (n=2;n<10001;n++) {
				sum=1;
				for (k=2;k<n;k++) {
					if (n%k==0) {
				    sum=sum+k;
					}
				}
				if (n==sum)
					System.out.println(n);		
			}
	}

}
			
			
			
