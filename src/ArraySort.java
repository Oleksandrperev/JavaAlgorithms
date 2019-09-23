public class ArraySort {




        //{7, 1, 6, 0, 9, 2}

        public static int[] bubbleSort(int[] array) {
            boolean sorted = false;
            int temp;
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i+1]) {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        sorted = false;
                    }
                }
            }

            return array;

        }

    public static int[] sort(int[] array) {

            int storage;

            for (int i = 0; i < array.length - 1; i++) {

                for (int j = i+1; j < array.length; j++) {


                    if (array[j] < array[i]) {
                        storage = array[i];
                        array[i] = array[j];
                        array[j] = storage;

                    }

                }
            }

            return array;
        }



    }







