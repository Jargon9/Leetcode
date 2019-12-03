
public class NO55链表中是否有环 {

	 public static class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	    public ListNode EntryNodeOfLoop(ListNode pHead)
	    {
	    	if(pHead==null)return null;
	        ListNode p1,p2;
	        p1=p2=pHead;
	        while(p2.next!=null){
	        	p1=p1.next;
	        	p2=p2.next.next;
	        	if(p1==p2)break;
	        }
	        if(p2.next.next==null)return null;
	        p1=pHead;
	        while(p1!=p2){
	        	p1=p1.next;
	        	p2=p2.next;
	        }	        	        
	        return p1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode p=new ListNode(1);
		ListNode p3;
		p3=p.next.next;
		
	}

}
