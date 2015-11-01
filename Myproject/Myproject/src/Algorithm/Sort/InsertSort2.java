package Algorithm.Sort;

public class InsertSort2 {

	public static void main(String args[]){
		
		int data[] = {2,2,2,2,34,2,3,444,555,6,33,213};
		for(int i =2; i<=data.length;i++){
			int tmp = data[i-1];
			int j =i-1;
			if(tmp >= data[j-1]){
				for(;j>0 && tmp > data[j-1];j--){
					data[j] = data[j-1];
				}
				data[j] = tmp;
			}
		}
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
	
}
