package jc01_2020.Savonik.lesson12.Task4;

import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class Car {
    Color color;
   

    enum Color {blue, red, yellow, green, dark}
    
    Car (Color color){
        this.color=color;
    }
    
    public static void main(String[] args) {
        
      
        Set<Color> colorSet = null;
        for (int i = 0; i < 50; i++) {
           colorSet = EnumSet.allOf(Color.class);
        }
      
        System.out.println(colorSet);  
    }
          
  
}

