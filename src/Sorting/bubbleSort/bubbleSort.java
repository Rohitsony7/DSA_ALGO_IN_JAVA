package Sorting.bubbleSort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {

        int[] arr = {1, -4, -6, -9, 2, 3, 4, 0, 6, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int @NotNull [] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    private static void swap(int[] arr, int j, int i) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}




