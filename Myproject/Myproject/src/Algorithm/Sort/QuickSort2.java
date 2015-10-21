package Algorithm.Sort;

class QuickSort2 {
	
	public static void main(String args[]){
		
		Data[] data ={new Data(23),new Data(23),new Data(934),new Data(-209),new Data(39),new Data(92),new Data(-9)};
	
		quitSort(data);
		
		System.out.print(java.util.Arrays.toString(data));
	}

	private static void quitSort(Data[] data) {

		subSort(data,0,data.length-1);
		
	}

	private static void subSort(Data[] data, int start, int end) {
		
		if(start <end)
		{
			int i = start;
			int j= end+1;
			Data base = data[start];
			
			while(true){
				
				while(i < end && data[++i].compareTo(base) <=0);
				
				while(j > start && data[--j].compareTo(base) >=0);
				
				if(i <j) swap(data,i,j);
				else break;
				
			}
			swap(data,start,j);
			subSort(data,start,j-1);
			subSort(data,j+1,end);
		}
		
		
	}

	private static void swap(Data[] data, int i, int j) {
		 Data tmp;
		 tmp = data[i];
		 data[i] = data[j];
		 data[j] = tmp;
	}
	

}

class Data implements Comparable<Data>
{
	int data;
	public Data(int data)
	{
		this.data = data;
	}
	public String toString()
	{
		return data+"";
	}

	public int compareTo(Data base)
	{
		return this.data > base.data ? 1 
			: (this.data == base.data ? 0 : -1);
	}

}