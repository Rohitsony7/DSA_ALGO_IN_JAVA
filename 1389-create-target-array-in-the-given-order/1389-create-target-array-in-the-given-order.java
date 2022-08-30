class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i< nums.length; i++){
            
            al.add(index[i], nums[i]); // help us to ordering the array
        }
        
        //list.size() >time takes more >> nums.length();
        
        int arr[]= new int[nums.length];
        
        for(int j=0; j<nums.length; j++){
            
            arr[j] = al.get(j);
        }
        
        return arr;
        
        
    }
}