package jc01_2020.Savonik.lesson12;

/*
 *
 * Дополнить код одним методом Stream API так, чтобы в консоль было выведено число 0
 *
 */

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2 {
	public static void main(String[] args) {
		int x = IntStream.range(-2, 2)
				.map(i -> i-2)
				.reduce(10, Integer::sum);
		System.out.println("x = " + x);
		
	}
}
