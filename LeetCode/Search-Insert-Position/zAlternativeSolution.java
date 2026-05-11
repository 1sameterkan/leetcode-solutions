class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++) {
		
			if(nums[i] == target) {		// Bulunursa i'yi (o anki index'i) döndür.
				return i;
			}
			
			else if(i < nums.length - 1 && nums[i] < target && nums[i + 1] > target) {
				return i + 1;
			}
			
		}

		return nums.length;
    }
}
