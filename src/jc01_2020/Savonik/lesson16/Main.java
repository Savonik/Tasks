package jc01_2020.Savonik.lesson16;

/*
*
* Написать игру крестики нолики, где два игрока-потока играют друг с другом
* Ходят по очереди.
* Вывести в консоль результат партии и итоговое игровое поле
*
*/

import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    
    public static void main(String[] args) {
        
        Player player1 = new Player('0');
        Player player2 = new Player('x');
        
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 20 ; i++) {
           
            if (Table.isWin()){
                Table.printWin();
              break;
            }
            else {
                service.execute(player1);
                if (Table.isWin()) {
                    Table.printWin();
                    break;
                }
                else service.execute(player2);
            }
       }
        
   if (!Table.isWin()){
       System.out.println("DRAW");
   }
            service.shutdown();
            Table.print();
            
    }

}
