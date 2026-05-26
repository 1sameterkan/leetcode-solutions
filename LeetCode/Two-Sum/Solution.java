class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i  = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};  // Örn : [numMap'deki 2 nin indexi, nums array'indeki 7'nin index'i] = [0, 1]
            }
            numMap.put(nums[i], i);  // numMap --> {2=0} --> Key = 2, Value = 0
        }
        return new int[]{};
    }
}
