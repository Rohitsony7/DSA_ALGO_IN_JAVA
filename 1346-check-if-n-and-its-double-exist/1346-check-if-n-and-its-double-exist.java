class Solution {
    public boolean checkIfExist(int[] arr) {
          
        if(arr == null || arr.length == 0)
        return false;
        
        for(int i=0; i< arr.length; i++){
            
            
            for(int j=0; j< arr.length; j++) {
                
                if(i!=j && arr[j]==arr[i]*2) return true;
            
                
            }
            
        }
        
        return false;
    }
}