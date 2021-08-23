package BinaryAlgo;

// for binary search array should be sorted

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {0, 1, 3, 6, 67, 89, 97, 123, 134, 143, 156};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter target value to find index : ");
        int target = in.nextInt();

        System.out.println(search(target, arr));

    }


    public static int search(int target, int[] arr) {

        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
//            int mid = (start + end) / 2; // this may exceed int range
            int mid = start + (end - start) / 2; // better way to calculate mid

            if (target == arr[mid]) return mid;
            if (target > arr[mid]) start = mid + 1;
            if (target < arr[mid]) end = mid - 1;


        }
        return -1;
    }


}
