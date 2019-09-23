package lesson23;

public class PrimeNumber {

    public static boolean primeNember(int num) {

        boolean isPrimeNumber = false;

        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            } else {
                isPrimeNumber = true;
            }
        }

        return isPrimeNumber;
    }
}
