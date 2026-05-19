1class Solution {
2    public int largestAltitude(int[] gain) {
3        int start = 0;
4        int sum = start;
5        int maxSum = sum;
6
7        for(int i = 0; i < gain.length; i++){
8            sum += gain[i];
9            if(sum > maxSum){
10                maxSum = sum;
11            }
12        }
13        return maxSum;
14    }
15}