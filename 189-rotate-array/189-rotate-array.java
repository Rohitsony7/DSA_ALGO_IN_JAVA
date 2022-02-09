class Solution {
    public void rotate(int[] nums, int k) {
        
        // if k -ve 
        if (k < 0) k+=nums.length;
        
        k = k % nums.length;
        
        // given => p1 + p2, want => p2 + p1
        // all = reverse(p1) + reverse(p2)
        // reverse(all)
        //p2 + p1 we get
        
        nums = reverseArr(0, nums.length-1, nums);
        nums = reverseArr(k, nums.length-1, nums);
        nums = reverseArr(0, k-1, nums);
        
    }
        
    public int[] reverseArr(int start, int end, int [] arr){
        
        while(start < end){    
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
            
            start++;
            end--;
        }
        
        return arr;
        
        
        
    }
    
}