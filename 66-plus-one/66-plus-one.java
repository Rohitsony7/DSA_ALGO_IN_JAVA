class Solution {
    public int[] plusOne(int[] digits) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        int add=1;
        for(int i=digits.length-1; i>=0; i--){
            
            al.add((digits[i]+add)%10);
            add = (digits[i]+add)/10;
            
            if(i==0 && add >0) al.add(add);
            
        }
        

        
        int arr[]= new int[al.size()];
        
        for(int j=0; j<al.size();j++) arr[al.size()-j-1] =al.get(j);
        
        
    return arr;
        
    }
}