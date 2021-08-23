package twoDArray;

public class MaxInArray {

    public static void main(String[] args) {

        int arr[] = {82, 3, 5, 7, 4, 3, -6, 7, 8, 5};

        int max = arr[0];
        int min = arr[0];

        // if you want to get max in a range then you can add i = start and i < end in conditions
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]); // for max
            min = Math.min(min, arr[i]); // for min

        }

        System.out.println("max : " + max + ", min : " + min);

    }
}
