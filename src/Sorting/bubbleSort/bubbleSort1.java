package Sorting.bubbleSort;

import java.util.Arrays;

public class bubbleSort1 {

    public static void main(String[] args) {

        int arr[] = {4,5,1,2,3,-2,0,-45,90,-56};
//        System.out.println(Arrays.toString(sortItByBubble(arr)));
//        System.out.println(Arrays.toString(sortItBySelection(arr)));
//        System.out.println(Arrays.toString(getSortByInsertion(arr)));

        int arrForSelection[] = {5,4,3,2,1,3,4};
        System.out.println(Arrays.toString((sortItBySelection(arrForSelection))));
    }


    public static   int[] sortItByBubble(int arr[]){


        int start=0;
        int end = arr.length;

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

    public  static  int[] sortItBySelection(int arr[]){

        for(int i=0; i<arr.length; i++){

            int end = arr.length -1-i;


          int maxIndex = getIndexOfMax( arr, 0, end);
//            int minIndex = getIndexOfMin(arr, i, arr.length-1);

          swap(arr,maxIndex, end);
//            swap(arr,minIndex, i);

        }

        return  arr;
    }

    public  static void swap(int arr[], int start, int end){

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public  static  int getIndexOfMax(int arr[], int start, int end){

        int max = start;

        for(int i=start; i<=end; i++){

            if(arr[max] < arr[i]) max= i;
        }

        return max;
    }

    public  static  int getIndexOfMin(int arr[], int start, int end){

        int min = start;

        for(int i=start; i<=end; i++){

            if(arr[min] > arr[i]) min= i;
        }

        return min;
    }

    public  static  int[] getSortByInsertion(int arr[]){


        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1; j>0; j--){

                if (arr[j] < arr[j-1]) swap(arr, j, j-1);
                else  break;
            }
        }

        return  arr;


    }


    //when there is [1,N] array
    public  static  int[] getSortBySelection(int arr[]){
        int i=0;
        while (i<arr.length){

            if(arr[i] == i+1 ) i++;
            else  swap(arr, arr[i]-1, i);
        }

        return arr;

    }
}


