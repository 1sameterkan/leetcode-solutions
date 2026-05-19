1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        
4        if(k > nums.length){
5            return 0.0;
6        }
7
8        int sum = 0;
9
10        for(int i = 0; i < k; i++){
11            sum += nums[i];
12        }
13
14        int maxSum = sum;
15
16        for(int j = k; j < nums.length; j++){
17            sum += nums[j] - nums[j - k];    // soldan çıkar sağdan ekle
18            if(sum > maxSum){
19                maxSum = sum;
20            }
21        }
22
23        return (double) maxSum / k;
24    }
25}
26