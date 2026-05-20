1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        
4        Map<Integer, Integer> frekansMap = new HashMap<>();
5
6        for(int num : arr){
7            frekansMap.put(num, frekansMap.getOrDefault(num, 0) + 1);  // varsa value'sini 1 arttır. yoksa 1'den başlat.
8        }
9
10        Set<Integer> frekansSet = new HashSet<>();
11
12        for(int sayac : frekansMap.values()){   // freqMap.values() = her sayının kaç kez geçtiğini gösteren frekans değerleri
13            if(frekansSet.contains(sayac)){
14                return false;
15            }
16            frekansSet.add(sayac);
17        }
18        return true;
19    }
20}