class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        int i=0,k=0,j=0;
        
        int res[] = new int[nums1.length + nums2.length];
        // if(res.length ==0) return (double) 0;
        
        while(i<nums1.length && j < nums2.length){
            
            if( nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
                k++;
            }
            
            else {
                res[k] = nums2[j];
                j++;
                k++;
            }
            
        }
        
        while(i < nums1.length){
            res[k] = nums1[i];
                i++;
                k++;
            
        }
        
            while(j < nums2.length){
            res[k] = nums2[j];
                j++;
                k++;
            
        }
        
       return ((res.length & 1)==1) ?  (double) res[res.length/2] :(double) ((res[res.length/2] + res[res.length/2 -1]))/2;
        
        
    }
}