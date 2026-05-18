1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        
4        List<Boolean> result = new ArrayList<>();
5
6        int max = candies[0];
7        for(int i = 1; i < candies.length; i++){
8            if(candies[i] > max){
9                max = candies[i];
10            }
11        }
12
13        for(int i = 0; i < candies.length; i++){
14            if(candies[i] + extraCandies >= max){
15                result.add(true);
16            }
17            else{
18                result.add(false);
19            }
20        }
21        return result;
22    }
23}