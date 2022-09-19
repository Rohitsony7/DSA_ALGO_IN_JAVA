/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start=1;
        int end=n;
        int possibleRes=0;
        
        while(start <=end){
            
            int mid= start + (end-start)/2;
            
            if(isBadVersion(mid)) {
                
                end = mid-1;
                possibleRes=mid;
            }else{
                start=mid+1;
            }
            
            
        }
        
        return possibleRes;
        
    }
}