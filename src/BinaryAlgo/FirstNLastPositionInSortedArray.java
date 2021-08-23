package BinaryAlgo;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstNLastPositionInSortedArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int first = searchRangeforFirstNLast(nums, target, true);
        int last = searchRangeforFirstNLast(nums, target, false);
        return new int[]{first, last};
    }

    public static int searchRangeforFirstNLast(int[] nums, int target, boolean isSearchFirst) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (end >= start) {
            int mid = start + (end - start) / 2;


            if (target > nums[mid]) start = mid + 1;
            else if (target < nums[mid]) end = mid - 1;
            else {

                ans = mid;

                if (isSearchFirst) end = mid - 1;
                else start = mid + 1;

            }

        }
        return ans;

    }
}



