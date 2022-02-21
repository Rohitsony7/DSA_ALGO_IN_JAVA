class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
       List<List<Integer>> al = new ArrayList<>();
        
        if(nums == null ) return al;
        if(nums.length < 3 ) return al;

        
        
        Arrays.sort(nums); //sorted arr
        
        for(int i=0; i< nums.length-2; i++ ){
            
            if( i !=0 && nums[i] == nums[i-1 ]){
                
                continue;
            }
            int val1= nums[i];
            int target = 0 - val1;
             List<List<Integer>> subRes = twoSum(nums, i+1, nums.length, target);
             
           subRes =  subRes.stream()
                    .distinct()
                    .collect(Collectors.toList());

             if(subRes.size() >0){
                 for(List<Integer> list: subRes){

                     List<Integer> ml = new ArrayList<>(list);
                     System.out.println(ml+ " " + val1);

                     ml.add(val1);
                     System.out.println(ml);
                     al.add(ml);
                 }
                 //adding all new triplet
             }
            

          
            
        }
        
        
        
        return al;
        
    }
    
    public List<List<Integer>>  twoSum(int arr[], int start, int end, int  target){
        
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
         List<List<Integer>> alTwoSum = new ArrayList<>();
        
        for(int i=start; i < end; i++){
            
            if(hm.containsKey(arr[i])){

                alTwoSum.add(Arrays.asList(hm.get(arr[i]), arr[i]));
            }else{

                hm.put(target-arr[i],arr[i]);
            }
        }
        
        return alTwoSum;
        
    }
}