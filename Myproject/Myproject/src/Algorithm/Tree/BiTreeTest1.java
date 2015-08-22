package Algorithm.Tree;

/**
 * 如果定义一棵二叉树的高度就是从根到叶子的最长距离。试编码求二叉树的高度。

	其实，二叉树的高度就是它的左子树和右子树中高度最大值 + 1

	另外考虑: 当待排序的数据本来就是有序的情况，会发生什么？
	
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