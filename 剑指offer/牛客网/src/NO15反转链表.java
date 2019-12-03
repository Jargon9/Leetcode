
public class NO15反转链表 {
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
    public static ListNode ReverseList(ListNode head) {
        if(head==null){return null;}
        ListNode head1=new ListNode(0);
        while(head.next!=null){
             ListNode s=new ListNode(head.val);                
             s.next=head1.next;
             head1.next=s;
             head=head.next;
        }
        head1.val=head.val;
        return head1;
    }
	public static void main(String[] args) {
		ListNode s=new ListNode(0);
		for(int i=1;i<10;i++){
			ListNode p=new ListNode(i);
			p.next=s.next;
			s.next=p;
		}
		ListNode t=new ListNode(0);
		t=ReverseList(s);
		while(t.next!=null){
			System.out.println(t.val);
			t=t.next;
		}

	}

}
