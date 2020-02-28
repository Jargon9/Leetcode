public class N203移除链表元素 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        p.next = head;
        while(p.next!=null){
            if(p.next.val==val){
                p.next = p.next.next;
                continue;
            }
            p = p.next;

        }
        return res.next;
    }
    public static ListNode setToList(int[] s){
        ListNode head = null, p2 = null;
        for(int i=0;i<s.length;i++){
            ListNode p1 = new ListNode(s[i]);
            if(i==0){
                p2 = p1;
                head = p2;
            }
            else {
                p2.next = p1;
                p2 = p2.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
        int[] s = {};
        ListNode res = setToList(s);
        res = removeElements(res, 6);
    }

}
