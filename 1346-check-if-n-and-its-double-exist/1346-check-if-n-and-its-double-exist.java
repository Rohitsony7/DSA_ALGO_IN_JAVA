class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        
        boolean bool = false;
        for(int i=0; i<arr.length; i++){
            
           if  (binarySearch(0, arr.length-1, arr, arr[i] * 2, i) ) return true;
            
        }
        
        return bool;
        
        
        
        
    }
    
    public static boolean binarySearch(int start, int end, int []arr, int target, int index){
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if((arr[mid] )== target & index !=mid)  return true;
            else if (arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        
        return false;
        
    }
}