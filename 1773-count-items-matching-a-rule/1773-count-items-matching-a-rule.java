class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count =0;
        switch(ruleKey){
                
            case "type":
              for(List<String> item : items){
                    
                    if(item.get(0).equals(ruleValue)) count++;
                }
                break;
            case "color":
                   for(List<String> item : items){
                    
                    if(item.get(1).equals(ruleValue)) count++;
                }
                     break;
            case "name":
                for(List<String> item : items){
                    
                    if(item.get(2).equals(ruleValue)) count++;
                }
                     break;
            default:
                 count=0;
                break;
        }
        
        return count;
        
    }
}