package demo1;

import java.util.Arrays;

public class TestOpArray {
	public static void main(String[] args) {
		//�������ĳ��Ȳ��ɱ������
		int[] arr =new int[] {9,8,7};
		//���ٲ鿴�����е�Ԫ�أ�
		System.out.println(Arrays.toString(arr));
		//����һ���µ����飬������ԭ���鳤�ȣ�1
		int[] newArr=new int[arr.length+1];
		//��ԭ�����е�����ȫ�����Ƶ��������У��ñ���
		for (int i =0;i<arr.length;i++)
		{ 
			newArr[i]=arr[i];
		}
		//Ҫ���������Ŀ��Ԫ��
		int dst=6;
		//��Ŀ��Ԫ�ط������������
		newArr[newArr.length-1]=dst;
		System.out.println(Arrays.toString(newArr));
		//�������滻ԭ����
		arr=newArr;
		System.out.println(Arrays.toString(arr));
		
	}

}
