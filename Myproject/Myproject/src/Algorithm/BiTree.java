package Algorithm;

class Tree{
	
	private int data;
	private Tree right;
	private Tree left;
	private int count1 = 1;
	private int count2 = 1;
	
	public Tree(int tree){		
		data = tree ;		
	}

	public void add(Tree tree) {
			
		if(tree.data < this.data){
			this.count1++;
			if(left == null) left = tree;
			else left.add(tree);
			
		}
		else {
			this.count2++;
			if(right == null) right =tree;
			else right.add(tree);
			
		}
			
	}

	public int countTree(){
		
		if(this.count1 > this.count2) return count1;
		else return count2;
		
	}
	
	public void travel1() {
		
		
		if(left != null)left.travel1();
		System.out.println(data);
		if(right != null)right.travel1();
		
	}

	public void travelHead() {

		System.out.println(data);
		if(left != null) left.travelHead();
		if(right != null) right.travelHead();
		
		
	}

	public void travelTrail() {
		
		if(left != null) left.travelHead();
		if(right != null) right.travelHead();
		System.out.println(data);
	}	
}

public class BiTree {

	public static void main(String[] args){
		Tree tree = new Tree(11);
		tree.add(new Tree(34));
		tree.add(new Tree(10));
	//	tree.add(new Tree(20));
	//	tree.add(new Tree(10));
	//	tree.add(new Tree(23));
		System.out.println(tree.countTree());
		tree.travel1();
		tree.travelHead();
		tree.travelTrail();
		
	}
	
}
