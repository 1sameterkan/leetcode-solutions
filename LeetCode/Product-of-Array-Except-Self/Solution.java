1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int[] carpimlar = new int[nums.length];
5
6        int solCarpim = 1;
7        for(int i = 0; i < nums.length; i++){
8            carpimlar[i] = solCarpim;   // [1,0,0,0] --> [1,1,0,0] --> [1,1,2,0] --> [1,1,2,6]...(DÖNGÜ BİTTİ)
9            solCarpim *= nums[i];       // 1*1=1 --> 1*2=2 --> 2*3=6 --> 6*4=24...(DÖNGÜ BİTTİ)
10        }
11
12        int sagCarpim = 1;
13        for(int j = nums.length - 1; j >= 0; j--){  // j = 3
14            carpimlar[j] *= sagCarpim;  // [1,1,2,(6*1)] --> [1,1,(2*4),6] --> [1,(1*12),8,6] --> [(1*24),12,8,6]...(DÖNGÜ BİTTİ)
15            sagCarpim *= nums[j];       // 1*4=4 --> 4*3=12 --> 12*2=24 --> 24*1 = 24 ...(DÖNGÜ BİTTİ)
16        }
17
18        return carpimlar; 
19    }
20}