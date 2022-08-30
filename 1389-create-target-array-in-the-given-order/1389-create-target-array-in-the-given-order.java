class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i< nums.length; i++){
            
            al.add(index[i], nums[i]); // help us to ordering the array
        }
        
        
       int arr[]= al.stream().mapToInt(Integer::intValue).toArray();
      
        
        
        
        
        return arr;
        
        
    }
}