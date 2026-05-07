1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        
4        if(strs == null || strs.length == 0){
5            return "";
6        }
7
8       String first = strs[0];
9
10       for(int i = 0; i < first.length(); i++){
11
12            char c = first.charAt(i);
13
14            for(int j = 1; j < strs.length; j++){
15                
16                if(i >= strs[j].length() || strs[j].charAt(i) != c){
17                    return first.substring(0, i);
18                }
19            }
20       }
21       return first; 
22    }
23}