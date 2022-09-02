class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(r*c != mat.length*mat[0].length) return mat;
        
        int reshape[][] = new int[r][c];
        
   
        int i=0;
        int j=0;
        for(int[] arr:mat){
            for(int val : arr){
                
                reshape[i][j]=val;
                j++;
                if(j==c) {
                    i++;
                    j=0;
                }
                
            }
        }
        
        return reshape;
        
    }
}