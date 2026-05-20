class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> frekansMap = new HashMap<>();

        for(int num : arr){
            frekansMap.put(num, frekansMap.getOrDefault(num, 0) + 1);  // varsa value'sini 1 arttır. yoksa 1'den başlat.
        }

        Set<Integer> frekansSet = new HashSet<>();

        for(int sayac : frekansMap.values()){   // freqMap.values() = her sayının kaç kez geçtiğini gösteren frekans değerleri
            if(frekansSet.contains(sayac)){
                return false;
            }
            frekansSet.add(sayac);
        }
        return true;
    }
}
