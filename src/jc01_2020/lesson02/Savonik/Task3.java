

/*
* */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        long second = scanner.nextLong();


        if (first% second ==0)  {
            System.out.println("делится");
            System.out.println("частное равно  "+first/ second);
        }
        else
            System.out.println("не делится, частное равно  "+first/ second);
        { System.out.println("остаток равен  "+first% second);

        }

    }
}
