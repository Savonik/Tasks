package jc01_2020.Savonik.lesson14.task03;

/*
 *
 * Создать объект любого пользовательского класса минимум с тремя полями с ненулевыми значениями.
 * Объявить любое поле несериализуемым.
 * Сериализовать этот объект в файл lesson14/resource/<userClassName>.dat.
 *
 */

import java.io.*;

public class Application {

	public static void main(String[] args)  {
		Man nikolay = new Man("Nikolay", 100, 52);
		try {
			File f = new File("src/jc01_2020/Savonik/lesson14/resource");
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/jc01_2020/Savonik/lesson14/resource/Man.dat"));
			o.writeObject(nikolay);
			o.close();
			System.out.println("Done");
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
}

   
