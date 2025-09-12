/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        if(curr==null){
            return curr;
        }
        HashSet <Integer> set = new HashSet<>();

        set.add(curr.val);
        while(curr.next!=null){
            if(!set.contains(curr.next.val)){
            set.add(curr.next.val);
            curr = curr.next;
            }else{
                curr.next = curr.next.next;
            }
                System.out.println(curr.val);
        }
        return head;
    }
}
