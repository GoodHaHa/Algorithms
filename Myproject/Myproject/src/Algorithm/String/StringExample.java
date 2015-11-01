package Algorithm.String;
import java.util.*;

public class StringExample {
	
	public static void main(String[] args){
		String test ="abcddd  ddddd";
		System.out.println(reverseString(test));
	}
	
	
	public static String reverseString(String iniString) {
        String string ="";
        for(int i=iniString.length()-1;i>=0;i--){
            string+=""+iniString.charAt(i);
        }
        return string;
        // write code here
    }
	
    public static String zipString(String iniString) {
    	StringBuilder abc = new StringBuilder();
        char last = iniString.charAt(0);
        int n = 1; 		

        for(int i=1;i<iniString.length();i++){
                        
           if(iniString.charAt(i)==last)
           {
               	n++;
           }
           else{
        	   abc.append(last);
        	   abc.append(n);
        	   last=iniString.charAt(i);
        	   n=1;
           }            
        }
        abc.append(last); abc.append(n);

        if(abc.length()<iniString.length()) return abc.toString();
        else return iniString;
    }
}