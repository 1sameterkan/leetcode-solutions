1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0) {
4            return false;
5        }
6
7        int n = x;
8        int revnum = 0;
9
10        while (n > 0) {
11            int d = n % 10;
12            revnum = revnum * 10 + d;
13            n = n / 10;
14        }
15
16        return revnum == x;
17    }
18}