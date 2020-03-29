package jc01_2020.Savonik.lesson14.task04;

/*
 *
 * Десериализовать объект из предыдущей задачи. Вывести в консоль значения всех полей
 *
 */

import jc01_2020.Savonik.lesson14.task03.Man;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Application {

	public static void main(String[] args) {
		try {
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("src/jc01_2020/Savonik/lesson14/resource/Man.dat"));
			Man nikolay = (Man) o.readObject();
			System.out.println(String.format("name - %s, weight - %s, age - %s", nikolay.name, nikolay.weight ,nikolay.age));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
