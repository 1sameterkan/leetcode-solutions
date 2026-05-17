1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13
14        if(head == null || head.next == null){  // Liste boşsa veya tek elemanlıysa head'i döndür.
15            return head;
16        }
17
18        ListNode current = head;
19
20        while(current != null && current.next != null){
21
22            if(current.val == current.next.val){
23                current.next = current.next.next;
24            }
25            else{
26                current = current.next;
27            }
28        }
29        return head;
30    }
31}