package jc01_2020.Savonik.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.*;

import java.util.Scanner;

public class Application {
 
	public static void main(String[] args) throws IOException {
		 StringBuilder s1= new StringBuilder();
		StringBuilder s2= new StringBuilder();
		try {
			FileReader reader = new FileReader("src\\jc01_2020\\Savonik\\lesson14\\resource\\lesson14-01.txt");
			Scanner scanner = new Scanner(reader);
			while (scanner.hasNextLine()) {
				s1.append(scanner.next());
			}
			System.out.println(s1);
			reader.close();
			scanner.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		
		try {
			FileInputStream fis = new FileInputStream("src\\jc01_2020\\Savonik\\lesson14\\resource\\lesson14-01.txt");
		int i;
		while ((i = fis.read()) != -1) {
			s2.append((char) i);
		}
		fis.close();
		System.out.println(s2);
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
		System.out.println(s1==s2);	
		
}
}
