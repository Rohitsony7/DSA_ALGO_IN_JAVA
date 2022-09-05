class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;
        for(int val : nums){ 
            
            if(((int)(Math.log10(val)) & 1)==1 ) count++;
        }
        
        return count;
    }
}