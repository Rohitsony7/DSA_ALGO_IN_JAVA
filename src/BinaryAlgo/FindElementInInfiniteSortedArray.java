package BinaryAlgo;

//sorted means apply binary search

// we can not expect index out of bound exception since given array will be infinite, so we can't use length
public class FindElementInInfiniteSortedArray {

    public static void main(String[] args) {

        System.out.println(ans(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 34, 45, 67, 78}, 10));

    }

    public static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; // doubling the range of array window
            start = newStart;

        }
        return binarySearch(arr, target, start, end);

    }

    private static int binarySearch(int[] arr, int target, int start, int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            else if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }
}





