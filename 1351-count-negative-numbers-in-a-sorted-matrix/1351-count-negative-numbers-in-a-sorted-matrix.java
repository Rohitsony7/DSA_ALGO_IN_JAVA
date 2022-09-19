class Solution {
    public int countNegatives(int[][] grid) {
        
        int count=0;
        for(int[] arr: grid){
            
            int start=0;
            int end = arr.length-1;
            int res=end+1;
          
            while(start <= end){
                
                int mid = start + (end-start)/2;
                
                if(arr[mid] <0) {
                    
                    res=mid;
                    end=mid-1;
                    
                }
                else start =mid+1;
                
            }
            
            count += (arr.length - res);
        }
        
        return count;
    }
}