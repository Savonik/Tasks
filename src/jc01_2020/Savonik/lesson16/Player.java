package jc01_2020.Savonik.lesson16;

import java.util.Random;


public class Player implements Runnable {
    Random random = new Random();
    char value;
    
    public Player(char value) {
        this.value = value;
    }
    

    
    @Override
    public void run() {
        boolean b = true;
        int n = 0;
                while (b) {
                     int i = random.nextInt(3);
                     int j = random.nextInt(3);
                     if (Table.getTable()[i][j] == '.') {
                         Table.sign(i, j, value);
                         b=false;
                    }
                     n++;
                     if (n>9) break;
                 }
    }
    
}
