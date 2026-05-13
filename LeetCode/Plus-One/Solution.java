1class Solution {
2    public int[] plusOne(int[] digits) {
3        
4        for(int i  = digits.length - 1; i >= 0; i--){
5            
6            if(digits[i] < 9){
7                digits[i]++;
8                return digits;
9            }
10            digits[i] = 0;
11        }
12
13        int[] newDigits = new int[digits.length + 1];
14        newDigits[0] = 1;
15        return newDigits;
16    }
17}