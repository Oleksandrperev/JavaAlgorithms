package lesson23;

public class Polindrom {

    public static void isPolindrom(String str) {

        boolean isPalindrom;

        StringBuffer buffer = new StringBuffer(str);

        String a = buffer.reverse().toString();

        if (str.equalsIgnoreCase(a)) {
            isPalindrom = true;
        } else isPalindrom = false;

        if (isPalindrom) {
            System.out.println(str + " is palindrom");
        } else System.out.println(str + " is not palindrom");

    }
}
