package Algorithm;
/**
 *	 	“我年龄的立方是个4位数。我年龄的4次方是个6位数。这10个数字正好包含了从0到9这10个数字，每个都恰好出现1次。” 

 *   请你推算一下，他当时到底有多年轻。

 */
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String arg[]){
			
		long startTime = System.nanoTime();
		for(int i = 0; i < 60; i++){
			int a = i * i * i;
			if((a+"").length() != 4) continue;
			
			int b = a * i;
			if((b+"").length() !=6) continue;
			Set t = new HashSet();
			while(a>0){ t.add(a%10); a = a / 10; }
			while(b>0){ t.add(b%10); b = b / 10; }
			if(t.size() != 10) continue;
			

			System.out.println(i);
		}
		long endTime = System.nanoTime();
		
		System.out.println(endTime-startTime); 
	}
	
}
