package demo2;

public class MyStack {
	
	//
	int[] elements;
	public MyStack() {
		elements= new int[0];
	}
    //ѹ��Ԫ��
	public void push(int element) {
		int[] newArr= new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i]=elements[i];
			}
	 newArr[elements.length]=element;
	 elements=newArr;
	}

     //ȡ��ջ��Ԫ��
     public int pop() {
    	if(elements.length==0) {
    		throw new RuntimeException("stack is empty");
    	}
    	 //ȡ����������һ��Ԫ��
    	int element= elements[elements.length-1];
    	//����һ���µ�����
    	int [] newArr=new int[elements.length-1];
    	//ԭ�����г������һ��Ԫ�ص�����Ԫ�ض������µ�������
    	for (int i=0;i<elements.length-1;i++) {
    		newArr[i]=elements[i];
    	}
    	//�滻����
    	elements=newArr; 
    	//����ջ��Ԫ��
    	return element;
     }
     
     
     //�鿴ջ��Ԫ��:ֻ�ǲ鿴������ȡ����
     public int peek() {
    	 //��ջ��û��Ԫ��
    	 if (elements.length==0) {
    		 throw new RuntimeException("Stack is empty");
    	 }
    	 return elements[elements.length-1];
     }
     
     //�ж�ջ�Ƿ�Ϊ��
     public boolean isEmpty() {
    	 return elements.length==0;
     }
}
