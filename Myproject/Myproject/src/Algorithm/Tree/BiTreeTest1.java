package Algorithm.Tree;

/**
 * �������һ�ö������ĸ߶Ⱦ��ǴӸ���Ҷ�ӵ�����롣�Ա�����������ĸ߶ȡ�

	��ʵ���������ĸ߶Ⱦ����������������������и߶����ֵ + 1

	���⿼��: ������������ݱ������������������ᷢ��ʲô��
	
 * @author Administrator
 *
 */

class BiTree
{
	private int data;
	private BiTree left;
	private BiTree right;
	
	public BiTree(int x) { data = x; }
	
	public void add(BiTree t)
	{
		if(t.data < this.data){
			if(left==null)
				left = t;
			else
				left.add(t);
		}
		else{
			if(right==null)
				right = t;
			else
				right.add(t);
		}
	}
	
	public int getHeight()
	{
		int a = 0;
		int b = 0;
		if(left != null) a =  left.getHeight();
		if(right != null) b = right.getHeight(); 
		
		return (a>b?a:b) + 1;
	}
}

public class BiTreeTest1
{
	public static void main(String[] args)
	{
		BiTree a = new BiTree(1);
		a.add(new BiTree(2));
		a.add(new BiTree(3));
		a.add(new BiTree(4));
		a.add(new BiTree(5));
		
		System.out.println(a.getHeight());
			
	}
}