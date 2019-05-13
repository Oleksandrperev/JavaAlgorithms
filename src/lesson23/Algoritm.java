package lesson23;

import java.util.ArrayList;

public class Algoritm {


    public static void printWords(String a) {

        String[] array = a.split(" ");

        for (String element: array) {
            System.out.println(element);
        }
    }

    public static ArrayList<String> fizzBazz(int[] a) {

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                arr.add("FizzBazz");
                continue;
            }
            if (a[i] % 3 == 0) {
                arr.add("Fizz");
                continue;
            }
            if (a[i] % 5 == 0) {
                arr.add("Bazz");
                continue;
            } else arr.add(Integer.toString(a[i]));
        }
        return arr;

    }
    //comment
    //git
}
