package Algorithm.search;

public class topn {
	
	public static void main(String[] args){
		String data ="123sdfdssssss";
		search(data);
	}

	public static void search(String data){
		int[] char_set =new int[256];
		int[] a = new int[256];
		for(int i =0; i<data.length();i++){
			
			int val =data.charAt(i);
			char_set[val] =  val;
			if(char_set[val]!=0){
				a[char_set[val]] +=1; 
			}
	//	System.out.println(a[char_set[val]]+":"+char_set[val]);

		}
//		for(int j = 0; j< 256; j++) {
//
//				System.out.println((char)j + ":" + a[j]);
//		}
		
		for(int i =1;i<=255;i++){
			
			int tmp =a[i];
			if(a[i-1] >= tmp){
				int j = i-1;
				for(;j>=0 && tmp < a[j];j--)
				{
					a[j+1] = a[j];
				}
				a[j+1] = tmp;
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]>0) System.out.print(a[i]+" ");
		}
		
	}
	
}
