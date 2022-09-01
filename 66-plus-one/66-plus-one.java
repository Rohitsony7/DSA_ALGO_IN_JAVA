class Solution {
    public int[] plusOne(int[] digits) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        int add=1;
        for(int i=digits.length-1; i>=0; i--){
            
            al.add(0,(digits[i]+add)%10);
            add = (digits[i]+add)/10;
            
            if(i==0 && add >0) al.add(0,add);
            
        }
        

        
        int arr[]= new int[al.size()];
        
        for(int j=0; j<al.size();j++) arr[j] =al.get(j);
        
        
    return arr;
        
    }
}