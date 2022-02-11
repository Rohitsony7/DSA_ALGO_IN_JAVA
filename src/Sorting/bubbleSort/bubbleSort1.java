package Sorting.bubbleSort;

import java.util.Arrays;

public class bubbleSort1 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(sortIt(arr)));
    }


    public static   int[] sortIt(int arr[]){


        int start=0;
        int end = arr.length-1;

        for(int i=0; i< end; i++){

            boolean isSwapped = false;

            for(int j=1; j<end-i; j++){

                if(arr[j-1] > arr[j]) {
                    isSwapped = true;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

            if (!isSwapped) break;
        }

        return arr;

    }
}


