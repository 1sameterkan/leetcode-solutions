package practise1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		
		System.out.println(Arrays.toString(removeElement1(nums, val)));
	}
	
	public static int[] removeElement1(int[] nums, int val) {
		
		Map<Integer, Integer> numsMap = new HashMap<>();
		
		int k = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				numsMap.put(k, nums[i]);
				k++;
			}
		}
		
		int[] result = new int[k];
		
		for(int i = 0; i < k; i++) {
			result[i] = numsMap.get(i);
		}
		
		return result;
	}

}
