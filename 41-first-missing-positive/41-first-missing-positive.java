class Solution {
    public int firstMissingPositive(int[] nums) {
        
        
        int i=0;
        while(i < nums.length){
            
            
            
            int correctIndex = nums[i]-1;
            
            
            if(nums[i] > 0 && correctIndex < nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else i++;
        }
        
        for(int j=0;  j< nums.length; j++){
            
            if(nums[j]-1 !=j) return j+1;
        }
        
        return nums.length+1;
    }
    
}