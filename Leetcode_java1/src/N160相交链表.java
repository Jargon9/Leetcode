public class N160相交链表 {
      public static class ListNode {
          int val;
          ListNode next;

          ListNode(int x) {
              val = x;
              next = null;
          }
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
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int numA=0, numB=0;
        ListNode p1=headA, p2=headB;
        while(p1!=null||p2!=null){
            if(p1!=null) {
                numA++;
                p1 = p1.next;
            }
            if(p2!=null){
                numB++;
                p2 = p2.next;
            }
        }
        p1 = numA>=numB? headA:headB;
        p2 = numA>=numB? headB:headA;
        numA = numA>numB?numA:numB;
        numB = numA>numB?numB:numA;
        for(int i=0;i<numA-numB;i++){
            p1=p1.next;
        }
        while(p1!=null&&p2!=null){
            if(p1==p2) return p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) { //高手方法
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
    public static void main(String[] args){
          int[] test={1,2,3,4,5,6};
          ListNode s = setToList(test);
          int[] test2={1,2,5,6};
          ListNode s1 = setToList(test2);
          getIntersectionNode(s, s1);
    }

}
