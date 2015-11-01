package Algorithm.dangdang;

public class ScaleShopping {

	public static void main(String[] args){
		int data[]={1000,120,500,300,350};
		search(data);
	}
	public static void search(int[] data){
		int sum1=0;
		int sum2=0;
		int[] sale = {100,200,300,400};
		int[] m = {10,20,50,80};
		int a,b;
		for(int i=0;i<data.length;i++){
			sum1+=data[i];
			for(int j=0;j<4;j++){
				if(data[i]>sale[j] && data[i]<sale[j+1]) sum2+=m[j];
				else sum2+=80;
			}
		System.out.println(sum1-sum2);		
		}
		
	}
	
}
