package demo1;

import java.util.Arrays;

public class TestOpArray2 {
	//我自己的做法是：用两个for 循环，比较费劲。课程中用了一个for+if else.而且是遍历新数组中的下标而不是原数组。
    public static void main(String[] arg) {
    	
    	int[] arr= new int[] {9,8,7,6,5,4};
    	int dst=2;
    	//创建一个新的数组，长度是原数组的长度-1
    	int[] newArr=new int[arr.length-1];
    	//复制原数组中除了要删的那个元素外其他的元素  
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
