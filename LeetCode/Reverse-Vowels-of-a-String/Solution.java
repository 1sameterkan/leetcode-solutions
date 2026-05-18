class Solution {
    public String reverseVowels(String s) {
       
        Set<Character> sesliHarfler = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] sKarakterler = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;
        char temp;

        while(left < right){

            // eğer o index'te sesli harf yoksa left'i arttır bir sonrakine bak
            while(left < right && !sesliHarfler.contains(sKarakterler[left])){   
                left++;
            }
            // eğer o index'te sesli harf yoksa right'i azalt bir öncekine bak
            while(left < right && !sesliHarfler.contains(sKarakterler[right])){
                right--;
            }

            // değiştirme işlemi
            temp = sKarakterler[left];
            sKarakterler[left] = sKarakterler[right];
            sKarakterler[right] = temp;
            
            left++;
            right--;
        }

        return new String(sKarakterler);
    }
}
