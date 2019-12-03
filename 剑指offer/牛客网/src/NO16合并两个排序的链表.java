

public class NO16合并两个排序的链表 {
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public static ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1==null&&list2==null){return null;}
    	else if(list1==null){return list2;}
    	else if(list2==null){return list1;}
        ListNode p,q;
        p=list1;
        q=list2;
        while(p!=null&&q!=null){
        	if(p.val<=q.val&&p.next==null||p.val<=q.val&&p.next.val>=q.val){
        		ListNode s=new ListNode(q.val);
        		s.next=p.next;
        		p.next=s;
        		p=p.next;
        		q=q.next;        		
        	}
        	else if(p.next==null){
        		p.next=q;
        	}
        	else{p=p.next;}
        }
        return list1;
    }
    
	public static void main(String[] args) {
		ListNode s1=new ListNode(1);
		ListNode s2=new ListNode(2);
		for(int i=3;i>1;i--){
			ListNode p1=new ListNode(2*i-1);
			ListNode p2=new ListNode(2*i);
			
			p1.next=s1.next;
			s1.next=p1;
			p2.next=s2.next;
			s2.next=p2;
		}
		ListNode t=Merge(s1, s2);
		while(t!=null){
			System.out.println(t.val);
			t=t.next;
		}
	}

}
