1class Solution {
2    public String addBinary(String a, String b) {
3        
4        int i = a.length() - 1;
5        int j = b.length() - 1;
6
7        int carry = 0;
8
9        StringBuilder result = new StringBuilder();
10
11        while(i >= 0 || j >= 0 || carry != 0){
12            int sum = carry;
13
14            if(i >= 0){
15                sum += a.charAt(i) - '0';
16                i--;
17            }
18            if(j >= 0){
19                sum += b.charAt(j) - '0';
20                j--;
21            }
22
23            result.append(sum % 2);
24            carry = sum / 2;
25        }
26        return result.reverse().toString();
27    }
28}