package jc01_2020.Savonik.lesson07.task02;

/*
*
* Реализовать валидацию хода шахматной фигуры
*
* Даны шахматные фигуры, которые должны являться наследниками класса Figure. В конструктор передается начальное положение
* фигуры в виде char e, int 2 (char g, int 8 и т.д.). Реализовать для каждой фигуры метод moveTo(char c, int i), который
* вернет логическое значение доступен ли такой ход для этой фигуры. Постарайтесь максимально использовать принципы ООП.
* Не добавляйте новые поля в классах-фигурах
* Ссылку на созданный объект фигуры в методе main хранить в переменной типа Figure
*
*/

public class Application {

	public static void main(String[] args) {
		Figure figure=new Bishop('e',3);
		System.out.println(figure.moveTo('f',4));
		
		Figure figure1=new King('b',2);
		System.out.println(figure1.moveTo('b',2));

		Figure figure2=new Knight('b',2);
		System.out.println(figure2.moveTo('c',4));

		Figure figure3=new Pawn('b',2);
		System.out.println(figure3.moveTo('c',2));
		
		Figure figure4=new Queen('b',2);
		System.out.println(figure4.moveTo('c',3));

		Figure figure5=new Rook('b',2);
		System.out.println(figure5.moveTo('g',2));
	}
}
