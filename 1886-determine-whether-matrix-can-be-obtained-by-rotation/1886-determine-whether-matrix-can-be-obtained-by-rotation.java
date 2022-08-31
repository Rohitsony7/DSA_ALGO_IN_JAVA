class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
          for(int i=0; i<4; i++){
            
            if(CheckArray(mat,target)){
                return true;
            }
            else{
               mat= rotationOfArray(mat);
                
            }

        }
              return false;
            
        }
        
    
 public static boolean CheckArray(int[][] mat,int[][] target){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]==target[i][j]){
                    continue;


                }
                else {
                    return false;
                }

            }

        }
        return true;
    }

    
    public int[][] rotationOfArray(int[][] mat){
        
        int[][] afterRotation = new int[mat[0].length][mat.length];
        
         for(int i=0; i< mat.length; i++){
            
            for(int j=mat[i].length-1; j>= 0; j--){
                
                afterRotation[i][mat[i].length-1-j] = mat[j][i];
            }
        }
        
            for(int [] val: afterRotation){
                    
                    System.out.println(Arrays.toString(val));
                    
                }
                
                System.out.println("-------After rotation-------");
        
        return afterRotation;
        
    }
}