class Solution {
    public int findKthPositive(int[] arr, int k) {
        
     if( arr[0] > k){
         return k;
     }
        
        
        for(int val:arr){
            
            if(val <= k) k++;
            else break;
        }
        
        return k;
    }
    
}