package demo1;
public class TestArray{
	
	 public static void main(String[] args) {
		 //����һ������
		 int[] arr1=new int[3];
		 //��ȡ���鳤��
		 int length1=arr1.length;
		 System.out.println("arr1'length"+length1);
		 //���������е�Ԫ�ء�������[�±�],�±��0��ʼ
		 int element1=arr1[0];
		 System.out.println(element1);
		 arr1[0]=99;
		 arr1[1]=98;
		 arr1[2]=97;
		 System.out.println(arr1[0]);  
		 //��������
		
		 for ( int i=0;i<length1;i++)//�м�ʹ�÷ֺŶ����Ƕ��ţ�
			 System.out.println("arr1"+i+":"+arr1[i]);
		 //���������ͬʱΪ�����е�Ԫ�ظ�ֵ 
		 int[] arr2=new int[]{90,80,70,60,50};
		 System.out.println(arr2.length);
	 }
}