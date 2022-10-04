/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int index = getPeak(mountainArr);
     
        int firstTry = binarySearch(0, index, mountainArr, target, true);
     
        
        if(firstTry !=-1){
            return firstTry;
        }
     return  binarySearch(index+1,mountainArr.length()-1 , mountainArr, target, false);
        
    }
    
    
    public static int getPeak(MountainArray mountainArr){
        
        int start=0;
        int end = mountainArr.length()-1;
        
        while(start < end){
            
            int mid = start + (end - start)/2;
            
            if(mountainArr.get(mid) > mountainArr.get(mid+1) ) end =mid;
            else  start = mid+1;           
        }
        
        return end;
        
    }
    
    public static int binarySearch(int start, int end, MountainArray mountainArr, int target, boolean bool){
        
        if(bool){
              while(start <= end){
            int mid = start + (end -start)/2;
            
            if(mountainArr.get(mid) == target) return mid;
            else if(mountainArr.get(mid) > target) end = mid-1;
            else start = mid+1;
        }
        return -1;
        }
        else {
              while(start <= end){
            int mid = start + (end -start)/2;
            
            if(mountainArr.get(mid) == target) return mid;
            else if(mountainArr.get(mid) < target) end = mid-1;
            else start = mid+1;
        }
        return -1;
        }
        
      
    }
    
    
}