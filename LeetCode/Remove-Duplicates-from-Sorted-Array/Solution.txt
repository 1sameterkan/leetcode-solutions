1// UPDATE
2class Solution {
3    public int removeDuplicates(int[] nums) {
4        
5        if (nums.length == 0) return 0;
6
7        int i = 0; // unique elemanların indexi
8
9        for (int j = 1; j < nums.length; j++) {
10            
11            if (nums[j] != nums[i]) {
12                i++;
13                nums[i] = nums[j];
14            }
15        }
16
17        return i + 1;
18    }
19}