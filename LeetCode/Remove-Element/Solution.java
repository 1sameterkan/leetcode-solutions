1class Solution {
2    public int removeElement(int[] nums, int val) {
3     
4     int k  = 0;
5     
6     for(int i = 0; i < nums.length; i++){
7        if(nums[i] != val) {
8            nums[k] = nums[i];
9            k++;
10        }
11     }
12     return k;
13    }
14}