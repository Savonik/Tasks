package jc01_2020.Savonik.lesson10.classwork;

import java.util.Random;
import java.util.Scanner;

public class classwork1 {
    static Dog[] array = new Dog[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            scanner.next();
        try{
            addDog(createDog());
        } catch (NullPointerException e){
            System.out.println("случился NullPointerException e");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("случился ArrayIndexOutOfBoundsException e");
        }
        }
    }
    static Dog createDog() {
        return new Random().nextBoolean() ? new Dog() : null;
    }
    static void addDog(Dog dog) {
        Random random = new Random();
        array[random.nextInt(20)] = dog;
    }

}
