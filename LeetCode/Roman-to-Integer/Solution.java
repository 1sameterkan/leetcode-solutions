1class Solution {
2    public int romanToInt(String s) {
3        
4        HashMap<Character, Integer> map = new HashMap<>();
5
6        map.put('I', 1);
7        map.put('V', 5);
8        map.put('X', 10);
9        map.put('L', 50);
10        map.put('C', 100);
11        map.put('D', 500);
12        map.put('M', 1000);
13
14        int toplam = 0;
15
16        for(int i = 0; i < s.length(); i++) {
17            
18            int simdiki = map.get(s.charAt(i));
19
20            if(i < s.length() - 1 && simdiki < map.get(s.charAt(i + 1))) {
21                toplam -= simdiki;
22            }
23            else {
24                toplam += simdiki;
25            }
26            
27        }
28        return toplam;
29    }
30}