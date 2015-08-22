package Algorithm.Stack;


import java.util.*;
/**
 * ջ�ṹ�����ô�����ʱͨ�����������ɻ���һЩ���⡣

	���������⣺

	...(.[...)...]...(..(.)..)..{..}.[.]...[[...(.).]..].

	���ж�һ�����е������Ƿ�ƥ��
	ע�����в�ƥ��������

	������̫��
	������̫��
	���������������ų��� ..)...(...
	������ ....[...(....]....)....

	������ջ
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