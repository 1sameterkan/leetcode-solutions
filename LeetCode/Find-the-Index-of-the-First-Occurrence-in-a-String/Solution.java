1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        int n = haystack.length();
5        int m = needle.length();
6
7        for (int i = 0; i <= n - m; i++) {
8
9            int j = 0;
10
11            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) { // karakter karşılaştırma
12                j++;
13            }
14
15            if (j == m) {
16                return i;
17            }
18        }
19
20        return -1;
21    }
22}