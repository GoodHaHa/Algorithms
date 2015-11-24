package Algorithm.Sort;

import java.util.Arrays;

public class QuickSort{
	
	 public static void main(String[] args) {
		  int[] datatest = new int[]{49,38,65,97,97,0,-76,13,27} ;
		  quickSort(datatest,0,datatest.length-1) ;
		  System.out.println(Arrays.toString(datatest)) ;
		  float a = 8.0f;
		  System.out.println(a);
		 }
	private static void quickSort(int[] datatest, int start, int end) {

		if(start <end){
			int tmp,middle,i,j;
			i=start;
			j=end+1;
			middle = datatest[start];
			while(true){
			while((++i)<end && datatest[i]<=middle);
				System.out.println(datatest[i]);
			while((--j)>start && datatest[j]>=middle);
				
			if(i>=j)
			break;
				
				tmp =datatest[i];
				datatest[i]=datatest[j];
				datatest[j]=tmp;
			}
			datatest[start]=datatest[j];
			datatest[j]=middle;
			
			quickSort(datatest,start,j-1);
			quickSort(datatest,j+1,end);
			}
		}
	}
	
