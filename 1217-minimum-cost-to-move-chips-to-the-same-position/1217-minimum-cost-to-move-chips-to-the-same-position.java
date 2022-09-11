class Solution {
public int minCostToMoveChips(int[] position) {
int costodd=0, costeven=0 ,cost =0;
for(int i : position){
if(i%2!=0){
costodd++;}
else{
costeven++;
}
}
cost=Math.min(costodd,costeven);
return cost;
}
}