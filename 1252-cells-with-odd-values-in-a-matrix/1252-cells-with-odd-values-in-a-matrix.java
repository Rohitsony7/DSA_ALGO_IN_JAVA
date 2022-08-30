class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int arr[][]= new int[m][n];
        
        for(int index []: indices){
            
            for(int row=0; row < m; row++){
                
                arr[row][index[1]]+=1;
            }
             for(int col=0; col < n; col++){
                
                arr[index[0]][col]+=1;
            }
            
        }
        
        int count=0;
        for(int myarr[] : arr){
            
            for(int val : myarr) if ((val&1)==1) count++;
        }
        
        return count;
        
    }
}