package demo2.test;

import demo2.MyQueue;


public class TestMyQueue {
	public static void main(String[] args) {
		MyQueue mq=new MyQueue();
		mq.add(9);
		mq.add(8);
		mq.add(7);
		mq.add(6);
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		mq.add(100);
		System.out.println(mq.poll());
		System.out.println(mq.isEmpty());
	}

}
