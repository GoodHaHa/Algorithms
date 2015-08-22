package Algorithm.Map;

import java.util.*;
public class MapTest 
{
	public static void main(String[] args) 
	{
		Map<String, String>  a = new  HashMap<String, String>();
		a.put("cat", "猫");
		a.put("desk", "桌子");
		a.put("table", "桌子");
		a.put("table" ,"表格");
		
		System.out.println(a.get("table"));
		
		// 遍历表格
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
