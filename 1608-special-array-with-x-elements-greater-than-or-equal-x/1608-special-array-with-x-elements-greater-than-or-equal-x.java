class Solution {
    public int specialArray(int[] nums) {
        
        if(nums[0]==1 && nums.length ==1) return 1;
        
        for(int i=1; i<= 1000; i++ ){
            
            int count=0;
            for(int  num : nums) if(num >= i) count++;
            
            if(count == i) return i;
    
        }
        
        return -1;
    }
    
}