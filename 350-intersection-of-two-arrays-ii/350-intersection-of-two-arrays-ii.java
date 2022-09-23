class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int val:nums1){
            
            if(hm1.containsKey(val)){
                hm1.put(val, hm1.get(val)+1);
            }else{
                hm1.put(val, 1);
            }
        }
        
          for(int val:nums2){
            
            if(hm2.containsKey(val)){
                hm2.put(val, hm2.get(val)+1);
            }else{
                hm2.put(val, 1);
            }
        }
        
        
        for(int key : hm1.keySet()){
            
            if(hm2.containsKey(key)){
                
                for(int i=0; i<Math.min(hm2.get(key), hm1.get(key)); i++) al.add(key);
            }
            
            
        }
        
        int [] res = new int[al.size()];
        int i=0;
        for(int val:al) res[i++]=val;
        return res;
        
    }
}