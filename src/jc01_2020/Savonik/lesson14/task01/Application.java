package jc01_2020.Savonik.lesson14.task01;

/*
 *
 * При помощи FileWriter создать в папке lesson14/resource текстовый файл с именем lesson14-01.txt, записать в него строки
 * "Давай проверим, что мы умеем писать в файл.
 * Поехали!"
 *
 */

import java.io.FileWriter;
import java.io.IOException;


public class Application {

	public static void main(String[] args){
		try { 
			
			FileWriter writer = new FileWriter("src\\jc01_2020\\Savonik\\lesson14\\resource\\lesson14-01.txt");
		writer.write("Hello проверим, что мы умеем писать в файл.");
		writer.write("\n");
		writer.write("Поехали!");
		writer.close();
		
		} catch (IOException e) { e.printStackTrace(); }
	}
}
