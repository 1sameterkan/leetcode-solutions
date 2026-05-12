1class Solution {
2    public int lengthOfLastWord(String s) {
3        
4        s = s.trim();
5        int sonBosluk = s.lastIndexOf(" ");    //Metin'deki son boşluğu bul
6        String sonKelime = s.substring(sonBosluk + 1);  // Son kelimeyi bul.
7        int sonKelimeUzunluk = sonKelime.length();
8        return sonKelimeUzunluk;
9    }
10}