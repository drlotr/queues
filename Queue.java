/**
 * This class implements a singly linked list data structure.
 * 
 * @author Michael Ida
 *
 */
public class Queue {
	
	private Node head;
	
	/*
	 * The constructor creates an empty list.
	 */
	public Queue() {
		head = null;
	}
	public String dequeue() {
		if(head == null) {
			return "";
		} else {
			Node newNode = new Node();
			newNode = head;
			head = head.next;
			return newNode.record;
		}
	}
	public void enqueue(String data) {
		Node pointer = head;
		if(pointer == null) {
			Node newNode = new Node();
			newNode.record = data;
			head = newNode;
		} else {
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			Node newNode = new Node();
			newNode.record = data;
			pointer.next = newNode;
		}
	}
	public void printQueue() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
}