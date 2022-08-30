class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
       List<Integer> ll = new ArrayList<Integer>();
       for(int i=num.length-1; i>= 0; i--){
            
             ll.add(0,(num[i]+k)%10);
             k = (num[i]+k)/10;                      
        }
        
        System.out.println(k); 
        //still if K>0,  value left to add in list
        
        while(k>0){
            ll.add(0,k%10);
            k = k/10;
        } 
        

        
        return ll;
    }
}