class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
          for(int i=0; i<4; i++){
            
            if(CheckArray(mat,target)) return true;
   
               mat= rotationOfArray(mat);
                

        }
              return false;
            
        }
        
    
 public static boolean CheckArray(int[][] mat,int[][] target){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]!=target[i][j]) return false;

            }

        }
        return true;
    }

    
    public int[][] rotationOfArray(int[][] mat){
        
        int[][] afterRotation = new int[mat[0].length][mat.length];
        
         for(int i=0; i< mat.length; i++){
            
            for(int j=0; j<mat[i].length; j++){
                
                afterRotation[mat[i].length-1-j][i] = mat[i][j];
            }
        }
        
        
        return afterRotation;
        
    }
}