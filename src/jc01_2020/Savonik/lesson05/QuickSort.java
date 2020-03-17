package jc01_2020.Savonik.lesson05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class QuickSort {
    public static void main(String[] args) {
        boolean sorted = false;
    int [] numbers =  {14,5,7,101,4,19};
    
                
      
    //сортировка пузырьком
        /*
        while (!sorted){
            sorted=true;
            for (int i = 1; i <numbers.length ; i++){
                if (numbers[i] < numbers [i-1]) {
                    int k=numbers [i];
                    numbers[i]=numbers[i-1];
                    numbers[i-1] =k;
                   sorted=false;
                }
            }
            }
            
        
        System.out.println(Arrays.toString(numbers));
        //сортировка выбором
        for (int i = 0; i <numbers.length-1 ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
            if (numbers[i]>numbers[j])  {
                int k=numbers [i];
                numbers[i]=numbers[j];
                numbers[j] =k;
            } 
            }
        }
*/

        System.out.println(Arrays.toString(numbers));

       
        
    }
}
