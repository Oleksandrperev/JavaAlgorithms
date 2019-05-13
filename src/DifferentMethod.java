import java.util.ArrayList;

public class DifferentMethod {


    public static int sum(ArrayList<Integer> array) {

        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                sum = sum + array.get(i);
            }
        }

        return sum;
    }

    public static int sum(int[] arr) {
        return 0;
    }


}
