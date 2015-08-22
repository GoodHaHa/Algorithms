package Algorithm.Map;

import java.util.*;
public class MapTest 
{
	public static void main(String[] args) 
	{
		Map<String, String>  a = new  HashMap<String, String>();
		a.put("cat", "è");
		a.put("desk", "����");
		a.put("table", "����");
		a.put("table" ,"���");
		
		System.out.println(a.get("table"));
		
		// �������
		Set<String> key = a.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println( s + "---->" + a.get(s));
		}
		
		Set<Map.Entry<String, String>>  et = a.entrySet();
		Iterator<Map.Entry<String, String>> it2 = et.iterator();
		while(it2.hasNext()){
			Map.Entry en = it2.next();

		}
		
		Set st = a.entrySet();
		Iterator it3 = st.iterator();
		while(it3.hasNext()){
			Map.Entry en = (Map.Entry)it3.next();
			System.out.println(en.getKey() +"+++"+en.getValue());
		}
	}

}
