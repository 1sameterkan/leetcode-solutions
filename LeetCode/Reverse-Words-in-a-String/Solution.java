1class Solution {
2    public String reverseWords(String s) {
3        String[] kelimeler = s.trim().split("\\s+");
4
5        StringBuilder tersCumle = new StringBuilder();
6
7        int i = kelimeler.length - 1;
8
9        while(i >= 0){
10            tersCumle.append(kelimeler[i]);
11            if(i > 0){
12                tersCumle.append(" ");
13            }
14            i--;
15        }
16
17        return tersCumle.toString().trim();
18    }
19}