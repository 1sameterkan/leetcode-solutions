1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for(char c : s.toCharArray()){
6            if(c == '(' || c == '{' || c == '['){
7                stack.push(c);
8            }
9            else{
10
11                if(stack.isEmpty()){
12                    return false;
13                }
14                
15                char top = stack.pop();
16
17                if(c == ')' && top != '(') {
18                    return false;
19                }
20                
21                if(c == ']' && top != '[') {
22                    return false;
23                }
24                
25                if(c == '}' && top != '{') {
26                    return false;
27                }
28
29            }
30        }
31        return stack.isEmpty();
32    }
33}