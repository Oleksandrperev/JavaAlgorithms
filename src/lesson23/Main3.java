package lesson23;

import java.util.Random;

public class Main3 {

    public static void main(String[] args) {

        int[] array3 = new int[29];

        Random random = new Random();

        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(100);
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }




    }
}
