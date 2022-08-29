class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = nums.length;
        int arr[] = new int[len*2];
        
        for(int i=0; i< len; i++){
            
            arr[i] = nums[i];
            arr[len*2-1-i] = nums[len-1-i];
            
        }
        return arr;
        
    }
}