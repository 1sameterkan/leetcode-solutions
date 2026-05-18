class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sayilar = new int[m + n];
 		
		for(int i = 0; i < m; i++) {
			sayilar[i] = nums1[i];
		}
		for(int j = 0; j < n; j++) {
			sayilar[j + m] = nums2[j];
		}
		
		for(int i = 0; i < sayilar.length - 1; i++) {
			for(int j = 0; j < sayilar.length - 1 - i; j++) {
				if(sayilar[j] > sayilar[j + 1]) {
					int temp = sayilar[j];
					sayilar[j] = sayilar[j + 1];
					sayilar[j + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = sayilar[i];
		}
    }
}
