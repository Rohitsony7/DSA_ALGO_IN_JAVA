package BinaryAlgo;


//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArrayPeak {

    public static void main(String[] args) {

        System.out.println(peakIndexInMountainArray(new int[]{0, 1, 2, 1, 3, 5, 6, 4}));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (true) {
            int mid = start + (end - start) / 2;
            if (start == end) return start; // returning peak index
            if (arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;

        }

    }
}

