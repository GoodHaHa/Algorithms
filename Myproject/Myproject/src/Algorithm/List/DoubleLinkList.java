package Algorithm.List;
/**
 * 	定义双向循环链表，解决如下的问题：
 *		有 n 个孩子顺时针站成一圈，其编号为：1，2，3，... n
 *	从1号孩子开始顺时针数数，每个孩子数一个数，遇到7的倍数或
 *	数字中含有7，则该孩子不出声，只拍一下手，数数的方向逆转，
 *	下一个孩子数下一个数字。
 *	例如：1,2,3...6,拍手,则接下来，6号孩子数8，5号孩子数9 ....
 *	请模拟该过程，如果有20个孩子，求哪个孩子要数100。
 */
class DList
{
	private int data;
	private DList next;  //后向
	private DList prior; //前向
	
	public DList getNext() { return next; }
	public DList getPrior() { return prior; }
	public int getData() { return data; }
	
	public DList(int data)
	{
		this.data = data;
		next = prior = this;
	}
	
	// 加入到自己的前边
	public void insert(DList t)
	{
		DList old = this.prior;
		old.next = t;
		t.next = this;
		this.prior = t;
		t.prior = old;
	}
	
	public void show()
	{
		DList p = this;
		do{
			System.out.println(p.data);
			p = p.next;
		}while(p!=this);
	}
}

class A
{
	public static void main(String[] args)
	{
		DList a = new DList(1);
		for(int i=2; i<=20; i++){
			a.insert(new DList(i));
		}
		
		DList p = a;
		boolean dr = true; // 方向
		for(int i=1; i<100; i++){
			if(i%7==0 || (i+"").indexOf("7")>=0) dr = !dr;
			if(dr) 
				p = p.getNext();
			else
				p = p.getPrior();
		}
		
		System.out.println(p.getData());
	}
}