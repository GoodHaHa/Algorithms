package Algorithm.List;

import Algorithm.List.List.Node;

class List
{
	private static Node head;
	
	class Node
	{
		int data;
		Node next;
		public Node reverseList(List a) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	public Node head(){
		return head;
	}
	
	public Node getTail()
	{
		if(head==null) return null;
		Node p = head;
		while(p.next != null) p = p.next;
		return p;
	}
	
	public void add(int x)
	{
		Node t = new Node();
		t.data = x;
		
		Node tail = getTail();
		if(tail == null) 
			head = t;
		else
			tail.next = t;
			
	}
	
	public void show()
	{
		Node p = head;
		while(p != null){
			System.out.println(p.data);
			p = p.next;
		}
	}
	
	public static Node reverseList(Node head){
		if(head == null) return head;
		Node pre = head ;
		Node cur = head.next;
		Node next;
		while(cur !=null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		head.next=null;
		head = pre;
		return head;
	}
	

}


public class LinkListTest2
{
	public static void main(String[] args)
	{
		List a = new List();
		a.add(3);
		a.add(5);
		a.add(20);
		a.add(18);
		a.add(9);
		a.show();
		Node b = a.reverseList(a.head());
		while (b!=null){
			System.out.print(b.data+"___");
			b = b.next;

		}
	}	
	

}

