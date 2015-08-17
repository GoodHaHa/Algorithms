package Algorithm;

/**
 * 				角谷定理说: 任何一个正整数，如果是偶数，则除以2，如果是奇数则乘以3再加1，如此反复，必能最终得到1。 

 *		这里不要求你证明这个定理，只需要验证10000以内的所有整数哪个经过了最长的步骤，最后才得到1， 并输出这个步骤。 

 *		比如对9，输出： 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 	

 */
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	
	public static void main(String args[]){
		List list0 = new ArrayList();

		for(int i = 1; i <= 10000;i++){
			List lst = run(i);
			if(lst.size() > list0.size()) list0 = lst;
		
		}
		System.out.println("Max="+ list0.size());
		System.out.println(list0);
		
		
	}	
	
	
	public static List<Integer> run(int n){
		List<Integer> list = new ArrayList<Integer>();		
		
		
		while(n != 1){
			list.add(n);
			if(n % 2 == 0){
				n = n / 2;
			}
			else {
				n= n * 3 +1;
			}
		}
		list.add(1);
		return list;
	}
	
}
