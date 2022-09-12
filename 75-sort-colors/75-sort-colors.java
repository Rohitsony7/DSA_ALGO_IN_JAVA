class Solution {
    public void sortColors(int[] nums) {
        
        int low=0, mid=0;
        int high = nums.length-1;
        
       while( mid <= high){
           
           switch(nums[mid]){
                   
                case 0:
                   swap(nums,low, mid);
                   low++;
                   mid++;
                   break;
                 
               case 1:
                   mid++;
                   break;
            
               case 2:
                   swap(nums,high, mid);
                   high--;
           }
       }
        
        System.out.println(Arrays.toString(nums));
        
         
        
    }
    
    public static void swap(int nums[], int i, int j){
                      int temp = nums[i];
                      nums[i] = nums[j];
                      nums[j]= temp;
    }
    

}