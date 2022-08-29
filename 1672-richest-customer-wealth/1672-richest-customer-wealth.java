class Solution {
    public int maximumWealth(int[][] accounts) {
        
    
        int len = accounts.length;
        int MaxSum=0;
        for(int customer = 0; customer < accounts.length; customer++){
            
            int customerSum=0;
            
            for(int bankNo = 0;  bankNo < accounts[customer].length; bankNo++){
                
                customerSum += accounts[customer][bankNo];
                
            }
            
            if (customerSum > MaxSum) MaxSum = customerSum;
            
        }
        
        return MaxSum;
    }
}