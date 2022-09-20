class Solution {
    public int findKthPositive(int[] arr, int k) {
        
     if( arr[0] > k){
         return k;
     }  
        int i=0;
        int index=0;
        while(i < arr.length && arr[i]-(i+1)< k){
            
            index=++i;
        }
        
        return k+index;
    }
    
}