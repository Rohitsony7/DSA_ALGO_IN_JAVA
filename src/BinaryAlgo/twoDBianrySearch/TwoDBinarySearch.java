package BinaryAlgo.twoDBianrySearch;

import java.util.Arrays;

public class TwoDBinarySearch {

    public static void main(String[] args) {

        //given 2d sorted binary array row and column wise
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        System.out.println(Arrays.toString((binarySearch(arr, 8))));
    }

    private static int[] binarySearch(int[][] arr, int target) {

        int r = 0;
        int c = arr[0].length - 1;

        while (r < arr.length && c >= 0) {

            if (target == arr[r][c]) return new int[]{r, c};
            else if (target > arr[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
