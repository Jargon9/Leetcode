

public class NO56删除链表中重复的节点 {

	 public static class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	 /*public static ListNode deleteDuplication(ListNode pHead){
	        ListNode p1,p2,p3;
	        if(pHead==null)return null;
	        p3=p1=p2=pHead;
	        p2=p1.next;
	        while(p3!=null&&p2!=null&&(p3.val==p2.val||p2.val==p1.val)){
	        	p2=p2.next.next;
	        	p3=p3.next.next;
	        }
	        pHead=p3;
		    p1=p2;
		    p2=p2.next;
	        while(p2!=null){
	        	if(p2.val==p1.val){
	        		while(p2!=null&&p2.val==p1.val){
		        		p1.next=p2.next;
		        		p2=p2.next;	        		
	        		}
	        		p3.next=p2;
	        		p1=p1.next;
	        		p2=p2.next;
		        	continue;
	        	}
	        	p3=p3.next;
	        	p1=p1.next;
	        	p2=p2.next;
	        }
	        return pHead;
	    }*/
	 public static ListNode deleteDuplication(ListNode pHead){
		 ListNode p1,p3;
		 if(pHead==null) return null;
		 p1=p3=pHead;
		 p1=p3.next;
		 int mark=0;
		 while(p1!=null){
			 if(p1.next!=null&&p1.val==p1.next.val){
				 p1=p1.next;
			 }
			 if(p3.val==p1.val){
				 p3=p1.next;
				 if(mark==0){
					 pHead=p3;
					 mark=1;
				 }
				 if(p3.next!=null)p1=p3.next;
			 }
			 
		 }
		 return pHead;
	 }
	public static void main(String[] args) {
		ListNode s=new ListNode(1);
		ListNode ph=s;
		int[]a ={1,1,2,3,3,4,4,5};
		for(int i=1;i<a.length;i++){
			ListNode p=new ListNode(a[i]);
			s.next=p;
			s=s.next;
		}
		s=deleteDuplication(ph);

	}

}
