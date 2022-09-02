class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        int col=0;
      
        for(int [] arr : matrix){
          
            col=checkMinInRow(arr);
            int possibleLucky = arr[col];
            int max= Integer.MIN_VALUE;
            
            for(int r=0; r<matrix.length; r++){
                
                if( matrix[r][col] >max) {
                    max = matrix[r][col];
                   
                }
                
            }
            
            if(max == possibleLucky) al.add(max);            
            
            
        }
        
        return al;
        
    }
    
    public static int checkMinInRow(int[] row){
        
       int min = Integer.MAX_VALUE;
        int col=0;
       for(int i=0; i< row.length; i++){
           
           if( row[i] < min){
               min= row[i];
               col=i;
           }
       }
        
        return col;
        
    }
}