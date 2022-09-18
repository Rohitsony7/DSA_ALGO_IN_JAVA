class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int minR=0;
        int minC=0;
        int maxR=matrix.length-1;
        int maxC= matrix[0].length-1;
        int totalElement = (maxR+1)*(maxC +1);
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count=0;
        while(totalElement > count){
            
            for( int r = minR, c = minC; totalElement > count && c <=maxC; c++){
                
                al.add(matrix[r][c]);
                count++;
            }
            
            minR++;
            
              for( int r = minR, c = maxC; totalElement > count && r <=maxR; r++){
                
                al.add(matrix[r][c]);
                count++;
            }
            
            maxC--;
            
             for( int r = maxR, c = maxC; totalElement > count && c >=minC; c--){
                
                al.add(matrix[r][c]);
                count++;
            }
            maxR--;
            
              for( int r = maxR, c = minC; totalElement > count && r >=minR; r--){
                
                al.add(matrix[r][c]);
                count++;
            }
            minC++;
    }
        
        return al;
    }
}