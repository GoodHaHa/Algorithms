package Algorithm.Sort;
public class InsertSort {
   public static void main(String[] args) {
       int[] values = { 5, 2, 4, 1, 3 };
       sort(values);
       for (int i = 0; i < values.length; ++i) {
           System.out.println(values[i]);
       }
   }
   public static void sort(int[] values) {
       int temp;
       int j = 0;
       for (int i = 1; i < values.length; i++) {
           if(values[i]<values[i-1])//�˴����жϺ���Ҫ�����������˲��������ð�������ѡ��������ԭ��
           {
               temp = values[i];
               //���������ƶ�
               for (j=i-1; j>=0 && temp<values[j]; j--)
               {	
//            	   System.out.println(j+";");
//            	   System.out.println(values[j+1]);
            	   values[j+1] =values[j];
//                   System.out.println(values[j+1]);
               }
               //�����ݲ��뵽j+1λ��
//               System.out.println(j+";");
               values[j+1] =temp;
               System.out.println(values[j+1]);
               System.out.print("��" + (i + 1) + "�Σ�");
               for (int k = 0; k < values.length; k++) {
                   System.out.print(values[k]+",");
               }
               System.out.println("");
           }
       }
   }
}