import java.util.ArrayList;

public class N234PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static boolean isPalindrome(ListNode head) {
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

    public static void main(String[] arg) {
        int[] a = {1, 2, 3, 2, 1};
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
