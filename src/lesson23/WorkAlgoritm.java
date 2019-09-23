package lesson23;

public class WorkAlgoritm {

    public static String plushCareAlgorithm(String input) {

        char[] arr = input.toCharArray();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {

                int a = Character.getNumericValue(arr[i]);

                for (int j = 0; j < a; j++) {
                    builder.append(arr[i+1]);
                }

                i++;

            } else {
                builder.append(arr[i]);
            }
        }

        String result = builder.toString();

        return result;

    }
}
