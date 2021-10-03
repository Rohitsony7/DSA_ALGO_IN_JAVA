package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 90, 91, 98};
        System.out.println(search(arr, 12, 0, arr.length - 1));
    }

    //  binary search using recursion
    private static int search(int[] arr, int target, int start, int end) {

        if (start > end) return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return mid;

        if (arr[mid] > target) {
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);

    }
}
