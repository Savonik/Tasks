package jc01_2020.Savonik.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	static class Cat {
	}

	interface Filter{
		boolean apply(Object o);
	}
	
	public static <Object> void Filter(Object array) {
	}

	public static void main(String[] args) {
		
		Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat(),4,4};
		List<Object> ListObjects = new ArrayList<>();
		for (int i=0; i<array.length;i++) {
            if (array[i] instanceof Number){
			ListObjects.add(array[i]);
            }
		}
		System.out.println(ListObjects);
	}
	
}
