class Solution {
    public int[] productExceptSelf(int[] nums) {
        
     int[] fromLeftSideProduct = new int[nums.length];
    fromLeftSideProduct[0]=1;
        
        int[] fromRightSideProduct = new int[nums.length];
    fromRightSideProduct[nums.length-1]=1;
        
 
        for(int i=0; i<nums.length-1; i++) {
            
            fromLeftSideProduct[i+1]=fromLeftSideProduct[i]*nums[i];
        }    
        
        for(int i=nums.length-2; i>=0; i--) {
            
            fromRightSideProduct[i]=fromRightSideProduct[i+1]*nums[i+1];
        }  
        
            
        for(int i=0; i< nums.length; i++){
            nums[i]=fromLeftSideProduct[i]*fromRightSideProduct[i];
            
        }
        
        return nums;
        
        
    }
}