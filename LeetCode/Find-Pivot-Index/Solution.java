1class Solution {
2    public int pivotIndex(int[] nums) {
3        
4        int totalSum = 0;
5        for(int i = 0; i < nums.length; i++){
6            totalSum += nums[i];
7        }
8        
9        int leftSum = 0;
10        for(int i = 0; i < nums.length; i++){
11            
12            int rightSum = totalSum - leftSum - nums[i];  // nums[i] yi çıkardığımda eşitleniyorsa o index'in sağ ve sol toplamları eşittir.
13
14            if(leftSum == rightSum){
15                return i;
16            }
17
18            leftSum += nums[i];
19        }
20
21        return -1;
22    }
23}