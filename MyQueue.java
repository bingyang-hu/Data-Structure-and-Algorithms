package demo2;

public class MyQueue {
	int[] elements;
	public MyQueue(){
		elements=new int[0];
	}
	//入队
    public void add(int element) {
    	int[] Arr=new int[elements.length+1];
    	for (int i =0;i<elements.length;i++) {
    		Arr[i]=elements[i];
    		
    	}
    	Arr[elements.length]=element;
    	elements=Arr;
    	
    }
    //出队
    public int poll() {
    	int element=elements[0];
    	int[] Arr1=new int[elements.length-1];
    	for (int i=0;i<elements.length-1;i++) {
    		Arr1[i]=elements[i+1];
    		
    	}
    	elements=Arr1;
    	return element;
    }
    //
    public boolean isEmpty() {
    	return elements.length==0;
    }
}
