class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        
        List<Integer> ll = new ArrayList<Integer>();
        
        int i=0;
      while(i < nums.length){
          
          int correctIndex = nums[i]-1;
          
          if( nums[i] == nums[correctIndex]) i++;
          else{
              
              int temp = nums[i];
              nums[i] = nums[ correctIndex];
              nums[correctIndex] = temp;
             
          }
         
    
          
          
          }
                
        for(int j=0; j< nums.length; j++){
            
            if( j != nums[j] -1 ) ll.add(j+1);
            
        }
        
        return ll;
          
      }
        
    }
