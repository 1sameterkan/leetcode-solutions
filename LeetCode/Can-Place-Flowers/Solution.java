class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(n <= 0){
            return true;
        }

        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){  // Şu anki saksı 0 mı

                boolean solBosMu = (i == 0 || flowerbed[i - 1] == 0);  // Başlangıçta mıyız VEYA solun boş mu 

                boolean sagBosMu = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);  // Sonda mıyız VEYA sağın boş mu 

                if(solBosMu && sagBosMu){
                    flowerbed[i] = 1;  // Çiçeği o index'e koy
                    n--;  // çiçek sayısını azalt

                    if(n == 0){
                        return true;
                    }
                }
            }
        }
        return n <= 0;  // Döngü bitmesine rağmen çiçek kalırsa sığmamıştır
    }
}
