class Solution {
    public int[] findErrorNums(int[] nums) {
        
        
        int i=0;
        while(i < nums.length){
            
            int correctIndex = nums[i]-1;
            if(nums[i] == nums[correctIndex]) i++;
            else {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        
        for(int j=0; j < nums.length; j++){
            
            if(nums[j] -1 != j) return new int[] {nums[j], j+1};
            
        }
        
        return null;
    }
}