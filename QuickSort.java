package demo4;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr= new int[] {3,4,6,7,2,7,2,8,0};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr,int start, int end) {
	if (start<end) {
		int stard=arr[end];
		int low=start;
		int high=end;
		while (low<high) {
			while(low<high&&arr[low]<=stard) {
				
				low++;
			}
			arr[high]=arr[low];
			while(low<high&&arr[high]>=stard) {
				high--;
			}
			arr[low]=arr[high];
		}
		arr[high]=stard;
		System.out.println(start);
		System.out.println(high);
		quickSort(arr,start,high);  //Problem occurs when it's high.  Should be 'high-1'
		quickSort(arr,high+1,end);
	 }

	}
}
/* must be while (low>high&&arr[high]>=stard), the 
 * low>high cannot be removed */
