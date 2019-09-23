public class Main2 {

    public static void main(String[] args) {

        int[] arr = {7, 1, 6, 0, 9, 2};

        //int[] array = ArraySort.bubbleSort(arr);

        int[] array = ArraySort.sort(arr);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
