

/*
*
* Какое из чисел 1, 2 или 3 введено
*
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeric = scanner.nextInt();

        switch (numeric){
            case 1:
                System.out.println("введено число 1");
                break;

                case 2:
                System.out.println("введено число 2");
                break;

                case 3:
                System.out.println("введено число 3");
                break;


            default:
                System.out.println("никакое число");

        }

    }
}
