package com.OOPs;

public class QueueLinklist<T> {
	
	private Node front, rear;
	private int queueSize;
	
	private class Node{
		 String data;
		 Node next;
	}

	public QueueLinklist() {
		front = null;
		rear = null;
		queueSize = 0;
	}
	
	public void enQueue(String data) {
		Node pointer = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;
		if(front == null) {
			front  = rear;
		}else {
			pointer.next = rear;
		}
		queueSize++;
		show();
	}
	
	public void show() {
		if(front == null) {
			System.out.println("no Element to print");
		}else {
			while(front != null) {
				System.out.println(front.data + "\n");
				front = front.next;
			}
		}
	}

}
