class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int arr1[] = new int[1001];
        int arr2[] = new int[1001];
        
        for(int val : nums1){
            
            arr1[val]+=1;
            
        }
        int count=0;
        for(int val : nums2){
            
             if(arr1[val] >0){
                 arr2[count++] = val;
                 arr1[val]--;
             }
        }
        
        return Arrays.copyOfRange(arr2,0,count);
      
    }
}