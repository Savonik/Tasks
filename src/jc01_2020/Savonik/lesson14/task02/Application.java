package jc01_2020.Savonik.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {
 
	public static void main(String[] args) throws IOException {
		
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		try {
			FileReader reader = new FileReader("src\\jc01_2020\\Savonik\\lesson14\\resource\\lesson14-01.txt");
			Scanner scanner = new Scanner(reader);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
			reader.close();
			scanner.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		
		try {
			FileInputStream fis = new FileInputStream("src\\jc01_2020\\Savonik\\lesson14\\resource\\lesson14-01.txt");
			InputStreamReader iR = new InputStreamReader(fis, StandardCharsets.UTF_8);
		while (iR.ready()) {
			s2.append((char)iR.read());
		}
		fis.close();
		System.out.println(s2);
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	//	System.out.println(s1.toString().equals(s2.toString()));	
		System.out.println(s1.toString().equals(s2.toString()));
		
}
}
