package Algorithm.Tree;

import java.util.*;
class MyTree
{
	private List<Node>  lst = new ArrayList<Node>();
	class Node
	{
		String data;
		String parent;
	}
	
	public void add(String parent, String child)
	{
		Node t = new Node();
		t.data = child;
		t.parent = parent;
		lst.add(t);
	}
	
	public String getParent(String x)
	{
		for(int i=0; i<lst.size(); i++){
			if(lst.get(i).data.equals(x)) return lst.get(i).parent;
		}
		return null;
	}
	
	public List<String> getChild(String x)
	{
		List<String> t = new ArrayList<String>();
		for(int i=0; i<lst.size(); i++){
			if(lst.get(i).parent.equals(x)) t.add(lst.get(i).data);
		}
		return t;
	}
}

public class SimpleTreeTest 
{
	public static void main(String[] args) 
	{
		MyTree a = new MyTree();
		a.add("����", "����");
		a.add("����", "ŷ��");
		a.add("����", "����");
		a.add("����","�й�");
		a.add("����","�ձ�");
		a.add("����","����");
		a.add("�й�","����");
		a.add("�й�","�ӱ�");
		a.add("�й�","����");
		
		System.out.println(a.getParent("�ӱ�"));
		System.out.println("----------");
		System.out.println(a.getChild("�й�"));
		
	}

}

