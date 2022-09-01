class Solution {
    public int[] twoSum(int[] nums, int target) {
        
          int res[] = new int[2];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i< nums.length; i++){
            
            if(hm.containsKey(nums[i])){
                res[0]=i;
                res[1]=hm.get(nums[i]);
                return res;
            }
            
            else{
                hm.put(target-nums[i], i);
            }
        }
        
        return res;
        
    }
}