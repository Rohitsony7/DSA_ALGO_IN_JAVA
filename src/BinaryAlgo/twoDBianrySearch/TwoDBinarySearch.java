package BinaryAlgo.twoDBianrySearch;

import java.util.Arrays;

public class TwoDBinarySearch {

    public static void main(String[] args) {

        //given 2d sorted binary array row and column wise
        int arr[][] = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(Arrays.toString((binarySearch(arr, 17))));
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
