package Algorithm.search;

public class NoDuplicate {

	public static void main(String args[]){
		
		String str ="eilejklxcklvp";
		System.out.print(noDuplicate(str));
		
		
	}
	
	public static String noDuplicate(String str) { 
	    String sub = ""; 
	    String result = ""; 
	    for (int i = 0; i < str.length(); i++) { 
	        String c = "" + str.charAt(i); 
	        if (sub.contains(c)) { 
	            if (sub.length() > result.length()) { 
	                result = sub; 
	            } 
	            sub = ""; 
	        } 
	        sub += c; 
	    } 
	    if (sub.length() > result.length()) { 
	        result = sub; 
	    } 
	    return result; 

	}
}
