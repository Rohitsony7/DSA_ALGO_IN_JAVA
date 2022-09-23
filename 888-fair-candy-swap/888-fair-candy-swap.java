class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa=0;
        int sb=0;
        
        for(int val:aliceSizes) sa+=val;
        for(int val:bobSizes) sb+=val;
        
        int delta = (sb-sa)/2;
        //if sa gives x then expact x+delta
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int val:bobSizes) hs.add(val);
        
        for(int val:aliceSizes){
            if(hs.contains(val+delta)) return new int[] {val, val+delta};
        }
        
        return null;        
    }
}