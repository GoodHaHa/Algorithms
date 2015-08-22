/*package Algorithm.Tree;


class BiTree
{
	private int data;
	private BiTree left;
	private BiTree right;
	
	public BiTree(int x)
	{
		data = x;
	}
	
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
	
	public void travel()
	{
		if(left!=null) left.travel();
		System.out.println(data);
		if(right!=null) right.travel();
	}
}

public class BiTreeTest 
{
	public static void main(String[] args) 
	{
		BiTree t = new BiTree(12);
		t.add(new BiTree(9));
		t.add(new BiTree(5));
		t.add(new BiTree(8));
		t.add(new BiTree(15));
		t.add(new BiTree(20));
		
		t.travel();
	}

}
*/