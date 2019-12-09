public class N206反转链表 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp,temp1;
        ListNode res = null;
        if(head!=null) {
            temp = head;
            while (temp!=null){
                temp1 = temp;
                temp = temp.next;
                temp1.next =res;
                res = temp1;
            }
        }
        return res;
    }
}
