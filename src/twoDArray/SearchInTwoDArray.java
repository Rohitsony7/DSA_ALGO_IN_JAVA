package twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInTwoDArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 24, 36},
                {4, 5, 67, 5, 434, 6},
                {7, 8, 9},
                {23, 45, 67, 7, 59, 56, -98}
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target element : ");
        int target = in.nextInt();
        System.out.println("Index of Target value : " + Arrays.toString(searchElement(arr, target)));
        System.out.println("[Max, Min] : " + Arrays.toString(searchMaxMinElement(arr)));
    }

    public static int[] searchElement(int[][] arr, int target) {

        int row = 0;


        for (int[] myarr : arr) {
            int column = 0;
            for (int element : myarr) {

                if (element == target) return new int[]{row, column};
                column++;

            }
            row++;

        }

        return new int[0];
    }

    public static int[] searchMaxMinElement(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int[] myarr : arr) {

            for (int element : myarr) {

                max = Math.max(element, max);
                min = Math.min(element, min);
            }

        }

        return new int[]{max, min};
    }

    class Solution {
        public int findNumbers(int[] nums) {

            StringBuilder sb = new StringBuilder();
            int count = 0;

            for (int num : nums) {

                if (Integer.toString(Math.abs(num)).length() % 2 == 0) {

                }
                count++;
            }
            return count;

        }
    }
}
