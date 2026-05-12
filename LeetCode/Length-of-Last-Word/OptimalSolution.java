class Solution {
    public int lengthOfLastWord(String s) {
        
        // "Hello World" --> length() = 11
        int length = 0;
        int i = s.length() - 1;  // i = 10

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }

        return length;
    }
}
