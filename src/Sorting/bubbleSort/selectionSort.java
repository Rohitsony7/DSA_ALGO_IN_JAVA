package Sorting.bubbleSort;


// either start with max and swap with last element in unsorted array
// or start with min and swap with first element in unsorted array

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int maxIndex = 0;
            int lastIndexOfArray = arr.length - i - 1;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            swap(arr, maxIndex, lastIndexOfArray);
        }

    }

    private static void swap(int[] arr, int maxIndex, int lastIndexOfArray) {

        int temp = arr[lastIndexOfArray];
        arr[lastIndexOfArray] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
