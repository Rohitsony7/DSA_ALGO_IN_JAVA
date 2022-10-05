class Solution {
    public int findMin(int[] nums) {
        
        int start =0;
        int end=nums.length-1;
        
        while(start<=end){
            
            int mid = start + (end-start)/2;
              if( mid-1 >=0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
           else if( mid+1 < nums.length && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
           
            else if( nums[mid] >= nums[start]) start = mid+1;
            else end = mid-1;
        }
        
        return nums[0];
        
    }
}