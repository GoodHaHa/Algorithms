package Algorithm.Stack;


import java.util.*;
/**
 * 栈结构很有用处，有时通过它可以轻松化解一些难题。

	看如下问题：

	...(.[...)...]...(..(.)..)..{..}.[.]...[[...(.).]..].

	请判断一个串中的括号是否匹配
	注意下列不匹配的情况：

	左括号太多
	右括号太多
	右括号先于左括号出现 ..)...(...
	挎臂情况 ....[...(....]....)....

	考虑用栈
 * @author Administrator
 *
 */
public class StackTest
{
	public static boolean f(String s)
	{
		Stack<Character> sk = new Stack<Character>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c=='(') sk.push(')');
			if(c=='[') sk.push(']');
			if(c=='{') sk.push('}');
			
			if(c==')' || c==']' || c=='}'){
				if(sk.isEmpty()) return false;
				if(sk.pop() != c) return false;
			}
		}
		return sk.isEmpty();
	}
	
	public static void main(String[] args)
	{
		System.out.println(f("...(.[...)...]...(..(.)..)..{..}.[.]...[[...(.).]..]."));
		System.out.println(f("..{.(.(.[.].).)..}..........."));
		
	}
}