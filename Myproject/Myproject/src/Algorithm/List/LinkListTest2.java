package Algorithm.List;


class List
{
	private Node head;
	
	class Node
	{
		int data;
		Node next;
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
	}	
}

