class Solution {
    public boolean search(int[] nums, int target) {
        
        int pivot = getPivot(nums);
        
        return binarySearch(0,pivot, nums, target)? true: binarySearch(pivot+1, nums.length-1, nums, target);
        
    }
    
    public  boolean binarySearch(int start, int end, int [] arr, int target){
        
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target || arr[start] ==target || arr[end] == target) return true;
            else if(arr[mid] > target) end =mid-1;
            else start= mid+1;
            
        }
        return false;
        
        
    } 
    
    public static int getPivot(int [] arr){
        
        int start=0;
        int end = arr.length-1;
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if(  mid+1 < arr.length && arr[mid] > arr[mid+1] ){
                return mid;
            }
           else if(  mid  >= 1  && arr[mid] < arr[mid-1] ){
                return mid-1;
            }
            
            
            // to skip duplicate
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                
                
                //if start id pivot
                
                if(start+1 < arr.length && arr[start] > arr[start+1]) return start;
                start ++;
                if( end -1 >=0  && arr[end] < arr[end-1]) return end-1;
                end--;
            }
            
            else if( arr[mid] > arr[start] ||  ( arr[mid] ==arr[start] && arr[mid] > arr[end])){
                
                start = mid+1;
            }
            else {
                end = mid-1;
            }
            
        }
        
        return -1;
        
    }
}