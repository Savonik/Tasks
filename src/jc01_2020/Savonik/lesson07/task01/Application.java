package jc01_2020.Savonik.lesson07.task01;

/*
 *
 * Собираем чемодан
 *
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Реализовать в нем конструктор, в который
 * передается объем коробки, и метод add(), который принимает на вход Shape и кладет в коробку.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватает места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 * Все сущности должны являть наследниками класса Shape.
 * Параллелепипед - прямоугольный
 *
 */

public class Application {

	public static void main(String[] args) {

		Shape Shape1 = new Sphere(5);
		Shape Shape2 = new Pyramid(6, 7);
		Shape Shape3 = new Cylinder(5,6);
		Box Box1 = new Box(500);
		System.out.println(Box1.add(Shape1));
		System.out.println(Box1.add(Shape2));
		System.out.println(Box1.volumebox);
		System.out.println(Shape3.getVolume());
		System.out.println(Box1.add(Shape3));
		

	}

}
