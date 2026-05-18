class Solution {
    public String reverseWords(String s) {
        String[] kelimeler = s.trim().split("\\s+");

        StringBuilder tersCumle = new StringBuilder();

        int i = kelimeler.length - 1;

        while(i >= 0){
            tersCumle.append(kelimeler[i]);
            if(i > 0){
                tersCumle.append(" ");
            }
            i--;
        }

        return tersCumle.toString();
    }
}
