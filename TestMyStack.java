package demo2.test;

import demo2.MyStack;

public class TestMyStack {
	
  public static void main(String[] args) {
	//����һ��ջ
	MyStack ms=new MyStack();
	//ѹ������
	ms.push(9);
	ms.push(8);
	ms.push(7);
	ms.push(6);
	//ȡ��ջ��Ԫ��
	//System.out.println(ms.pop());
	//System.out.println(ms.pop());
	//System.out.println(ms.pop());
	//System.out.println(ms.pop());
	//System.out.println(ms.pop());
	//�鿴ջ��Ԫ��
	System.out.println(ms.peek());
	//�鿴ջ�Ƿ�Ϊ��
	System.out.println(ms.isEmpty());

  }
	
}