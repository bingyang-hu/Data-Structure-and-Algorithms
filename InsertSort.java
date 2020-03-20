package demo4;

import java.util.Arrays;

public class InsertSort {
    
    public static  void main(String[] args) {
    	int[] arr= new int[]  {2,3,7,9,4,0,1 };
    	insertSort(arr);
    	System.out.println(Arrays.toString(arr));
   }
    
      public static void insertSort(int[] arr) {
    	int j;
    	for (int i=1;i<arr.length;i++) {
    		if(arr[i]<arr[i-1]) {
    			int temp=arr[i];
    			for (j=i-1;j>=0 && arr[j]>temp;j--) {
    				arr[j+1]=arr[j];
    			}
    			arr[j+1]=temp;
    		}
    	}
    }
    
}
    
