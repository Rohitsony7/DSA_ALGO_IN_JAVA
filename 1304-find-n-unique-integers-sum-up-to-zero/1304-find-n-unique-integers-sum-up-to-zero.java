class Solution {
    public int[] sumZero(int n) {
        
    int[] num = new int[n];
        
        for(int i=0; i< num.length/2; i++){
            
            num[i]=n;
            num[num.length-1-i]= -n;
            n--;
            
        }
        
        return num;
        
        
    }
}