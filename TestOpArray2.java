package demo1;

import java.util.Arrays;

public class TestOpArray2 {
	//���Լ��������ǣ�������for ѭ�����ȽϷѾ����γ�������һ��for+if else.�����Ǳ����������е��±������ԭ���顣
    public static void main(String[] arg) {
    	
    	int[] arr= new int[] {9,8,7,6,5,4};
    	int dst=2;
    	//����һ���µ����飬������ԭ����ĳ���-1
    	int[] newArr=new int[arr.length-1];
    	//����ԭ�����г���Ҫɾ���Ǹ�Ԫ����������Ԫ��  
    	//for (int i=0;i<dst;i++) {
    		//newArr[i]=arr[i];
    	//}
    	//for (int t=3;t<arr.length-1;t++) {
    		//newArr[t]=arr[t+1];
    	//}
    	//System.out.println(Arrays.toString(newArr));
    	for (int i =0; i<newArr.length;i++) {
    		if(i<dst) {
    			newArr[i]=arr[i];
    		}else {
    			newArr[i]=arr[i+1];
    		}
    		
    	}
    	System.out.println(Arrays.toString(newArr));
    }
}
