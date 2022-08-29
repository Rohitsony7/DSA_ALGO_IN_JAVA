class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int [] money : accounts){
            int sum=0;
            for(int num : money) sum+=num;
            max = Math.max(sum,max);
            
        }
        
        return max;
    
     
    }
}