class Solution {
    public int removeDuplicates(int[] nums) {
        
        int num=-101;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=num) {
                
               num=nums[i];
               nums[count++]=nums[i];
              
        }}
        
        return count;
        
    }
}