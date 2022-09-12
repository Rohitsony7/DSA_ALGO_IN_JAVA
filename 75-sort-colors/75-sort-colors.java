class Solution {
    public void sortColors(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int count1=0, count2=0, count3=0;
        
        for(int val : nums){
            
            switch(val){
                    
                case 0:
                    hm.put(0, ++count1);
                    break;
                
                case 1:
                    hm.put(1,++count2);
                    break;
                case 2:
                    hm.put(2,++count3);
                    break;
                default:
                    break;
                    
            }
        }
        
        count1=0;
        
        
        
        for(int key : hm.keySet()){

           for(int i=1; i<=hm.get(key); i++){
              nums[count1++] = key;
             
           }
          
        }
        
       System.out.println(Arrays.toString(nums));
        
    }
}