package Algorithm.List;
/**
 * 	����˫��ѭ������������µ����⣺
 *		�� n ������˳ʱ��վ��һȦ������Ϊ��1��2��3��... n
 *	��1�ź��ӿ�ʼ˳ʱ��������ÿ��������һ����������7�ı�����
 *	�����к���7����ú��Ӳ�������ֻ��һ���֣������ķ�����ת��
 *	��һ����������һ�����֡�
 *	���磺1,2,3...6,����,���������6�ź�����8��5�ź�����9 ....
 *	��ģ��ù��̣������20�����ӣ����ĸ�����Ҫ��100��
 */
class DList
{
	private int data;
	private DList next;  //����
	private DList prior; //ǰ��
	
	public DList getNext() { return next; }
	public DList getPrior() { return prior; }
	public int getData() { return data; }
	
	public DList(int data)
	{
		this.data = data;
		next = prior = this;
	}
	
	// ���뵽�Լ���ǰ��
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
		boolean dr = true; // ����
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