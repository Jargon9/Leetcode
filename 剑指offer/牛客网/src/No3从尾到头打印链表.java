import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Integer;
import java.util.Scanner;

import NO14链表中的倒数第k个节点.ListNode;

public class No3从尾到头打印链表 {
    
	public static class ListNode {
		int val;
		ListNode next = null;
	
		ListNode(int val) {
		this.val = val;
	}
		public void addNode(int data){
			ListNode s=new ListNode(data);
			next = s;
		}
}
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList();
		ListNode p = new ListNode(0);
		p = listNode;
		if(p!=null){
			list.add(p.val);
	        while(p.next!=null){
	        	p=p.next;
	        	list.add(0,p.val);
	        }
		}
        return list;
    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){return null;}
        if(k<=0){return null;}
    	ListNode s;
    	ListNode sk;
    	s=head;
        sk=head;
    	for(int i=0;i<k-1;i++){
            if(s.next==null){return null;}
            else{s=s.next;}
        }
    	while(s.next!=null){
    		s=s.next;
    		sk=sk.next;
    	}
    	return sk;
    }
/*	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList();
		ListNode p = new ListNode(0);
		p = listNode;
		if(p!=null){
			list.add(p.val);
	        while(p.next!=null){
	        	p=p.next;
	        	list.add(0,p.val);
	        }
		}
        return list;
    }*/

	public static void main(String[] args) {
		 ListNode p = new ListNode(0);
		 p.addNode(1);
		 System.out.println(p.next.val);
		 
		

//		ListNode L =new ListNode(1);
		Scanner in = new Scanner(System.in);
		/*			String line = in.nextLine();
		String[] words = line.split(" ");
		words.toString();
		System.out.println(line);
		System.out.println(words[0]);
		*/
	}

}
