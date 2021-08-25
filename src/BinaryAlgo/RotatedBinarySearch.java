package BinaryAlgo;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearch {

    public static void main(String[] args) {

        System.out.println(search(new int[]{1, 2, 3, 4, -3, -2, -1, 0,}, 2));
    }


    // if you don't find pivot, the array is not rotated then
    // Q. find the rotation count, Ans. Pivot+1;
    public static int pivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) return mid;
            if (mid > start && nums[mid] < nums[mid - 1]) return mid - 1;
            if (nums[start] >= nums[mid]) end = mid - 1;
            else start = mid + 1;

        }

        return -1;

    }

    public static int pivotWithDuplicateNumberInArray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) return mid;
            if (mid > start && nums[mid] < nums[mid - 1]) return mid - 1;


            //changes required here, will do it later

        }

        return -1;

    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = pivot(nums);

        // if you don't find pivot, the array is not rotated then
        if (peak == -1) return binarySearch(start, end, nums, target);
        if (nums[peak] == target) return peak;
        else {
            int firstPossiblePeak = binarySearch(start, peak, nums, target);
            if (firstPossiblePeak != -1) {
                return firstPossiblePeak;
            } else {
                return binarySearch(peak + 1, end, nums, target);
            }
        }

    }

    public static int binarySearch(int start, int end, int[] nums, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return -1;

    }

}
