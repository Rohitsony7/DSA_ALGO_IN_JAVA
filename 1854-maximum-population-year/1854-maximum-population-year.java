class Solution {
    public int maximumPopulation(int[][] logs) {
        
        
        int arr[] = new int[101];
        int earlierYear =0;
        int maxPopulation=0;
        
        for(int timeSpan[] : logs){
            
            for(int year = timeSpan[0]-1950; year < timeSpan[1]-1950; year++ ){
                
                arr[year] += 1;  
            }
            
        }
           
        
        for(int i=0; i < arr.length; i++){
            
            if(arr[i] > maxPopulation) {
                
                earlierYear= i;
                maxPopulation = arr[i];
            }
            
        }
        
        return earlierYear+1950;
        
        
    }
}