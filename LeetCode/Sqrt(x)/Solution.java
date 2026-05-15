1class Solution {
2    public int mySqrt(int x) {
3        
4        int a = 0;
5
6        while((long)a * a <= x){
7            a++;
8        }
9
10        return a - 1;
11
12    }
13}