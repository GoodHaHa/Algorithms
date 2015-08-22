package Algorithm.List;


class MyList
{
	private int data;
	private MyList next;
	public MyList(int x)
	{
		data = x;
	}
	public void add(MyList x)
	{
		x.next = next;
		next = x;
	}
	public void append(MyList x)
	{
		MyList p = this;
		while(p.next != null){
			p = p.next;
		}
		p.next = x;
	}
	public void show()
	{
		MyList p = this;
		while(p!=null){
			System.out.println(p.data);
			p = p.next;
		}
	}
	
}


public class LinkListTest1 {
	public static void main(String[] args) 
	{
		MyList head = new MyList(10);
		head.append(new MyList(30));
		head.append(new MyList(40));
		head.append(new MyList(50));
		head.add(new MyList(20));
		head.show();
	}
}
