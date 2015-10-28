package Algorithm.Sort;

public class QuitkSort3 {

	public static void main(String args[]){
		
		Integer data[]={1,23,32,11,-11,-23};
		sortlist(data,0,data.length-1);
		for(int i1 =0;i1<data.length;i1++)	System.out.println(data[i1]);	

	}

	private static void sortlist(Integer[] data, int start, int end) {
		
		if(start < end)
			{	
			int i = start;
			int j = end;
			int middle = data[start];
			while(true){
				
			if(i>j)
				{
					while(i < end && middle >= data[++i]);
					while(j > start && middle <= data[--j]);
					int tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			else break;
			
			data[start]=data[j];
			data[j]=middle;
			sortlist(data,start,j-1);
			sortlist(data,j+1,end);
			}
		}
	}
	
	
}
