package Algorithm;

/**
 * 				�ǹȶ���˵: �κ�һ���������������ż���������2����������������3�ټ�1����˷������������յõ�1�� 

 *		���ﲻҪ����֤���������ֻ��Ҫ��֤10000���ڵ����������ĸ���������Ĳ��裬���ŵõ�1�� �����������衣 

 *		�����9������� 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 	

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
