1class Solution {
2    public int climbStairs(int n) {
3        
4        if(n == 1){
5            return 1;
6        }
7
8        int[] fib = new int[n + 1];
9        fib[1] = 1;
10        fib[2] = 2;
11
12        for(int i = 3; i <= n; i++){
13            fib[i] = fib[i - 1] + fib[i - 2];
14        }
15
16        return fib[n];
17    }
18}