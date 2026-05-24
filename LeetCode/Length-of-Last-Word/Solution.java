class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        int sonBosluk = s.lastIndexOf(" ");    //Metin'deki son boşluğu bul
        String sonKelime = s.substring(sonBosluk + 1);  // Son kelimeyi bul.
        int sonKelimeUzunluk = sonKelime.length();
        return sonKelimeUzunluk;
    }
}
