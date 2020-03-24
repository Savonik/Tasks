package jc01_2020.Savonik.lesson13;

/*
 *
 * Сгенерировать случайную дату в интервале с 1 по 4 марта 2020 (включительно). Вывести в консоль каждую дату и
 * результат сравнения этих дат (дата1 больше/меньше/равна дата2)
 *
 */

import java.time.LocalDate;
import java.util.Random;
import static java.lang.System.*;

public class Task1 {
	public static void main(String[] args) {
		
		LocalDate firstLocalDate = LocalDate.of(2020, 3, new Random().nextInt(4)+1);
		LocalDate secondLocalDate = LocalDate.of(2020, 3, new Random().nextInt(4)+1);
		out.println(firstLocalDate);
		out.println(secondLocalDate);
		if (firstLocalDate.isBefore(secondLocalDate)) { out.println(firstLocalDate+" меньше "+secondLocalDate);}
		else if (firstLocalDate.isAfter(secondLocalDate)) {out.println(firstLocalDate+" больше "+secondLocalDate);}
		else {out.println(firstLocalDate+" равна "+secondLocalDate);}
			

	}

}
