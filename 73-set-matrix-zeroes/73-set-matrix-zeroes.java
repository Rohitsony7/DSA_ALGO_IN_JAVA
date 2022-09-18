class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<Integer> listR = new ArrayList<Integer>();
        ArrayList<Integer> listC = new ArrayList<Integer>();
        
        for(int row=0; row< matrix.length; row++){
            
            for(int col=0; col < matrix[row].length; col++){
                
                if(matrix[row][col] ==0) {
                    
                    if(!listR.contains(row)) listR.add(row);
                    if(!listC.contains(col)) listC.add(col);
                }
                
                
            }
        }
        
        
        for(int col=0; col < matrix[0].length; col++){
            
            for(int r : listR){
                matrix[r][col] = 0;
            }
            
        }
        
         for(int row=0; row < matrix.length; row++){
            
            for(int c : listC){
                matrix[row][c] = 0;
            }
            
        }
        
        
}
}