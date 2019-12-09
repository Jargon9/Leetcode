public class N83删除排序链表中的重复元素 {
     public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
         if(head==null) return head;
         else{
             ListNode p = head;
            while(p!=null&&p.next!=null){
                if(p.val==p.next.val){
                    p.next=p.next.next;
                    continue;
                }
                p=p.next;
            }
        }
         return head;
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
         ListNode head = null;
         ListNode res = null;
         int[] s = {1,1,1};
         head = setToList(s);
         res = deleteDuplicates(head);

    }
}
