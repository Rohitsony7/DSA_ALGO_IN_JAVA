class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0; i< nums.length; i++){
            
            if(hm.containsKey(nums[i])){
                
                return new int[]{i, hm.get(nums[i])};
            }
            
            else{
                hm.put(target-nums[i], i);
            }
        }
        
        return new int[] {0,0};
        
    }
}