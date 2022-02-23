class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ll = new ArrayList<Integer>();
        int i=0;
        while( i < nums.length){
            
            int correctIndex = nums[i]-1;
            if(nums[i] == nums[correctIndex]) i++;
            else {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
             }
        }
        
        for(int j=0; j< nums.length; j++){
            
            if(nums[j]-1 != j) ll.add(nums[j]);
        }
        
        return ll;
    }
    
}