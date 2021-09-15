package Sorting.InsertionSort;

import java.util.Arrays;


// best case O(N-1) ----> O(N)
//wrost case O(N^2)
// not stable
// best for small length of array
public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
                // very imp condition to break;
                else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


