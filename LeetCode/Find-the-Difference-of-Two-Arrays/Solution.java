    class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> uniqueNums1 = new HashSet<>();
        Set<Integer> uniqueNums2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){  // tekrarlanmayan nums1
            uniqueNums1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){  // tekrarlanmayan nums2
            uniqueNums2.add(nums2[i]);
        }

        List<Integer> answer1 = new ArrayList<>(); // nums1'de olup nums2'de olmayan elemanları tutacak liste
        List<Integer> answer2 = new ArrayList<>(); // nums2'de olup nums1'de olmayan elemanları tutacak liste

        for(int num1 : uniqueNums1){
            if(!uniqueNums2.contains(num1)){
                answer1.add(num1);
            }
        }
        for(int num2 : uniqueNums2){
            if(!uniqueNums1.contains(num2)){
                answer2.add(num2);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(answer1);
        result.add(answer2);

        return result;
    }
}
