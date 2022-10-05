class Solution {
    public int search(int[] nums, int target) {
        
        int len = nums.length-1;
        
        int pivot = getPivot(nums, len);
        int firstPossibleRes =binarySearch(nums, 0, pivot, target);
        
        if(firstPossibleRes >-1){
            return firstPossibleRes;
        }
        
        else return binarySearch(nums, pivot+1, len, target);
    }
    
    public static int binarySearch(int [] arr, int start, int end, int target){
        
        while(start <=end){
            
            int mid= start + (end - start)/2;
            
            if(arr[mid]==target) return mid;
            else if(arr[mid] > target) end = mid-1;
            else start = mid+1;
            
        }
        
        return -1;
        
    }
    
    
    public static int getPivot(int [] arr, int len){
        
        int start = 0;
        int end = len;
        
        while(start <=end){
            
            int mid = start + (end - start)/2;
            
            if( mid+1 <= len  && arr[mid] > arr[mid+1]){
                 return mid;
            }
            
            else if ( mid-1 >= 0 && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            
            else if(arr[start] >= arr[mid] ){
                
                end = mid-1;
                
            }
            else {
                start = mid+1;
            }
            
            
        }
        
        return -1;
        
    }
}