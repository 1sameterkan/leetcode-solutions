1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        if (nums.length == 0) return 0;
5
6        int i = 0; // unique elemanların indexi
7
8        for (int j = 1; j < nums.length; j++) {
9            
10            if (nums[j] != nums[i]) {
11                i++;
12                nums[i] = nums[j];
13            }
14        }
15
16        return i + 1;
17    }
18}