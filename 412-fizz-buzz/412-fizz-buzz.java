class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> al = new ArrayList<String>();
        
         int c3=0;
         int c5=0; 
        
        for(int val=1; val<=n; val++ ){
                c3++;
                c5++;
            String sb="";
                
             if(c3==3 )  {
                 sb="Fizz";
                 c3=0;
             }
             if(c5==5) {
                sb+="Buzz";
                 c5=0;
             }
             if(sb !="") al.add(sb);
             else al.add(Integer.toString(val));
              
         }
        
        return al;
    }
}