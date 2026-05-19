class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            
            int rightSum = totalSum - leftSum - nums[i];  // nums[i] yi çıkardığımda eşitleniyorsa o index'in sağ ve sol toplamları eşittir.

            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
