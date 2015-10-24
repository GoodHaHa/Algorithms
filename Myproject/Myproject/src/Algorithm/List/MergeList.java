package Algorithm.List;

import Algorithm.List.ListFactory.Node;


class ListFactory{
	
	private Node head;
	
	class Node {
		Node next;
		int data;
	}
	
	public Node getTail(){
		if(head==null) return null;
		Node node =head;
		while(node.next!=null)node=node.next;
		return node;	
	}
	
	public Node Head(){
		return head;
	}
	
	
	public void addNode(int data){
		
		Node node =new Node();
		node.data = data;
		
		Node tail = getTail();
		if(tail == null)
			head = node;
		else
			tail.next = node;
	}
	
	public void printList(){
		Node node = head;
		while(node != null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
}
public class MergeList {
	
		public static ListFactory List1(){
			ListFactory list1 = new ListFactory();
			list1.addNode(0);
			list1.addNode(2);
			list1.addNode(4);
			list1.addNode(5);
			list1.addNode(9);
			list1.addNode(10);
			list1.addNode(18);
//			list1.printList();
			return list1;
		}
		
		public static ListFactory List2(){
			ListFactory list2 = new ListFactory();

			list2.addNode(1);
			list2.addNode(2);
			list2.addNode(3);
			list2.addNode(4);
			list2.addNode(11);
			list2.addNode(19);
//			list2.printList();
			return list2;
		}

		private static Node MergeList(Node node1, Node node2) {
		
			if(node1 == null) 
				return node2;
			if(node2 == null)
				return node1;
			Node node = null;
				
			if(node1.data < node2.data)  {
					node = node1;
					node.next = MergeList(node1.next, node2);
				}
			else{
				node = node2;
				node2.next = MergeList(node1,node2.next);
			
			}
			return node;
		}
	
		public static void  main(String[] args){

			Node head = MergeList(List1().Head(), List2().Head());
			while (head != null){
				System.out.print(head.data+" ");
				head = head.next;
			}
			
		}
}
