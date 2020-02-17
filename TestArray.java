package demo1;
public class TestArray{
	
	 public static void main(String[] args) {
		 //创建一个数组
		 int[] arr1=new int[3];
		 //获取数组长度
		 int length1=arr1.length;
		 System.out.println("arr1'length"+length1);
		 //访问数组中的元素。数组名[下标],下标从0开始
		 int element1=arr1[0];
		 System.out.println(element1);
		 arr1[0]=99;
		 arr1[1]=98;
		 arr1[2]=97;
		 System.out.println(arr1[0]);  
		 //遍历数组
		
		 for ( int i=0;i<length1;i++)//中间使用分号而不是逗号！
			 System.out.println("arr1"+i+":"+arr1[i]);
		 //创建数组的同时为数组中的元素赋值 
		 int[] arr2=new int[]{90,80,70,60,50};
		 System.out.println(arr2.length);
	 }
}