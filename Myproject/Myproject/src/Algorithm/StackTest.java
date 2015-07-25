package Algorithm;

import java.util.Stack;

public class StackTest {
	
//	public static void main(String[] args){
//		
//		 Stack<Integer> stack;
//		 stack = new Stack();
//		 while (!StdIn.isEmpty())
//			 stack.push(StdIn.readInt());
//		 for(int i :stack)
//			 StdOut.println(i);
//				 
//	}
//	

	
	public static void main(String[] args){

		//System.out.println(stack("...(.[...)...]...(..(.)..)..{..}.[.]...[[...(.).]..]."));
		System.out.println(stack("()}"));
	
		//System.out.println(stack("..{.(.(.[.].).)..}..........."));
	}
	
	public static String stack(String s){
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(c=='(') stack.push(c);
			if(c=='[') stack.push(c);
			if(c=='{') stack.push(c);
			if( c==')' || c==']' || c=='}'){
				if(stack.isEmpty()) return "null";
				//if(c == stack.pop()) {System.out.println("test is right");}
				else if(stack.pop() == '(' && c == ')') return "test is tight";
				else if(stack.pop() == '[' && c == ']') return "test is tight";
				else if(stack.pop() == '{' && c == '}') return "test is tight";
				else return "error";	
				
			}
			
			
			
		}
		return null;

	}
}
