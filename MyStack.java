package demo2;

public class MyStack {
	
	//
	int[] elements;
	public MyStack() {
		elements= new int[0];
	}
    //压入元素
	public void push(int element) {
		int[] newArr= new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i]=elements[i];
			}
	 newArr[elements.length]=element;
	 elements=newArr;
	}

     //取出栈顶元素
     public int pop() {
    	if(elements.length==0) {
    		throw new RuntimeException("stack is empty");
    	}
    	 //取出数组的最后一个元素
    	int element= elements[elements.length-1];
    	//创建一个新的数组
    	int [] newArr=new int[elements.length-1];
    	//原数组中除了最后一个元素的其他元素都放入新的数组中
    	for (int i=0;i<elements.length-1;i++) {
    		newArr[i]=elements[i];
    	}
    	//替换数组
    	elements=newArr; 
    	//返回栈顶元素
    	return element;
     }
     
     
     //查看栈顶元素:只是查看，并不取出。
     public int peek() {
    	 //若栈中没有元素
    	 if (elements.length==0) {
    		 throw new RuntimeException("Stack is empty");
    	 }
    	 return elements[elements.length-1];
     }
     
     //判断栈是否为空
     public boolean isEmpty() {
    	 return elements.length==0;
     }
}
