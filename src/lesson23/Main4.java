package lesson23;

import java.util.ArrayList;
import java.util.Random;

public class Main4 {

    public static void main(String[] args) {

        int[] array = new int[5];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        ArrayList<String> array1 = Algoritm.fizzBazz(array);

        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i));
        }



    }




}
