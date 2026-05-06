1// UPDATE
2class Solution {
3    public boolean isPalindrome(int x) {
4        
5        String s = Integer.toString(x);
6        String ters = new StringBuilder(s).reverse().toString();
7
8        if(x < 0) {
9            return false;
10        }
11        else{
12            return s.equals(ters);
13        }
14    }
15}