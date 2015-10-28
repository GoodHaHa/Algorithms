package Algorithm.search;

class Test{

	String reg,left;
	
	public String find(String str) {

		for(int len=str.length()/2;len>0;len--){
			reg=str.substring(0,len+1);
			left=str.substring(len+1);
			if(left.indexOf(reg)!=-1) return reg;
				
		}
		return null;
	}	
	
}


public class Search {
	public static void main(String args[]){
		String str =new Test().find("abcd");
		System.out.println(str);
		
	}
	
}
