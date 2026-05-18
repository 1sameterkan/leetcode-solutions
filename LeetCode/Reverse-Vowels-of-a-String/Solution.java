1class Solution {
2    public String reverseVowels(String s) {
3       
4        Set<Character> sesliHarfler = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
5
6        char[] sKarakterler = s.toCharArray();
7
8        int left = 0;
9        int right = s.length() - 1;
10        char temp;
11
12        while(left < right){
13
14            // eğer o index'te sesli harf yoksa left'i arttır bir sonrakine bak
15            while(left < right && !sesliHarfler.contains(sKarakterler[left])){   
16                left++;
17            }
18            // eğer o index'te sesli harf yoksa right'i azalt bir öncekine bak
19            while(left < right && !sesliHarfler.contains(sKarakterler[right])){
20                right--;
21            }
22
23            // değiştirme işlemi
24            temp = sKarakterler[left];
25            sKarakterler[left] = sKarakterler[right];
26            sKarakterler[right] = temp;
27            
28            left++;
29            right--;
30        }
31
32        return new String(sKarakterler);
33    }
34}