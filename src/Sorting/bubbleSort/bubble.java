package Sorting.bubbleSort;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {

        int arr[] = {-9, -7, 0, 3, 9, 5, 6, -5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            boolean isSwap = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j - 1] > arr[j]) {
                    isSwap = true;
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }

            if (!isSwap) return;
        }
    }

    public static void selectionSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {

                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            swap(arr, maxIndex, arr.length - 1 - i);


        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}


