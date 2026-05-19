class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxSum = sum;

        for(int i = 0; i < gain.length; i++){
            sum += gain[i];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
