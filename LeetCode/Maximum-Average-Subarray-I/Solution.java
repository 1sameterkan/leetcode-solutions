class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(k > nums.length){
            return 0.0;
        }

        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int maxSum = sum;

        for(int j = k; j < nums.length; j++){
            sum += nums[j] - nums[j - k];    // soldan çıkar sağdan ekle
            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }
}
