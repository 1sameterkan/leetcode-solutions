class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = 0;
        int w2 = 0;
        int mergeIndex = 0;

        char[] result = new char[word1.length() + word2.length()];

        while(w1 < word1.length() || w2 < word2.length()){

            if(w1 < word1.length()){
                result[mergeIndex] = word1.charAt(w1);
                mergeIndex++;
                w1++;
            }
            if(w2 < word2.length()){
                result[mergeIndex] = word2.charAt(w2);
                mergeIndex++;
                w2++;
            }
        }

        return new String(result);
    }
}
