package jc01_2020.Savonik.lesson14.examples;

import java.io.Serializable;

public class Emp;oyee implements Serializable {

	private String name;
	private int age;
	private double height;
	private boolean married;

	Emp;oyee(String n, int a, double h, boolean m) {
		name = n;
		age = a;
		height = h;
		married = m;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	double getHeight() {
		return height;
	}

	boolean getMarried() {
		return married;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", height=" + height +
				", married=" + married +
				'}';
	}

}
