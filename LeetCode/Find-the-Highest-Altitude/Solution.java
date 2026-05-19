1class Solution {
2    public int largestAltitude(int[] gain) {
3        int sum = 0;
4        int maxSum = sum;
5
6        for(int i = 0; i < gain.length; i++){
7            sum += gain[i];
8            if(sum > maxSum){
9                maxSum = sum;
10            }
11        }
12        return maxSum;
13    }
14}