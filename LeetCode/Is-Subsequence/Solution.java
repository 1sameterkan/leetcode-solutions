class Solution {
    public boolean isSubsequence(String s, String t) {
       
       int temp = 0;
       int i = 0;

       while(temp < s.length() && i < t.length()){
        if(s.charAt(temp) == t.charAt(i)){
            temp++;
        }
        i++;
       }
       return temp == s.length();

    }
}
