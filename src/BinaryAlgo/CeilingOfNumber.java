package BinaryAlgo;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // given array is sorted, apply binary

        int target = 15;

        System.out.println(getCeiling(arr, target));
    }

    private static int getCeiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;


        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return arr[mid];
            if (target > arr[mid]) start = mid + 1;
            if (target < arr[mid]) end = mid - 1;

        }
//      return arr[start]; // for ceiling value
        return arr[end]; // for floor value

    }
}
