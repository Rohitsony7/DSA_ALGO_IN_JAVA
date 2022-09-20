class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
        
        for(int val:nums1) hm.put(val, false);
        
        for(int val:nums2) {
            if(hm.containsKey(val)){
                hm.put(val, true);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int val: hm.keySet()){
            
            if(hm.get(val)) al.add(val);
        }
        
          int[] arr = al.stream().mapToInt(i -> i).toArray();
        return arr;
   }
}