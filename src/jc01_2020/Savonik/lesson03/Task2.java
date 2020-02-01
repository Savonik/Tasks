package jc01_2020.Savonik.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int secret = (int) (Math.random() * 100 + 1);
		int i;
		for (i = 1; i<11; i++){
			int input = scanner.nextInt();
			if (input>secret) {
				System.out.println("попытка " +i+ " не удалась, загаданное число меньше, чем введённое");
			} else if (input<secret){
				System.out.println("попытка " +i+ " не удалась, загаданное число больше, чем введённое");
			}
			else {
				System.out.println("Ура! Число угадано)))))");
				break;
			}
			
			}
		if (i==11) {System.out.println("число попыток исчерпано, secret = " + secret);}
		}
		
		
		
	}

