class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int arr1[] = new int[1001];
        int arr2[] = new int[1001];
        
        for(int val : nums1){
            
            arr1[val]+=1;
            
        }
        
        for(int val : nums2){
            
              arr2[val]+=1;
        }
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<arr1.length; i++){
            
            for(int j=0; j< Math.min(arr1[i], arr2[i]); j++){
                al.add(i);
                
            }
        }
        
        int arr [] = new int[al.size()];
        
        for(int k=0; k< arr.length; k++){
            
            arr[k] = al.get(k);
        }
        return arr;
    }
}