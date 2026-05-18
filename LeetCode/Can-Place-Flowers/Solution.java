1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        
4        if(n <= 0){
5            return true;
6        }
7
8        for(int i = 0; i < flowerbed.length; i++){
9            if(flowerbed[i] == 0){  // Şu anki saksı 0 mı
10
11                boolean solBosMu = (i == 0 || flowerbed[i - 1] == 0);  // Başlangıçta mıyız VEYA solun boş mu 
12
13                boolean sagBosMu = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);  // Sonda mıyız VEYA sağın boş mu 
14
15                if(solBosMu && sagBosMu){
16                    flowerbed[i] = 1;  // Çiçeği o index'e koy
17                    n--;  // çiçek sayısını azalt
18
19                    if(n == 0){
20                        return true;
21                    }
22                }
23            }
24        }
25        return n <= 0;  // Döngü bitmesine rağmen çiçek kalırsa sığmamıştır
26    }
27}