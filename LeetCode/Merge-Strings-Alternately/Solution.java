1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        int w1 = 0;
4        int w2 = 0;
5        int mergeIndex = 0;
6
7        char[] result = new char[word1.length() + word2.length()];
8
9        while(w1 < word1.length() || w2 < word2.length()){
10
11            if(w1 < word1.length()){
12                result[mergeIndex] = word1.charAt(w1);
13                mergeIndex++;
14                w1++;
15            }
16            if(w2 < word2.length()){
17                result[mergeIndex] = word2.charAt(w2);
18                mergeIndex++;
19                w2++;
20            }
21        }
22
23        return new String(result);
24    }
25}