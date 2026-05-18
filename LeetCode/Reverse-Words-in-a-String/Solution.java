1class Solution {
2    public String reverseWords(String s) {
3        String[] kelimler = s.trim().split("\\s+");
4
5        StringBuilder tersCumle = new StringBuilder();
6
7        int i = kelimler.length - 1;
8
9        while(i >= 0){
10            if(!kelimler[i].equals("")){
11                tersCumle.append(kelimler[i]);
12                
13                if(i > 0){
14                    tersCumle.append(" ");
15                }
16                i--;
17            }
18        }
19        
20        return tersCumle.toString().trim();
21    }
22}