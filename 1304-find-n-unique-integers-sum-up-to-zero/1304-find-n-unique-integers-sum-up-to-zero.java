class Solution {
    public int[] sumZero(int n) {
        
        if (n==1)  return new int[1];
        
      ArrayList<Integer> al = new ArrayList<Integer>();
        
    int start=0;
     for(int i=1; i<=n/2; i++){
         start+=1;
         al.add(start);
         al.add(-1*start);
     }
        
        if((n & 1)==1) al.add(0);
        
        System.out.println(al);
        
       int[] arr = al.stream().mapToInt(i -> i).toArray();
  

        return arr;
        
        
    }
}