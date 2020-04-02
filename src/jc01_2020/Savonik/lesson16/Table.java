package jc01_2020.Savonik.lesson16;

import java.util.Arrays;

public class Table {
    
    static char [][] table = {{'.','.','.'},
                              {'.','.','.'},
                               {'.','.','.'}};

    static public char[][] getTable() {
        return table;
    }

    public static void sign(int h, int f, char type){
        table [h][f] = type;
    }
    
    static public void print(){
        for (int k = 0; k <3 ; k++) {
            for (int n = 0; n <3; n++) {
                System.out.print(table[n][k]);  
            }
            System.out.println();
        }
    }
    
    
    public static int getWin (){
        
        for (int i = 0; i <3 ; i++) {
            if ((table [i][0] == table [i][1]) && (table [i][2] ==table [i][1])&& (table [i][1] !='.')) {
                return 1;
            }
            
            if ((table [0][i] == table [1][i]) && (table [2][i] ==table [1][i])&& (table [1][i] !='.')) {
                return 1;
            }
        }
    
        if ((table [0][0] == table [1][1]) && (table [2][2] ==table [0][0])&& (table[0][0] !='.')) {
                return 1;
            }
        
        if ((table [0][2] == table [1][1]) && (table [2][0] ==table [1][1])&& (table [1][1] !='.')) {
                return 1;
        }
        return 0;
    }

    public static boolean  isWin (){
        return Table.getWin()==1;
    }


    public static void printWin (){

        for (int i = 0; i <3 ; i++) {
            if ((table [i][0] == table [i][1]) && (table [i][2] ==table [i][1])&& (table [i][1] !='.')) {
                System.out.println("winner "+table[i][1]); }
            if ((table [0][i] == table [1][i]) && (table [2][i] ==table [1][i])&& (table [1][i] !='.')) {
                System.out.println("Winner "+table[1][i]);
            }
        }

        if ((table [0][0] == table [1][1]) && (table [2][2] ==table [0][0])&& (table[0][0] !='.')) {
            System.out.println("Winner "+table[0][0]);
        }

        if ((table [0][2] == table [1][1]) && (table [2][0] ==table [1][1])&& (table [1][1] !='.')) {
            System.out.println("Winner "+table[1][1]);
        }
    }

 
    }
    
