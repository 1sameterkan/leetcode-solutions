class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] carpimlar = new int[nums.length];

        int solCarpim = 1;
        for(int i = 0; i < nums.length; i++){
            carpimlar[i] = solCarpim;   // [1,0,0,0] --> [1,1,0,0] --> [1,1,2,0] --> [1,1,2,6]...(DÖNGÜ BİTTİ)
            solCarpim *= nums[i];       // 1*1=1 --> 1*2=2 --> 2*3=6 --> 6*4=24...(DÖNGÜ BİTTİ)
        }

        int sagCarpim = 1;
        for(int j = nums.length - 1; j >= 0; j--){  // j = 3
            carpimlar[j] *= sagCarpim;  // [1,1,2,(6*1)] --> [1,1,(2*4),6] --> [1,(1*12),8,6] --> [(1*24),12,8,6]...(DÖNGÜ BİTTİ)
            sagCarpim *= nums[j];       // 1*4=4 --> 4*3=12 --> 12*2=24 --> 24*1 = 24 ...(DÖNGÜ BİTTİ)
        }

        return carpimlar; 
    }
}
