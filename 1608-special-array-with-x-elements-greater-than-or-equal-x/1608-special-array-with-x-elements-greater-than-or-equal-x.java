class Solution {
    public int specialArray(int[] nums) {
        
        
        int [] arr = new int[1001];
        int len = nums.length;
        
        for(int num : nums){
            
            arr[num]++;
            
        }
        
        for(int j=0; j<1001; j++){
            
            if(j == len) return j;
            len-=arr[j];
            
            
        }
        
        return -1;
    }
    
}