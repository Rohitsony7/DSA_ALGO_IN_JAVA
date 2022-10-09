class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int sum=0;
        int step=0;
        
        while(sum < target  || (sum-target)%2==1 ){
        
            sum +=  ++step;
       }
    
    return step;
}
}