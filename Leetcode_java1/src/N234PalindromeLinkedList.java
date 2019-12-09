import java.util.ArrayList;

public class N234PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static boolean isPalindrome1(ListNode head) {
        if (head == null) return true;
        ListNode p1 = head, p2;
        ArrayList<Integer> arr = new ArrayList<>();
        while (p1 != null) {
            arr.add(p1.val);
            p1 = p1.next;
        }
        int sta = 0, end = arr.size() - 1;
        while (sta < end) {
            if (arr.get(sta) != arr.get(end)) {
                return false;
            }
            sta++;
            end--;
        }
        return true;
    }
    public static boolean isPalindrome(ListNode head){
        ListNode fast=head, slow=head, slowhead = null;
        if(fast==null||fast.next==null||(fast.next.next==null&&fast.val==fast.next.val)) return true;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            ListNode temp = slow, temp1 = slow.next;
            temp.next = slowhead;
            slowhead = temp;
            slow = temp1;
        }
        ListNode fastHead = slow;
        while(fastHead!=null&&slowhead!=null){
            if(fastHead.val!=slowhead.val){
                return false;
            }
            fastHead = fastHead.next;
            slowhead = slowhead.next;
        }
        return true;
    }

    public static void main(String[] arg) {
        int[] a = {1, 0, 0, 1, 1};
        ListNode head = new ListNode(1);
        ListNode p1 = head;
        for (int i = 1; i < a.length; i++) {
            ListNode p2 = new ListNode(a[i]);
            p1.next = p2;
            p1 = p1.next;
        }
        System.out.println(isPalindrome(head));
    }
}
