package jc01_2020.Savonik.lesson14.examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("resource/Emp;oyee.dat"))) {
			Emp;oyee p = (Emp;oyee) ois.readObject();
			System.out.println(p.toString());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}

