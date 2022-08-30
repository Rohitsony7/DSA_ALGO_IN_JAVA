class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
     int len = image[0].length;
     for(int[] arr : image){   
         for(int i=0; i< (len +1)/2; i++ ){
             
             int temp = arr[i]^1;
             arr[i] = arr[len-1-i]^1 ;
             arr[len-1-i] = temp;
         }
     }
        
        return image;
    

}
}