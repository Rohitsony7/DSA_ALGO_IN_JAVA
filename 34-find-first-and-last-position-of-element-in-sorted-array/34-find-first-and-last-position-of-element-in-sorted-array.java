class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    int first, last;
        
         first = binarySearch(0, nums.length-1, nums, target, true);
         last = binarySearch(0, nums.length-1, nums, target, false);
            
            
            return new int [] {first, last};
    }
    
    
    public static int binarySearch(int start, int end, int[] arr, int target, boolean isFirst){
        int possibleVal=-1;
        
        while(start <=end){
            int mid = start + (end - start)/2;
               if(arr[mid]==target){
                possibleVal=mid;
                if(isFirst) end=mid-1;
                else  start=mid+1;     
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }
        
        return possibleVal;
        
    }
    
}