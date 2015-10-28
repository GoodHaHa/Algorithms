package Algorithm.Sort;

import java.util.Arrays;
public class QuickSort3 {

	 public static void main(String[] args) {
		  int[] pData = new int[]{49,38,65,97,-76,13,27} ;
		  quickSort(pData,0,pData.length-1) ;
		  System.out.println(Arrays.toString(pData)) ;

		 }
    
    public static void quickSort(int[] pData,int left,int right)
    {
     int i ,j ;
     int middle,temp ;
     i = left ;
     j = right +1;
     middle = pData[left] ;
     while(true)
     {
      while((++i)<right-1 && pData[i]<middle) ;
      while((--j)>left && pData[j]>middle) ;
      if(i>=j)
       break ;
         temp = pData[i] ;
         pData[i] = pData[j] ;
         pData[j] = temp ;
     
     }
     pData[left] = pData[j] ;
     pData[j] = middle ;
       
     if(left<j)
      quickSort(pData,left,j) ;
    
     if(right>i)
      quickSort(pData,i,right) ;
    }



}
