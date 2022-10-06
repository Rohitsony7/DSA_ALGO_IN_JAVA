class Solution {
    public int findMin(int[] nums) {
        
        int pivot = getPivot(nums);
        
        if( pivot <=nums.length-1 && pivot != -1) return nums[pivot+1];
        else return nums[0];
    }
    
     public  int getPivot(int [] arr){
        
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