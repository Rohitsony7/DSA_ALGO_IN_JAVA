class Solution {
    public boolean checkIfExist(int[] arr) {
          
        if(arr == null || arr.length == 0)
        return false;
        
        for(int i=0; i< arr.length; i++){
            
            int j=0;
            int val = arr[i]*2;
            
            while(j<arr.length) {
                
                if(i!=j && arr[j]==val) return true;
                j++;
                
            }
            
        }
        
        return false;
    }
}