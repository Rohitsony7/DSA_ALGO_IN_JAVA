/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    
    let boolres = candies.map(candy=> candy+extraCandies).map(candy => candy >= Math.max(...candies))
    
   return boolres;
};